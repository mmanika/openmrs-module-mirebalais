package org.openmrs.module.mirebalais.apploader;

import java.util.Arrays;
import java.util.List;

public class CustomAppLoaderConstants {

    public static final class Components {
        public static final String VISIT_MANAGEMENT = "visitManagement";
        public static final String ACTIVE_VISITS = "activeVisits";
        public static final String CHECK_IN = "checkIn";
        public static final String VITALS = "vitals";
        public static final String CONSULT = "consult";
        public static final String ED_CONSULT = "edConsult";
        public static final String ADT = "adt";
        public static final String DEATH_CERTIFICATE = "deathCertificate";
        public static final String RADIOLOGY = "radiology";
        public static final String DISPENSING = "dispensing";
        public static final String SURGERY = "surgery";
        public static final String OVERVIEW_REPORTS = "overviewReports";
        public static final String DATA_EXPORTS = "dataExports";
        public static final String ARCHIVES = "archives";
        public static final String WRISTBANDS = "wristbands";
        public static final String APPOINTMENT_SCHEDULING = "appointmentScheduling";
        public static final String SYSTEM_ADMINISTRATION = "systemAdministration";
        public static final String MANAGE_PRINTERS = "managePrinters";
        public static final String MY_ACCOUNT = "myAccount";
        public static final String PATIENT_REGISTRATION = "patientRegistration";
        public static final String CLINICIAN_DASHBOARD = "clinicianDashboard";
        public static final String LEGACY_MPI = "legacyMpi";
        public static final String LEGACY_PATIENT_REGISTRATION = "legacyPatientRegistration";
        public static final String LACOLLINE_PATIENT_REGISTRATION_ENCOUNTER_TYPES = "lacollinePatientRegistrationEncounterTypes";
    }

    public static final class Apps {

        // TODO would be nice to rename this to "pih.checkin"
        // TODO for checkin would need to fix requestRecord.gsp:69
        public static final String CHECK_IN = "mirebalais.liveCheckin";
        public static final String VITALS = "pih.app.vitals";
        public static final String AWAITING_ADMISSION = "coreapps.app.awaitingAdmission";
        public static final String ACTIVE_VISITS = "pih.app.activeVisits";
        public static final String ARCHIVES_ROOM = "paperrecord.app.archivesRoom";
        public static final String SYSTEM_ADMINISTRATION = "coreapps.app.systemAdministration";
        public static final String APPOINTMENT_SCHEDULING_HOME = "appointmentschedulingui.app";
        public static final String DISPENSING = "dispensing.app";
        public static final String SCHEDULE_APPOINTMENT = "appointmentschedulingui.schedulingAppointmentApp";
        public static final String MY_ACCOUNT = "emr.myAccount";
        public static final String REPORTS = "reportingui.reports";
        public static final String INPATIENTS = "mirebalaisreports.inpatients";
        public static final String PATIENT_REGISTRATION = "registrationapp.registerPatient";

        public static final String MANAGE_ACCOUNTS = "emr.account.manageAccounts";
        public static final String MANAGE_PRINTERS = "printer.managePrinters";
        public static final String DEFAULT_PRINTERS = "printer.defaultPrinters";
        public static final String MERGE_PATIENTS = "emr.mergePatients";
        public static final String REGISTER_TEST_PATIENT = "emr.testPatient.registration";
        public static final String FEATURE_TOGGLES = "pih.featureToggles";

        public static final String MOST_RECENT_VITALS = "coreapps.mostRecentVitals";
        public static final String MOST_RECENT_REGISTRATION = "coreapps.mostRecentRegistration";

        public static final String LEGACY_MPI = "mirebalais.mpi";
        public static final String LEGACY_PATIENT_REGISTRATION = "mirebalais.patientRegistration.app.registration";
        public static final String LEGACY_PATIENT_REGISTRATION_ED = "mirebalais.patientRegistration.app.registration.ed";
        public static final String LEGACY_PATIENT_LOOKUP = "mirebalais.patientRegistration.app.lookup";

    }

    public static final class Extensions {

        public static final String CHECK_IN_VISIT_ACTION = "pih.checkin.visitAction";
        public static final String VITALS_CAPTURE_VISIT_ACTION = "pih.form.vitals";
        public static final String CONSULT_NOTE_VISIT_ACTION = "pih.form.consult";
        public static final String ADMISSION_NOTE_VISIT_ACTION = "pih.form.admission";
        public static final String DISPENSE_MEDICATION_VISIT_ACTION = "dispensing.form";
        public static final String ED_CONSULT_NOTE_VISIT_ACTION = "pih.form.edConsult";
        public static final String SURGICAL_NOTE_VISIT_ACTION = "pih.form.surgicalNote";
        public static final String ORDER_XRAY_VISIT_ACTION = "radiologyapp.orderXray";
        public static final String ORDER_CT_VISIT_ACTION = "radiologyapp.orderCT";
        public static final String ORDER_ULTRASOUND_VISIT_ACTION = "radiologyapp.orderUS";

        public static final String ADMISSION_FORM_AWAITING_ADMISSION_ACTION = "pih.form.admit";
        public static final String DENY_ADMISSION_FORM_AWAITING_ADMISSION_ACTION = "pih.form.deny";

        public static final String REQUEST_PAPER_RECORD_OVERALL_ACTION = "paperrecord.requestPaperRecord";
        public static final String REQUEST_APPOINTMENT_OVERALL_ACTION = "appointmentschedulingui.requestAppointment";
        public static final String PRINT_ID_CARD_OVERALL_ACTION = "paperrecord.printIdCardLabel";
        public static final String PRINT_PAPER_FORM_LABEL_OVERALL_ACTION = "paperrecord.printPaperFormLabel";
        public static final String PRINT_WRISTBAND_OVERALL_ACTION = "pih.wristband.print";
        public static final String CREATE_VISIT_OVERALL_ACTION = "coreapps.createVisit";
        public static final String CREATE_RETROSPECTIVE_VISIT_OVERALL_ACTION = "coreapps.createRetrospectiveVisit";
        public static final String MERGE_VISITS_OVERALL_ACTION = "coreapps.mergeVisits";
        public static final String DEATH_CERTIFICATE_OVERALL_ACTION = "pih.haiti.deathCertificate";

        public static final String PAPER_RECORD_ACTIONS_INCLUDES = "paperrecord.patientDashboard.includes";
        public static final String PRINT_WRISTBAND_ACTION_INCLUDES = "pih.wristband.patientDashboard.includes";
        public static final String VISIT_ACTIONS_INCLUDES = "coreapps.patientDashboard.includes";

        public static final String RADIOLOGY_TAB = "radiologyapp.tab";
        public static final String APPOINTMENTS_TAB = "appointmentschedulingui.tab";

        public static final String EDIT_PATIENT_CONTACT_INFO = "registrationapp.editPatientContactInfo";
        public static final String EDIT_PATIENT_DEMOGRAPHICS = "registrationapp.editPatientDemographics";

        public static final String PIH_HEADER_EXTENSION = "pih.header";

        public static final String DEATH_CERTIFICATE_HEADER_EXTENSION = "pih.header.deathCertificate";

        public static final String REPORTING_AD_HOC_ANALYSIS = "reportingui.dataExports.adHoc";

        // Reports
        public static final String DAILY_REGISTRATIONS_OVERVIEW_REPORT = "mirebalaisreports.overview.dailyRegistrations";
        public static final String DAILY_CHECK_INS_OVERVIEW_REPORT = "mirebalaisreports.overview.dailyCheckIns";
        public static final String DAILY_CLINICAL_ENCOUNTERS_OVERVIEW_REPORT = "mirebalaisreports.overview.dailyClinicalEncounters";
        public static final String DAILY_INPATIENTS_OVERVIEW_REPORT = "mirebalaisreports.overview.inpatientDaily";
        public static final String MONTHLY_INPATIENTS_OVERVIEW_REPORT = "mirebalaisreports.overview.inpatientMonthly";

        public static final String NON_CODED_DIAGNOSES_DATA_QUALITY_REPORT = "mirebalaisreports.dataQuality.nonCodedDiagnoses";

        public static final String USERS_AND_PROVIDERS_DATA_EXPORT = "mirebalaisreports.dataExports.usersAndProviders";
        public static final String LQAS_DATA_EXPORT = "mirebalaisreports.dataExports.lqasDiagnoses";
        public static final String ALL_PATIENTS_WITH_IDS_DATA_EXPORT = "mirebalaisreports.dataExports.allPatientsWithIds";
        public static final String APPOINTMENTS_DATA_EXPORT = "mirebalaisreports.dataExports.appointments";

    }

    public static final class ExtensionPoints {
        public static final String OVERALL_ACTIONS = "patientDashboard.overallActions";
        public static final String VISIT_ACTIONS = "patientDashboard.visitActions";
        public static final String AWAITING_ADMISSION_ACTIONS = "coreapps.app.awaitingAdmissionActions";
        public static final String ENCOUNTER_TEMPLATE = "org.openmrs.referenceapplication.encounterTemplate";
        public static final String HOME_PAGE = "org.openmrs.referenceapplication.homepageLink";
        public static final String DEATH_INFO_HEADER = "patientHeader.deathInfo";
        public static final String DASHBOARD_TAB = "patientDashboard.tabs";
        public static final String DASHBOARD_INCLUDE_FRAGMENTS = "patientDashboard.includeFragments";
        public static final String SYSTEM_ADMINISTRATION_PAGE = "systemAdministration.apps";
        public static final String REPORTING_DATA_EXPORT = "org.openmrs.module.reportingui.reports.dataexport";
        public static final String REPORTING_OVERVIEW_REPORTS = "org.openmrs.module.reportingui.reports.overview";
        public static final String REPORTING_DATA_QUALITY = "org.openmrs.module.reportingui.reports.dataquality";
        public static final String PATIENT_HEADER_PATIENT_CONTACT_INFO = "patientHeader.editPatientContactInfo";
        public static final String PATIENT_HEADER_PATIENT_DEMOGRAPHICS = "patientHeader.editPatientDemographics";
        public static final String CLINICIAN_DASHBOARD_FIRST_COLUMN = "patientDashboard.firstColumnFragments";
        public static final String CLINICIAN_DASHBOARD_SECOND_COLUMN = "patientDashboard.secondColumnFragments";
    }

    public static final class EncounterTemplates {
        public static final String DEFAULT = "defaultEncounterTemplate";
        public static final String CONSULT = "consultEncounterTemplate";
        public static final String NO_DETAILS = "noDetailsEncounterTemplate";
    }

    // order of lists define the order apps and extensions appear
    public static final List<String> HOME_PAGE_APPS_ORDER = Arrays.asList(
            Apps.ACTIVE_VISITS,
            Apps.PATIENT_REGISTRATION,
            Apps.CHECK_IN,
            Apps.AWAITING_ADMISSION,
            Apps.VITALS,
            Apps.APPOINTMENT_SCHEDULING_HOME,
            Apps.ARCHIVES_ROOM,
            Apps.INPATIENTS,
            Apps.REPORTS,
            Apps.LEGACY_PATIENT_REGISTRATION,
            Apps.LEGACY_PATIENT_REGISTRATION_ED,
            Apps.LEGACY_PATIENT_LOOKUP,
            Apps.DISPENSING,
            Apps.LEGACY_MPI,
            Apps.MY_ACCOUNT,
            Apps.SYSTEM_ADMINISTRATION);

    public static final List<String> SYSTEM_ADMINISTRATION_APPS_ORDER = Arrays.asList(
            Apps.MANAGE_ACCOUNTS,
            Apps.MANAGE_PRINTERS,
            Apps.DEFAULT_PRINTERS,
            Apps.MERGE_PATIENTS,
            Apps.REGISTER_TEST_PATIENT,
            Apps.FEATURE_TOGGLES);

    public static final List<String> OVERALL_ACTIONS_ORDER = Arrays.asList(
            Extensions.CREATE_VISIT_OVERALL_ACTION,
            Extensions.CREATE_RETROSPECTIVE_VISIT_OVERALL_ACTION,
            Extensions. REQUEST_PAPER_RECORD_OVERALL_ACTION,
            Extensions.PRINT_PAPER_FORM_LABEL_OVERALL_ACTION,
            Extensions.PRINT_ID_CARD_OVERALL_ACTION,
            Extensions.PRINT_WRISTBAND_OVERALL_ACTION,
            Extensions.REQUEST_APPOINTMENT_OVERALL_ACTION,
            Apps.SCHEDULE_APPOINTMENT,
            Extensions.MERGE_VISITS_OVERALL_ACTION,
            Extensions.DEATH_CERTIFICATE_OVERALL_ACTION,
            Extensions.EDIT_PATIENT_DEMOGRAPHICS,
            Extensions.EDIT_PATIENT_CONTACT_INFO);

    public static final List<String> VISIT_ACTIONS_ORDER = Arrays.asList(
            Extensions.CHECK_IN_VISIT_ACTION,
            Extensions.CONSULT_NOTE_VISIT_ACTION,
            Extensions.ADMISSION_NOTE_VISIT_ACTION,
            Extensions.VITALS_CAPTURE_VISIT_ACTION,
            Extensions.ED_CONSULT_NOTE_VISIT_ACTION,
            Extensions.DISPENSE_MEDICATION_VISIT_ACTION,
            Extensions.SURGICAL_NOTE_VISIT_ACTION,
            Extensions.ORDER_XRAY_VISIT_ACTION,
            Extensions.ORDER_CT_VISIT_ACTION,
            Extensions.ORDER_ULTRASOUND_VISIT_ACTION);

    public static final List<String> AWAITING_ADMISSION_ACTIONS_ORDER = Arrays.asList(
            Extensions.ADMISSION_FORM_AWAITING_ADMISSION_ACTION,
            Extensions.DENY_ADMISSION_FORM_AWAITING_ADMISSION_ACTION);

    public static final List<String> REPORTING_OVERVIEW_REPORTS_ORDER = Arrays.asList(
            Extensions.DAILY_REGISTRATIONS_OVERVIEW_REPORT,
            Extensions.DAILY_CHECK_INS_OVERVIEW_REPORT,
            Extensions.DAILY_CLINICAL_ENCOUNTERS_OVERVIEW_REPORT,
            Extensions.DAILY_INPATIENTS_OVERVIEW_REPORT,
            Extensions.MONTHLY_INPATIENTS_OVERVIEW_REPORT);

    public static final List<String> REPORTING_DATA_EXPORT_REPORTS_ORDER = Arrays.asList(
            Extensions.USERS_AND_PROVIDERS_DATA_EXPORT,
            Extensions.LQAS_DATA_EXPORT,
            Extensions.ALL_PATIENTS_WITH_IDS_DATA_EXPORT,
            Extensions.APPOINTMENTS_DATA_EXPORT);

}
