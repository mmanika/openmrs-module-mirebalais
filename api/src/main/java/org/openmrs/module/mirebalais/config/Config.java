package org.openmrs.module.mirebalais.config;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.openmrs.api.context.Context;
import org.openmrs.util.OpenmrsUtil;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

@Component
public class Config {

    private final Log log = LogFactory.getLog(getClass());

    public static final String PIH_CONFIGURATION_RUNTIME_PROPERTY = "pih.config";

    private ConfigDescriptor descriptor;

    private PathMatchingResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();

    private ObjectMapper objectMapper = new ObjectMapper();

    public Config() {
        descriptor = new ConfigDescriptor();
        objectMapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);

        String configs = Context.getRuntimeProperties().getProperty(PIH_CONFIGURATION_RUNTIME_PROPERTY);

        if (StringUtils.isBlank(configs)) {
            configs = "mirebalais";  // we default to mirebalais for now
        }

        try {
            JsonNode configNode = null;
            for (String config : configs.split(",")) {
                InputStream configStream = findConfig(config.trim());

                if (configStream != null) {
                    JsonNode rootNode = objectMapper.readTree(configStream);

                    if (configNode == null) {
                        configNode = rootNode;
                    }
                    else {
                        configNode = merge(configNode, rootNode);
                    }
                }
                else {
                    throw new IllegalStateException("Unable to find config file for configuration " + config);
                }
            }

            String json = objectMapper.writeValueAsString(configNode);
            descriptor = objectMapper.readValue(json, ConfigDescriptor.class);
        }
        catch (Exception e) {
            throw new RuntimeException("Error parsing json configuration", e);
        }
    }

    public Boolean isComponentEnabled(String component) {
        return descriptor.getComponents().contains(component);
    }

    public String getWelcomeMessage() {
        return descriptor.getWelcomeMessage();
    }

    public ConfigDescriptor.Site getSite() {
        return descriptor.getSite();
    }

    public Boolean shouldScheduleBackupReports() {
        return descriptor.getScheduleBackupReports() != null ? descriptor.getScheduleBackupReports() : false;
    }

    public JsonNode merge(JsonNode mainNode, JsonNode updateNode) {
        Iterator<String> fieldNames = updateNode.getFieldNames();
        while (fieldNames.hasNext()) {
            String fieldName = fieldNames.next();
            JsonNode jsonNode = mainNode.get(fieldName);
            if (jsonNode != null && jsonNode.isObject()) {
                merge(jsonNode, updateNode.get(fieldName));
            }
            else {
                ((ObjectNode) mainNode).put(fieldName, updateNode.get(fieldName));
            }
        }
        return mainNode;
    }

    private InputStream findConfig(String config) {

        String configFilename = "pih-config-" + config + ".json";
        Exception exception = null;

        // first see if is in the .OpenMRS directory (which will override any file of the same name on the classpath)
        File configFile = new File(OpenmrsUtil.getApplicationDataDirectory() + File.separatorChar + config);

        if (configFile.exists()) {
            try {
                return new FileInputStream(configFile);
            }
            catch (IOException e){
                exception = e;
            }
        }

        // if not found, check the classpath
        try {
            Resource[] appConfigJsonResource = resourceResolver.getResources("classpath*:/config/" + configFilename);
            if (appConfigJsonResource != null && appConfigJsonResource.length > 0) {
                if (appConfigJsonResource.length > 1) {
                    log.error("Multiple files named " + configFilename + " found, using one arbitrarily");
                }
                return appConfigJsonResource[0].getInputStream();
            }
        }
        catch (IOException e) {
            exception  = e;
        }

        log.error("Unable to find appframework configuration file " + configFilename + " either in /appconfig on the classpath or in the OpenMRS application directory", exception);
        return null;
    }
}


