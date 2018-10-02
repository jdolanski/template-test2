// Exported from:        http://xlrelease.chep.com/#/templates/Folder579209860-Folder49251542-Release289119679/releasefile
// XL Release version:   8.5.0-SNAPSHOT
// Date created:         Tue Oct 02 14:34:31 CEST 2018

xlr {
  template('SAP Landscape Outage') {
    folder('SAP/ABAP')
    variables {
      listBoxVariable('environment') {
        label 'Environment'
        description 'Choose an environment to perform the action on'
        possibleValues 'SAP test systems (BW,ERP,Gateway,SRM)', 'SAP production systems (BW,ERP,Gateway,SRM)'
        value 'SAP test systems (BW,ERP,Gateway,SRM)'
      }
      listBoxVariable('action_full_name') {
        required false
        showOnReleaseStart false
        label 'Action'
        description 'Action to perform on selected environment.  If the action has not been configured for the selected environment, then nothing will happen.'
        possibleValues 'Start SAP', 'Stop SAP', 'Environment Validation', 'Check SAP'
        value 'Start SAP'
      }
      booleanVariable('parallel') {
        required false
        showOnReleaseStart false
        label 'Do multihost actions in parallel'
      }
      booleanVariable('stop_j2ee') {
        showOnReleaseStart false
      }
      booleanVariable('shutdown_db') {
        showOnReleaseStart false
      }
      booleanVariable('startup') {
        showOnReleaseStart false
      }
      stringVariable('host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('sid') {
        required false
        showOnReleaseStart false
      }
      stringVariable('f5_host') {
        showOnReleaseStart false
      }
      stringVariable('f5_vip') {
        showOnReleaseStart false
      }
      stringVariable('f5_enable') {
        showOnReleaseStart false
      }
      stringVariable('f5_disable') {
        showOnReleaseStart false
      }
      stringVariable('f5_maint') {
        required false
        showOnReleaseStart false
      }
      stringVariable('control_task') {
        required false
        showOnReleaseStart false
      }
      stringVariable('start_apps') {
        required false
        showOnReleaseStart false
      }
      stringVariable('control_task2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('slack_channel') {
        required false
        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
        value '#sap_web-admin'
      }
      stringVariable('slack_ts') {
        required false
        showOnReleaseStart false
        description 'LEAVE THIS FIELD BLANK'
      }
      stringVariable('siduser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host_check_output') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host_check_err') {
        required false
        showOnReleaseStart false
      }
      stringVariable('color') {
        required false
        showOnReleaseStart false
        value 'good'
      }
      stringVariable('host_check_exitcode') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host2_check_err') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host2_check_output') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host2_check_exitcode') {
        required false
        showOnReleaseStart false
      }
      stringVariable('err') {
        required false
        showOnReleaseStart false
      }
      stringVariable('output') {
        required false
        showOnReleaseStart false
      }
      booleanVariable('stopscs') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host1_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host2_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('StopStartparam') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host3') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host4') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host3_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host4_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('PAS_Sys_Num') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANANumberofWorkers') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_Sys_Num') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ShortActionName') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host5') {
        required false
        showOnReleaseStart false
      }
      stringVariable('host5_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bi_java_siduser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('releaseStartDateUnix') {
        required false
        showOnReleaseStart false
      }
      stringVariable('releaseStartDate') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_SID') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ControlM-Resources') {
        required false
        showOnReleaseStart false
      }
      stringVariable('CCMSPingAgentSysNum') {
        required false
        showOnReleaseStart false
      }
      stringVariable('CCMSAgentComplete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('VertexHost') {
        required false
        showOnReleaseStart false
      }
      stringVariable('vertex_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_SID') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('Sybase_IQ_Host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAP_IQ_Complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_siduser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_precalc_host1') {
        showOnReleaseStart false
      }
      stringVariable('bw_precalc_user1') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc1_complete') {
        required false
        showOnReleaseStart false
      }
      passwordVariable('bw_precalc_password') {
        required false
        showOnReleaseStart false
        value '{b64}KDFe4SGBv9foii9qgV+Iwg=='
      }
      stringVariable('hana_maintenance_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ccms_alerts_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('MonitoredBySolMan') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_precalc_host2') {
        required false
        showOnReleaseStart false
        label 'bw_precalc_host2'
      }
      stringVariable('bw_precalc_host3') {
        required false
        showOnReleaseStart false
        label 'bw_precalc_host3'
      }
      stringVariable('bw_precalc_host4') {
        required false
        showOnReleaseStart false
        label 'bw_precalc_host4'
      }
      stringVariable('bw_precalc_host5') {
        required false
        showOnReleaseStart false
        label 'bw_precalc_host5'
      }
      stringVariable('bw_precalc_host6') {
        required false
        showOnReleaseStart false
        label 'bw_precalc_host6'
      }
      stringVariable('precalc2_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('Oracle_DB_OS') {
        required false
        showOnReleaseStart false
        value 'Solaris'
      }
      stringVariable('oracle_action_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_f5_vip') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_f5_enable') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_f5_vip') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_f5_enable') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_sid') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host2_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host3') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host3_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host4') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host4_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_CI_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_ControlM-Resources') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_ControlM-Resources') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_sid') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_ControlM-Resources') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_sid') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_host') {
        required false
        showOnReleaseStart false
      }
      booleanVariable('Apply_Windows_Patches') {
        required false
        label 'Wintel Team to apply Windows patches?'
        description 
      }
      booleanVariable('Apply_SQL_Server_Patches') {
        required false
        label 'SQL Server Team to perform SQL Server patches ?'
      }
      booleanVariable('restart_ERP') {
        label 'Restart SAP ERP application ?'
        value true
      }
      booleanVariable('restart_Oracle_ERP') {
        label 'Restart Oracle database for SAP ERP?'
        description 'If ticked, tasks to suspend backups, monitoring will be executed in the workflow'
      }
      booleanVariable('reboot_ERP') {
        label 'Tick this box if the server hosting the Oracle ERP database will be rebooted'
        description 'If ticked, tasks to suspend backups, monitoring will be executed in the workflow'
      }
      booleanVariable('ERP_UNIX_patching') {
        required false
        label 'Tick if the server hosting the SAP ERP CI server will be patched / upgraded'
        description 'If ticked, tasks to suspend backups, monitoring , perform OS patching/upgrade will be executed in the workflow'
      }
      stringVariable('revtracs_ERP') {
        required false
        label 'Rev-Tracs to apply in ERP?'
        description 'List the rev-tracs that will have to be applied in ERP during this outage. Leave blank if none.'
        value 
      }
      booleanVariable('revtracs_post_steps_ERP') {
        required false
        label 'Rev-Trac manual post steps in ERP?'
        description 'Tick if there are any Rev-Trac manual post steps in ERP. Please edit the task description in the generated release with something relevant.'
      }
      booleanVariable('ERP_upgrade') {
        required false
        label 'Tick if SAP ERP is being upgraded'
        description 
      }
      booleanVariable('ERP_DB_upgrade') {
        required false
        label 'Tick if the database for SAP ERP will be upgraded'
      }
      booleanVariable('restart_BW') {
        label 'Restart SAP BW application ?'
        value true
      }
      booleanVariable('reboot_BW') {
        required false
        label 'Tick this box if the server hosting the SAP BW central instance will be rebooted'
        description 'If ticked, tasks to suspend backups, monitoring will be executed in the workflow'
      }
      booleanVariable('BW_UNIX_patching') {
        required false
        label 'Tick if the server hosting the SAP BW ABAP CI server will be patched / upgraded'
        description 'If ticked, tasks to suspend backups, monitoring , perform OS patching/upgrade will be executed in the workflow'
      }
      booleanVariable('StopStartHANA') {
        label 'Restart SAP HANA database for SAP BW?'
        description 
        value true
      }
      booleanVariable('Unity_storage_patching') {
        required false
        label 'Perform maintenance on the Unity Storage?'
        description 'Tick if the Storage team will perform maintenance of the Unity Storage, if so, there will be a task for maintenance once HANA is stopped.'
      }
      booleanVariable('RestartSybaseIQ') {
        label 'Restart SAP IQ database for SAP BW?'
        description 
        value true
      }
      booleanVariable('reboot_IQ') {
        required false
        label 'Tick this box if the Linux server hosting the SAP IQ DB will be rebooted / have its OS patched or upgraded'
      }
      booleanVariable('restart_Oracle_BIJAVA') {
        label 'Restart Oracle  database for SAP BI-JAVA?'
      }
      booleanVariable('reboot_BIJAVA') {
        label 'Tick this box if the server hosting the Oracle database for BI-JAVA will be rebooted'
        description 'If ticked, tasks to suspend backups, monitoring will be executed in the workflow'
      }
      booleanVariable('Java_stack_UNIX_patching') {
        required false
        label 'Tick if the server hosting the JAVA Stack CI server will be patched / upgraded'
        description 'If ticked, tasks to suspend backups, monitoring , perform OS patching/upgrade will be executed in the workflow'
      }
      stringVariable('revtracs_BW') {
        required false
        label 'Rev-Tracs to apply in BW?'
        description 'List the rev-tracs that will have to be applied in BW during this outage. Leave blank if none.'
        value 
      }
      booleanVariable('revtracs_post_steps_BW') {
        required false
        label 'Rev-Trac manual post steps in BW?'
        description 'Tick if there are any Rev-Trac manual post steps in BW. Please edit the task description in the generated release with something relevant.'
      }
      booleanVariable('restart_GW') {
        label 'Restart SAP Gateway application ?'
        value true
      }
      booleanVariable('restart_Oracle_GW') {
        label 'Restart Oracle  database for SAP Gateway?'
        description 'If ticked, tasks to suspend backups, monitoring will be executed in the workflow'
      }
      booleanVariable('reboot_GW') {
        label 'Tick this box if the server hosting the Oracle database for SAP Gateway will be rebooted'
        description 'If ticked, tasks to suspend backups, monitoring, stop/start Control-M agent will be executed in the workflow'
      }
      booleanVariable('GW_UNIX_patching') {
        required false
        label 'Tick if the server hosting the SAP Gateway CI server will be patched / upgraded'
        description 'If ticked, tasks to suspend backups, monitoring, stop/start Control-M agent, patch/upgrade OS  will be executed in the workflow'
      }
      stringVariable('revtracs_GW') {
        required false
        label 'Rev-Tracs to apply in GW?'
        description 'List the rev-tracs that will have to be applied in GW during this outage. Leave blank if none.'
        value 
      }
      booleanVariable('revtracs_post_steps_GW') {
        required false
        label 'Rev-Trac manual post steps in GW?'
        description 'Tick if there are any Rev-Trac manual post steps in GW. Please edit the task description in the generated release with something relevant.'
      }
      booleanVariable('restart_SRM') {
        label 'Restart SAP SRM application ?'
        value true
      }
      booleanVariable('restart_Oracle_SRM') {
        required false
        label 'Restart Oracle database for SAP SRM?'
        description 'If ticked, tasks to suspend backups, monitoring will be executed in the workflow'
      }
      booleanVariable('reboot_SRM') {
        required false
        label 'Tick this box if the server hosting the Oracle database for SAP SRM will be rebooted'
        description 'If ticked, tasks to suspend backups, monitoring will be executed in the workflow'
      }
      booleanVariable('reboot_Streamserve') {
        required false
        label 'Tick this box if the Linux server hosting the Streamserve application will be rebooted'
        description 'If ticked, tasks to stop the control-M agent will be generated'
      }
      booleanVariable('Streamserve_UNIX_patching') {
        required false
        label 'Tick this box if the Linux server hosting the Streamserve application will have its OS patched / upgraded'
        description 'If ticked, tasks to suspend backups, monitoring, stop/start Control-M agent, patch/upgrade OS  will be executed in the workflow'
      }
      stringVariable('erp_siduser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_siduser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('CCMSAgentBWComplete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_siduser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('CCMSAgentGWComplete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_sid') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host2_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host3') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host3_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host4') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host4_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host5') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host5_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_start_host2_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_start_host3_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_start_host4_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_stop_host4_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host4_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host3_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host2_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host5_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_f5_disable') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_f5_end') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_f5_disable') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_f5_end') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc1_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('interfaces_server_name') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_host2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_stop_host2_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_CI_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_host_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_host1') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_host1_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('vertex_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc1_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc2_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc3_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc4_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc5_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc6_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_host1_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host1_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host2_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host3_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host4_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_host1_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('gw_host2_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('oracle_gw_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('vertex_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_host_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('java_stack_host1_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_CI_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_siduser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_trexSysNum') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_host2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_CI_SysNum') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_trexhost') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_ipchost') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_trexadm') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_ipcuser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('CCMSAgentSRMComplete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc2_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc3_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc4_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc5_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('precalc6_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_started') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_stopped') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAP_IQ_Stop_Complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAP_IQ_Start_Complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host2_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host3_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('bw_host4_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('suspend_erp_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('suspend_bw_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('suspend_srm_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('release_erp_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('release_bw_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('release_srm_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('lock_users_erp_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('lock_users_srm_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('lock_users_bw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('unlock_users_erp_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('unlock_users_bw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('unlock_users_srm_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAP_system_message_line1') {
        required false
        value 'This SAP system will go down for'
      }
      stringVariable('SAP_system_message_line2') {
        required false
        value 'maintenance. Please log off as soon as'
      }
      stringVariable('SAP_system_message_line3') {
        required false
        value 'possible. Thank you and best regards.'
      }
      integerVariable('SAP_system_message_expire_in_n_hours') {
        label 'Number of hours until the message expires'
        value 2
      }
      stringVariable('message_post_erp_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('message_post_bw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('message_post_srm_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('message_delete_erp_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('message_delete_bw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('message_delete_srm_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('StreamserveEnvironment') {
        required false
        showOnReleaseStart false
      }
      stringVariable('streamserve_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('streamserve_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('BOBIURL') {
        required false
        showOnReleaseStart false
      }
      stringVariable('suspend_gw_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('message_post_gw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_ERP_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_recipients') {
        required false
        showOnReleaseStart false
        label 'OEM recipients'
        description 'Recipients that will be notified when OEM blackout is added or removed'
        value 'DL-DataBaseOracle@CHEP.com'
      }
      stringVariable('OEM_JavaStack_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_SRM_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_GW_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_ERP_resumed') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_SRM_resumed') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_GW_resumed') {
        required false
        showOnReleaseStart false
      }
      stringVariable('OEM_JavaStack_resumed') {
        required false
        showOnReleaseStart false
      }
      stringVariable('lock_users_gw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('unlock_users_gw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('release_gw_jobs_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('message_delete_gw_done') {
        required false
        showOnReleaseStart false
      }
      stringVariable('MastersafEnvironment') {
        required false
        showOnReleaseStart false
      }
      stringVariable('msaf_stopped') {
        required false
        showOnReleaseStart false
      }
      stringVariable('msaf_started') {
        required false
        showOnReleaseStart false
      }
      stringVariable('InvoicewareEnvironment') {
        required false
        showOnReleaseStart false
      }
      stringVariable('invoiceware_stopped') {
        required false
        showOnReleaseStart false
      }
      stringVariable('invoiceware_started') {
        required false
        showOnReleaseStart false
      }
      stringVariable('release_url') {
        required false
        showOnReleaseStart false
      }
      stringVariable('outage_test_notification_recipients') {
        required false
        showOnReleaseStart false
        label 'those people will receive an email when the ERP system is locked and unlocked externally'
        value 'Kerry.Tobbell@brambles.com,Janeth.Henao@brambles.com,CHEP.SAP@chep.com,Anil.Varanasi@brambles.com,Saichand.Pullepu@brambles.com,vrashabh.pudale@brambles.com,Madhukar.Anthireddy@brambles.com,Gary.Duttlinger@brambles.com,Sathish.Nagam@brambles.com,Jodi.Waalewyn@brambles.com,Anand.Bawa@brambles.com,Tom.Beatty@brambles.com,Tony.Green@brambles.com,Fay.Glennie@brambles.com'
      }
      stringVariable('outage_prod_notification_recipients') {
        required false
        showOnReleaseStart false
        label 'those people will receive an email when the ERP system is locked and unlocked externally'
        value 'Kerry.Tobbell@brambles.com,Janeth.Henao@brambles.com,CHEP.SAP@chep.com,Anil.Varanasi@brambles.com,Saichand.Pullepu@brambles.com,vrashabh.pudale@brambles.com,Madhukar.Anthireddy@brambles.com,Gary.Duttlinger@brambles.com,Sathish.Nagam@brambles.com,Jodi.Waalewyn@brambles.com,Anand.Bawa@brambles.com,Tom.Beatty@brambles.com,Tony.Green@brambles.com,Fay.Glennie@brambles.com'
      }
      stringVariable('outage_CC') {
        required false
        showOnReleaseStart false
        value 'DL-SAPWebAdmin@CHEP.com,gpm@chep.com'
      }
      stringVariable('time1') {
        required false
        showOnReleaseStart false
      }
      stringVariable('time2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HumanReadableInterruption') {
        required false
        showOnReleaseStart false
      }
      stringVariable('interruption') {
        required false
        showOnReleaseStart false
      }
      stringVariable('difference') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_sap_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_bw_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_srm_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_cso_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_sap_released') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_bw_released') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_srm_released') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_cso_released') {
        required false
        showOnReleaseStart false
      }
      stringVariable('srm_url') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_erp_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_erp_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_bw_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_erp_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_bw_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_gw_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_gw_released') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_gw_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('Streamserve_host') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_strs_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_gw_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_agt_strs_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('oracle_java_stack_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('backup_hostname_java_stack') {
        required false
        showOnReleaseStart false
      }
      stringVariable('backup_hostname_gw') {
        required false
        showOnReleaseStart false
      }
      stringVariable('backup_hostname_erp') {
        required false
        showOnReleaseStart false
      }
      stringVariable('backup_hostname_bw') {
        required false
        showOnReleaseStart false
      }
      stringVariable('oracle_gw_stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_Oracle_listener') {
        required false
        showOnReleaseStart false
      }
      stringVariable('BusinessObjectsEnvironment') {
        showOnReleaseStart false
      }
      stringVariable('sap_bo_ds_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('sap_bo_ds_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('sap_bo_bi_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('sap_bo_bi_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('sap_bo_bi_patch') {
        required false
        showOnReleaseStart false
      }
      stringVariable('sap_bo_ds_patch') {
        required false
        showOnReleaseStart false
      }
      stringVariable('TRAXEnvironment') {
        required false
        showOnReleaseStart false
      }
      stringVariable('trax_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('trax_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('trax_patch') {
        required false
        showOnReleaseStart false
      }
      stringVariable('Unity_storage_name') {
        required false
        showOnReleaseStart false
      }
      stringVariable('oracle_java_stack_start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_dqs_suspended') {
        required false
        showOnReleaseStart false
      }
      stringVariable('ctm_dqs_released') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_orauser') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_upg_prep1') {
        required false
        showOnReleaseStart false
      }
      stringVariable('erp_upg_post1') {
        required false
        showOnReleaseStart false
      }
      stringVariable('BOBI_f5_vip') {
        required false
        showOnReleaseStart false
      }
      stringVariable('BOBI_f5_enable_maintenance') {
        required false
        showOnReleaseStart false
      }
      stringVariable('f5_bobi_maint') {
        required false
        showOnReleaseStart false
      }
      stringVariable('BOBI_f5_disable_maintenance') {
        required false
        showOnReleaseStart false
      }
      stringVariable('f5_bobi_opened') {
        required false
        showOnReleaseStart false
      }
      stringVariable('f5_gw_maint') {
        required false
        showOnReleaseStart false
      }
      stringVariable('suspend_srm_jobs_complete2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('suspend_erp_jobs_complete2') {
        required false
        showOnReleaseStart false
      }
      stringVariable('power_bi_stop') {
        required false
        showOnReleaseStart false
      }
      stringVariable('PowerBIEnvironment') {
        required false
        showOnReleaseStart false
      }
      stringVariable('power_bi_patch') {
        required false
        showOnReleaseStart false
      }
      stringVariable('power_bi_start') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAPIDM_URL') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAPIDM_f5_vip') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAPIDM_f5_enable_maintenance') {
        required false
        showOnReleaseStart false
      }
      stringVariable('f5_SAPIDM_maint') {
        required false
        showOnReleaseStart false
      }
      stringVariable('SAPIDM_f5_disable_maintenance') {
        required false
        showOnReleaseStart false
      }
      stringVariable('f5_SAPIDM_opened') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_SID_production_standby') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_Sys_Num_production_standby') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_production_standby_stopped') {
        required false
        showOnReleaseStart false
      }
      stringVariable('HANA_production_standby_started') {
        required false
        showOnReleaseStart false
      }
      stringVariable('edi_patch') {
        required false
        showOnReleaseStart false
      }
    }
    description 'to use to bring down/up a whole SAP landscape (ERP,BW,GW,SRM) and connected systems.\n' +
                'template designed for test and production.\n' +
                '\n' +
                'please see instructions on how to create a release here : https://bramblesgroup.sharepoint.com/teams/webadmin/_layouts/OneNote.aspx?id=%2Fteams%2Fwebadmin%2FShared%20Documents%2FSWAT&wd=target%28Xebia%20Labs.one%7CA8430F86-779B-42F2-9652-C6F84B7B089E%2FHow%20to%20create%20a%20release%20for%20SAP%20landscape%20outage%7C579BD4A5-F98B-493D-B0A3-F14FE0C57B00%2F%29'
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-05T15:00:00+0100')
    scriptUsername 'admin'
    scriptUserPassword '{b64}C0SqJ8Ewz++2uNODwygGKQ=='
    phases {
      phase('Initialize') {
        color '#009CDB'
        tasks {
          script('Set Variables') {
            script (['''\
id = getCurrentRelease().id.split('/')
releaseVariables['release_url'] = "http://xlrelease.chep.com/#/releases/"+id[1]+'-'+id[2]+'-'+id[3]
if releaseVariables['environment'] == 'SAP production systems (BW,ERP,Gateway,SRM)':
    releaseVariables['erp_sid'] = 'PRD'
    releaseVariables['erp_siduser'] = 'prdadm'
    releaseVariables['erp_orauser'] = 'oraprd'
    releaseVariables['erp_host'] = 'r3prd.chep.com'
    releaseVariables['backup_hostname_erp'] = 'usdc2up13.chep.com'
    releaseVariables['erp_Oracle_listener'] = 'LISTENER_PRD_PRIMARY'	
    releaseVariables['PAS_Sys_Num'] = '00'
    releaseVariables['erp_host2'] = 'usdcvup14.chep.com'
    releaseVariables['erp_host3'] = 'usdcvup15.chep.com'
    releaseVariables['erp_host4'] = 'usdcvup22.chep.com'
    releaseVariables['erp_host5'] = 'usdcvup41.chep.com'
    releaseVariables['f5_host'] = 'usdc2lb01v01.chep.com'
    releaseVariables['erp_f5_vip'] = 'PlantsPrd_HTTPS'
    releaseVariables['erp_f5_enable'] = '"/Common/SystemUnavailable"'
    releaseVariables['erp_f5_disable'] = '"/Common/PlantsPrd","/Common/Remove_Server_Header"'
    releaseVariables['parallel'] = True
    releaseVariables['erp_ControlM-Resources'] = 'WW-SAP-SYSTEM'
    releaseVariables['erp_CCMSPingAgentSysNum'] = '00'
    releaseVariables['VertexHost'] = 'usdcvlp040.chep.com'
    releaseVariables['VertexEnvironment'] = 'Production'
    releaseVariables['StreamserveEnvironment'] = 'Production'
    releaseVariables['Streamserve_host'] = 'usdcvlp025.chep.com'
    releaseVariables['MastersafEnvironment'] = 'Production'
    releaseVariables['InvoicewareEnvironment'] = 'Production'
    releaseVariables['BusinessObjectsEnvironment'] = 'Production'
    releaseVariables['PowerBIEnvironment'] = 'Production'
    releaseVariables['TRAXEnvironment'] = 'Production'
    releaseVariables['bw_sid'] = 'BWP'
    releaseVariables['bw_siduser'] = 'bwpadm'
    releaseVariables['bw_host'] = 'bwprd01.chep.com'
    releaseVariables['backup_hostname_bw'] = 'usdcvup70.chep.com'
    releaseVariables['bw_PAS_Sys_Num'] = '10'
    releaseVariables['bw_host2'] = 'usdcvup23.chep.com'
    releaseVariables['bw_host3'] = 'usdcvup24.chep.com'
    releaseVariables['bw_host4'] = 'usdcvup33.chep.com'
    releaseVariables['HANA_host'] = 'usdc2hp05.chep.com'
    releaseVariables['HANA_Sys_Num'] = '00'
    releaseVariables['HANANumberofWorkers'] = '4'
    releaseVariables['HANA_SID'] = 'HBP'
    releaseVariables['Unity_storage_name'] = 'USDC2UNY01'
    releaseVariables['java_stack_host'] = 'bwbjp'
    releaseVariables['backup_hostname_java_stack'] = 'usdcvlp60.chep.com'
    releaseVariables['java_stack_host1'] = 'usdcvlp61'
    releaseVariables['java_stack_siduser'] = 'bjpadm'	
    releaseVariables['java_stack_SID'] = 'BJP'
    releaseVariables['java_stack_Oracle_listener'] = 'LISTENER'	
    releaseVariables['java_stack_separate_oracle_DB'] = True
    releaseVariables['bw_ControlM-Resources'] = 'WW-BW-SYSTEM'	
    releaseVariables['bw_CCMSPingAgentSysNum'] = '00'
    releaseVariables['Sybase_IQ_Host'] = 'usdcvlp043.chep.com'
    releaseVariables['bw_precalc_host1'] = 'USORSDV141'
    releaseVariables['bw_precalc_host2'] = 'USORSMS325'
    releaseVariables['bw_precalc_host3'] = 'USORSMS327'
    releaseVariables['bw_precalc_host4'] = 'USDCVMS96'
    releaseVariables['bw_precalc_host5'] = 'USORSMS326'
    releaseVariables['bw_precalc_host6'] = 'USORSDV140'
    releaseVariables['bw_precalc_user1'] = 'bwprecalc'
    releaseVariables['gw_sid'] = 'GWP'
    releaseVariables['gw_siduser'] = 'gwpadm'
    releaseVariables['gw_host'] = 'gwprd.chep.com'
    releaseVariables['backup_hostname_gw'] = 'usdcvlp028.chep.com'
    releaseVariables['gw_PAS_Sys_Num'] = '00'
    releaseVariables['gw_host2'] = 'usdcvlp026.chep.com'
    releaseVariables['gw_f5_vip'] = 'ESP_Prod_HTTPS'
    releaseVariables['gw_f5_enable'] = '"/Common/SystemUnavailable"'
    releaseVariables['gw_f5_disable'] = '"/Common/ESP_Prod"'
    releaseVariables['gw_Oracle_listener'] = 'LISTENER'
    releaseVariables['MonitoredBySolMan'] = 'CEN'
    releaseVariables['Oracle_DB_Managed_by_SAP_WebAdmin'] = False
    releaseVariables['Oracle_DB_is_not_backed_up'] = False
    releaseVariables['CCMSPingAgentSysNum'] = '00'
    releaseVariables['srm_sid'] = 'SRP'
    releaseVariables['srm_CI_SysNum'] = '00'
    releaseVariables['srm_host'] = 'srmprd.chep.com'
    releaseVariables['backup_hostname_srm'] = 'usorlu85.chep.com'
    releaseVariables['srm_virtualhostname'] = 'srmprd'
    releaseVariables['srm_url'] = 'srm.chep.com'
    releaseVariables['srm_host2'] = 'usorlu77.chep.com'
    releaseVariables['srm_siduser'] = 'srpadm'
    releaseVariables['srm_ipcuser'] = 'ipcadm'
    releaseVariables['srm_ipchost'] = 'usorlu77'
    releaseVariables['srm_trexhost'] = 'usorlu77'
    releaseVariables['srm_trexadm'] = 'trexadm'
    releaseVariables['srm_trexSysNum'] = '00'
    releaseVariables['srm_ControlM-Resources'] = 'WW-SRM-SYSTEM'
    releaseVariables['interfaces_server_name'] = 'chephubprd'
    releaseVariables['BOBIURL'] = 'http://boprd.chep.com/BOE/BI'
    releaseVariables['BOBI_f5_vip'] = 'BO_Prod_HTTP'
    releaseVariables['BOBI_f5_disable_maintenance'] = '"/Common/CHEP_Favicon"'
    releaseVariables['BOBI_f5_enable_maintenance'] = '"/Common/SYSTEM_OFFLINE"'
    releaseVariables['SAPIDM_URL'] = 'http://sappasswordreset.chep.com'
    releaseVariables['SAPIDM_f5_vip'] = 'SAPPasswordReset'
    releaseVariables['SAPIDM_f5_disable_maintenance'] = '"/Common/SAP_IDM"'
    releaseVariables['SAPIDM_f5_enable_maintenance'] = '"/Common/SYSTEM_OFFLINE"'
	
# Set variables based on environment
if releaseVariables['environment'] == 'SAP test systems (BW,ERP,Gateway,SRM)':
    releaseVariables['erp_sid'] = 'TST'
    releaseVariables['erp_siduser'] = 'tstadm'
    releaseVariables['erp_orauser'] = 'oratst'
    releaseVariables['erp_host'] = 'erptst.chep.com'
    releaseVariables['backup_hostname_erp'] = 'usdc3ut15.chep.com'
    releaseVariables['erp_Oracle_listener'] = 'LISTENER_TST'	
    releaseVariables['PAS_Sys_Num'] = '00'
    releaseVariables['erp_host2'] = 'usdcvut83.chep.com'
    releaseVariables['erp_host3'] = 'usdcvut84.chep.com'
    releaseVariables['erp_host4'] = ''
    releaseVariables['erp_host5'] = ''
    releaseVariables['f5_host'] = 'usdc2lb01v01.chep.com'
    releaseVariables['erp_f5_vip'] = 'PlantsTst_HTTPS'
    releaseVariables['erp_f5_enable'] = '"/Common/SystemUnavailable"'
    releaseVariables['erp_f5_disable'] = '"/Common/ERP_Test","/Common/Remove_Server_Header"'
    releaseVariables['parallel'] = True
    releaseVariables['erp_ControlM-Resources'] = 'WW-SAP-SYSTEM'
    releaseVariables['erp_CCMSPingAgentSysNum'] = '00'
    releaseVariables['VertexHost'] = 'usdcvlt038.chep.com'
    releaseVariables['VertexEnvironment'] = 'Test'
    releaseVariables['StreamserveEnvironment'] = 'Test'
    releaseVariables['Streamserve_host'] = 'usdcvlt018.chep.com'
    releaseVariables['MastersafEnvironment'] = 'Test'
    releaseVariables['InvoicewareEnvironment'] = 'Test'
    releaseVariables['BusinessObjectsEnvironment'] = 'Test'
    releaseVariables['PowerBIEnvironment'] = 'Development'
    releaseVariables['TRAXEnvironment'] = 'Test'
    releaseVariables['bw_sid'] = 'BWT'
    releaseVariables['bw_siduser'] = 'bwtadm'
    releaseVariables['bw_host'] = 'bwtst.chep.com'
    releaseVariables['backup_hostname_bw'] = 'usdcvut72.chep.com'
    releaseVariables['bw_PAS_Sys_Num'] = '02'
    releaseVariables['bw_host2'] = 'usdcvut87.chep.com'
    releaseVariables['bw_host3'] = ''
    releaseVariables['bw_host4'] = ''
    releaseVariables['HANA_host'] = 'usdc3ht1.chep.com'
    releaseVariables['HANA_Sys_Num'] = '20'
    releaseVariables['HANA_Sys_Num_production_standby'] = '00'
    releaseVariables['HANANumberofWorkers'] = '4'
    releaseVariables['HANA_SID'] = 'HBT'
    releaseVariables['HANA_SID_production_standby'] = 'HBP'
    releaseVariables['Unity_storage_name'] = 'USDC3SD05'
    releaseVariables['java_stack_host'] = 'bwbjt'
    releaseVariables['backup_hostname_java_stack'] = 'usdcvlt059.chep.com'
    releaseVariables['java_stack_host1'] = ''
    releaseVariables['java_stack_siduser'] = 'bjtadm'	
''',
'''    releaseVariables['java_stack_SID'] = 'BJT'
    releaseVariables['java_stack_Oracle_listener'] = 'LISTENER'	
    releaseVariables['java_stack_separate_oracle_DB'] = True
    releaseVariables['bw_ControlM-Resources'] = 'WW-BW-SYSTEM'	
    releaseVariables['bw_CCMSPingAgentSysNum'] = '00'
    releaseVariables['Sybase_IQ_Host'] = 'usdcvlt056.chep.com'
    releaseVariables['bw_precalc_host1'] = 'USDCVMS95'
    releaseVariables['bw_precalc_host2'] = 'USORSDV141'
    releaseVariables['bw_precalc_host3'] = ''
    releaseVariables['bw_precalc_host4'] = ''
    releaseVariables['bw_precalc_host5'] = ''
    releaseVariables['bw_precalc_user6'] = ''
    releaseVariables['bw_precalc_user1'] = 'bwprecalc'
    releaseVariables['gw_sid'] = 'GWT'
    releaseVariables['gw_siduser'] = 'gwtadm'
    releaseVariables['gw_host'] = 'gwtst.chep.com'
    releaseVariables['backup_hostname_gw'] = 'usdcvlt029.chep.com'
    releaseVariables['gw_PAS_Sys_Num'] = '00'
    releaseVariables['gw_host2'] = 'usdcvlt027.chep.com'
    releaseVariables['gw_f5_vip'] = 'ESP_Test_HTTPS'
    releaseVariables['gw_f5_enable'] = '"/Common/SystemUnavailable"'
    releaseVariables['gw_f5_disable'] = '"/Common/ESP_Test"'
    releaseVariables['gw_Oracle_listener'] = 'LISTENER'
    releaseVariables['Oracle_DB_Managed_by_SAP_WebAdmin'] = False
    releaseVariables['Oracle_DB_is_not_backed_up'] = False
    releaseVariables['MonitoredBySolMan'] = 'SMD'
    releaseVariables['CCMSPingAgentSysNum'] = '00'
    releaseVariables['srm_sid'] = 'SRT'
    releaseVariables['srm_CI_SysNum'] = '02'
    releaseVariables['srm_host'] = 'usorlu87'
    releaseVariables['backup_hostname_srm'] = 'usorlu87.chep.com'
    releaseVariables['srm_virtualhostname'] = 'srmtst'
    releaseVariables['srm_url'] = 'http://srmtst.chep.com:8002/sap/bc/gui/sap/its/bbpstart'
    releaseVariables['srm_host2'] = ''
    releaseVariables['srm_siduser'] = 'srtadm'
    releaseVariables['srm_ipcuser'] = 'ipcadm'
    releaseVariables['srm_ipchost'] = 'usorlu87'
    releaseVariables['srm_trexhost'] = 'usorlu87'
    releaseVariables['srm_trexadm'] = 'trex_srd'
    releaseVariables['srm_trexSysNum'] = '10'
    releaseVariables['srm_ControlM-Resources'] = 'WW-SRM-SYSTEM'
    releaseVariables['interfaces_server_name'] = 'chephubtst'
    releaseVariables['BOBIURL'] = 'http://botst.chep.com/BOE/BI'
    releaseVariables['BOBI_f5_vip'] = 'BO_Test_HTTP'
    releaseVariables['BOBI_f5_disable_maintenance'] = '"/Common/CHEP_Favicon","/Common/FixIECompatability"'
    releaseVariables['BOBI_f5_enable_maintenance'] = '"/Common/SYSTEM_OFFLINE"'
if releaseVariables['Unity_storage_patching'] == True:
    releaseVariables['StopStartHANA'] = True
    releaseVariables['restart_BW'] = True
'''])
          }
          manual('At this stage, variables are set. We send a reminder to the team that the next step we will be prompted to look for approvals for the proposed outage of  ${environment}') {
            description 'Please confirm you are about to ask permissions to take an outage of   ${environment}'
            team 'SAP/Web Admin Team'
          }
          manual('Confirm outage agreement for the test environment') {
            description 'Negotiate an outage window of ${environment}\n' +
            '\n' +
            'by sending an email to the following people:\n' +
            '\n' +
            'To:\n' +
            '\n' +
            'CHEP SAP <CHEP.SAP@chep.com>; Tobbell, Kerry <Kerry.Tobbell@brambles.com>; Pudale, Vrashabh <vrashabh.pudale@brambles.com>; Anthireddy, Madhukar <Madhukar.Anthireddy@brambles.com>; Bawa, Anand <Anand.Bawa@brambles.com>; Beatty, Tom <Tom.Beatty@brambles.com>; Johnson, James <James.Johnson@brambles.com>; Burgos, Luis <luis.burgos@brambles.com>; Saayman, Nicholas <Nicholas.Saayman@brambles.com>; Trollip, Wayne <Wayne.Trollip@brambles.com>; Nagam, Sathish <Sathish.Nagam@brambles.com>; Varanasi, Anil <Anil.Varanasi@brambles.com>; Pullepu, Saichand <Saichand.Pullepu@brambles.com>; CHEP QA <CHEPQA@chep.com>; CHEP SAP Security <CHEPSAPSecurity@chep.com>\n' +
            '\n' +
            'CC:\n' +
            '\n' +
            'CHEP GPM <gpm@chep.com>; DL-SAPWebAdmin <DL-SAPWebAdmin@CHEP.com>; DL-Database-Oracle <DL-DataBaseOracle@CHEP.com>\n' +
            '\n' +
            'Please be considerate by giving as much notice as possible because taking the ${environment} down impacts usually a lot of people (Developers, System Analysts, QA Team, etc.) and several systems are affected such as  (MyCHEP, etc.)\n' +
            '  \n' +
            'Click the **Complete** button below to continue organizing the outage of ${environment}\n' +
            'Click the **Fail** button below to not go further'
            team 'SAP/Web Admin Team'
            precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
          }
          manual('Confirm outage agreement for the production environment') {
            description 'Confirm that the outage of ${environment}  has been agreed by typing a ServiceNow INC or CHG reference'
            team 'SAP/Web Admin Team'
            precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
          }
          custom('Start Thread') {
            precondition 'releaseVariables[\'slack_ts\']==\'\' and releaseVariables[\'slack_channel\']!=\'\''
            script {
              type 'slack.WebAPI'
              server 'Slack WebAPI as XL-Release'
              channelin '${slack_channel}'
              text '<!channel> Template: SAP Landscape Outage'
              attachments '[{"color": "good", "title": "${release.title}", "title_link":"${release_url}", "fields": [{"title": "Status", "value": "See Replies", "short": true },{"title":"Owner","value":"${release.owner}"},{"title":"Environment","value":"SAP Landscape Outage for ${environment}"}] }]'
              channel variable('slack_channel')
              ts variable('slack_ts')
            }
          }
          custom('Notify Start') {
            precondition 'releaseVariables[\'slack_channel\']!=\'\''
            script {
              type 'slack.WebAPI'
              server 'Slack WebAPI as XL-Release'
              channelin '${slack_channel}'
              text 'Template: SAP Environment Control'
              attachments '[{"color": "good", "title": "${release.title} -  ${environment}", "fields": [{"title": "Environment", "value": "${environment}", "short": true }, {"title": "Action", "value": "", "short": true }, {"title": "Status", "value": "IN PROGRESS", "short": true }] }]'
              thread_ts '${slack_ts}'
            }
          }
          custom('Notify we will wait for pre-shutdown phase to begin') {
            description 
            precondition 'releaseVariables[\'slack_channel\']!=""'
            script {
              type 'slack.WebAPI'
              server 'Slack WebAPI as XL-Release'
              channelin '${slack_channel}'
              text 'We will now wait for the pre-shutdown phase for ${environment} to start at its scheduled time...'
              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "We will now wait for the pre-shutdown phase for ${environment} to start at its scheduled time...", "short": true }] }]'
              thread_ts '${slack_ts}'
            }
          }
        }
      }
      phase('Pre-shutdown phase') {
        color '#009CDB'
        tasks {
          sequentialGroup('Pre-shutdown steps') {
            description 
            precondition 
            tasks {
              custom('Notify the pre-shutdown phase of ${environment} is starting...') {
                description 
                precondition 'releaseVariables[\'slack_channel\']!=""'
                script {
                  type 'slack.WebAPI'
                  server 'Slack WebAPI as XL-Release'
                  channelin '${slack_channel}'
                  text 'Pre-shutdown phase for ${environment} (Stop jobs, interfaces, process chains, suspend backups, etc.) is now starting...'
                  attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Pre-shutdown phase for ${environment} (Stop jobs, interfaces, process chains, suspend backups, etc.) is now starting...", "short": true }] }]'
                  thread_ts '${slack_ts}'
                }
              }
              manual('10:00 GMT - DC-OPS to change INVAP_INV_PRE_PROCESSING from Release to Scheduled (production systems)') {
                plannedDuration 600
                team 'DC-Ops Team'
                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
              }
              parallelGroup('12:00 - BW process chains and resources') {
                tasks {
                  manual('Please stop the process chains in ${bw_sid}') {
                    description 'Click the Complete button once you have suspended the process chains in ${bw_sid}.\n' +
                    '\n' +
                    'Click the Fail button below to not go further in the outage'
                    plannedDuration 14400
                    team 'BW Technical Team'
                  }
                  sequentialGroup('Stop WW-BW-SYSTEM') {
                    tasks {
                      createRelease('Stop WW-BW-SYSTEM (Production)') {
                        precondition '(releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\') and (releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True)'
                        newReleaseTitle 'stop WW-BW-SYSTEM'
                        template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Suspend', 'Release'
                            value 'Suspend'
                          }
                          listBoxVariable('CTMEnvironment') {
                            label 'Control-M environment'
                            possibleValues 'Test', 'Production'
                            value 'Production'
                          }
                          listBoxVariable('CTMResourceName') {
                            label 'Control-M resource name'
                            possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                            value 'WW-BW-SYSTEM'
                          }
                        }
                        createdReleaseId '${ctm_bw_suspended}'
                      }
                      createRelease('Stop WW-BW-SYSTEM (Test)') {
                        precondition '(releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\') and (releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True)'
                        newReleaseTitle 'Stop WW-BW-SYSTEM'
                        template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Suspend', 'Release'
                            value 'Suspend'
                          }
                          listBoxVariable('CTMEnvironment') {
                            label 'Control-M environment'
                            possibleValues 'Test', 'Production'
                            value 'Test'
                          }
                          listBoxVariable('CTMResourceName') {
                            label 'Control-M resource name'
                            possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                            value 'WW-BW-SYSTEM'
                          }
                        }
                        createdReleaseId '${ctm_bw_suspended}'
                      }
                      gate('wait for Control-M resource control') {
                        dependencies {
                          dependency {
                            variable 'ctm_bw_suspended'
                          }
                        }
                      }
                    }
                  }
                }
              }
              parallelGroup('16:00 GMT - Shutdown WTX/MQ monitor, Control-M resources') {
                scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-05T22:16:00+0100')
                tasks {
                  manual('Shutdown WTX/MQ Monitor') {
                    description 'on ${interfaces_server_name}, run sdmon'
                    plannedDuration 300
                    team 'DC-Ops Team'
                    precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                  }
                  manual('Shutdown WTX/MQ Monitor (test environment)') {
                    description 'on ${interfaces_server_name}, run sdmon'
                    plannedDuration 300
                    team 'GPM'
                    precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                  }
                  sequentialGroup('Control-M other resources, and some steps for SAP jobs') {
                    tasks {
                      manual('Prod only : DC-OPS run USSAPOL430-ZPNIORDER_TRIGGER...') {
                        description '* In Control-M, to run USSAPOL430-ZPNIORDER_TRIGGER, do the following:\n' +
                        '      * Place the job on Hold.\n' +
                        '      * In the Execution tab, delete the Submit between time.\n' +
                        '      * FREE the job and ensure the job runs and completes.'
                        plannedDuration 900
                        attachments {
                          attachment("sql:Attachmentf1a047700b5244c493459a9fb4a780b2") {
                            filename "attachments/Attachmentf1a047700b5244c493459a9fb4a780b2-image.png"
                          }
                        }
                        team 'DC-Ops Team'
                        precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                      }
                      parallelGroup('Suspend Control-M resources (prod systems)') {
                        precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                        tasks {
                          sequentialGroup('Stop WW-SAP-SYSTEM (also includes jobs for Streamserve)') {
                            precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                            tasks {
                              createRelease('stop WW-SAP-SYSTEM') {
                                newReleaseTitle 'stop WW-SAP-SYSTEM'
                                template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  listBoxVariable('CTMEnvironment') {
                                    label 'Control-M environment'
                                    possibleValues 'Test', 'Production'
                                    value 'Production'
                                  }
                                  listBoxVariable('CTMResourceName') {
                                    label 'Control-M resource name'
                                    possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                    value 'WW-SAP-SYSTEM'
                                  }
                                }
                                createdReleaseId '${ctm_sap_suspended}'
                              }
                              gate('wait for Control-M resource control') {
                                dependencies {
                                  dependency {
                                    variable 'ctm_sap_suspended'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Stop WW-SRM-SYSTEM') {
                            precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                            tasks {
                              createRelease('stop WW-SRM-SYSTEM') {
                                newReleaseTitle 'stop WW-SRM-SYSTEM'
                                template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  listBoxVariable('CTMEnvironment') {
                                    label 'Control-M environment'
                                    possibleValues 'Test', 'Production'
                                    value 'Production'
                                  }
                                  listBoxVariable('CTMResourceName') {
                                    label 'Control-M resource name'
                                    possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                    value 'WW-SRM-SYSTEM'
                                  }
                                }
                                createdReleaseId '${ctm_srm_suspended}'
                              }
                              gate('wait for Control-M resource control') {
                                dependencies {
                                  dependency {
                                    variable 'ctm_srm_suspended'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Stop STOP_CSO') {
                            precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                            tasks {
                              createRelease('stop STOP_CSO') {
                                newReleaseTitle 'stop STOP_CSO'
                                template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  listBoxVariable('CTMEnvironment') {
                                    label 'Control-M environment'
                                    possibleValues 'Test', 'Production'
                                    value 'Production'
                                  }
                                  listBoxVariable('CTMResourceName') {
                                    label 'Control-M resource name'
                                    possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                    value 'STOP_CSO'
                                  }
                                }
                                createdReleaseId '${ctm_cso_suspended}'
                              }
                              gate('wait for Control-M resource control') {
                                dependencies {
                                  dependency {
                                    variable 'ctm_cso_suspended'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Stop WW-GATEWAY-SYSTEM') {
                            precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                            tasks {
                              createRelease('stop WW-GATEWAY-SYSTEM') {
                                newReleaseTitle 'stop WW-GATEWAY-SYSTEM'
                                template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  listBoxVariable('CTMEnvironment') {
                                    label 'Control-M environment'
                                    possibleValues 'Test', 'Production'
                                    value 'Production'
                                  }
                                  listBoxVariable('CTMResourceName') {
                                    label 'Control-M resource name'
                                    possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                    value 'WW-GATEWAY-SYSTEM'
                                  }
                                }
                                createdReleaseId '${ctm_gw_suspended}'
                              }
                              gate('wait for Control-M resource control') {
                                dependencies {
                                  dependency {
                                    variable 'ctm_gw_suspended'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Stop WW-DQS-SYSTEM') {
                            precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                            tasks {
                              createRelease('stop WW-DQS-SYSTEM') {
                                newReleaseTitle 'stop WW-DQS-SYSTEM'
                                template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  listBoxVariable('CTMEnvironment') {
                                    label 'Control-M environment'
                                    possibleValues 'Test', 'Production'
                                    value 'Production'
                                  }
                                  listBoxVariable('CTMResourceName') {
                                    label 'Control-M resource name'
                                    possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                    value 'WW-DQS-SYSTEM'
                                  }
                                }
                                createdReleaseId '${ctm_dqs_suspended}'
                              }
                              gate('wait for Control-M resource control') {
                                dependencies {
                                  dependency {
                                    variable 'ctm_dqs_suspended'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Suspend Control-M resources (test systems)') {
                        precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                        tasks {
                          parallelGroup('Suspend resources') {
                            tasks {
                              sequentialGroup('Stop WW-SAP-SYSTEM (also includes jobs for Streamserve)') {
                                precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                                tasks {
                                  createRelease('stop WW-SAP-SYSTEM') {
                                    newReleaseTitle 'stop WW-SAP-SYSTEM'
                                    template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Suspend', 'Release'
                                        value 'Suspend'
                                      }
                                      listBoxVariable('CTMEnvironment') {
                                        label 'Control-M environment'
                                        possibleValues 'Test', 'Production'
                                        value 'Test'
                                      }
                                      listBoxVariable('CTMResourceName') {
                                        label 'Control-M resource name'
                                        possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                        value 'WW-SAP-SYSTEM'
                                      }
                                    }
                                    createdReleaseId '${ctm_sap_suspended}'
                                  }
                                  gate('wait for Control-M resource control') {
                                    dependencies {
                                      dependency {
                                        variable 'ctm_sap_suspended'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Stop WW-DQS-SYSTEM') {
                                precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                                tasks {
                                  createRelease('stop WW-DQS-SYSTEM') {
                                    newReleaseTitle 'stop WW-DQS-SYSTEM'
                                    template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Suspend', 'Release'
                                        value 'Suspend'
                                      }
                                      listBoxVariable('CTMEnvironment') {
                                        label 'Control-M environment'
                                        possibleValues 'Test', 'Production'
                                        value 'Test'
                                      }
                                      listBoxVariable('CTMResourceName') {
                                        label 'Control-M resource name'
                                        possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                        value 'WW-DQS-SYSTEM'
                                      }
                                    }
                                    createdReleaseId '${ctm_dqs_suspended}'
                                  }
                                  gate('wait for Control-M resource control') {
                                    dependencies {
                                      dependency {
                                        variable 'ctm_dqs_suspended'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Stop WW-SRM-SYSTEM') {
                                precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                                tasks {
                                  createRelease('stop WW-SRM-SYSTEM') {
                                    newReleaseTitle 'stop WW-SRM-SYSTEM'
                                    template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Suspend', 'Release'
                                        value 'Suspend'
                                      }
                                      listBoxVariable('CTMEnvironment') {
                                        label 'Control-M environment'
                                        possibleValues 'Test', 'Production'
                                        value 'Test'
                                      }
                                      listBoxVariable('CTMResourceName') {
                                        label 'Control-M resource name'
                                        possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                        value 'WW-SRM-SYSTEM'
                                      }
                                    }
                                    createdReleaseId '${ctm_srm_suspended}'
                                  }
                                  gate('wait for Control-M resource control') {
                                    dependencies {
                                      dependency {
                                        variable 'ctm_srm_suspended'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Stop WW-GATEWAY-SYSTEM') {
                                precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                                tasks {
                                  createRelease('stop WW-GATEWAY-SYSTEM') {
                                    newReleaseTitle 'stop WW-GATEWAY-SYSTEM'
                                    template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Suspend', 'Release'
                                        value 'Suspend'
                                      }
                                      listBoxVariable('CTMEnvironment') {
                                        label 'Control-M environment'
                                        possibleValues 'Test', 'Production'
                                        value 'Test'
                                      }
                                      listBoxVariable('CTMResourceName') {
                                        label 'Control-M resource name'
                                        possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                        value 'WW-GATEWAY-SYSTEM'
                                      }
                                    }
                                    createdReleaseId '${ctm_gw_suspended}'
                                  }
                                  gate('wait for Control-M resource control') {
                                    dependencies {
                                      dependency {
                                        variable 'ctm_gw_suspended'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Stop STOP_CSO') {
                                description 
                                precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                                tasks {
                                  createRelease('stop STOP_CSO') {
                                    newReleaseTitle 'stop STOP_CSO'
                                    template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Suspend', 'Release'
                                        value 'Suspend'
                                      }
                                      listBoxVariable('CTMEnvironment') {
                                        label 'Control-M environment'
                                        possibleValues 'Test', 'Production'
                                        value 'Test'
                                      }
                                      listBoxVariable('CTMResourceName') {
                                        label 'Control-M resource name'
                                        possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                        value 'STOP_CSO'
                                      }
                                    }
                                    createdReleaseId '${ctm_cso_suspended}'
                                  }
                                  gate('wait for Control-M resource control') {
                                    dependencies {
                                      dependency {
                                        variable 'ctm_cso_suspended'
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          manual('Confirm resources have all been set to 0') {
                            description 'Please acknowledge that the following Control-M resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} have all been set to 0 successfully (you should have received 4 emails from XL-Release showing the new resource values as well)\n' +
                            '\n' +
                            '* STOP_CSO\n' +
                            '*  ${erp_ControlM-Resources}  (also includes jobs for Streamserve)\n' +
                            '* ${bw_ControlM-Resources}\n' +
                            '* ${srm_ControlM-Resources}\n' +
                            '\n' +
                            '\n' +
                            'Click the Complete button below to confirm resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} have been suspended \n' +
                            '\n' +
                            'Click the Fail button below to not go further in the outage'
                            plannedDuration 300
                            team 'GPM'
                          }
                        }
                      }
                      manual('Confirm resources have all been set to 0') {
                        description 'Please acknowledge that the following Control-M resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} have all been set to 0 successfully (you should have received 4 emails from XL-Release showing the new resource values as well)\n' +
                        '\n' +
                        '* STOP_CSO\n' +
                        '*  ${erp_ControlM-Resources}  (also includes jobs for Streamserve)\n' +
                        '* ${bw_ControlM-Resources}\n' +
                        '* ${srm_ControlM-Resources}\n' +
                        '\n' +
                        '\n' +
                        'Click the Complete button below to confirm resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} have been suspended \n' +
                        '\n' +
                        'Click the Fail button below to not go further in the outage'
                        plannedDuration 300
                        team 'DC-Ops Team'
                        precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                      }
                      manual('Prod only : in SAP ${erp_sid}, verify or change the following invoicing jobs from Released to Scheduled') {
                        description 'in SAP ${erp_sid}, verify or change the following invoicing jobs from Released to Scheduled\n' +
                        '\n' +
                        '      * INVAF_INV_PRE_PROCESSING  - Must change to Scheduled in this step. \n' +
                        '      * INVAM_INV_PRE_PROCESSING - Must change to Scheduled in this step. \n' +
                        '      * INVAP_INV_PRE_PROCESSING  - Already changed to Scheduled (Step 1) .\n' +
                        '      * INVEA_INV_PRE_PROCESSING  - Must change to Scheduled in this step. \n' +
                        '      * INVEU_INV_PRE_PROCESSING  - Must change to Scheduled in this step. \n' +
                        '      * INVEI_INV_PRE_PROCESSING  -   Must change to Scheduled in this step. \n' +
                        '      * INVUS_INV_PRE_PROCESSING  - Must change to Scheduled in this step.   \n' +
                        '      * INVSM_INV_PRE_PROCESSING  - Must change to Scheduled in this step.'
                        plannedDuration 900
                        attachments {
                          attachment("sql:Attachmentb32997cbc85d4d3abe5582212c5cb3d1") {
                            filename "attachments/Attachmentb32997cbc85d4d3abe5582212c5cb3d1-image.png"
                          }
                        }
                        team 'DC-Ops Team'
                        precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                      }
                    }
                  }
                }
              }
              parallelGroup('17:00 GMT - Stop jobs, remove interfaces monitoring , stop process chains, suspend backups and notify users about upcoming outage') {
                precondition 
                tasks {
                  parallelGroup('Basis post system message and suspend jobs') {
                    tasks {
                      sequentialGroup('post system message and suspend jobs in ${erp_sid}') {
                        tasks {
                          sequentialGroup('Suspend jobs in SAP ${erp_sid} (BTCTRNS1)') {
                            tasks {
                              createRelease('Suspend jobs in SAP ${erp_sid} (BTCTRNS1)') {
                                precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                                newReleaseTitle 'Suspend jobs in SAP ${erp_sid} (BTCTRNS1)'
                                template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  stringVariable('SID') {
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${suspend_erp_jobs_complete}'
                              }
                              createRelease('Suspend jobs in SAP ${erp_sid} (BTCTRNS1) (excluding FAX_SEND_JOB_WRAPPER and INTERNET MAIL SEND)') {
                                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                                newReleaseTitle 'Suspend jobs in SAP ${erp_sid} (BTCTRNS1) (excluding FAX_SEND_JOB_WRAPPER and INTERNET MAIL SEND)'
                                template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  stringVariable('SID') {
                                    value '${erp_sid}'
                                  }
                                  stringVariable('jobs_to_exclude') {
                                    required false
                                    value ', {\'JOBNAME\': "FAX_SEND_JOB_WRAPPER"}, {\'JOBNAME\': "INTERNET MAIL SEND"}'
                                  }
                                }
                                createdReleaseId '${suspend_erp_jobs_complete}'
                              }
                              gate('wait for jobs suspend') {
                                dependencies {
                                  dependency {
                                    variable 'suspend_erp_jobs_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Post system message in SAP ${erp_sid} (SM02)') {
                            precondition 'releaseVariables[\'SAP_system_message_line1\'] != \'\''
                            tasks {
                              createRelease('Post system message in SAP ${erp_sid} (SM02)') {
                                newReleaseTitle 'Post system message in SAP ${erp_sid} (SM02)'
                                template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Post message', 'Delete message'
                                    value 'Post message'
                                  }
                                  stringVariable('SID') {
                                    value '${erp_sid}'
                                  }
                                  stringVariable('Message_line1') {
                                    value '${SAP_system_message_line1}'
                                  }
                                  stringVariable('Message_line2') {
                                    label 
                                    value '${SAP_system_message_line2}'
                                  }
                                  stringVariable('Message_line3') {
                                    value '${SAP_system_message_line3}'
                                  }
                                  integerVariable('Expires_in_n_hours') {
                                    label 'Number of hours until the message expires'
                                  }
                                }
                                createdReleaseId '${message_post_erp_done}'
                              }
                              gate('Wait for message') {
                                dependencies {
                                  dependency {
                                    variable 'message_post_erp_done'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('post system message and suspend jobs in ${bw_sid}') {
                        tasks {
                          sequentialGroup('Post system message in SAP ${bw_sid} (SM02)') {
                            precondition 'releaseVariables[\'SAP_system_message_line1\'] != \'\''
                            tasks {
                              createRelease('Post system message in SAP ${bw_sid} (SM02)') {
                                newReleaseTitle 'Post system message in SAP ${bw_sid} (SM02)'
                                template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Post message', 'Delete message'
                                    value 'Post message'
                                  }
                                  stringVariable('SID') {
                                    value '${bw_sid}'
                                  }
                                  stringVariable('Message_line1') {
                                    value '${SAP_system_message_line1}'
                                  }
                                  stringVariable('Message_line2') {
                                    label 
                                    value '${SAP_system_message_line2}'
                                  }
                                  stringVariable('Message_line3') {
                                    value '${SAP_system_message_line3}'
                                  }
                                  integerVariable('Expires_in_n_hours') {
                                    label 'Number of hours until the message expires'
                                  }
                                }
                                createdReleaseId '${message_post_bw_done}'
                              }
                              gate('Wait for message') {
                                dependencies {
                                  dependency {
                                    variable 'message_post_bw_done'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Suspend jobs in SAP ${bw_sid} (BTCTRNS1)') {
                            tasks {
                              createRelease('Suspend jobs in SAP ${bw_sid} (BTCTRNS1)') {
                                newReleaseTitle 'Suspend jobs in SAP ${bw_sid} (BTCTRNS1)'
                                template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  stringVariable('SID') {
                                    value '${bw_sid}'
                                  }
                                }
                                createdReleaseId '${suspend_bw_jobs_complete}'
                              }
                              gate('wait for jobs suspend') {
                                dependencies {
                                  dependency {
                                    variable 'suspend_bw_jobs_complete'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('post system message and suspend jobs in ${srm_sid}') {
                        tasks {
                          sequentialGroup('Suspend jobs in SAP ${srm_sid} (BTCTRNS1)') {
                            tasks {
                              createRelease('Suspend jobs in SAP ${srm_sid} (BTCTRNS1)') {
                                precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                                newReleaseTitle 'Suspend jobs in SAP ${srm_sid} (BTCTRNS1)'
                                template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  stringVariable('SID') {
                                    value '${srm_sid}'
                                  }
                                }
                                createdReleaseId '${suspend_srm_jobs_complete}'
                              }
                              createRelease('Suspend jobs in SAP ${srm_sid} (BTCTRNS1) (excluding FAX SEND JOB,EMAIL SEND JOB)') {
                                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                                newReleaseTitle 'Suspend jobs in SAP ${srm_sid} (BTCTRNS1)  (excluding FAX SEND JOB,EMAIL SEND JOB)'
                                template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  stringVariable('SID') {
                                    value '${srm_sid}'
                                  }
                                  stringVariable('jobs_to_exclude') {
                                    required false
                                    value ', {\'JOBNAME\': "FAX SEND JOB"}, {\'JOBNAME\': "EMAIL SEND JOB"}'
                                  }
                                }
                                createdReleaseId '${suspend_srm_jobs_complete}'
                              }
                              gate('wait for jobs suspend') {
                                dependencies {
                                  dependency {
                                    variable 'suspend_srm_jobs_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Post system message in SAP ${srm_sid} (SM02)') {
                            precondition 'releaseVariables[\'SAP_system_message_line1\'] != \'\''
                            tasks {
                              createRelease('Post system message in SAP ${srm_sid} (SM02)') {
                                newReleaseTitle 'Post system message in SAP ${srm_sid} (SM02)'
                                template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Post message', 'Delete message'
                                    value 'Post message'
                                  }
                                  stringVariable('SID') {
                                    value '${srm_sid}'
                                  }
                                  stringVariable('Message_line1') {
                                    value '${SAP_system_message_line1}'
                                  }
                                  stringVariable('Message_line2') {
                                    label 
                                    value '${SAP_system_message_line2}'
                                  }
                                  stringVariable('Message_line3') {
                                    value '${SAP_system_message_line3}'
                                  }
                                  integerVariable('Expires_in_n_hours') {
                                    label 'Number of hours until the message expires'
                                  }
                                }
                                createdReleaseId '${message_post_srm_done}'
                              }
                              gate('Wait for message') {
                                dependencies {
                                  dependency {
                                    variable 'message_post_srm_done'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('post system message and suspend jobs in ${gw_sid}') {
                        tasks {
                          sequentialGroup('Suspend jobs in SAP ${gw_sid} (BTCTRNS1)') {
                            tasks {
                              createRelease('Suspend jobs in SAP ${gw_sid} (BTCTRNS1)') {
                                newReleaseTitle 'Suspend jobs in SAP ${gw_sid} (BTCTRNS1)'
                                template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Suspend', 'Release'
                                    value 'Suspend'
                                  }
                                  stringVariable('SID') {
                                    value '${gw_sid}'
                                  }
                                }
                                createdReleaseId '${suspend_gw_jobs_complete}'
                              }
                              gate('Wait for jobs suspend') {
                                dependencies {
                                  dependency {
                                    variable 'suspend_gw_jobs_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Post system message in SAP ${gw_sid} (SM02)') {
                            precondition 'releaseVariables[\'SAP_system_message_line1\'] != \'\''
                            tasks {
                              createRelease('Post system message in SAP ${gw_sid} (SM02)') {
                                newReleaseTitle 'Post system message in SAP ${gw_sid} (SM02)'
                                template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Post message', 'Delete message'
                                    value 'Post message'
                                  }
                                  stringVariable('Message_line1') {
                                    value '${SAP_system_message_line1}'
                                  }
                                  stringVariable('Message_line2') {
                                    label 
                                    value '${SAP_system_message_line2}'
                                  }
                                  stringVariable('Message_line3') {
                                    value '${SAP_system_message_line3}'
                                  }
                                  integerVariable('Expires_in_n_hours') {
                                    label 'Number of hours until the message expires'
                                  }
                                  stringVariable('SID') {
                                    value '${gw_sid}'
                                  }
                                }
                                createdReleaseId '${message_post_gw_done}'
                              }
                              gate('Wait for message') {
                                dependencies {
                                  dependency {
                                    variable 'message_post_gw_done'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('If some Oracle Databases are going to be stopped or upgraded...') {
                    tasks {
                      parallelGroup('if Oracle ${erp_sid} is going to be stopped or upgraded...') {
                        precondition 'releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True or  releaseVariables[\'ERP_DB_upgrade\'] == True'
                        tasks {
                          manual('suspend backups for Oracle ${erp_sid}') {
                            description 'NetBackup Team : suspend Oracle backups for Oracle ${erp_sid}\n' +
                            '\n' +
                            'Click the Complete button once you have suspended backups for Oracle ${erp_sid}\n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Netbackup Team'
                            precondition 
                          }
                          sequentialGroup('suspend OEM monitoring for Oracle ${erp_sid}') {
                            tasks {
                              createRelease('start OEM blackout for Oracle ${erp_sid}') {
                                newReleaseTitle 'start OEM blackout for Oracle ${erp_sid}'
                                template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${erp_host}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${erp_sid}'
                                  }
                                  stringVariable('notification_recipients') {
                                    value '${OEM_recipients}'
                                  }
                                }
                                createdReleaseId '${OEM_ERP_suspended}'
                              }
                              gate('wait for OEM') {
                                dependencies {
                                  dependency {
                                    variable 'OEM_ERP_suspended'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      parallelGroup('if Oracle ${java_stack_SID} is going to be shutdown...') {
                        precondition 'releaseVariables[\'restart_Oracle_BIJAVA\'] == True or releaseVariables[\'reboot_BIJAVA\'] == True or releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                        tasks {
                          manual('suspend backups for Oracle ${java_stack_SID}') {
                            description 'NetBackup Team : suspend Oracle backups for Oracle ${java_stack_SID}\n' +
                            '\n' +
                            'Click the Complete button once you have suspended backups for Oracle ${java_stack_SID}\n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Netbackup Team'
                            precondition 
                          }
                          sequentialGroup('suspend OEM monitoring for Oracle ${java_stack_SID}') {
                            tasks {
                              createRelease('start OEM blackout for Oracle ${java_stack_SID}') {
                                newReleaseTitle 'start OEM blackout for Oracle ${java_stack_SID}'
                                template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${java_stack_host}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${java_stack_SID}'
                                  }
                                  stringVariable('notification_recipients') {
                                    value '${OEM_recipients}'
                                  }
                                }
                                createdReleaseId '${OEM_JavaStack_suspended}'
                              }
                              gate('wait for OEM') {
                                dependencies {
                                  dependency {
                                    variable 'OEM_JavaStack_suspended'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      parallelGroup('if Oracle ${srm_sid} is going to be shutdown...') {
                        precondition 'releaseVariables[\'restart_Oracle_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                        tasks {
                          manual('suspend backups for Oracle ${srm_sid}') {
                            description 'NetBackup Team : suspend Oracle backups for Oracle ${srm_sid}\n' +
                            '\n' +
                            'Click the Complete button once you have suspended backups for Oracle ${srm_sid}\n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Netbackup Team'
                            precondition 
                          }
                          sequentialGroup('suspend OEM monitoring for Oracle ${srm_sid}') {
                            tasks {
                              createRelease('start OEM blackout for Oracle ${srm_sid}') {
                                newReleaseTitle 'start OEM blackout for Oracle ${srm_sid}'
                                template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${srm_host}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${srm_sid}'
                                  }
                                  stringVariable('notification_recipients') {
                                    value '${OEM_recipients}'
                                  }
                                }
                                createdReleaseId '${OEM_SRM_suspended}'
                              }
                              gate('wait for OEM') {
                                dependencies {
                                  dependency {
                                    variable 'OEM_SRM_suspended'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      parallelGroup('if Oracle ${gw_sid} is going to be shutdown...') {
                        precondition 'releaseVariables[\'restart_Oracle_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                        tasks {
                          manual('suspend backups for Oracle ${gw_sid}') {
                            description 'NetBackup Team : suspend Oracle backups for Oracle ${gw_sid}\n' +
                            '\n' +
                            'Click the Complete button once you have suspended backups for Oracle ${gw_sid}\n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Netbackup Team'
                            precondition 
                          }
                          sequentialGroup('suspend OEM monitoring for Oracle ${gw_sid}') {
                            tasks {
                              createRelease('start OEM blackout for Oracle ${gw_sid}') {
                                newReleaseTitle 'start OEM blackout for Oracle ${gw_sid}'
                                template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${gw_host}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${gw_sid}'
                                  }
                                  stringVariable('notification_recipients') {
                                    value '${OEM_recipients}'
                                  }
                                }
                                createdReleaseId '${OEM_GW_suspended}'
                              }
                              gate('wait for OEM') {
                                dependencies {
                                  dependency {
                                    variable 'OEM_GW_suspended'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('Bring interfaces down') {
                    tasks {
                      parallelGroup('BW instances') {
                        precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True'
                        tasks {
                          manual('Bring interfaces (BW instances) down on ${interfaces_server_name} (test systems)') {
                            description '* On  ${interfaces_server_name} bring down the BW instances: \n' +
                            '      * bwsd'
                            plannedDuration 900
                            team 'GPM'
                            precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                          }
                          manual('Bring interfaces (BW instances) down on ${interfaces_server_name} (production systems)') {
                            description '* On  ${interfaces_server_name} bring down the BW instances: \n' +
                            '      * bwsd'
                            plannedDuration 900
                            team 'DC-Ops Team'
                            precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                          }
                        }
                      }
                      parallelGroup('ERP instances') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          manual('Bring interfaces (SAP instances) down on ${interfaces_server_name} (test systems)') {
                            description '* On  ${interfaces_server_name} bring down the SAP instances: \n' +
                            '      * sapsd'
                            plannedDuration 900
                            team 'GPM'
                            precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                          }
                          manual('Bring interfaces (SAP instances) down on ${interfaces_server_name} (production systems)') {
                            description '* On  ${interfaces_server_name} bring down the SAP instances: \n' +
                            '      * sapsd'
                            plannedDuration 900
                            team 'DC-Ops Team'
                            precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('If some servers are going to be patched /upgraded') {
                    tasks {
                      parallelGroup('If server ${backup_hostname_java_stack} is going to be patched/upgraded, suspend OS backups and notify DC-OPs') {
                        precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                        tasks {
                          manual('Suspend monitoring for ${backup_hostname_java_stack}') {
                            description 'As server ${backup_hostname_java_stack} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_java_stack}'
                            plannedDuration 300
                            team 'DC-Ops Team'
                          }
                          manual('Suspend OS backups for ${backup_hostname_java_stack}') {
                            description 'As server ${backup_hostname_java_stack} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_java_stack}'
                            plannedDuration 300
                            team 'Netbackup Team'
                          }
                        }
                      }
                      parallelGroup('If server ${backup_hostname_gw} is going to be patched/upgraded, suspend OS backups and notify DC-OPs') {
                        precondition 'releaseVariables[\'GW_UNIX_patching\'] == True'
                        tasks {
                          manual('Suspend monitoring for ${backup_hostname_gw}') {
                            description 'As server ${backup_hostname_gw} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_gw}'
                            plannedDuration 300
                            team 'DC-Ops Team'
                          }
                          manual('Suspend OS backups for ${backup_hostname_gw}') {
                            description 'As server ${backup_hostname_gw} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_gw}'
                            plannedDuration 300
                            team 'Netbackup Team'
                          }
                        }
                      }
                      parallelGroup('If server ${backup_hostname_erp} is going to be patched/upgraded, suspend OS backups and notify DC-OPs') {
                        precondition 'releaseVariables[\'ERP_UNIX_patching\'] == True'
                        tasks {
                          manual('Suspend monitoring for ${backup_hostname_erp}') {
                            description 'As server ${backup_hostname_erp} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_erp}'
                            plannedDuration 300
                            team 'DC-Ops Team'
                          }
                          manual('Suspend OS backups for ${backup_hostname_erp}') {
                            description 'As server ${backup_hostname_erp} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_erp}'
                            plannedDuration 300
                            team 'Netbackup Team'
                          }
                        }
                      }
                      parallelGroup('If server ${backup_hostname_bw} is going to be patched/upgraded, suspend OS backups and notify DC-OPs') {
                        precondition 'releaseVariables[\'BW_UNIX_patching\'] == True'
                        tasks {
                          manual('Suspend monitoring for ${backup_hostname_bw}') {
                            description 'As server ${backup_hostname_bw} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_bw}'
                            plannedDuration 300
                            team 'DC-Ops Team'
                          }
                          manual('Suspend OS backups for ${backup_hostname_bw}') {
                            description 'As server ${backup_hostname_bw} is going to be patched/upgraded and/or rebooted, please suspend monitoring for ${backup_hostname_bw}'
                            plannedDuration 300
                            team 'Netbackup Team'
                          }
                        }
                      }
                    }
                  }
                }
              }
              manual('Check there are no Control-M jobs active... (production systems)') {
                description '* Verify there are no jobs running under the following resources  for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} \n' +
                ' * STOP_CSO\n' +
                '  * ${srm_ControlM-Resources}\n' +
                '  *  ${erp_ControlM-Resources}\n' +
                '  *  ${bw_ControlM-Resources}\n' +
                '* Document any jobs which must be killed and notify the GPM Team'
                plannedDuration 900
                attachments {
                  attachment("sql:Attachment483116135") {
                    filename "attachments/Attachment483116135-image.png"
                  }
                  attachment("sql:Attachment2892609") {
                    filename "attachments/Attachment2892609-image.png"
                  }
                }
                team 'DC-Ops Team'
                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
              }
              parallelGroup('Stop Control-M agents') {
                tasks {
                  sequentialGroup('Stop Control-M agent on ${erp_host}') {
                    precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                    tasks {
                      createRelease('Stop Control-M agent on ${erp_host}') {
                        newReleaseTitle 'Stop Control-M agent on ${erp_host}'
                        template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start'
                            value 'Stop'
                          }
                          stringVariable('ctm_agt_host') {
                            value '${erp_host}'
                          }
                        }
                        createdReleaseId '${ctm_agt_erp_stop}'
                      }
                      gate('Wait for CTM agent stop') {
                        dependencies {
                          dependency {
                            variable 'ctm_agt_erp_stop'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Stop Control-M agent on ${bw_host}') {
                    precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True'
                    tasks {
                      createRelease('Stop Control-M agent on ${bw_host}') {
                        newReleaseTitle 'Stop Control-M agent on ${bw_host}'
                        template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start'
                            value 'Stop'
                          }
                          stringVariable('ctm_agt_host') {
                            value '${bw_host}'
                          }
                        }
                        createdReleaseId '${ctm_agt_bw_stop}'
                      }
                      gate('Wait for CTM agent stop') {
                        dependencies {
                          dependency {
                            variable 'ctm_agt_bw_stop'
                          }
                        }
                      }
                    }
                  }
                }
              }
              parallelGroup('Confirm Control-M agents have been stopped') {
                tasks {
                  manual('Confirm Control-M agents have been stopped (production systems)') {
                    description 'Please confirm that the Control-M agents have been stopped:\n' +
                    '* SAP  ${erp_sid} Control-M agent on ${erp_host}\n' +
                    '* SAP  ${bw_sid} Control-M agent on ${bw_host}'
                    plannedDuration 300
                    attachments {
                      attachment("sql:Attachment140636071") {
                        filename "attachments/Attachment140636071-image.png"
                      }
                    }
                    team 'Production Control Team'
                    precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                  }
                  manual('Confirm Control-M agents have been stopped (test systems)') {
                    description 'Please confirm that the Control-M agents have been stopped:\n' +
                    '* SAP  ${erp_sid} Control-M agent on ${erp_host}\n' +
                    '* SAP  ${bw_sid} Control-M agent on ${bw_host}'
                    plannedDuration 300
                    attachments {
                      attachment("sql:Attachment140636071") {
                        filename "attachments/Attachment140636071-image.png"
                      }
                    }
                    team 'GPM'
                    precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                  }
                }
              }
              parallelGroup('Suspend Basis monitoring') {
                tasks {
                  createRelease('Stop CCMS alerts for ${erp_sid}') {
                    precondition 
                    newReleaseTitle 'Stop CCMS alerts for SAP ${erp_sid}'
                    template 'SAP/ABAP/Maintenance mode for CCMS alerts- this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Set or unset the maintenance flag'
                        description 'Set or unset the maintenance flag'
                        possibleValues 'Set', 'Unset'
                        value 'Set'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      stringVariable('SID') {
                        value '${erp_sid}'
                      }
                      stringVariable('host') {
                        value '${erp_host}'
                      }
                    }
                    createdReleaseId '${ccms_alerts_done}'
                  }
                  createRelease('Stop CCMSping alerts coming from Solman ${MonitoredBySolMan}') {
                    precondition 'releaseVariables[\'MonitoredBySolMan\']!=\'\''
                    newReleaseTitle 'Stop CCMSping alerts coming from Solman ${MonitoredBySolMan}'
                    template 'SAP/ABAP/Maintenance mode for CCMSping monitoring- this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Set or unset the maintenance flag'
                        description 'Set or unset the maintenance flag'
                        possibleValues 'Set', 'Unset'
                        value 'Set'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('SolMan_SID') {
                        label 'Solution Manager SID'
                        possibleValues 'CEN', 'SMD', 'SMX'
                        value '${MonitoredBySolMan}'
                      }
                    }
                    createdReleaseId '${ccms_alerts_done}'
                  }
                }
              }
              custom('Notify the pre-shutdown phase of ${environment}  is complete') {
                description 'releaseVariables[\'ShortActionName\'] != \'Start\' and releaseVariables[\'slack_channel\']!=""'
                precondition 'releaseVariables[\'slack_channel\']!=""'
                script {
                  type 'slack.WebAPI'
                  server 'Slack WebAPI as XL-Release'
                  channelin '${slack_channel}'
                  text 'Pre-shutdown phase for ${environment} (Stop jobs, interfaces, process chains, suspend oracle backups, etc.) is complete'
                  attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Pre-shutdown phase for ${environment} (Stop jobs, interfaces, process chains, suspend oracle backups etc.) is complete", "short": true }] }]'
                  thread_ts '${slack_ts}'
                }
              }
            }
          }
          manual('18:00 GMT - Confirm we can now lock users in systems, stop connected systems etc.') {
            description 'Please confirm that all pre-shutdown activities for ${environment} are complete.\n' +
            '\n' +
            'CAUTION : if you confirm this phase, XL-Release will then enter the phase where users will be locked and systems such as vertex, streamserve, mastersaf etc. will also be shutdown,'
            plannedDuration 300
            team 'SAP/Web Admin Team'
          }
        }
      }
      phase('Outage has now begun : lock users, stop Vertex etc.') {
        color '#009CDB'
        tasks {
          sequentialGroup('Suspend mail and faxes jobs in SRP and PRD') {
            precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
            tasks {
              parallelGroup('Suspend fax and email send jobs in SRP and PRD') {
                tasks {
                  createRelease('Suspend remaining jobs in SAP ${erp_sid} (BTCTRNS1)') {
                    precondition 
                    newReleaseTitle 'Suspend remaining jobs in SAP ${erp_sid} (BTCTRNS1)'
                    template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Suspend', 'Release'
                        value 'Suspend'
                      }
                      stringVariable('SID') {
                        value '${erp_sid}'
                      }
                      stringVariable('jobs_to_exclude') {
                        required false
                        value 
                      }
                    }
                    createdReleaseId '${suspend_erp_jobs_complete2}'
                  }
                  createRelease('Suspend remaining jobs in SAP ${srm_sid} (BTCTRNS1)') {
                    precondition 
                    newReleaseTitle 'Suspend remaining jobs in SAP ${srm_sid} (BTCTRNS1)'
                    template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Suspend', 'Release'
                        value 'Suspend'
                      }
                      stringVariable('SID') {
                        value '${srm_sid}'
                      }
                      stringVariable('jobs_to_exclude') {
                        required false
                      }
                    }
                    createdReleaseId '${suspend_srm_jobs_complete2}'
                  }
                }
              }
              gate('wait for jobs suspend') {
                dependencies {
                  dependency {
                    variable 'suspend_srm_jobs_complete2'
                  }
                  dependency {
                    variable 'suspend_erp_jobs_complete2'
                  }
                }
              }
            }
          }
          parallelGroup('Lock users') {
            tasks {
              sequentialGroup('Lock users in SAP ${erp_sid}') {
                description 'this tasks runs transaction ZLOCK'
                tasks {
                  createRelease('Lock users in SAP ${erp_sid}') {
                    newReleaseTitle 'Lock users in SAP ${erp_sid}'
                    template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Lock', 'Unlock'
                        value 'Lock'
                      }
                      stringVariable('SID') {
                        value '${erp_sid}'
                      }
                    }
                    createdReleaseId '${lock_users_erp_done}'
                  }
                  gate('Wait for lock') {
                    dependencies {
                      dependency {
                        variable 'lock_users_erp_done'
                      }
                    }
                  }
                  script('set global variable ERP.UsersLocked=True') {
                    script (['''\
globalVariables["global.ERP.UsersLocked"] = True
'''])
                  }
                }
              }
              sequentialGroup('Lock users in SAP ${srm_sid}') {
                description 'this tasks runs transaction ZLOCK'
                tasks {
                  createRelease('Lock users in SAP ${srm_sid}') {
                    newReleaseTitle 'Lock users in SAP ${srm_sid}'
                    template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Lock', 'Unlock'
                        value 'Lock'
                      }
                      stringVariable('SID') {
                        value '${srm_sid}'
                      }
                    }
                    createdReleaseId '${lock_users_srm_done}'
                  }
                  gate('Wait for lock') {
                    dependencies {
                      dependency {
                        variable 'lock_users_srm_done'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Lock users in SAP ${bw_sid}') {
                description 'this tasks runs transaction ZLOCK'
                tasks {
                  createRelease('Lock users in SAP ${bw_sid}') {
                    newReleaseTitle 'Lock users in SAP ${bw_sid}'
                    template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Lock', 'Unlock'
                        value 'Lock'
                      }
                      stringVariable('SID') {
                        value '${bw_sid}'
                      }
                    }
                    createdReleaseId '${lock_users_bw_done}'
                  }
                  gate('Wait for lock') {
                    dependencies {
                      dependency {
                        variable 'lock_users_bw_done'
                      }
                    }
                  }
                  script('set global variable BW.UsersLocked=True') {
                    script (['''\
globalVariables["global.BW.UsersLocked"] = True
'''])
                  }
                }
              }
              sequentialGroup('Lock users in SAP ${gw_sid}') {
                description 'this tasks runs transaction ZLOCK'
                tasks {
                  createRelease('Lock users in SAP ${gw_sid}') {
                    newReleaseTitle 'Lock users in SAP ${gw_sid}'
                    template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Lock', 'Unlock'
                        value 'Lock'
                      }
                      stringVariable('SID') {
                        value '${gw_sid}'
                      }
                    }
                    createdReleaseId '${lock_users_gw_done}'
                  }
                  gate('Wait for lock') {
                    dependencies {
                      dependency {
                        variable 'lock_users_gw_done'
                      }
                    }
                  }
                  script('set global variable GW.UsersLocked=True') {
                    script (['''\
globalVariables["global.GW.UsersLocked"] = True
'''])
                  }
                }
              }
            }
          }
          sequentialGroup('Enable F5 Maintenance pages') {
            precondition 
            tasks {
              parallelGroup('f5 maintenance rules') {
                tasks {
                  sequentialGroup('F5 maintenance for ${erp_sid}') {
                    tasks {
                      createRelease('Enable F5 Maintenance Page iRule') {
                        newReleaseTitle '${release.title} - Enable F5 Maintenance Page iRule'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${erp_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${erp_f5_enable}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${f5_maint}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'f5_maint'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('F5 maintenance for ${gw_sid}') {
                    tasks {
                      createRelease('Enable F5 Maintenance Page iRule') {
                        newReleaseTitle '${release.title} - Enable F5 Maintenance Page iRule'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${gw_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${gw_f5_enable}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${f5_gw_maint}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'f5_gw_maint'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('F5 maintenance for ${BOBIURL}') {
                    precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True'
                    tasks {
                      createRelease('Enable F5 Maintenance Page iRule') {
                        newReleaseTitle 'Enable F5 Maintenance Page iRule for ${BOBIURL}'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${BOBI_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${BOBI_f5_enable_maintenance}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${f5_bobi_maint}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'f5_bobi_maint'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('F5 maintenance for ${SAPIDM_URL}') {
                    precondition 'releaseVariables[\'SAPIDM_URL\'] != \'\''
                    tasks {
                      createRelease('Enable F5 Maintenance Page iRule') {
                        newReleaseTitle 'Enable F5 Maintenance Page iRule for ${SAPIDM_URL}'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${SAPIDM_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${SAPIDM_f5_enable_maintenance}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${f5_SAPIDM_maint}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'f5_SAPIDM_maint'
                          }
                        }
                      }
                    }
                  }
                }
              }
              custom('Notify the F5 rules are in place') {
                precondition 'releaseVariables[\'slack_channel\']!=""'
                script {
                  type 'slack.WebAPI'
                  server 'Slack WebAPI as XL-Release'
                  channelin '${slack_channel}'
                  text 'F5 maintenance irules for ${environment} outage are now in place'
                  attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "F5 maintenance irules for ${environment} outage are now in place", "short": true }] }]'
                  thread_ts '${slack_ts}'
                }
              }
            }
          }
          sequentialGroup('Notify outage email receipients that the systems have been locked') {
            tasks {
              custom('get service interruption start') {
                script {
                  type 'remoteScript.Unix'
                  script 'date +%s'
                  remotePath 
                  output variable('time1')
                  address 'localhost'
                  username '${global.rundeckuser}'
                  privateKey 
                  privateKeyFile '${global.rundeckkeyfile}'
                }
              }
              notification('send email (prod environment)') {
                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                addresses '${outage_prod_notification_recipients}'
                subject '${environment} environments have now been locked'
                body 'Dear recipients,\n' +
                '\n' +
                'We would like to inform you that the users in ${environment} have now been locked.\n' +
                '\n' +
                'At this stage, the systems are also no longer accessible externally (i.e. maintenance pages have been put in place)\n' +
                '\n' +
                '\n' +
                'If you have an XL-Release account, you can follow the progress of the operations by going to the following URL : ${release_url}'
                cc '${outage_CC}'
              }
              notification('send email (test environment)') {
                precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                addresses '${outage_test_notification_recipients}'
                subject '${environment} environments have now been locked'
                body 'Dear recipients,\n' +
                '\n' +
                'We would like to inform you that the users in ${environment} have now been locked.\n' +
                '\n' +
                'At this stage, the systems are also no longer accessible externally (i.e. maintenance pages have been put in place)\n' +
                '\n' +
                'If you have an XL-Release account, you can follow the progress of the operations by going to the following URL : ${release_url}'
                cc '${outage_CC}'
              }
            }
          }
          sequentialGroup('SAP ERP upgrade preparation steps') {
            precondition 'releaseVariables[\'ERP_upgrade\'] == True'
            tasks {
              createRelease('Prepare for upgrade of of SAP ${erp_sid}') {
                newReleaseTitle 'Prepare for upgrade of of SAP ${erp_sid}'
                template 'SAP/ABAP/SAP ERP Upgrade - prepare for downtime'
                templateVariables {
                  stringVariable('slack_channel') {
                    required false
                    value '${slack_channel}'
                  }
                  stringVariable('slack_ts') {
                    required false
                    value '${slack_ts}'
                  }
                  stringVariable('host') {
                    value '${erp_host}'
                  }
                  stringVariable('sidadm') {
                    value '${erp_siduser}'
                  }
                  stringVariable('orasid') {
                    required false
                    value '${erp_orauser}'
                  }
                  stringVariable('srm_sid') {
                    required false
                    value '${srm_sid}'
                  }
                  stringVariable('erp_sid') {
                    value '${erp_sid}'
                  }
                }
                createdReleaseId '${erp_upg_prep1}'
              }
              gate('Wait for prep step completion') {
                dependencies {
                  dependency {
                    variable 'erp_upg_prep1'
                  }
                }
              }
            }
          }
          parallelGroup('Stop Vertex, Streamserve, BI-JAVA etc.') {
            tasks {
              sequentialGroup('Stop Vertex') {
                precondition 'releaseVariables[\'VertexHost\'] != \'\' and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop Vertex (prod)') {
                    precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                    newReleaseTitle 'Stop Vertex production'
                    template 'Vertex/Vertex Service Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Start', 'Stop', 'Restart'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        possibleValues 'Dev', 'Test', 'Production'
                        value 'Production'
                      }
                    }
                    createdReleaseId '${vertex_stop_complete}'
                  }
                  createRelease('Stop Vertex (test)') {
                    precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                    newReleaseTitle 'Stop Vertex test'
                    template 'Vertex/Vertex Service Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Start', 'Stop', 'Restart'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        possibleValues 'Dev', 'Test', 'Production'
                        value 'Test'
                      }
                    }
                    createdReleaseId '${vertex_stop_complete}'
                  }
                  gate('Wait for Vertex service stop') {
                    dependencies {
                      dependency {
                        variable 'vertex_stop_complete'
                      }
                    }
                  }
                }
              }
              parallelGroup('Stop BW precalc') {
                precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True  or releaseVariables[\'Java_stack_UNIX_patching\'] == True  or releaseVariables[\'BW_UNIX_patching\'] == True'
                tasks {
                  sequentialGroup('Stop precalc on ${bw_precalc_host1}') {
                    precondition 'releaseVariables[\'bw_precalc_host1\'] != \'\''
                    tasks {
                      createRelease('Stop precalc on ${bw_precalc_host1}') {
                        newReleaseTitle 'Stop precalc on ${bw_precalc_host1}'
                        template 'Microsoft/Windows service control'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart'
                            value 'Stop'
                          }
                          stringVariable('service_name') {
                            label 'Windows service name'
                            value 'SAP BW Precalculation Service Multi Instance'
                          }
                          stringVariable('windows_host') {
                            value '${bw_precalc_host1}'
                          }
                          passwordVariable('xlrelease_windows_password') {
                            
                          }
                          stringVariable('xlrelease_windows_user') {
                            value '${bw_precalc_user1}'
                          }
                        }
                        createdReleaseId '${precalc1_stop_complete}'
                      }
                      gate('Wait for Stop ${bw_precalc_host1}') {
                        dependencies {
                          dependency {
                            variable 'precalc1_stop_complete'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Stop precalc on ${bw_precalc_host2}') {
                    precondition 'releaseVariables[\'bw_precalc_host2\'] != \'\''
                    tasks {
                      createRelease('Stop precalc on ${bw_precalc_host2}') {
                        newReleaseTitle 'Stop precalc on ${bw_precalc_host2}'
                        template 'Microsoft/Windows service control'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart'
                            value 'Stop'
                          }
                          stringVariable('service_name') {
                            label 'Windows service name'
                            value 'SAP BW Precalculation Service Multi Instance'
                          }
                          stringVariable('windows_host') {
                            value '${bw_precalc_host2}'
                          }
                          passwordVariable('xlrelease_windows_password') {
                            
                          }
                          stringVariable('xlrelease_windows_user') {
                            value '${bw_precalc_user1}'
                          }
                        }
                        createdReleaseId '${precalc2_stop_complete}'
                      }
                      gate('Wait for Stop ${bw_precalc_host2}') {
                        dependencies {
                          dependency {
                            variable 'precalc2_stop_complete'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Stop precalc on ${bw_precalc_host3}') {
                    precondition 'releaseVariables[\'bw_precalc_host3\'] != \'\''
                    tasks {
                      createRelease('Stop precalc on ${bw_precalc_host3}') {
                        newReleaseTitle 'Stop precalc on ${bw_precalc_host3}'
                        template 'Microsoft/Windows service control'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart'
                            value 'Stop'
                          }
                          stringVariable('service_name') {
                            label 'Windows service name'
                            value 'SAP BW Precalculation Service Multi Instance'
                          }
                          stringVariable('windows_host') {
                            value '${bw_precalc_host3}'
                          }
                          passwordVariable('xlrelease_windows_password') {
                            
                          }
                          stringVariable('xlrelease_windows_user') {
                            value '${bw_precalc_user1}'
                          }
                        }
                        createdReleaseId '${precalc3_stop_complete}'
                      }
                      gate('Wait for Stop ${bw_precalc_host3}') {
                        dependencies {
                          dependency {
                            variable 'precalc3_stop_complete'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Stop precalc on ${bw_precalc_host4}') {
                    precondition 'releaseVariables[\'bw_precalc_host4\'] != \'\''
                    tasks {
                      createRelease('Stop precalc on ${bw_precalc_host4}') {
                        newReleaseTitle 'Stop precalc on ${bw_precalc_host4}'
                        template 'Microsoft/Windows service control'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart'
                            value 'Stop'
                          }
                          stringVariable('service_name') {
                            label 'Windows service name'
                            value 'SAP BW Precalculation Service Multi Instance'
                          }
                          stringVariable('windows_host') {
                            value '${bw_precalc_host4}'
                          }
                          passwordVariable('xlrelease_windows_password') {
                            
                          }
                          stringVariable('xlrelease_windows_user') {
                            value '${bw_precalc_user1}'
                          }
                        }
                        createdReleaseId '${precalc4_stop_complete}'
                      }
                      gate('Wait for Stop ${bw_precalc_host4}') {
                        dependencies {
                          dependency {
                            variable 'precalc4_stop_complete'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Stop precalc on ${bw_precalc_host5}') {
                    precondition 'releaseVariables[\'bw_precalc_host5\'] != \'\''
                    tasks {
                      createRelease('Stop precalc on ${bw_precalc_host5}') {
                        newReleaseTitle 'Stop precalc on ${bw_precalc_host5}'
                        template 'Microsoft/Windows service control'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart'
                            value 'Stop'
                          }
                          stringVariable('service_name') {
                            label 'Windows service name'
                            value 'SAP BW Precalculation Service Multi Instance'
                          }
                          stringVariable('windows_host') {
                            value '${bw_precalc_host5}'
                          }
                          passwordVariable('xlrelease_windows_password') {
                            
                          }
                          stringVariable('xlrelease_windows_user') {
                            value '${bw_precalc_user1}'
                          }
                        }
                        createdReleaseId '${precalc5_stop_complete}'
                      }
                      gate('Wait for Stop ${bw_precalc_host5}') {
                        dependencies {
                          dependency {
                            variable 'precalc5_stop_complete'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Stop precalc on ${bw_precalc_host6}') {
                    precondition 'releaseVariables[\'bw_precalc_host6\'] != \'\''
                    tasks {
                      createRelease('Stop precalc on ${bw_precalc_host6}') {
                        newReleaseTitle 'Stop precalc on ${bw_precalc_host6}'
                        template 'Microsoft/Windows service control'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart'
                            value 'Stop'
                          }
                          stringVariable('service_name') {
                            label 'Windows service name'
                            value 'SAP BW Precalculation Service Multi Instance'
                          }
                          stringVariable('windows_host') {
                            value '${bw_precalc_host6}'
                          }
                          passwordVariable('xlrelease_windows_password') {
                            
                          }
                          stringVariable('xlrelease_windows_user') {
                            value '${bw_precalc_user1}'
                          }
                        }
                        createdReleaseId '${precalc6_stop_complete}'
                      }
                      gate('Wait for Stop ${bw_precalc_host6}') {
                        dependencies {
                          dependency {
                            variable 'precalc6_stop_complete'
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('Stop BI-JAVA ${java_stack_SID}') {
                precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True  or releaseVariables[\'Java_stack_UNIX_patching\'] == True  or releaseVariables[\'BW_UNIX_patching\'] == True'
                tasks {
                  custom('Notify Java Stack ${java_stack_SID} is now stopping') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'Java Stack ${java_stack_SID} is now stopping...'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Java Stack ${java_stack_SID} is now stopping...", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                  sequentialGroup('Stop ${java_stack_SID} on app server ${java_stack_host1}') {
                    precondition 'releaseVariables[\'java_stack_host1\'] != \'\''
                    tasks {
                      createRelease('Stop ${java_stack_SID} on ${java_stack_host1}') {
                        scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-05T15:11:00+0100')
                        waitForScheduledStartDate false
                        precondition 
                        newReleaseTitle '${release.title} - stop ${java_stack_SID} on ${java_stack_host1}'
                        template 'SAP/Java/SAP JAVA Server Control - sapcontrol version'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Stop'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${java_stack_host1}'
                          }
                          stringVariable('sid') {
                            label 'SAP SID in lowercase'
                            value '${java_stack_SID}'
                          }
                        }
                        createdReleaseId '${java_stack_host1_stop_complete}'
                      }
                      gate('Wait for stop  ${java_stack_SID} on ${java_stack_host1}') {
                        dependencies {
                          dependency {
                            variable 'java_stack_host1_stop_complete'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Stop ${java_stack_SID} on ${java_stack_host}') {
                    precondition 'releaseVariables[\'java_stack_host\'] != \'\''
                    tasks {
                      createRelease('Stop ${java_stack_SID} on ${java_stack_host}') {
                        scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-05T15:11:00+0100')
                        waitForScheduledStartDate false
                        precondition 
                        newReleaseTitle '${release.title} - stop ${java_stack_SID} on ${java_stack_host}'
                        template 'SAP/Java/SAP JAVA Server Control - sapcontrol version'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Stop'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${java_stack_host}'
                          }
                          stringVariable('sid') {
                            label 'SAP SID in lowercase'
                            value '${java_stack_SID}'
                          }
                        }
                        createdReleaseId '${java_stack_host_stop_complete}'
                      }
                      gate('Wait for stop  ${java_stack_SID} on ${java_stack_host}') {
                        dependencies {
                          dependency {
                            variable 'java_stack_host_stop_complete'
                          }
                        }
                      }
                    }
                  }
                  custom('Notify JAVA Stack ${java_stack_SID} is now stopped') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'Java Stack ${java_stack_SID} is now stopped'
                      attachments '[{"color": "good", "title": "${release.title}""fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Java Stack ${java_stack_SID} is now stopped", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                }
              }
              sequentialGroup('Stop Streamserve ${StreamserveEnvironment} application') {
                precondition 'releaseVariables[\'StreamserveEnvironment\'] != \'\' and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop Streamserve ${StreamserveEnvironment} application') {
                    newReleaseTitle 'Stop Streamserve ${StreamserveEnvironment} application'
                    template 'StreamServe/Streamserve 5.6.2 and Tomcat8'
                    templateVariables {
                      listBoxVariable('environment') {
                        label 'Streamserve environment'
                        possibleValues 'Dev', 'Test', 'Production'
                        value '${StreamserveEnvironment}'
                      }
                      listBoxVariable('StopStartparam') {
                        label 'Stop or Start'
                        description 'Stop or Start'
                        possibleValues 'Stop', 'Start', 'Status'
                        value 'Stop'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${streamserve_stop_complete}'
                  }
                  gate('Wait for Streamserve stop') {
                    dependencies {
                      dependency {
                        variable 'streamserve_stop_complete'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Stop Mastersaf') {
                precondition 'releaseVariables[\'MastersafEnvironment\'] != \'\'   and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop Mastersaf ${MastersafEnvironment}') {
                    newReleaseTitle 'Stop Mastersaf ${MastersafEnvironment}'
                    template 'Mastersaf/Mastersaf control'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('StopStartparam') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Check'
                        value 'Stop'
                      }
                      stringVariable('environment') {
                        value '${MastersafEnvironment}'
                      }
                    }
                    createdReleaseId '${msaf_stopped}'
                  }
                  gate('wait for Mastersaf ${MastersafEnvironment}') {
                    dependencies {
                      dependency {
                        variable 'msaf_stopped'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Stop Invoiceware') {
                precondition 'releaseVariables[\'InvoicewareEnvironment\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop Invoiceware ${InvoicewareEnvironment}') {
                    newReleaseTitle 'Stop Invoiceware ${InvoicewareEnvironment}'
                    template 'Invoiceware/Invoiceware control'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('StopStartparam') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart'
                        value 'Stop'
                      }
                      stringVariable('environment') {
                        value '${InvoicewareEnvironment}'
                      }
                    }
                    createdReleaseId '${invoiceware_stopped}'
                  }
                  gate('wait for Invoiceware ${InvoicewareEnvironment}') {
                    dependencies {
                      dependency {
                        variable 'invoiceware_stopped'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Stop SAP Data Services ${BusinessObjectsEnvironment}') {
                precondition 'releaseVariables[\'BusinessObjectsEnvironment\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop SAP Data Services  (Production)') {
                    precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Production\''
                    newReleaseTitle 'Stop SAP Data Services (${BusinessObjectsEnvironment})'
                    template 'SAP/Business Objects/SAP Data Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Production'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${sap_bo_ds_stop}'
                  }
                  createRelease('Stop SAP Data Services  (Test)') {
                    precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Test\''
                    newReleaseTitle 'Stop SAP Data Services (${BusinessObjectsEnvironment})'
                    template 'SAP/Business Objects/SAP Data Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Test'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${sap_bo_ds_stop}'
                  }
                  gate('Wait for SAP Data Services') {
                    dependencies {
                      dependency {
                        variable 'sap_bo_ds_stop'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Stop TRAX ${TRAXEnvironment}') {
                precondition 'releaseVariables[\'TRAXEnvironment\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop TRAX  (Production)') {
                    precondition 'releaseVariables[\'TRAXEnvironment\']==\'Production\''
                    newReleaseTitle 'Stop TRAX (${TRAXEnvironment})'
                    template 'TRAX/TRAX Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Production'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${trax_stop}'
                  }
                  createRelease('Stop TRAX  (Test)') {
                    precondition 'releaseVariables[\'TRAXEnvironment\']==\'Test\''
                    newReleaseTitle 'Stop TRAX (${TRAXEnvironment})'
                    template 'TRAX/TRAX Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Test'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${trax_stop}'
                  }
                  gate('Wait for TRAX') {
                    dependencies {
                      dependency {
                        variable 'trax_stop'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Stop SAP BO BI ${BusinessObjectsEnvironment}') {
                plannedDuration 120
                precondition 'releaseVariables[\'BusinessObjectsEnvironment\'] != \'\'  and ( releaseVariables[\'restart_BW\'] == True or releaseVariables[\'StopStartHANA\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop SAP BO BI  (Production)') {
                    precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Production\''
                    newReleaseTitle 'Stop SAP BO BI (${BusinessObjectsEnvironment})'
                    template 'SAP/Business Objects/SAP BO BI Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    folder 'SAP/ABAP'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Production'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                      booleanVariable('outage_page_controlled_by_parent_release') {
                        required false
                        label 'Untick if the release is not controlled by a parent release'
                        description 'if you untick, the release you are creating will control the F5 outage page for BO BI'
                        value true
                      }
                    }
                    createdReleaseId '${sap_bo_bi_stop}'
                  }
                  createRelease('Stop SAP BO BI  (Test)') {
                    precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Test\''
                    newReleaseTitle 'Stop SAP BO BI (${BusinessObjectsEnvironment})'
                    template 'SAP/Business Objects/SAP BO BI Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Test'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${sap_bo_bi_stop}'
                  }
                  gate('Wait for SAP BO BI') {
                    plannedDuration 1200
                    dependencies {
                      dependency {
                        variable 'sap_bo_bi_stop'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Stop PowerBI ${PowerBIEnvironment}') {
                precondition 'releaseVariables[\'PowerBIEnvironment\'] != \'\'  and ( releaseVariables[\'restart_BW\'] == True or releaseVariables[\'StopStartHANA\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Stop Power BI (Production)') {
                    precondition 'releaseVariables[\'PowerBIEnvironment\']==\'Production\''
                    newReleaseTitle 'Stop Power BI  (Production)'
                    template 'Microsoft/Power BI Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    folder 'SAP/ABAP'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Production'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${power_bi_stop}'
                  }
                  createRelease('Stop Power BI  (non-Production)') {
                    precondition 'releaseVariables[\'PowerBIEnvironment\']==\'Development\''
                    newReleaseTitle 'Stop Power BI  (non-Production)'
                    template 'Microsoft/Power BI Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                        value 'Stop'
                      }
                      listBoxVariable('environment') {
                        label 'Environment'
                        possibleValues 'Development', 'Test', 'Production'
                        value 'Development'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        description 'LEAVE THIS FIELD BLANK'
                        value '${slack_ts}'
                      }
                    }
                    createdReleaseId '${power_bi_stop}'
                  }
                  gate('Wait for Power BI') {
                    dependencies {
                      dependency {
                        variable 'power_bi_stop'
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      phase('Stop SAP ABAP applications and SAP IQ/HANA if required') {
        color '#009CDB'
        tasks {
          parallelGroup('Stop BW, SRM, GW') {
            tasks {
              sequentialGroup('Stop BW ${bw_sid}') {
                precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True'
                tasks {
                  custom('Notify SAP ${bw_sid} is now stopping') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'SAP ${bw_sid} is now stopping...'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${bw_sid} is now stopping...", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                  parallelGroup('Multi Host') {
                    precondition 
                    tasks {
                      sequentialGroup('Stop SAP on ${bw_host2}') {
                        precondition 'releaseVariables[\'bw_host2\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${bw_host2}') {
                            precondition 'releaseVariables[\'bw_host2\'] != \'\''
                            newReleaseTitle '${release.title} - ${action_full_name} ${host2}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${bw_host2}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${bw_sid}'
                              }
                            }
                            createdReleaseId '${bw_host2_stop_complete}'
                          }
                          gate('Wait for completion of stop SAP on ${bw_host2}') {
                            dependencies {
                              dependency {
                                variable 'bw_host2_stop_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Stop SAP on ${bw_host3}') {
                        precondition 'releaseVariables[\'bw_host3\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${bw_host3}') {
                            precondition 
                            newReleaseTitle '${release.title} - ${action_full_name} ${host3}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${bw_host3}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${bw_sid}'
                              }
                            }
                            createdReleaseId '${bw_host3_stop_complete}'
                          }
                          gate('Wait for completion of stop SAP on ${bw_host3}') {
                            dependencies {
                              dependency {
                                variable 'bw_host3_stop_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Stop SAP on ${bw_host4}') {
                        precondition 'releaseVariables[\'bw_host4\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${bw_host4}') {
                            precondition 
                            newReleaseTitle '${release.title} - ${action_full_name} ${host4}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${bw_host4}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${bw_sid}'
                              }
                            }
                            createdReleaseId '${bw_host4_stop_complete}'
                          }
                          gate('Wait for completion of stop SAP on ${bw_host4}') {
                            dependencies {
                              dependency {
                                variable 'bw_host4_stop_complete'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  createRelease('Stop CI on ${bw_host}') {
                    newReleaseTitle 'stop ${bw_sid} on ${bw_host}'
                    template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      listBoxVariable('StopStartparam') {
                        label 'Stop or Start'
                        description 'Stop or Start'
                        possibleValues 'Stop', 'Start'
                        value 'Stop'
                      }
                      stringVariable('host') {
                        label 'Host'
                        description 'The host name of the server'
                        value '${bw_host}'
                      }
                      stringVariable('sid') {
                        label 'SAP SID'
                        value '${bw_sid}'
                      }
                    }
                    createdReleaseId '${bw_CI_stop_complete}'
                  }
                  gate('Wait for ${bw_sid} CI stop') {
                    dependencies {
                      dependency {
                        variable 'bw_CI_stop_complete'
                      }
                    }
                  }
                  custom('Notify SAP ${bw_sid} is now stopped') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'SAP ${bw_sid} is now stopped'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${bw_sid} is now stopped", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                }
              }
              sequentialGroup('Stop GW ${gw_sid}') {
                precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                tasks {
                  custom('Notify SAP ${gw_sid} is now stopping') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'SAP ${gw_sid} is now stopping...'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${gw_sid} is now stopping...", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                  parallelGroup('Multi Host') {
                    precondition 
                    tasks {
                      sequentialGroup('Stop SAP on ${gw_host2}') {
                        precondition 'releaseVariables[\'gw_host2\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${gw_host2}') {
                            precondition 
                            newReleaseTitle 'Stop SAP ${gw_sid} on ${gw_host2}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${gw_host2}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${gw_sid}'
                              }
                            }
                            createdReleaseId '${gw_stop_host2_complete}'
                          }
                          gate('Wait for completion of stop SAP ${gw_sid} on ${gw_host2}') {
                            dependencies {
                              dependency {
                                variable 'gw_stop_host2_complete'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  createRelease('Stop ${gw_sid} CI on ${gw_host}') {
                    newReleaseTitle 'stop ${gw_sid} on ${gw_host}'
                    template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      listBoxVariable('StopStartparam') {
                        label 'Stop or Start'
                        description 'Stop or Start'
                        possibleValues 'Stop', 'Start'
                        value 'Stop'
                      }
                      stringVariable('host') {
                        label 'Host'
                        description 'The host name of the server'
                        value '${gw_host}'
                      }
                      stringVariable('sid') {
                        label 'SAP SID'
                        value '${gw_sid}'
                      }
                    }
                    createdReleaseId '${gw_CI_stop_complete}'
                  }
                  gate('Wait for ${gw_sid} CI stop') {
                    dependencies {
                      dependency {
                        variable 'gw_CI_stop_complete'
                      }
                    }
                  }
                  custom('Notify SAP ${gw_sid} is now stopped') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'SAP ${gw_sid} is now stopped'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${gw_sid} is now stopped", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                }
              }
              sequentialGroup('Stop SRM ${srm_sid}') {
                precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                tasks {
                  createRelease('stop SRM ${srm_sid}') {
                    newReleaseTitle 'stop SRM ${srm_sid}'
                    template 'SAP/ABAP/SAP SRM Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('host') {
                        value '${srm_host}'
                      }
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('StopStartparam') {
                        label 'Action'
                        possibleValues 'Stop', 'Start'
                        value 'Stop'
                      }
                      stringVariable('sid_adm') {
                        label 'SAP user <sid>adm'
                        description 
                        value '${srm_siduser}'
                      }
                      stringVariable('SID') {
                        value '${srm_sid}'
                      }
                      stringVariable('ipc_adm') {
                        value '${srm_ipcuser}'
                      }
                      stringVariable('trex_adm') {
                        value '${srm_trexadm}'
                      }
                      stringVariable('ipc_host') {
                        value '${srm_ipchost}'
                      }
                      stringVariable('trex_host') {
                        label 
                        value '${srm_trexhost}'
                      }
                      stringVariable('trex_system_number') {
                        value '${srm_trexSysNum}'
                      }
                      stringVariable('host1') {
                        required false
                        description 'for SRP only : app server hostname'
                        value '${srm_host2}'
                      }
                      stringVariable('CI_SysNum') {
                        value '${srm_CI_SysNum}'
                      }
                    }
                    createdReleaseId '${srm_stop_complete}'
                  }
                  gate('Wait for ${srm_sid} stop') {
                    dependencies {
                      dependency {
                        variable 'srm_stop_complete'
                      }
                    }
                  }
                }
              }
            }
          }
          parallelGroup('Stop ERP (and while ERP  stops, HANA , IQ can be stopped if BW is already down)') {
            tasks {
              sequentialGroup('Stop ERP ${erp_sid}') {
                precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                tasks {
                  custom('Notify SAP ${erp_sid} is now stopping') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'SAP ${erp_sid} is now stopping...'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${erp_sid} is now stopping...", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                  parallelGroup('Multi Host') {
                    precondition 'releaseVariables[\'erp_host2\']!=\'\''
                    tasks {
                      sequentialGroup('Stop SAP on ${erp_host2}') {
                        precondition 'releaseVariables[\'erp_host2\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${erp_host2}') {
                            precondition 
                            newReleaseTitle '${release.title} - Stop SAP on ${erp_host2}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${erp_host2}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${erp_sid}'
                              }
                            }
                            createdReleaseId '${erp_host2_stop_complete}'
                          }
                          gate('Wait for completion of stop SAP on ${erp_host2}') {
                            dependencies {
                              dependency {
                                variable 'erp_host2_stop_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Stop SAP on ${erp_host3}') {
                        precondition 'releaseVariables[\'erp_host3\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${erp_host3}') {
                            precondition 
                            newReleaseTitle '${release.title} - Stop SAP on ${erp_host3}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${erp_host3}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${erp_sid}'
                              }
                            }
                            createdReleaseId '${erp_host3_stop_complete}'
                          }
                          gate('Wait for completion of stop SAP on ${erp_host3}') {
                            dependencies {
                              dependency {
                                variable 'erp_host3_stop_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Stop SAP on ${erp_host4}') {
                        precondition 'releaseVariables[\'erp_host4\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${erp_host4}') {
                            precondition 
                            newReleaseTitle '${release.title} - Stop SAP on ${erp_host4}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${erp_host4}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${erp_sid}'
                              }
                            }
                            createdReleaseId '${erp_host4_stop_complete}'
                          }
                          gate('Wait for completion of stop SAP on ${erp_host4}') {
                            dependencies {
                              dependency {
                                variable 'erp_host4_stop_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Stop SAP on ${erp_host5}') {
                        precondition 'releaseVariables[\'erp_host5\'] != \'\''
                        tasks {
                          createRelease('Stop SAP on ${erp_host5}') {
                            precondition 
                            newReleaseTitle '${release.title} - Stop SAP on ${erp_host5}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${erp_host5}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${erp_sid}'
                              }
                            }
                            createdReleaseId '${erp_host5_stop_complete}'
                          }
                          gate('Wait for completion of stop SAP on ${erp_host5}') {
                            dependencies {
                              dependency {
                                variable 'erp_host5_stop_complete'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  createRelease('Stop SAP ${erp_sid} on ${erp_host}') {
                    newReleaseTitle '${release.title} - Stop SAP ${erp_sid} on ${erp_host}'
                    template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      listBoxVariable('StopStartparam') {
                        label 'Stop or Start'
                        description 'Stop or Start'
                        possibleValues 'Stop', 'Start'
                        value 'Stop'
                      }
                      stringVariable('host') {
                        label 'Host'
                        description 'The host name of the server'
                        value '${erp_host}'
                      }
                      stringVariable('sid') {
                        label 'SAP SID'
                        value '${erp_sid}'
                      }
                    }
                    createdReleaseId '${erp_host_stop_complete}'
                  }
                  gate('Wait for stop on ${erp_host}') {
                    dependencies {
                      dependency {
                        variable 'erp_host_stop_complete'
                      }
                    }
                  }
                  custom('Notify SAP ${erp_sid} is now stopped') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'SAP ${erp_sid} is now stopped'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${erp_sid} is now stopped", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                }
              }
              sequentialGroup('Stop HANA and IQ') {
                precondition 'releaseVariables[\'restart_BW\'] == True'
                tasks {
                  gate('Wait that BW ${bw_sid} is stopped first') {
                    dependencies {
                      dependency {
                        variable 'bw_CI_stop_complete'
                      }
                    }
                  }
                  parallelGroup('stop HANA and IQ') {
                    precondition 'releaseVariables[\'restart_BW\'] == True and ( releaseVariables[\'StopStartHANA\'] == True or  releaseVariables[\'RestartSybaseIQ\'] == True )'
                    tasks {
                      sequentialGroup('Stop HANA ${HANA_host}') {
                        precondition 'releaseVariables[\'StopStartHANA\'] == True'
                        tasks {
                          createRelease('Enable maintenance mode for HANA ${HANA_SID}') {
                            precondition 'releaseVariables[\'HANA_SID\']=="HBP"'
                            newReleaseTitle 'Enable maintenance mode for HANA ${HANA_SID}'
                            template 'SAP/HANA/Maintenance mode for HANA monitoring- this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Set or unset the maintenance flag'
                                description 'Set or unset the maintenance flag'
                                possibleValues 'Set', 'Unset'
                                value 'Set'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              stringVariable('HANA_host') {
                                value '${HANA_host}'
                              }
                              stringVariable('HANA_SID') {
                                description 'HANA SID'
                                value '${HANA_SID}'
                              }
                            }
                            createdReleaseId '${hana_maintenance_complete}'
                          }
                          custom('Notify HANA ${HANA_SID} is now stopping') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'HANA ${HANA_SID} is now stopping...'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "HANA ${HANA_SID} is now stopping...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          createRelease('Stop HANA ${HANA_SID}') {
                            precondition 
                            newReleaseTitle '${release.title} - Stop HANA ${HANA_SID}'
                            template 'SAP/HANA/SAP HANA Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${HANA_host}'
                              }
                              stringVariable('HANAInstanceNumber') {
                                label 'HANA Instance Number'
                                value '${HANA_Sys_Num}'
                              }
                              stringVariable('HANANumberofWorkers') {
                                label 'Number of nodes'
                                description 'usually 1 or 4'
                                value '${HANANumberofWorkers}'
                              }
                            }
                            createdReleaseId '${HANA_stopped}'
                          }
                          gate('Wait for Stop HANA ${HANA_host}') {
                            dependencies {
                              dependency {
                                variable 'HANA_stopped'
                              }
                            }
                          }
                          custom('Notify HANA ${HANA_SID} is now stopped') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'HANA ${HANA_SID} is now stopped'
                              attachments '[{"color": "good", "title": "${release.title} - ${sid} outage", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "HANA ${HANA_SID} is now stopped", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      sequentialGroup('Stop HANA prod standby due to Unity Storage maintenance on test environment') {
                        precondition 'releaseVariables[\'Unity_storage_patching\'] == True and releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                        tasks {
                          custom('Notify HANA production standby ${HANA_SID_production_standby} is now stopping due to Unity Storage maintenance') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'HANA production standby ${HANA_SID_production_standby} is now stopping due to Unity Storage maintenance'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Status", "value": "HANA production standby ${HANA_SID_production_standby} is now stopping due to Unity Storage maintenance...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          createRelease('Stop HANA production standby ${HANA_SID_production_standby}') {
                            precondition 
                            newReleaseTitle 'Stop HANA production standby ${HANA_SID_production_standby}'
                            template 'SAP/HANA/SAP HANA Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            folder 'SAP/ABAP'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${HANA_host}'
                              }
                              stringVariable('HANAInstanceNumber') {
                                label 'HANA Instance Number'
                                value '${HANA_Sys_Num_production_standby}'
                              }
                              stringVariable('HANANumberofWorkers') {
                                label 'Number of nodes'
                                description 'usually 1 or 4'
                                value '${HANANumberofWorkers}'
                              }
                            }
                            createdReleaseId '${HANA_production_standby_stopped}'
                          }
                          gate('Wait for HANA production standby ${HANA_SID_production_standby} to be stopped') {
                            dependencies {
                              dependency {
                                variable 'HANA_production_standby_stopped'
                              }
                            }
                          }
                          custom('HANA production standby ${HANA_SID_production_standby} has been brought down in preparation to Unity Storage maintenance') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'HANA production standby ${HANA_SID_production_standby} has been brought down in preparation to Unity Storage maintenance'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Status", "value": "HANA production standby ${HANA_SID_production_standby} has been brought down in preparation to Unity Storage maintenance", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      sequentialGroup('Stop SAP IQ on ${Sybase_IQ_Host}') {
                        precondition 'releaseVariables[\'RestartSybaseIQ\'] == True'
                        tasks {
                          createRelease('Stop SAP IQ ${Sybase_IQ_Host}') {
                            newReleaseTitle 'Stop SAP IQ ${Sybase_IQ_Host}'
                            template 'SAP/IQ/SAP IQ Control'
                            templateVariables {
                              stringVariable('host') {
                                value '${Sybase_IQ_Host}'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Stop'
                              }
                            }
                            createdReleaseId '${SAP_IQ_Stop_Complete}'
                          }
                          gate('Wait for Stop SAP IQ on ${Sybase_IQ_Host}') {
                            dependencies {
                              dependency {
                                variable 'SAP_IQ_Stop_Complete'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          parallelGroup('Notify Wintel + SQL server teams') {
            tasks {
              manual('Notify Wintel Team to apply Windows patches on the SAP dependent servers') {
                description 'Since all SAP apps are down, Wintel can now start working on Windows patches.\n' +
                '\n' +
                'Please notify Wintel team to work on the patching of the following servers.\n' +
                '\n' +
                'Please make sure you forward the server list to the Wintel Team\n' +
                '\n' +
                'BW Precalculation:\n' +
                '\n' +
                '* USORSMS327\n' +
                '* USORSMS326\n' +
                '* USORSMS325\n' +
                '* USORSDV140\n' +
                '* USORSDV139\n' +
                '* USDCVMS96\n' +
                '\n' +
                'Winshuttle:\n' +
                '* usorsms336\n' +
                '\n' +
                'Mastersaf:\n' +
                '* usorsms324\n' +
                '\n' +
                'Invoiceware: \n' +
                '* usorsms289\n' +
                '\n' +
                'Rightfax:\n' +
                '* usorsfx02\n' +
                '* usorsfx03\n' +
                '\n' +
                'Streamserve 5.6.2 database server:\n' +
                '* usdcvms92\n' +
                '\n' +
                'IDM prod:\n' +
                '* usorsms316\n' +
                '* usorsms318\n' +
                '* usorsms319\n' +
                '\n' +
                '\n' +
                'Business Objects , TRAX and FTP EDI are NOW DONE AUTOMATICALLY BY XL-RELEASE (calling Ansible)\n' +
                '\n' +
                'FYI - the list is maintained here : https://bramblesgroup.sharepoint.com/:w:/r/teams/webadmin/_layouts/15/Doc.aspx?sourcedoc=%7Bf586d9b8-7a93-4891-8e4f-95132a7c7d1c%7D&action=default'
                plannedDuration 600
                team 'Service Management Team'
                precondition 'releaseVariables[\'Apply_Windows_Patches\'] == True and releaseVariables[\'environment\'] == \'SAP production systems (BW,ERP,Gateway,SRM)\''
              }
              manual('Notify SQL Server Team to perform SQL server patches') {
                description 'Since all apps are down, SQL server Team can now start working on SQL patches.\n' +
                'Please notify SQL Server team...'
                plannedDuration 600
                team 'Service Management Team'
                precondition 'releaseVariables[\'Apply_SQL_Server_Patches\'] == True'
              }
            }
          }
        }
      }
      phase('Infra and SAP activities') {
        color '#0099CC'
        tasks {
          parallelGroup('Parallel operations') {
            precondition 'releaseVariables[\'ERP_upgrade\'] == False'
            tasks {
              sequentialGroup('SAP HANA Systems') {
                tasks {
                  manual('Perform maintenance on Unity Storage ${Unity_storage_name}') {
                    description 'Perform maintenance on Unity Storage ${Unity_storage_name}\n' +
                    '\n' +
                    'Caution! when you will mark this task complete, HANA ${HANA_SID} will be started automatically!'
                    plannedDuration 9000
                    team 'Storage Team'
                    precondition 'releaseVariables[\'Unity_storage_patching\'] == True'
                  }
                  manual('Double check with Storage Team that maintenance on Unity Storage ${Unity_storage_name}is complete.') {
                    description 'Double check with Storage Team that maintenance on Unity Storage ${Unity_storage_name}is complete.\n' +
                    '\n' +
                    'Caution! when you will mark this task complete, HANA ${HANA_SID} will be started automatically!'
                    plannedDuration 300
                    team 'Service Management Team'
                    precondition 'releaseVariables[\'Unity_storage_patching\'] == True'
                  }
                  sequentialGroup('Start HANA ${HANA_SID}') {
                    precondition 'releaseVariables[\'restart_BW\'] == True and releaseVariables[\'StopStartHANA\'] == True'
                    tasks {
                      custom('Notify HANA ${HANA_SID} is now starting') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'HANA ${HANA_SID} is now starting...'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "HANA ${HANA_SID} is now starting...", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      createRelease('Start HANA ${HANA_SID}') {
                        precondition 
                        newReleaseTitle '${release.title} - Start ${HANA_host}'
                        template 'SAP/HANA/SAP HANA Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${HANA_host}'
                          }
                          stringVariable('HANAInstanceNumber') {
                            label 'HANA Instance Number'
                            value '${HANA_Sys_Num}'
                          }
                          stringVariable('HANANumberofWorkers') {
                            label 'Number of nodes'
                            description 'usually 1 or 4'
                            value '${HANANumberofWorkers}'
                          }
                        }
                        createdReleaseId '${HANA_started}'
                      }
                      gate('Wait for start HANA ${HANA_host}') {
                        dependencies {
                          dependency {
                            variable 'HANA_started'
                          }
                        }
                      }
                      custom('Notify HANA ${HANA_SID} is now started') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'HANA ${HANA_SID} is now started'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "HANA ${HANA_SID} is now started", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      createRelease('Remove maintenance mode for HANA ${HANA_SID}') {
                        precondition 'releaseVariables[\'HANA_SID\']=="HBP"'
                        newReleaseTitle 'Enable maintenance mode for HANA ${HANA_SID}'
                        template 'SAP/HANA/Maintenance mode for HANA monitoring- this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          listBoxVariable('action') {
                            label 'Set or unset the maintenance flag'
                            description 'Set or unset the maintenance flag'
                            possibleValues 'Set', 'Unset'
                            value 'Unset'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          stringVariable('HANA_host') {
                            value '${HANA_host}'
                          }
                          stringVariable('HANA_SID') {
                            description 'HANA SID'
                            value '${HANA_SID}'
                          }
                        }
                        createdReleaseId '${hana_maintenance_complete}'
                      }
                    }
                  }
                  sequentialGroup('Start HANA prod standby after Unity Storage maintenance on test environment') {
                    precondition 'releaseVariables[\'Unity_storage_patching\'] == True and releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                    tasks {
                      custom('Notify HANA production standby ${HANA_SID_production_standby} is now starting after Unity Storage maintenance...') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'HANA production standby ${HANA_SID_production_standby} is now starting after Unity Storage maintenance...'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Status", "value": "HANA production standby ${HANA_SID_production_standby} is now starting after Unity Storage maintenance...", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      createRelease('Start HANA production standby ${HANA_SID_production_standby}') {
                        precondition 
                        newReleaseTitle 'Start HANA production standby ${HANA_SID_production_standby}'
                        template 'SAP/HANA/SAP HANA Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        folder 'SAP/ABAP'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${HANA_host}'
                          }
                          stringVariable('HANAInstanceNumber') {
                            label 'HANA Instance Number'
                            value '${HANA_Sys_Num_production_standby}'
                          }
                          stringVariable('HANANumberofWorkers') {
                            label 'Number of nodes'
                            description 'usually 1 or 4'
                            value '${HANANumberofWorkers}'
                          }
                        }
                        createdReleaseId '${HANA_production_standby_started}'
                      }
                      gate('Wait for HANA production standby ${HANA_SID_production_standby} to be started') {
                        dependencies {
                          dependency {
                            variable 'HANA_production_standby_started'
                          }
                        }
                      }
                      custom('HANA production standby ${HANA_SID_production_standby} has been brought down in preparation to Unity Storage maintenance') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'HANA production standby ${HANA_SID_production_standby} has been brought up after Unity Storage maintenance'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Status", "value": "HANA production standby ${HANA_SID_production_standby} has been brought up after Unity Storage maintenance", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('SAP IQ Systems') {
                tasks {
                  manual('Perform OS patching / upgrade / reboot of ${Sybase_IQ_Host}') {
                    description 'Perform OS patching / upgrade / reboot of ${Sybase_IQ_Host}'
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'reboot_IQ\'] == True'
                  }
                  sequentialGroup('Start SAP IQ on ${Sybase_IQ_Host}') {
                    precondition '(releaseVariables[\'restart_BW\'] == True and releaseVariables[\'RestartSybaseIQ\'] == True ) or releaseVariables[\'reboot_IQ\'] == True'
                    tasks {
                      createRelease('Start SAP IQ ${Sybase_IQ_Host}') {
                        newReleaseTitle 'Start SAP IQ ${Sybase_IQ_Host}'
                        template 'SAP/IQ/SAP IQ Control'
                        templateVariables {
                          stringVariable('host') {
                            value '${Sybase_IQ_Host}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Status'
                            value 'Start'
                          }
                        }
                        createdReleaseId '${SAP_IQ_Start_Complete}'
                      }
                      gate('Wait for Start SAP IQ on ${Sybase_IQ_Host}') {
                        dependencies {
                          dependency {
                            variable 'SAP_IQ_Start_Complete'
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('SAP BW ABAP system') {
                tasks {
                  manual('Perform OS patching / upgrade on ${backup_hostname_bw}') {
                    description 'Perform OS patching / upgrade on ${backup_hostname_bw}'
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'BW_UNIX_patching\'] == True'
                  }
                  manual('Perform reboot of ${backup_hostname_bw}') {
                    description 'Perform reboot of ${backup_hostname_bw}'
                    plannedDuration 600
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'reboot_BW\'] == True'
                  }
                  sequentialGroup('Start CCMSping agent on ${bw_host}') {
                    precondition 'releaseVariables[\'reboot_BW\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True'
                    tasks {
                      createRelease('start CCMSping agent on ${bw_host}') {
                        precondition 
                        newReleaseTitle 'start CCMSping agent on ${bw_host}'
                        template 'SAP/ABAP/SAP CCMSping Control  - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          stringVariable('host') {
                            value '${bw_host}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('ccmsping_inst_num') {
                            label 'CCMSPing instance number'
                            possibleValues '00', '01'
                            value '${CCMSPingAgentSysNum}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Status'
                            value 'Start'
                          }
                          stringVariable('sid_adm') {
                            label 'SAP user <sid>adm'
                            description 'for example : gwdadm, bwdadm, prdadm'
                            value '${bw_siduser}'
                          }
                        }
                        createdReleaseId '${CCMSAgentBWComplete}'
                      }
                      gate('Wait for CCMSping agent') {
                        dependencies {
                          dependency {
                            variable 'CCMSAgentBWComplete'
                          }
                        }
                      }
                    }
                  }
                  gate('Wait for HANA ${HANA_SID} to be up and running before starting SAP ${bw_sid}') {
                    dependencies {
                      dependency {
                        variable 'HANA_started'
                      }
                    }
                  }
                  sequentialGroup('Start BW ${bw_sid}') {
                    plannedDuration 360
                    precondition 'releaseVariables[\'restart_BW\'] == True  or releaseVariables[\'reboot_BW\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True'
                    tasks {
                      custom('Notify SAP ${bw_sid} is now starting') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'SAP ${bw_sid} is now starting...'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${bw_sid} is now starting... check your SAP MMC to see the progress", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      createRelease('Start ${bw_sid} on ${bw_host}') {
                        newReleaseTitle '${release.title} - Start SAP on  ${erp_host}'
                        template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${bw_host}'
                          }
                          stringVariable('sid') {
                            label 'SAP SID'
                            value '${bw_sid}'
                          }
                        }
                        createdReleaseId '${bw_host1_start_complete}'
                      }
                      gate('Wait for CI ${bw_host}') {
                        dependencies {
                          dependency {
                            variable 'bw_host1_start_complete'
                          }
                        }
                      }
                      parallelGroup('Multi Host') {
                        precondition 'releaseVariables[\'bw_host\']!=\'\' and releaseVariables[\'bw_host2\']!=\'\''
                        tasks {
                          sequentialGroup('Start SAP ${bw_sid} on ${bw_host2}') {
                            precondition 'releaseVariables[\'bw_host2\'] != \'\''
                            tasks {
                              createRelease('Start SAP ${bw_sid} on ${bw_host2}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${bw_sid} on ${bw_host2}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${bw_host2}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${bw_sid}'
                                  }
                                }
                                createdReleaseId '${bw_host2_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${bw_host2}') {
                                dependencies {
                                  dependency {
                                    variable 'bw_host2_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP ${bw_sid} on ${bw_host3}') {
                            precondition 'releaseVariables[\'bw_host3\'] != \'\''
                            tasks {
                              createRelease('Start SAP ${bw_sid} on ${bw_host3}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${bw_sid} on ${bw_host3}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${bw_host3}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${bw_sid}'
                                  }
                                }
                                createdReleaseId '${bw_host3_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${bw_host3}') {
                                dependencies {
                                  dependency {
                                    variable 'bw_host3_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP ${bw_sid} on ${bw_host4}') {
                            precondition 'releaseVariables[\'bw_host4\'] != \'\''
                            tasks {
                              createRelease('Start SAP ${bw_sid} on ${bw_host4}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${bw_sid} on ${bw_host4}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${bw_host4}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${bw_sid}'
                                  }
                                }
                                createdReleaseId '${bw_host4_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${bw_host4}') {
                                dependencies {
                                  dependency {
                                    variable 'bw_host4_start_complete'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      custom('Notify SAP ${bw_sid} is now started') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'SAP ${bw_sid} is now started'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${bw_sid} is now started", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                    }
                  }
                  sequentialGroup('Apply Rev-Tracs in BW') {
                    precondition 'releaseVariables[\'revtracs_BW\'] != \'\''
                    tasks {
                      manual('Apply Rev-tracs in ${bw_sid}.') {
                        description 'Please approve ${revtracs_BW} to ${bw_sid}.\n' +
                        '\n' +
                        'Click the Complete button once those Rev-Tracs have successfully gone into {bw_sid}'
                        team 'SAP/Web Admin Team'
                      }
                      sequentialGroup('Manual steps post Rev-Tracs') {
                        description 
                        precondition 'releaseVariables[\'revtracs_post_steps_BW\'] == True'
                        tasks {
                          manual('Unlock specific users in ${bw_sid}. to perform steps') {
                            plannedDuration 300
                            team 'SAP/Web Admin Team'
                          }
                          manual('Notify people that manual steps in ${bw_sid}. are about to begin') {
                            team 'Service Management Team'
                          }
                          manual('Manual steps') {
                            precondition 
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('SAP ERP system') {
                tasks {
                  sequentialGroup('Stop Oracle ${erp_sid} (regular stop - no upgrade involved)') {
                    precondition '( releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True ) and releaseVariables[\'ERP_DB_upgrade\'] == False'
                    tasks {
                      custom('Notify Oracle ${erp_sid} has to be stopped') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'Oracle ${erp_sid} now has to be stopped...'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} now has to be stopped...", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      manual('Stop Oracle ${erp_sid} (production)') {
                        description 'Please first defer the log shipping to the standbys then stop Oracle ${erp_sid} \n' +
                        '\n' +
                        'Click the Complete button once you have stopped Oracle ${erp_sid} \n' +
                        'Click the Fail button below to not go further'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                      }
                      manual('Stop Oracle ${erp_sid} (non-production)') {
                        description 'Oracle DBA Team : Stop Oracle ${erp_sid} on on ${backup_hostname_erp}\n' +
                        '\n' +
                        'Click the Complete button once you have stopped Oracle ${erp_sid} \n' +
                        'Click the Fail button below to not go further'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 'releaseVariables[\'environment\']!=\'SAP production systems (BW,ERP,Gateway,SRM)\''
                      }
                      manual('Stop listener for Oracle ${erp_sid}') {
                        description 'Because ${backup_hostname_erp} will be patched / upgraded by the UNIX Team,, please stop ${erp_Oracle_listener} on ${backup_hostname_erp}\n' +
                        '\n' +
                        'Click the Complete button once you have stopped ${erp_Oracle_listener} on ${backup_hostname_erp}'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 'releaseVariables[\'ERP_UNIX_patching\'] == \'True\''
                      }
                      custom('Notify Oracle ${erp_sid} is now stopped') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'Oracle ${erp_sid} is now stopped'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} is now stopped", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                    }
                  }
                  manual('Perform OS patching / upgrade on ${backup_hostname_erp}') {
                    description 'Perform OS patching / upgrade on ${backup_hostname_erp}'
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'ERP_UNIX_patching\'] == True'
                  }
                  manual('Perform reboot of ${backup_hostname_erp}') {
                    description 'Perform reboot of ${backup_hostname_erp}'
                    plannedDuration 900
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'reboot_ERP\'] == True'
                  }
                  parallelGroup('Start Oracle or perform DB upgrade + CCMSping') {
                    tasks {
                      sequentialGroup('Start CCMSping agent on ${erp_host}') {
                        precondition 'releaseVariables[\'reboot_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True'
                        tasks {
                          createRelease('start CCMSping agent on ${erp_host}') {
                            precondition 
                            newReleaseTitle 'start CCMSping agent on ${erp_host}'
                            template 'SAP/ABAP/SAP CCMSping Control  - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('host') {
                                value '${erp_host}'
                              }
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('ccmsping_inst_num') {
                                label 'CCMSPing instance number'
                                possibleValues '00', '01'
                                value '${CCMSPingAgentSysNum}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Start'
                              }
                              stringVariable('sid_adm') {
                                label 'SAP user <sid>adm'
                                description 'for example : gwdadm, bwdadm, prdadm'
                                value '${erp_siduser}'
                              }
                            }
                            createdReleaseId '${CCMSAgentComplete}'
                          }
                          gate('Wait for CCMSping agent') {
                            dependencies {
                              dependency {
                                variable 'CCMSAgentComplete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Oracle ${erp_sid} (regular start - no DB upgrade involved)') {
                        precondition '( releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True ) and releaseVariables[\'ERP_DB_upgrade\'] == False'
                        tasks {
                          custom('Notify Oracle ${erp_sid} has to be started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} now has to be started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} now has to be  started...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          manual('Start listener') {
                            description 'DBA Team : please start ${erp_Oracle_listener} on ${backup_hostname_erp}\n' +
                            '\n' +
                            'Click the Complete button once you have started the listener${erp_Oracle_listener} on ${backup_hostname_erp}\n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 180
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'reboot_ERP\'] ==True or releaseVariables[\'ERP_UNIX_patching\'] ==True'
                          }
                          manual('Start Oracle ${erp_sid} (production)') {
                            description 'Oracle DBA Team :  start Oracle ${erp_sid} on ${backup_hostname_erp} and then re-enable log shipping to the standbys\n' +
                            '\n' +
                            'Click the Complete button once you have started Oracle ${erp_sid} and re-enabled log shipping to the standbys\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 600
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                          }
                          manual('Start Oracle ${erp_sid} (non-production)') {
                            description 'Oracle DBA Team :  start Oracle ${erp_sid} on ${backup_hostname_erp}\n' +
                            '\n' +
                            'Click the Complete button once you have started Oracle ${erp_sid} \n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 600
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'environment\']!=\'SAP production systems (BW,ERP,Gateway,SRM)\''
                          }
                          parallelGroup('Resume backups and monitoring for Oracle ${erp_sid}') {
                            precondition 
                            tasks {
                              sequentialGroup('Resume OEM monitoring for Oracle ${erp_sid}') {
                                tasks {
                                  createRelease('stop OEM blackout for Oracle ${erp_sid}') {
                                    newReleaseTitle 'stop OEM blackout for Oracle ${erp_sid}'
                                    template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${erp_host}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${erp_sid}'
                                      }
                                      stringVariable('notification_recipients') {
                                        value '${OEM_recipients}'
                                      }
                                    }
                                    createdReleaseId '${OEM_ERP_resumed}'
                                  }
                                  gate('wait for OEM') {
                                    dependencies {
                                      dependency {
                                        variable 'OEM_ERP_resumed'
                                      }
                                    }
                                  }
                                }
                              }
                              manual('Resume backups for Oracle ${erp_sid}') {
                                description 'NetBackup Team : please resume Oracle backups for Oracle ${erp_sid}\n' +
                                '\n' +
                                'Click the Complete button once you have resumed backups for Oracle ${erp_sid}\n' +
                                '\n' +
                                'Click the Fail button below to not go further'
                                plannedDuration 300
                                team 'Netbackup Team'
                                precondition 
                              }
                            }
                          }
                          custom('Notify Oracle ${erp_sid} is now started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} is now started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} is now started", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      sequentialGroup('Upgrade Oracle ${erp_sid}') {
                        precondition 'releaseVariables[\'ERP_DB_upgrade\'] == True'
                        tasks {
                          custom('Notify Oracle ${erp_sid} has to be upgraded') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} now has to be upgraded'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} now has to be upgraded...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          manual('Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -PRE-ORA-UPGRADE') {
                            description 'Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -POST-ORA-UPGRADE'
                            plannedDuration 300
                            team 'Storage Team'
                          }
                          manual('Lock non-SAP application DB users') {
                            description 'alter user VTXUSR_TPS account lock;\n' +
                            'alter user  VTXUSR_RPT account lock;\n' +
                            'alter user  VERTEX7  account lock;\n' +
                            'alter user AU_USER account lock;\n' +
                            'alter user QUEST account lock;'
                            plannedDuration 120
                            team 'SAP/Web Admin Team'
                          }
                          manual('Upgrade Oracle ${erp_sid}') {
                            description 'Oracle DBA Team :  start Oracle ${erp_sid} on ${erp_host}\n' +
                            '\n' +
                            'Click the Complete button once you have upgraded Oracle ${erp_sid} \n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 600
                            team 'Oracle DBA Team'
                            precondition 
                          }
                          manual('Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -POST-ORA-UPGRADE') {
                            description 'Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -POST-ORA-UPGRADE'
                            plannedDuration 300
                            team 'Storage Team'
                          }
                          parallelGroup('Resume backups and monitoring for Oracle ${erp_sid}') {
                            precondition 
                            tasks {
                              sequentialGroup('Resume OEM monitoring for Oracle ${erp_sid}') {
                                tasks {
                                  createRelease('stop OEM blackout for Oracle ${erp_sid}') {
                                    newReleaseTitle 'stop OEM blackout for Oracle ${erp_sid}'
                                    template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${erp_host}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${erp_sid}'
                                      }
                                      stringVariable('notification_recipients') {
                                        value '${OEM_recipients}'
                                      }
                                    }
                                    createdReleaseId '${OEM_ERP_resumed}'
                                  }
                                  gate('wait for OEM') {
                                    dependencies {
                                      dependency {
                                        variable 'OEM_ERP_resumed'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Backup steps') {
                                tasks {
                                  manual('Upgrade RMAN recovery catalog for Oracle ${erp_sid}') {
                                    description 'Please upgrade RMAN recovery catalog for Oracle ${erp_sid}'
                                    plannedDuration 180
                                    team 'Oracle DBA Team'
                                  }
                                  manual('Kick online backup for Oracle ${erp_sid} and make sure the backup is running properly before closing the task.') {
                                    description 'Because Oracle ${erp_sid} has just been upgraded, please kick an online backup for Oracle ${erp_sid} on ${backup_hostname_erp} and make sure the backup is running properly before closing the task.\n' +
                                    '\n' +
                                    'Click the Fail button below to not go further'
                                    plannedDuration 300
                                    team 'Netbackup Team'
                                    precondition 
                                  }
                                  manual('Resume backups schedule for Oracle ${erp_sid}') {
                                    description 'NetBackup Team : please resume Oracle backups for Oracle ${erp_sid} (archived redologs backup/cleanup  AND online backups)\n' +
                                    '\n' +
                                    'Click the Complete button once you have resumed backups for Oracle ${erp_sid}\n' +
                                    '\n' +
                                    'Click the Fail button below to not go further'
                                    plannedDuration 300
                                    team 'Netbackup Team'
                                    precondition 
                                  }
                                }
                              }
                              manual('Update .dbenv.csh for ${erp_siduser}') {
                                description 'Update .dbenv.csh for ${erp_siduser} to reflect upgraded Oracle settings'
                                plannedDuration 300
                                team 'SAP/Web Admin Team'
                              }
                              manual('If applicable, update the instant client on the SAP ${erp_sid} hosts.') {
                                description 'If applicable, update the instant client on the SAP ${erp_sid} hosts.\n' +
                                'And if applicable, update instant client path in .dbenv.csh for ${erp_siduser}.'
                                plannedDuration 900
                                team 'SAP/Web Admin Team'
                              }
                              manual('Unlock non-SAP application DB users') {
                                description 'alter user VTXUSR_TPS account unlock;\n' +
                                'alter user  VTXUSR_RPT account unlock;\n' +
                                'alter user  VERTEX7  account unlock;\n' +
                                'alter user AU_USER account unlock;\n' +
                                'alter user QUEST account unlock;'
                                plannedDuration 120
                                team 'SAP/Web Admin Team'
                              }
                            }
                          }
                          custom('Notify Oracle ${erp_sid} is now upgraded') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} is now upgraded'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Status", "value": "Oracle ${erp_sid} is now upgraded", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Start ERP ${erp_sid}') {
                    description 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                    precondition 
                    tasks {
                      custom('Notify SAP ${erp_sid} is now starting') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'SAP ${erp_sid} is now starting...'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${erp_sid} is now starting... check your SAP MMC to see the progress", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      createRelease('Start CI ${erp_sid} on ${erp_host}') {
                        newReleaseTitle '${release.title} - Start SAP {erp_sid} on  ${erp_host}'
                        template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${erp_host}'
                          }
                          stringVariable('sid') {
                            label 'SAP SID'
                            value '${erp_sid}'
                          }
                        }
                        createdReleaseId '${erp_host1_start_complete}'
                      }
                      gate('Wait for CI ${erp_host}') {
                        dependencies {
                          dependency {
                            variable 'erp_host1_start_complete'
                          }
                        }
                      }
                      parallelGroup('Start app servers') {
                        precondition 'releaseVariables[\'erp_host\']!=\'\' and releaseVariables[\'erp_host2\']!=\'\''
                        tasks {
                          sequentialGroup('Start SAP on ${erp_host2}') {
                            precondition 'releaseVariables[\'erp_host2\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host2}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host2}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host2}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host2_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host2}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host2_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP on ${erp_host3}') {
                            precondition 'releaseVariables[\'erp_host3\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host3}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host3}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host3}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host3_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host3}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host3_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP on ${erp_host4}') {
                            precondition 'releaseVariables[\'erp_host4\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host4}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host4}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host4}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host4_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host4}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host4_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP on ${erp_host5}') {
                            precondition 'releaseVariables[\'erp_host5\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host5}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host5}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host5}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host5_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host5}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host5_start_complete'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      custom('Notify SAP ${erp_sid} is now started') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'SAP ${erp_sid} is now started'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${erp_sid} is now started", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                    }
                  }
                  sequentialGroup('Apply Rev-Tracs in ERP') {
                    precondition 'releaseVariables[\'revtracs_ERP\'] != \'\''
                    tasks {
                      manual('Apply Rev-tracs in ${erp_sid}') {
                        description 'Please approve ${revtracs_ERP} to  ${erp_sid}\n' +
                        '\n' +
                        'Click the Complete button once those Rev-Tracs have successfully gone into  ${erp_sid}'
                        team 'SAP/Web Admin Team'
                      }
                      sequentialGroup('Manual steps post Rev-Tracs') {
                        description 
                        precondition 'releaseVariables[\'revtracs_post_steps_ERP\'] == True'
                        tasks {
                          manual('Unlock specific users in ${erp_sid} to perform steps') {
                            plannedDuration 300
                            team 'SAP/Web Admin Team'
                          }
                          manual('Notify people that manual steps are in ${erp_sid} about to begin') {
                            team 'Service Management Team'
                          }
                          manual('Manual steps') {
                            precondition 
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('SAP BI-JAVA (OS+DB)') {
                tasks {
                  sequentialGroup('Stop Oracle ${java_stack_SID} (and ASM if relevant)') {
                    precondition 'releaseVariables[\'restart_Oracle_BIJAVA\'] == True or releaseVariables[\'reboot_BIJAVA\'] == True or releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                    tasks {
                      sequentialGroup('Stop Oracle ${java_stack_SID}') {
                        tasks {
                          createRelease('Stop Oracle ${java_stack_SID}') {
                            newReleaseTitle 'Stop Oracle ${java_stack_SID}'
                            template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Stop'
                              }
                              stringVariable('host') {
                                label 'host'
                                value '${backup_hostname_java_stack}'
                              }
                              stringVariable('SID') {
                                label 'Oracle SID'
                                value '${java_stack_SID}'
                              }
                            }
                            createdReleaseId '${oracle_java_stack_stop_complete}'
                          }
                          gate('Wait for Oracle ${java_stack_SID}') {
                            dependencies {
                              dependency {
                                variable 'oracle_java_stack_stop_complete'
                              }
                            }
                          }
                        }
                      }
                      manual('Stop ASM + Oracle HAS on ${backup_hostname_java_stack}') {
                        description 'Because ${backup_hostname_java_stack} will be patched / upgraded by the UNIX Team,, please stop ASM + Oracle HAS on ${backup_hostname_java_stack}\n' +
                        '\n' +
                        'Click the Complete button once you have stopped ASM + Oracle HAS on ${backup_hostname_java_stack}\n' +
                        'Click the Fail button below to not go further'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == \'True\''
                      }
                    }
                  }
                  manual('Perform OS patching / upgrade on ${backup_hostname_java_stack}') {
                    description 'Perform OS patching / upgrade on ${backup_hostname_java_stack}'
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                  }
                  sequentialGroup('Start Oracle ${java_stack_SID} etc.') {
                    precondition 'releaseVariables[\'restart_Oracle_BIJAVA\'] == True or releaseVariables[\'reboot_BIJAVA\'] == True or releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                    tasks {
                      manual('Check Oracle HAS and ASM  on ${backup_hostname_java_stack}') {
                        description 'Because ${backup_hostname_java_stack} has been patched / upgraded by the UNIX Team,, please check Oracle HAS and ASM  on ${backup_hostname_java_stack}${backup_hostname_java_stack}\n' +
                        '\n' +
                        'Please note that the next task will automatically start Oracle ${java_stack_SID}'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == \'True\''
                      }
                      sequentialGroup('Start Oracle ${java_stack_SID}') {
                        tasks {
                          createRelease('Start Oracle ${java_stack_SID}') {
                            newReleaseTitle 'Start Oracle ${java_stack_SID}'
                            template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Start'
                              }
                              stringVariable('host') {
                                label 'host'
                                value '${backup_hostname_java_stack}'
                              }
                              stringVariable('SID') {
                                label 'Oracle SID'
                                value '${java_stack_SID}'
                              }
                            }
                            createdReleaseId '${oracle_java_stack_start_complete}'
                          }
                          gate('Wait for Oracle ${java_stack_SID}') {
                            dependencies {
                              dependency {
                                variable 'oracle_java_stack_start_complete'
                              }
                            }
                          }
                        }
                      }
                      parallelGroup('Resume backups and monitoring for Oracle ${java_stack_SID}') {
                        precondition 
                        tasks {
                          manual('Resume backups for Oracle ${java_stack_SID}') {
                            description 'NetBackup Team : please resume Oracle backups for Oracle ${java_stack_SID}\n' +
                            '\n' +
                            'Click the Complete button once you have resumed backups for Oracle ${java_stack_SID}\n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Netbackup Team'
                            precondition 
                          }
                          sequentialGroup('Resume OEM monitoring for Oracle ${java_stack_SID}') {
                            tasks {
                              createRelease('stop OEM blackout for Oracle ${java_stack_SID}') {
                                newReleaseTitle 'stop OEM blackout for Oracle ${java_stack_SID}'
                                template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Stop'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${java_stack_host}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${java_stack_SID}'
                                  }
                                  stringVariable('notification_recipients') {
                                    value '${OEM_recipients}'
                                  }
                                }
                                createdReleaseId '${OEM_JavaStack_resumed}'
                              }
                              gate('wait for OEM') {
                                dependencies {
                                  dependency {
                                    variable 'OEM_JavaStack_resumed'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('SAP Gateway system') {
                tasks {
                  parallelGroup('Stop DB + Control-M agent') {
                    tasks {
                      sequentialGroup('Stop Oracle ${gw_sid} (and ASM if relevant)') {
                        precondition 'releaseVariables[\'restart_Oracle_GW\'] == True or releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                        tasks {
                          sequentialGroup('Stop Oracle ${gw_sid}') {
                            tasks {
                              createRelease('Stop Oracle ${gw_sid}') {
                                newReleaseTitle 'Stop Oracle ${gw_sid}'
                                template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Stop'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${backup_hostname_gw}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${gw_sid}'
                                  }
                                }
                                createdReleaseId '${oracle_gw_stop_complete}'
                              }
                              gate('Wait for Oracle ${gw_sid}') {
                                dependencies {
                                  dependency {
                                    variable 'oracle_gw_stop_complete'
                                  }
                                }
                              }
                            }
                          }
                          manual('Stop ASM + Oracle HAS on ${backup_hostname_gw}') {
                            description 'Because ${backup_hostname_gw} will be patched / upgraded by the UNIX Team,, please stop ASM + Oracle HAS on ${backup_hostname_gw}\n' +
                            '\n' +
                            'Click the Complete button once you have stopped ASM + Oracle HAS on ${backup_hostname_gw}\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'GW_UNIX_patching\'] == \'True\''
                          }
                        }
                      }
                      sequentialGroup('Stop Control-M agent on SAP Gateway ${gw_host}') {
                        precondition 'releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                        tasks {
                          createRelease('Stop Control-M agent on SAP Gateway ${gw_host}') {
                            newReleaseTitle 'Stop Control-M agent on SAP Gateway ${gw_host}'
                            template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('ctm_agt_host') {
                                value '${gw_host}'
                              }
                            }
                            createdReleaseId '${ctm_agt_gw_stop}'
                          }
                          gate('Wait for CTM agent stop') {
                            dependencies {
                              dependency {
                                variable 'ctm_agt_gw_stop'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  manual('Perform OS patching / upgrade on ${backup_hostname_gw}') {
                    description 'Perform OS patching / upgrade on ${backup_hostname_gw}'
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'GW_UNIX_patching\'] == True'
                  }
                  parallelGroup('Start Oracle + CCMSping') {
                    tasks {
                      sequentialGroup('Start CCMSping agent on ${gw_host}') {
                        precondition 'releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                        tasks {
                          createRelease('start CCMSping agent on ${gw_host}') {
                            precondition 
                            newReleaseTitle 'start CCMSping agent on ${gw_host}'
                            template 'SAP/ABAP/SAP CCMSping Control  - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('host') {
                                value '${gw_host}'
                              }
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('ccmsping_inst_num') {
                                label 'CCMSPing instance number'
                                possibleValues '00', '01'
                                value '${CCMSPingAgentSysNum}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Start'
                              }
                              stringVariable('sid_adm') {
                                label 'SAP user <sid>adm'
                                description 'for example : gwdadm, bwdadm, prdadm'
                                value '${gw_siduser}'
                              }
                            }
                            createdReleaseId '${CCMSAgentGWComplete}'
                          }
                          gate('Wait for CCMSping agent') {
                            dependencies {
                              dependency {
                                variable 'CCMSAgentGWComplete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Oracle ${gw_sid} etc.') {
                        precondition 'releaseVariables[\'restart_Oracle_GW\'] == True or releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                        tasks {
                          manual('Check Oracle HAS and ASM  on ${backup_hostname_gw}') {
                            description 'Because ${backup_hostname_gw} has been patched / upgraded by the UNIX Team,, please check Oracle HAS and ASM on ${backup_hostname_gw}\n' +
                            '\n' +
                            'Please note that the next task will automatically start Oracle ${gw_sid}'
                            plannedDuration 300
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'GW_UNIX_patching\'] == \'True\''
                          }
                          sequentialGroup('Start Oracle ${gw_sid}') {
                            tasks {
                              createRelease('Start Oracle ${gw_sid}') {
                                newReleaseTitle 'Start Oracle ${gw_sid}'
                                template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${backup_hostname_gw}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${gw_sid}'
                                  }
                                }
                                createdReleaseId '${oracle_gw_start_complete}'
                              }
                              gate('Wait for Oracle ${gw_sid}') {
                                dependencies {
                                  dependency {
                                    variable 'oracle_gw_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          parallelGroup('Resume backups and monitoring for Oracle ${gw_sid}') {
                            precondition 
                            tasks {
                              manual('Resume backups for Oracle ${gw_sid}') {
                                description 'NetBackup Team : please resume Oracle backups for Oracle ${gw_sid}\n' +
                                '\n' +
                                'Click the Complete button once you have resumed backups for Oracle ${gw_sid}\n' +
                                '\n' +
                                'Click the Fail button below to not go further'
                                plannedDuration 300
                                team 'Netbackup Team'
                                precondition 
                              }
                              sequentialGroup('Resume OEM monitoring for Oracle ${gw_sid}') {
                                tasks {
                                  createRelease('stop OEM blackout for Oracle ${gw_sid}') {
                                    newReleaseTitle 'stop OEM blackout for Oracle ${gw_sid}'
                                    template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${gw_host}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${gw_sid}'
                                      }
                                      stringVariable('notification_recipients') {
                                        value '${OEM_recipients}'
                                      }
                                    }
                                    createdReleaseId '${OEM_GW_resumed}'
                                  }
                                  gate('wait for OEM') {
                                    dependencies {
                                      dependency {
                                        variable 'OEM_GW_resumed'
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Control-M agent on SAP Gateway ${gw_host}') {
                        precondition 'releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                        tasks {
                          createRelease('Start Control-M agent on SAP Gateway ${gw_host}') {
                            newReleaseTitle 'Start Control-M agent on SAP Gateway ${gw_host}'
                            template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('ctm_agt_host') {
                                value '${gw_host}'
                              }
                            }
                            createdReleaseId '${ctm_agt_gw_start}'
                          }
                          gate('Wait for CTM agent start') {
                            dependencies {
                              dependency {
                                variable 'ctm_agt_gw_start'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Start SAP GW ${gw_sid}') {
                    plannedDuration 360
                    precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                    tasks {
                      custom('Notify SAP ${gw_sid} is now starting') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'SAP ${gw_sid} is now starting...'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${gw_sid} is now starting... check your SAP MMC to see the progress", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      createRelease('Start ${gw_sid} on ${gw_host}') {
                        newReleaseTitle '${release.title} - Start SAP ${gw_sid}  on  ${gw_host}'
                        template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${gw_host}'
                          }
                          stringVariable('sid') {
                            label 'SAP SID'
                            value '${gw_sid}'
                          }
                        }
                        createdReleaseId '${gw_host1_start_complete}'
                      }
                      gate('Wait for CI ${gw_host}') {
                        dependencies {
                          dependency {
                            variable 'gw_host1_start_complete'
                          }
                        }
                      }
                      parallelGroup('Multi Host') {
                        precondition 'releaseVariables[\'gw_host\']!=\'\' and releaseVariables[\'gw_host2\']!=\'\''
                        tasks {
                          sequentialGroup('Start SAP ${gw_sid} on ${gw_host2}') {
                            precondition 'releaseVariables[\'gw_host2\'] != \'\''
                            tasks {
                              createRelease('Start SAP ${gw_sid} on ${gw_host2}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${gw_sid} on ${gw_host2}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${gw_host2}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${gw_sid}'
                                  }
                                }
                                createdReleaseId '${gw_host2_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${gw_host2}') {
                                dependencies {
                                  dependency {
                                    variable 'gw_host2_start_complete'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      custom('Notify SAP ${gw_sid} is now started') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'SAP ${gw_sid} is now started'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${gw_sid} is now started", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                    }
                  }
                  sequentialGroup('Apply Rev-Tracs in GW') {
                    precondition 'releaseVariables[\'revtracs_GW\'] != \'\''
                    tasks {
                      manual('Apply Rev-tracs in ${gw_sid}.') {
                        description 'Please approve ${revtracs_GW} to ${gw_sid}.\n' +
                        '\n' +
                        'Click the Complete button once those Rev-Tracs have successfully gone into {gw_sid}'
                        team 'SAP/Web Admin Team'
                      }
                      sequentialGroup('Manual steps post Rev-Tracs') {
                        description 
                        precondition 'releaseVariables[\'revtracs_post_steps_GW\'] == True'
                        tasks {
                          manual('Unlock specific users in ${gw_sid}. to perform steps') {
                            plannedDuration 300
                            team 'SAP/Web Admin Team'
                          }
                          manual('Notify people that manual steps in ${gw_sid}. are about to begin') {
                            team 'Service Management Team'
                          }
                          manual('Manual steps') {
                            precondition 
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('SAP SRM system') {
                tasks {
                  sequentialGroup('Stop Oracle ${srm_sid}') {
                    precondition 'releaseVariables[\'restart_Oracle_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                    tasks {
                      custom('Notify Oracle ${srm_sid} has to be stopped') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'Oracle ${srm_sid} now has to be stopped...'
                          attachments 'v[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} now has to be stopped...", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      manual('Stop Oracle ${srm_sid}') {
                        description 'Oracle DBA Team : Stop Oracle ${srm_sid} \n' +
                        '\n' +
                        'Click the Complete button once you have stopped Oracle ${srm_sid} \n' +
                        '\n' +
                        'Click the Fail button below to not go further'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 
                      }
                      custom('Notify Oracle ${srm_sid} is now stopped') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'Oracle ${srm_sid} is now stopped'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} is now stopped", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                    }
                  }
                  parallelGroup('Start Oracle + CCMSping') {
                    tasks {
                      sequentialGroup('Start CCMSping agent on ${srm_host}') {
                        precondition 'releaseVariables[\'reboot_SRM\'] == True'
                        tasks {
                          createRelease('start CCMSping agent on ${srm_host}') {
                            dueDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-06T00:02:00+0100')
                            precondition 
                            newReleaseTitle 'start CCMSping agent on ${srm_host}'
                            template 'SAP/ABAP/SAP CCMSping Control  - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('host') {
                                value '${srm_host}'
                              }
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('ccmsping_inst_num') {
                                label 'CCMSPing instance number'
                                possibleValues '00', '01'
                                value '${CCMSPingAgentSysNum}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Start'
                              }
                              stringVariable('sid_adm') {
                                label 'SAP user <sid>adm'
                                description 'for example : gwdadm, bwdadm, prdadm'
                                value '${srm_siduser}'
                              }
                            }
                            createdReleaseId '${CCMSAgentSRMComplete}'
                          }
                          gate('Wait for CCMSping agent') {
                            dependencies {
                              dependency {
                                variable 'CCMSAgentSRMComplete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Oracle ${srm_sid}') {
                        precondition 'releaseVariables[\'restart_Oracle_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                        tasks {
                          custom('Notify Oracle ${srm_sid} has to be started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${srm_sid} has to be started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} now has to be  started...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          manual('Start Oracle ${srm_sid}') {
                            description 'Oracle DBA Team :  start Oracle ${srm_sid}  \n' +
                            '\n' +
                            'Click the Complete button once you have started Oracle ${srm_sid} \n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'SAP/Web Admin Team'
                            precondition 
                          }
                          parallelGroup('Resume backups and monitoring for Oracle ${srm_sid}') {
                            precondition 
                            tasks {
                              manual('Resume backups for Oracle ${srm_sid}') {
                                description 'NetBackup Team : please resume Oracle backups for Oracle ${srm_sid}\n' +
                                '\n' +
                                'Click the Complete button once you have resumed backups for Oracle ${srm_sid}\n' +
                                '\n' +
                                'Click the Fail button below to not go further'
                                plannedDuration 300
                                team 'Netbackup Team'
                                precondition 
                              }
                              sequentialGroup('Resume OEM monitoring for Oracle ${srm_sid}') {
                                tasks {
                                  createRelease('stop OEM blackout for Oracle ${srm_sid}') {
                                    newReleaseTitle 'stop OEM blackout for Oracle ${srm_sid}'
                                    template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${srm_host}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${srm_sid}'
                                      }
                                      stringVariable('notification_recipients') {
                                        value '${OEM_recipients}'
                                      }
                                    }
                                    createdReleaseId '${OEM_SRM_resumed}'
                                  }
                                  gate('wait for OEM') {
                                    dependencies {
                                      dependency {
                                        variable 'OEM_SRM_resumed'
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          custom('Notify Oracle ${srm_sid} is now started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${srm_sid} is now started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} is now started", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      sequentialGroup('Start SRM ${srm_sid}') {
                        plannedDuration 600
                        precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                        tasks {
                          createRelease('start SRM ${srm_sid}') {
                            newReleaseTitle 'start SRM ${srm_sid}'
                            template 'SAP/ABAP/SAP SRM Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('host') {
                                value '${srm_host}'
                              }
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('sid_adm') {
                                label 'SAP user <sid>adm'
                                description 
                                value '${srm_siduser}'
                              }
                              stringVariable('SID') {
                                value '${srm_sid}'
                              }
                              stringVariable('ipc_adm') {
                                value '${srm_ipcuser}'
                              }
                              stringVariable('trex_adm') {
                                value '${srm_trexadm}'
                              }
                              stringVariable('ipc_host') {
                                value '${srm_ipchost}'
                              }
                              stringVariable('trex_host') {
                                label 
                                value '${srm_trexhost}'
                              }
                              stringVariable('trex_system_number') {
                                value '${srm_trexSysNum}'
                              }
                              stringVariable('host1') {
                                required false
                                description 'for SRP only : app server hostname'
                                value '${srm_host2}'
                              }
                              stringVariable('CI_SysNum') {
                                value '${srm_CI_SysNum}'
                              }
                            }
                            createdReleaseId '${srm_start_complete}'
                          }
                          gate('Wait for ${srm_sid} start') {
                            plannedDuration 0
                            dependencies {
                              dependency {
                                variable 'srm_start_complete'
                              }
                            }
                          }
                          manual('Check SRM ${srm_sid} status') {
                            description 'SAP Web Admin Team :  SRM ${srm_sid} has just been started.\n' +
                            '\n' +
                            'Please check status of the application.\n' +
                            '\n' +
                            '*IPC* :  login into  ${srm_sid} , run transaction BBP_CND_CHECK_CUST, you should see two lines which state ‘IPC Pricing is Active’ and ‘IPC up and Running’\n' +
                            '\n' +
                            '*TREX* :  login into  ${srm_sid}, run transaction SRMO, select the ‘RFC destinations’ tab, select one of the ‘SSR_TREX’ entries, click the ‘Connection Test’ button, a new window should open with a green traffic light.\n' +
                            '\n' +
                            '*URL* :  verify application is reachable via  ${srm_url}\n' +
                            '\n' +
                            '\n' +
                            'Please note that XL-Release does not restart the webdispatcher during outages (only SRP has a webdispatcher)\n' +
                            '\n' +
                            'Thank you.'
                            plannedDuration 600
                            team 'SAP/Web Admin Team'
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('Streamserve') {
                precondition 'releaseVariables[\'reboot_Streamserve\'] == True or releaseVariables[\'Streamserve_UNIX_patching\'] == True'
                tasks {
                  sequentialGroup('Stop Control-M agent on Streamserve ${Streamserve_host}') {
                    precondition 
                    tasks {
                      createRelease('Stop Control-M agent on Streamserve ${Streamserve_host}') {
                        newReleaseTitle 'Stop Control-M agent on Streamserve ${Streamserve_host}'
                        template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start'
                            value 'Stop'
                          }
                          stringVariable('ctm_agt_host') {
                            value '${Streamserve_host}'
                          }
                        }
                        createdReleaseId '${ctm_agt_strs_stop}'
                      }
                      gate('Wait for CTM agent stop (copy)') {
                        dependencies {
                          dependency {
                            variable 'ctm_agt_strs_stop'
                          }
                        }
                      }
                    }
                  }
                  manual('Perform OS patching / upgrade on ${Streamserve_host}') {
                    description 'Perform OS patching / upgrade on ${Streamserve_host}'
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'Streamserve_UNIX_patching\'] == True'
                  }
                  manual('Perform reboot of ${Streamserve_host}') {
                    description 'Perform reboot of ${Streamserve_host}'
                    plannedDuration 300
                    team 'UNIX Team'
                    precondition 'releaseVariables[\'reboot_Streamserve\'] == True'
                  }
                  sequentialGroup('Start Control-M agent on Streamserve ${Streamserve_host}') {
                    precondition 'releaseVariables[\'reboot_Streamserve\'] == True or releaseVariables[\'Streamserve_UNIX_patching\'] == True'
                    tasks {
                      createRelease('Start Control-M agent on Streamserve ${Streamserve_host}') {
                        newReleaseTitle 'Start Control-M agent on Streamserve ${Streamserve_host}'
                        template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('ctm_agt_host') {
                            value '${Streamserve_host}'
                          }
                        }
                        createdReleaseId '${ctm_agt_strs_start}'
                      }
                      gate('Wait for CTM agent stop (copy)') {
                        dependencies {
                          dependency {
                            variable 'ctm_agt_strs_start'
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('Windows patches applied via Ansible (Production)') {
                precondition 'releaseVariables[\'Apply_Windows_Patches\'] == True and releaseVariables[\'environment\'] == \'SAP production systems (BW,ERP,Gateway,SRM)\''
                tasks {
                  parallelGroup('Windows patches applied via Ansible') {
                    precondition 
                    tasks {
                      createRelease('Patch SAP BO BI') {
                        newReleaseTitle 'Patch SAP BO BI'
                        template 'SAP/Business Objects/SAP BO BI Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                        templateVariables {
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                            value 'Apply Windows patches'
                          }
                          listBoxVariable('environment') {
                            label 'Environment'
                            possibleValues 'Development', 'Test', 'Production'
                            value 'Production'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${sap_bo_bi_patch}'
                      }
                      createRelease('Patch SAP BO Data Services') {
                        newReleaseTitle 'Patch SAP BO Data Services'
                        template 'SAP/Business Objects/SAP Data Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                        templateVariables {
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                            value 'Apply Windows patches'
                          }
                          listBoxVariable('environment') {
                            label 'Environment'
                            possibleValues 'Development', 'Test', 'Production'
                            value 'Production'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${sap_bo_ds_patch}'
                      }
                      createRelease('Patch TRAX') {
                        newReleaseTitle 'Patch TRAX'
                        template 'TRAX/TRAX Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                        templateVariables {
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                            value 'Apply Windows patches'
                          }
                          listBoxVariable('environment') {
                            label 'Environment'
                            possibleValues 'Development', 'Test', 'Production'
                            value 'Production'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${trax_patch}'
                      }
                      createRelease('Patch Power BI') {
                        newReleaseTitle 'Patch Power BI'
                        template 'Microsoft/Power BI Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                        folder 'SAP/ABAP'
                        templateVariables {
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                            value 'Apply Windows patches'
                          }
                          listBoxVariable('environment') {
                            label 'Environment'
                            possibleValues 'Development', 'Test', 'Production'
                            value 'Production'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${power_bi_patch}'
                      }
                      createRelease('Patch edi.chep.com') {
                        newReleaseTitle 'Patch edi.chep.com'
                        template 'FTP/edi.chep.com Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM LANDSCAPE OUT AGE RELEASE'
                        folder 'SAP/ABAP'
                        templateVariables {
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Apply Windows patches'
                            value 'Apply Windows patches'
                          }
                          listBoxVariable('environment') {
                            label 'Environment'
                            possibleValues 'Production'
                            value 'Production'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${edi_patch}'
                      }
                    }
                  }
                  gate('Wait for Windows patching') {
                    dependencies {
                      dependency {
                        variable 'sap_bo_bi_patch'
                      }
                      dependency {
                        variable 'sap_bo_ds_patch'
                      }
                      dependency {
                        variable 'trax_patch'
                      }
                      dependency {
                        variable 'power_bi_patch'
                      }
                      dependency {
                        variable 'edi_patch'
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      phase('SAP ERP upgrade scenario') {
        color '#0099CC'
        tasks {
          sequentialGroup('Sequential operations') {
            precondition 'releaseVariables[\'ERP_upgrade\'] == True'
            tasks {
              sequentialGroup('SAP ERP (DB) - in an SAP upgrade scenario, we don\'t do Solaris OS patch/upgrade') {
                tasks {
                  manual('Stop log shipping to usdc2up12 ${erp_sid} standby  (as it is our rollback plan B if snapshot restore doesn\'t work) (copy)') {
                    description 'Stop log shipping to usdc2up12 ${erp_sid} standby  (as it is our rollback plan B if snapshot restore doesn\'t work)'
                    plannedDuration 300
                    team 'Oracle DBA Team'
                    precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                  }
                  sequentialGroup('Stop Oracle ${erp_sid} (No Oracle upgrade)') {
                    precondition '( releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True ) and releaseVariables[\'ERP_DB_upgrade\'] == False'
                    tasks {
                      custom('Notify Oracle ${erp_sid} has to be stopped') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'Oracle ${erp_sid} now has to be stopped...'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} now has to be stopped...", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                      manual('Stop Oracle ${erp_sid}') {
                        description 'Oracle DBA Team : Stop Oracle ${erp_sid} \n' +
                        '\n' +
                        'Click the Complete button once you have stopped Oracle ${erp_sid} \n' +
                        'Click the Fail button below to not go further'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 
                      }
                      manual('Stop listener for Oracle ${erp_sid}') {
                        description 'Because ${backup_hostname_erp} will be patched / upgraded by the UNIX Team,, please stop ${erp_Oracle_listener} on ${backup_hostname_erp}\n' +
                        '\n' +
                        'Click the Complete button once you have stopped ${erp_Oracle_listener} on ${backup_hostname_erp}'
                        plannedDuration 300
                        team 'Oracle DBA Team'
                        precondition 'releaseVariables[\'ERP_UNIX_patching\'] == \'True\''
                      }
                      custom('Notify Oracle ${erp_sid} is now stopped') {
                        precondition 'releaseVariables[\'slack_channel\']!=""'
                        script {
                          type 'slack.WebAPI'
                          server 'Slack WebAPI as XL-Release'
                          channelin '${slack_channel}'
                          text 'Oracle ${erp_sid} is now stopped'
                          attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} is now stopped", "short": true }] }]'
                          thread_ts '${slack_ts}'
                        }
                      }
                    }
                  }
                  parallelGroup('Start Oracle or perform DB upgrade') {
                    tasks {
                      sequentialGroup('Start Oracle ${erp_sid} (regular start - no DB upgrade involved)') {
                        precondition '( releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True ) and releaseVariables[\'ERP_DB_upgrade\'] == False'
                        tasks {
                          custom('Notify Oracle ${erp_sid} has to be started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} now has to be started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} now has to be  started...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          manual('Start listener') {
                            description 'DBA Team : please start ${erp_Oracle_listener} on ${backup_hostname_erp}\n' +
                            '\n' +
                            'Click the Complete button once you have started the listener${erp_Oracle_listener} on ${backup_hostname_erp}\n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 180
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'reboot_ERP\'] ==True or releaseVariables[\'ERP_UNIX_patching\'] ==True'
                          }
                          manual('Start Oracle ${erp_sid}') {
                            description 'Oracle DBA Team :  start Oracle ${erp_sid} on ${backup_hostname_erp}\n' +
                            '\n' +
                            'Click the Complete button once you have started Oracle ${erp_sid} \n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 600
                            team 'Oracle DBA Team'
                            precondition 
                          }
                          parallelGroup('Resume backups and monitoring for Oracle ${erp_sid}') {
                            precondition 
                            tasks {
                              sequentialGroup('Resume OEM monitoring for Oracle ${erp_sid}') {
                                tasks {
                                  createRelease('stop OEM blackout for Oracle ${erp_sid}') {
                                    newReleaseTitle 'stop OEM blackout for Oracle ${erp_sid}'
                                    template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${erp_host}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${erp_sid}'
                                      }
                                      stringVariable('notification_recipients') {
                                        value '${OEM_recipients}'
                                      }
                                    }
                                    createdReleaseId '${OEM_ERP_resumed}'
                                  }
                                  gate('wait for OEM') {
                                    dependencies {
                                      dependency {
                                        variable 'OEM_ERP_resumed'
                                      }
                                    }
                                  }
                                }
                              }
                              manual('Resume backups for Oracle ${erp_sid}') {
                                description 'NetBackup Team : please resume Oracle backups for Oracle ${erp_sid}\n' +
                                '\n' +
                                'Click the Complete button once you have resumed backups for Oracle ${erp_sid}\n' +
                                '\n' +
                                'Click the Fail button below to not go further'
                                plannedDuration 300
                                team 'Netbackup Team'
                                precondition 
                              }
                            }
                          }
                          custom('Notify Oracle ${erp_sid} is now started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} is now started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} is now started", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      sequentialGroup('Upgrade Oracle ${erp_sid}') {
                        precondition 'releaseVariables[\'ERP_DB_upgrade\'] == True'
                        tasks {
                          custom('Notify Oracle ${erp_sid} has to be upgraded') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} now has to be upgraded'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${erp_sid} now has to be upgraded...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          manual('Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -PRE-ORA-UPGRADE') {
                            description 'Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -PRE-ORA-UPGRADE'
                            plannedDuration 300
                            team 'Storage Team'
                          }
                          manual('Lock non-SAP application DB users') {
                            description 'alter user VTXUSR_TPS account lock;\n' +
                            'alter user  VTXUSR_RPT account lock;\n' +
                            'alter user  VERTEX7  account lock;\n' +
                            'alter user AU_USER account lock;\n' +
                            'alter user QUEST account lock;'
                            plannedDuration 120
                            team 'SAP/Web Admin Team'
                          }
                          manual('Upgrade Oracle ${erp_sid}') {
                            description 'Oracle DBA Team :  perform Oracle ${erp_sid}\n' +
                            '\n' +
                            'Click the Complete button once you have upgraded Oracle ${erp_sid} \n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 600
                            team 'Oracle DBA Team'
                            precondition 
                          }
                          manual('Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -POST-ORA-UPGRADE') {
                            description 'Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -POST-ORA-UPGRADE'
                            plannedDuration 300
                            team 'Storage Team'
                          }
                          parallelGroup('Resume backups and monitoring for Oracle ${erp_sid}') {
                            precondition 
                            tasks {
                              sequentialGroup('Resume OEM monitoring for Oracle ${erp_sid}') {
                                tasks {
                                  createRelease('stop OEM blackout for Oracle ${erp_sid}') {
                                    newReleaseTitle 'stop OEM blackout for Oracle ${erp_sid}'
                                    template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${erp_host}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${erp_sid}'
                                      }
                                      stringVariable('notification_recipients') {
                                        value '${OEM_recipients}'
                                      }
                                    }
                                    createdReleaseId '${OEM_ERP_resumed}'
                                  }
                                  gate('wait for OEM') {
                                    dependencies {
                                      dependency {
                                        variable 'OEM_ERP_resumed'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Backup steps') {
                                tasks {
                                  manual('Upgrade RMAN recovery catalog for Oracle ${erp_sid}') {
                                    description 'Please upgrade RMAN recovery catalog for Oracle ${erp_sid}'
                                    plannedDuration 180
                                    team 'Oracle DBA Team'
                                  }
                                  manual('Kick online backup for Oracle ${erp_sid} and make sure the backup is running properly before closing the task.') {
                                    description 'Because Oracle ${erp_sid} has just been upgraded, please kick an online backup for Oracle ${erp_sid} on ${backup_hostname_erp} and make sure the backup is running properly before closing the task.\n' +
                                    '\n' +
                                    'Click the Fail button below to not go further'
                                    plannedDuration 300
                                    team 'Netbackup Team'
                                    precondition 
                                  }
                                  manual('Resume backups schedule for Oracle ${erp_sid}') {
                                    description 'NetBackup Team : please resume Oracle backups for Oracle ${erp_sid} (archived redologs backup/cleanup  AND online backups)\n' +
                                    '\n' +
                                    'Click the Complete button once you have resumed backups for Oracle ${erp_sid}\n' +
                                    '\n' +
                                    'Click the Fail button below to not go further'
                                    plannedDuration 300
                                    team 'Netbackup Team'
                                    precondition 
                                  }
                                }
                              }
                              manual('Update .dbenv.csh for ${erp_siduser}') {
                                description 'Update .dbenv.csh for ${erp_siduser} to reflect upgraded Oracle settings'
                                plannedDuration 300
                                team 'SAP/Web Admin Team'
                              }
                              manual('If applicable, update the instant client on the SAP ${erp_sid} hosts.') {
                                description 'If applicable, update the instant client on the SAP ${erp_sid} hosts.\n' +
                                'And if applicable, update instant client path in .dbenv.csh for ${erp_siduser}.'
                                plannedDuration 900
                                team 'SAP/Web Admin Team'
                              }
                            }
                          }
                          custom('Notify Oracle ${erp_sid} is now upgraded') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${erp_sid} is now upgraded'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Status", "value": "Oracle ${erp_sid} is now upgraded", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          manual('Stop SUM process') {
                            description 'because Oracle ${erp_sid} will be upgraded,  stop SUM process\n' +
                            'on ${erp_host} : sudo /usr/sap/hostctrl/exe/saphostexec -stop'
                            plannedDuration 120
                            team 'SAP/Web Admin Team'
                          }
                        }
                      }
                    }
                  }
                }
              }
              parallelGroup('ERP upgrade group and start other SAP systems') {
                tasks {
                  sequentialGroup('SAP HANA Systems') {
                    tasks {
                      manual('Perform maintenance on Unity Storage ${Unity_storage_name}') {
                        description 'Perform maintenance on Unity Storage ${Unity_storage_name}\n' +
                        '\n' +
                        'Caution! when you will mark this task complete, HANA ${HANA_SID} will be started automatically!'
                        plannedDuration 9000
                        team 'Storage Team'
                        precondition 'releaseVariables[\'Unity_storage_patching\'] == True'
                      }
                      manual('Double check with Storage Team that maintenance on Unity Storage ${Unity_storage_name}is complete.') {
                        description 'Double check with Storage Team that maintenance on Unity Storage ${Unity_storage_name}is complete.\n' +
                        '\n' +
                        'Caution! when you will mark this task complete, HANA ${HANA_SID} will be started automatically!'
                        plannedDuration 300
                        team 'Service Management Team'
                        precondition 'releaseVariables[\'Unity_storage_patching\'] == True'
                      }
                      sequentialGroup('Start HANA ${HANA_SID}') {
                        precondition 'releaseVariables[\'restart_BW\'] == True and releaseVariables[\'StopStartHANA\'] == True'
                        tasks {
                          custom('Notify HANA ${HANA_SID} is now starting') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'HANA ${HANA_SID} is now starting...'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "HANA ${HANA_SID} is now starting...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          createRelease('Start HANA ${HANA_SID}') {
                            precondition 
                            newReleaseTitle '${release.title} - Start ${HANA_host}'
                            template 'SAP/HANA/SAP HANA Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${HANA_host}'
                              }
                              stringVariable('HANAInstanceNumber') {
                                label 'HANA Instance Number'
                                value '${HANA_Sys_Num}'
                              }
                              stringVariable('HANANumberofWorkers') {
                                label 'Number of nodes'
                                description 'usually 1 or 4'
                                value '${HANANumberofWorkers}'
                              }
                            }
                            createdReleaseId '${HANA_started}'
                          }
                          gate('Wait for start HANA ${HANA_host}') {
                            dependencies {
                              dependency {
                                variable 'HANA_started'
                              }
                            }
                          }
                          custom('Notify HANA ${HANA_SID} is now started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'HANA ${HANA_SID} is now started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "HANA ${HANA_SID} is now started", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          createRelease('Remove maintenance mode for HANA ${HANA_SID}') {
                            precondition 'releaseVariables[\'HANA_SID\']=="HBP"'
                            newReleaseTitle 'Enable maintenance mode for HANA ${HANA_SID}'
                            template 'SAP/HANA/Maintenance mode for HANA monitoring- this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Set or unset the maintenance flag'
                                description 'Set or unset the maintenance flag'
                                possibleValues 'Set', 'Unset'
                                value 'Unset'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              stringVariable('HANA_host') {
                                value '${HANA_host}'
                              }
                              stringVariable('HANA_SID') {
                                description 'HANA SID'
                                value '${HANA_SID}'
                              }
                            }
                            createdReleaseId '${hana_maintenance_complete}'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('SAP IQ Systems') {
                    tasks {
                      manual('Perform OS patching / upgrade / reboot of ${Sybase_IQ_Host}') {
                        description 'Perform OS patching / upgrade / reboot of ${Sybase_IQ_Host}'
                        team 'UNIX Team'
                        precondition 'releaseVariables[\'reboot_IQ\'] == True'
                      }
                      sequentialGroup('Start SAP IQ on ${Sybase_IQ_Host}') {
                        precondition '(releaseVariables[\'restart_BW\'] == True and releaseVariables[\'RestartSybaseIQ\'] == True ) or releaseVariables[\'reboot_IQ\'] == True'
                        tasks {
                          createRelease('Start SAP IQ ${Sybase_IQ_Host}') {
                            newReleaseTitle 'Start SAP IQ ${Sybase_IQ_Host}'
                            template 'SAP/IQ/SAP IQ Control'
                            templateVariables {
                              stringVariable('host') {
                                value '${Sybase_IQ_Host}'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Start'
                              }
                            }
                            createdReleaseId '${SAP_IQ_Start_Complete}'
                          }
                          gate('Wait for Start SAP IQ on ${Sybase_IQ_Host}') {
                            dependencies {
                              dependency {
                                variable 'SAP_IQ_Start_Complete'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('SAP Gateway (OS+DB)') {
                    precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                    tasks {
                      parallelGroup('Stop DB + Control-M agent') {
                        tasks {
                          sequentialGroup('Stop Oracle ${gw_sid} (and ASM if relevant)') {
                            precondition 'releaseVariables[\'restart_Oracle_GW\'] == True or releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                            tasks {
                              sequentialGroup('Stop Oracle ${gw_sid}') {
                                tasks {
                                  createRelease('Stop Oracle ${gw_sid}') {
                                    newReleaseTitle 'Stop Oracle ${gw_sid}'
                                    template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${backup_hostname_gw}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${gw_sid}'
                                      }
                                    }
                                    createdReleaseId '${oracle_gw_stop_complete}'
                                  }
                                  gate('Wait for Oracle ${gw_sid}') {
                                    dependencies {
                                      dependency {
                                        variable 'oracle_gw_stop_complete'
                                      }
                                    }
                                  }
                                }
                              }
                              manual('Stop ASM + Oracle HAS on ${backup_hostname_gw}') {
                                description 'Because ${backup_hostname_gw} will be patched / upgraded by the UNIX Team,, please stop ASM + Oracle HAS on ${backup_hostname_gw}\n' +
                                '\n' +
                                'Click the Complete button once you have stopped ASM + Oracle HAS on ${backup_hostname_gw}\n' +
                                'Click the Fail button below to not go further'
                                plannedDuration 300
                                team 'Oracle DBA Team'
                                precondition 'releaseVariables[\'GW_UNIX_patching\'] == \'True\''
                              }
                            }
                          }
                          sequentialGroup('Stop Control-M agent on SAP Gateway ${gw_host}') {
                            precondition 'releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                            tasks {
                              createRelease('Stop Control-M agent on SAP Gateway ${gw_host}') {
                                newReleaseTitle 'Stop Control-M agent on SAP Gateway ${gw_host}'
                                template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start'
                                    value 'Stop'
                                  }
                                  stringVariable('ctm_agt_host') {
                                    value '${gw_host}'
                                  }
                                }
                                createdReleaseId '${ctm_agt_gw_stop}'
                              }
                              gate('Wait for CTM agent stop') {
                                dependencies {
                                  dependency {
                                    variable 'ctm_agt_gw_stop'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      manual('Perform OS patching / upgrade on ${backup_hostname_gw}') {
                        description 'Perform OS patching / upgrade on ${backup_hostname_gw}'
                        team 'UNIX Team'
                        precondition 'releaseVariables[\'GW_UNIX_patching\'] == True'
                      }
                      parallelGroup('Start Oracle + CCMSping') {
                        tasks {
                          sequentialGroup('Start CCMSping agent on ${gw_host}') {
                            precondition 'releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                            tasks {
                              createRelease('start CCMSping agent on ${gw_host}') {
                                precondition 
                                newReleaseTitle 'start CCMSping agent on ${gw_host}'
                                template 'SAP/ABAP/SAP CCMSping Control  - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('host') {
                                    value '${gw_host}'
                                  }
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('ccmsping_inst_num') {
                                    label 'CCMSPing instance number'
                                    possibleValues '00', '01'
                                    value '${CCMSPingAgentSysNum}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('sid_adm') {
                                    label 'SAP user <sid>adm'
                                    description 'for example : gwdadm, bwdadm, prdadm'
                                    value '${gw_siduser}'
                                  }
                                }
                                createdReleaseId '${CCMSAgentGWComplete}'
                              }
                              gate('Wait for CCMSping agent') {
                                dependencies {
                                  dependency {
                                    variable 'CCMSAgentGWComplete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start Oracle ${gw_sid} etc.') {
                            precondition 'releaseVariables[\'restart_Oracle_GW\'] == True or releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                            tasks {
                              manual('Check Oracle HAS and ASM  on ${backup_hostname_gw}') {
                                description 'Because ${backup_hostname_gw} has been patched / upgraded by the UNIX Team,, please check Oracle HAS and ASM on ${backup_hostname_gw}\n' +
                                '\n' +
                                'Please note that the next task will automatically start Oracle ${gw_sid}'
                                plannedDuration 300
                                team 'Oracle DBA Team'
                                precondition 'releaseVariables[\'GW_UNIX_patching\'] == \'True\''
                              }
                              sequentialGroup('Start Oracle ${gw_sid}') {
                                tasks {
                                  createRelease('Start Oracle ${gw_sid}') {
                                    newReleaseTitle 'Start Oracle ${gw_sid}'
                                    template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Start'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${backup_hostname_gw}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${gw_sid}'
                                      }
                                    }
                                    createdReleaseId '${oracle_gw_start_complete}'
                                  }
                                  gate('Wait for Oracle ${gw_sid}') {
                                    dependencies {
                                      dependency {
                                        variable 'oracle_gw_start_complete'
                                      }
                                    }
                                  }
                                }
                              }
                              parallelGroup('Resume backups and monitoring for Oracle ${gw_sid}') {
                                precondition 
                                tasks {
                                  manual('Resume backups for Oracle ${gw_sid}') {
                                    description 'NetBackup Team : please resume Oracle backups for Oracle ${gw_sid}\n' +
                                    '\n' +
                                    'Click the Complete button once you have resumed backups for Oracle ${gw_sid}\n' +
                                    '\n' +
                                    'Click the Fail button below to not go further'
                                    plannedDuration 300
                                    team 'Netbackup Team'
                                    precondition 
                                  }
                                  sequentialGroup('Resume OEM monitoring for Oracle ${gw_sid}') {
                                    tasks {
                                      createRelease('stop OEM blackout for Oracle ${gw_sid}') {
                                        newReleaseTitle 'stop OEM blackout for Oracle ${gw_sid}'
                                        template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                        templateVariables {
                                          stringVariable('slack_channel') {
                                            required false
                                            value '${slack_channel}'
                                          }
                                          stringVariable('slack_ts') {
                                            required false
                                            value '${slack_ts}'
                                          }
                                          listBoxVariable('action') {
                                            label 'Action'
                                            possibleValues 'Stop', 'Start', 'Status'
                                            value 'Stop'
                                          }
                                          stringVariable('host') {
                                            label 'host'
                                            value '${gw_host}'
                                          }
                                          stringVariable('SID') {
                                            label 'Oracle SID'
                                            value '${gw_sid}'
                                          }
                                          stringVariable('notification_recipients') {
                                            value '${OEM_recipients}'
                                          }
                                        }
                                        createdReleaseId '${OEM_GW_resumed}'
                                      }
                                      gate('wait for OEM') {
                                        dependencies {
                                          dependency {
                                            variable 'OEM_GW_resumed'
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start Control-M agent on SAP Gateway ${gw_host}') {
                            precondition 'releaseVariables[\'reboot_GW\'] == True or releaseVariables[\'GW_UNIX_patching\'] == True'
                            tasks {
                              createRelease('Start Control-M agent on SAP Gateway ${gw_host}') {
                                newReleaseTitle 'Start Control-M agent on SAP Gateway ${gw_host}'
                                template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('ctm_agt_host') {
                                    value '${gw_host}'
                                  }
                                }
                                createdReleaseId '${ctm_agt_gw_start}'
                              }
                              gate('Wait for CTM agent start') {
                                dependencies {
                                  dependency {
                                    variable 'ctm_agt_gw_start'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('SAP SRM (OS+DB)') {
                    tasks {
                      sequentialGroup('Stop Oracle ${srm_sid}') {
                        precondition 'releaseVariables[\'restart_Oracle_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                        tasks {
                          custom('Notify Oracle ${srm_sid} has to be stopped') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${srm_sid} now has to be stopped...'
                              attachments 'v[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} now has to be stopped...", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          manual('Stop Oracle ${srm_sid}') {
                            description 'Oracle DBA Team : Stop Oracle ${srm_sid} \n' +
                            '\n' +
                            'Click the Complete button once you have stopped Oracle ${srm_sid} \n' +
                            '\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Oracle DBA Team'
                            precondition 
                          }
                          custom('Notify Oracle ${srm_sid} is now stopped') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'Oracle ${srm_sid} is now stopped'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} is now stopped", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      parallelGroup('Start Oracle + CCMSping') {
                        tasks {
                          sequentialGroup('Start CCMSping agent on ${srm_host}') {
                            precondition 'releaseVariables[\'reboot_SRM\'] == True'
                            tasks {
                              createRelease('start CCMSping agent on ${srm_host}') {
                                dueDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-06T00:02:00+0100')
                                precondition 
                                newReleaseTitle 'start CCMSping agent on ${srm_host}'
                                template 'SAP/ABAP/SAP CCMSping Control  - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('host') {
                                    value '${srm_host}'
                                  }
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('ccmsping_inst_num') {
                                    label 'CCMSPing instance number'
                                    possibleValues '00', '01'
                                    value '${CCMSPingAgentSysNum}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('sid_adm') {
                                    label 'SAP user <sid>adm'
                                    description 'for example : gwdadm, bwdadm, prdadm'
                                    value '${srm_siduser}'
                                  }
                                }
                                createdReleaseId '${CCMSAgentSRMComplete}'
                              }
                              gate('Wait for CCMSping agent') {
                                dependencies {
                                  dependency {
                                    variable 'CCMSAgentSRMComplete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start Oracle ${srm_sid}') {
                            precondition 'releaseVariables[\'restart_Oracle_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                            tasks {
                              custom('Notify Oracle ${srm_sid} has to be started') {
                                precondition 'releaseVariables[\'slack_channel\']!=""'
                                script {
                                  type 'slack.WebAPI'
                                  server 'Slack WebAPI as XL-Release'
                                  channelin '${slack_channel}'
                                  text 'Oracle ${srm_sid} has to be started'
                                  attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} now has to be  started...", "short": true }] }]'
                                  thread_ts '${slack_ts}'
                                }
                              }
                              manual('Start Oracle ${srm_sid}') {
                                description 'Oracle DBA Team :  start Oracle ${srm_sid}  \n' +
                                '\n' +
                                'Click the Complete button once you have started Oracle ${srm_sid} \n' +
                                'Click the Fail button below to not go further'
                                plannedDuration 300
                                team 'SAP/Web Admin Team'
                                precondition 
                              }
                              parallelGroup('Resume backups and monitoring for Oracle ${srm_sid}') {
                                precondition 
                                tasks {
                                  manual('Resume backups for Oracle ${srm_sid}') {
                                    description 'NetBackup Team : please resume Oracle backups for Oracle ${srm_sid}\n' +
                                    '\n' +
                                    'Click the Complete button once you have resumed backups for Oracle ${srm_sid}\n' +
                                    '\n' +
                                    'Click the Fail button below to not go further'
                                    plannedDuration 300
                                    team 'Netbackup Team'
                                    precondition 
                                  }
                                  sequentialGroup('Resume OEM monitoring for Oracle ${srm_sid}') {
                                    tasks {
                                      createRelease('stop OEM blackout for Oracle ${srm_sid}') {
                                        newReleaseTitle 'stop OEM blackout for Oracle ${srm_sid}'
                                        template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                        templateVariables {
                                          stringVariable('slack_channel') {
                                            required false
                                            value '${slack_channel}'
                                          }
                                          stringVariable('slack_ts') {
                                            required false
                                            value '${slack_ts}'
                                          }
                                          listBoxVariable('action') {
                                            label 'Action'
                                            possibleValues 'Stop', 'Start', 'Status'
                                            value 'Stop'
                                          }
                                          stringVariable('host') {
                                            label 'host'
                                            value '${srm_host}'
                                          }
                                          stringVariable('SID') {
                                            label 'Oracle SID'
                                            value '${srm_sid}'
                                          }
                                          stringVariable('notification_recipients') {
                                            value '${OEM_recipients}'
                                          }
                                        }
                                        createdReleaseId '${OEM_SRM_resumed}'
                                      }
                                      gate('wait for OEM') {
                                        dependencies {
                                          dependency {
                                            variable 'OEM_SRM_resumed'
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              custom('Notify Oracle ${srm_sid} is now started') {
                                precondition 'releaseVariables[\'slack_channel\']!=""'
                                script {
                                  type 'slack.WebAPI'
                                  server 'Slack WebAPI as XL-Release'
                                  channelin '${slack_channel}'
                                  text 'Oracle ${srm_sid} is now started'
                                  attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "Oracle ${srm_sid} is now started", "short": true }] }]'
                                  thread_ts '${slack_ts}'
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SRM ${srm_sid}') {
                            plannedDuration 600
                            precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                            tasks {
                              createRelease('start SRM ${srm_sid}') {
                                newReleaseTitle 'start SRM ${srm_sid}'
                                template 'SAP/ABAP/SAP SRM Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  stringVariable('host') {
                                    value '${srm_host}'
                                  }
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('sid_adm') {
                                    label 'SAP user <sid>adm'
                                    description 
                                    value '${srm_siduser}'
                                  }
                                  stringVariable('SID') {
                                    value '${srm_sid}'
                                  }
                                  stringVariable('ipc_adm') {
                                    value '${srm_ipcuser}'
                                  }
                                  stringVariable('trex_adm') {
                                    value '${srm_trexadm}'
                                  }
                                  stringVariable('ipc_host') {
                                    value '${srm_ipchost}'
                                  }
                                  stringVariable('trex_host') {
                                    label 
                                    value '${srm_trexhost}'
                                  }
                                  stringVariable('trex_system_number') {
                                    value '${srm_trexSysNum}'
                                  }
                                  stringVariable('host1') {
                                    required false
                                    description 'for SRP only : app server hostname'
                                    value '${srm_host2}'
                                  }
                                  stringVariable('CI_SysNum') {
                                    value '${srm_CI_SysNum}'
                                  }
                                }
                                createdReleaseId '${srm_start_complete}'
                              }
                              gate('Wait for ${srm_sid} start') {
                                plannedDuration 0
                                dependencies {
                                  dependency {
                                    variable 'srm_start_complete'
                                  }
                                }
                              }
                              manual('Check SRM ${srm_sid} status') {
                                description 'SAP Web Admin Team :  SRM ${srm_sid} has just been started.\n' +
                                '\n' +
                                'Please check status of the application.\n' +
                                '\n' +
                                '*IPC* :  login into  ${srm_sid} , run transaction BBP_CND_CHECK_CUST, you should see two lines which state ‘IPC Pricing is Active’ and ‘IPC up and Running’\n' +
                                '\n' +
                                '*TREX* :  login into  ${srm_sid}, run transaction SRMO, select the ‘RFC destinations’ tab, select one of the ‘SSR_TREX’ entries, click the ‘Connection Test’ button, a new window should open with a green traffic light.\n' +
                                '\n' +
                                '*URL* :  verify application is reachable via  ${srm_url}\n' +
                                '\n' +
                                '\n' +
                                'Please note that XL-Release does not restart the webdispatcher during outages (only SRP has a webdispatcher)\n' +
                                '\n' +
                                'Thank you.'
                                plannedDuration 600
                                team 'SAP/Web Admin Team'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('SAP BW ABAP (OS+DB)') {
                    tasks {
                      manual('Perform OS patching / upgrade on ${backup_hostname_bw}') {
                        description 'Perform OS patching / upgrade on ${backup_hostname_bw}'
                        team 'UNIX Team'
                        precondition 'releaseVariables[\'BW_UNIX_patching\'] == True'
                      }
                      manual('Perform reboot of ${backup_hostname_bw}') {
                        description 'Perform reboot of ${backup_hostname_bw}'
                        plannedDuration 600
                        team 'UNIX Team'
                        precondition 'releaseVariables[\'reboot_BW\'] == True'
                      }
                      sequentialGroup('Start CCMSping agent on ${bw_host}') {
                        precondition 'releaseVariables[\'reboot_BW\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True'
                        tasks {
                          createRelease('start CCMSping agent on ${bw_host}') {
                            precondition 
                            newReleaseTitle 'start CCMSping agent on ${bw_host}'
                            template 'SAP/ABAP/SAP CCMSping Control  - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('host') {
                                value '${bw_host}'
                              }
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('ccmsping_inst_num') {
                                label 'CCMSPing instance number'
                                possibleValues '00', '01'
                                value '${CCMSPingAgentSysNum}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Start'
                              }
                              stringVariable('sid_adm') {
                                label 'SAP user <sid>adm'
                                description 'for example : gwdadm, bwdadm, prdadm'
                                value '${bw_siduser}'
                              }
                            }
                            createdReleaseId '${CCMSAgentBWComplete}'
                          }
                          gate('Wait for CCMSping agent') {
                            dependencies {
                              dependency {
                                variable 'CCMSAgentBWComplete'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('SAP BI-JAVA (OS+DB)') {
                    tasks {
                      sequentialGroup('Stop Oracle ${java_stack_SID} (and ASM if relevant)') {
                        precondition 'releaseVariables[\'restart_Oracle_BIJAVA\'] == True or releaseVariables[\'reboot_BIJAVA\'] == True or releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                        tasks {
                          sequentialGroup('Stop Oracle ${java_stack_SID}') {
                            tasks {
                              createRelease('Stop Oracle ${java_stack_SID}') {
                                newReleaseTitle 'Stop Oracle ${java_stack_SID}'
                                template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Stop'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${backup_hostname_java_stack}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${java_stack_SID}'
                                  }
                                }
                                createdReleaseId '${oracle_java_stack_stop_complete}'
                              }
                              gate('Wait for Oracle ${java_stack_SID}') {
                                dependencies {
                                  dependency {
                                    variable 'oracle_java_stack_stop_complete'
                                  }
                                }
                              }
                            }
                          }
                          manual('Stop ASM + Oracle HAS on ${backup_hostname_java_stack}') {
                            description 'Because ${backup_hostname_java_stack} will be patched / upgraded by the UNIX Team,, please stop ASM + Oracle HAS on ${backup_hostname_java_stack}\n' +
                            '\n' +
                            'Click the Complete button once you have stopped ASM + Oracle HAS on ${backup_hostname_java_stack}\n' +
                            'Click the Fail button below to not go further'
                            plannedDuration 300
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == \'True\''
                          }
                        }
                      }
                      manual('Perform OS patching / upgrade on ${backup_hostname_java_stack}') {
                        description 'Perform OS patching / upgrade on ${backup_hostname_java_stack}'
                        team 'UNIX Team'
                        precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                      }
                      sequentialGroup('Start Oracle ${java_stack_SID} etc.') {
                        precondition 'releaseVariables[\'restart_Oracle_BIJAVA\'] == True or releaseVariables[\'reboot_BIJAVA\'] == True or releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                        tasks {
                          manual('Check Oracle HAS and ASM  on ${backup_hostname_java_stack}') {
                            description 'Because ${backup_hostname_java_stack} has been patched / upgraded by the UNIX Team,, please check Oracle HAS and ASM  on ${backup_hostname_java_stack}${backup_hostname_java_stack}\n' +
                            '\n' +
                            'Please note that the next task will automatically start Oracle ${java_stack_SID}'
                            plannedDuration 300
                            team 'Oracle DBA Team'
                            precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == \'True\''
                          }
                          sequentialGroup('Start Oracle ${java_stack_SID}') {
                            tasks {
                              createRelease('Start Oracle ${java_stack_SID}') {
                                newReleaseTitle 'Start Oracle ${java_stack_SID}'
                                template 'Oracle/Oracle on ASM Linux - RDBMS Control (Do not call directly - this is designed to be call from ABAP environment control template!)'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('action') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Status'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'host'
                                    value '${backup_hostname_java_stack}'
                                  }
                                  stringVariable('SID') {
                                    label 'Oracle SID'
                                    value '${java_stack_SID}'
                                  }
                                }
                                createdReleaseId '${oracle_java_stack_start_complete}'
                              }
                              gate('Wait for Oracle ${java_stack_SID}') {
                                dependencies {
                                  dependency {
                                    variable 'oracle_java_stack_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          parallelGroup('Resume backups and monitoring for Oracle ${java_stack_SID}') {
                            precondition 
                            tasks {
                              manual('Resume backups for Oracle ${java_stack_SID}') {
                                description 'NetBackup Team : please resume Oracle backups for Oracle ${java_stack_SID}\n' +
                                '\n' +
                                'Click the Complete button once you have resumed backups for Oracle ${java_stack_SID}\n' +
                                '\n' +
                                'Click the Fail button below to not go further'
                                plannedDuration 300
                                team 'Netbackup Team'
                                precondition 
                              }
                              sequentialGroup('Resume OEM monitoring for Oracle ${java_stack_SID}') {
                                tasks {
                                  createRelease('stop OEM blackout for Oracle ${java_stack_SID}') {
                                    newReleaseTitle 'stop OEM blackout for Oracle ${java_stack_SID}'
                                    template 'Oracle/Oracle - OEM monitoring control (Do not call directly - this is designed to be call from ABAP environment control template!)  TEMPLATE'
                                    templateVariables {
                                      stringVariable('slack_channel') {
                                        required false
                                        value '${slack_channel}'
                                      }
                                      stringVariable('slack_ts') {
                                        required false
                                        value '${slack_ts}'
                                      }
                                      listBoxVariable('action') {
                                        label 'Action'
                                        possibleValues 'Stop', 'Start', 'Status'
                                        value 'Stop'
                                      }
                                      stringVariable('host') {
                                        label 'host'
                                        value '${java_stack_host}'
                                      }
                                      stringVariable('SID') {
                                        label 'Oracle SID'
                                        value '${java_stack_SID}'
                                      }
                                      stringVariable('notification_recipients') {
                                        value '${OEM_recipients}'
                                      }
                                    }
                                    createdReleaseId '${OEM_JavaStack_resumed}'
                                  }
                                  gate('wait for OEM') {
                                    dependencies {
                                      dependency {
                                        variable 'OEM_JavaStack_resumed'
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Streamserve (OS+DB)') {
                    precondition 'releaseVariables[\'reboot_Streamserve\'] == True or releaseVariables[\'Streamserve_UNIX_patching\'] == True'
                    tasks {
                      sequentialGroup('Stop Control-M agent on Streamserve ${Streamserve_host}') {
                        precondition 
                        tasks {
                          createRelease('Stop Control-M agent on Streamserve ${Streamserve_host}') {
                            newReleaseTitle 'Stop Control-M agent on Streamserve ${Streamserve_host}'
                            template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start'
                                value 'Stop'
                              }
                              stringVariable('ctm_agt_host') {
                                value '${Streamserve_host}'
                              }
                            }
                            createdReleaseId '${ctm_agt_strs_stop}'
                          }
                          gate('Wait for CTM agent stop (copy)') {
                            dependencies {
                              dependency {
                                variable 'ctm_agt_strs_stop'
                              }
                            }
                          }
                        }
                      }
                      manual('Perform OS patching / upgrade on ${Streamserve_host}') {
                        description 'Perform OS patching / upgrade on ${Streamserve_host}'
                        team 'UNIX Team'
                        precondition 'releaseVariables[\'Streamserve_UNIX_patching\'] == True'
                      }
                      manual('Perform reboot of ${Streamserve_host}') {
                        description 'Perform reboot of ${Streamserve_host}'
                        plannedDuration 300
                        team 'UNIX Team'
                        precondition 'releaseVariables[\'reboot_Streamserve\'] == True'
                      }
                      sequentialGroup('Start Control-M agent on Streamserve ${Streamserve_host}') {
                        precondition 'releaseVariables[\'reboot_Streamserve\'] == True or releaseVariables[\'Streamserve_UNIX_patching\'] == True'
                        tasks {
                          createRelease('Start Control-M agent on Streamserve ${Streamserve_host}') {
                            newReleaseTitle 'Start Control-M agent on Streamserve ${Streamserve_host}'
                            template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('ctm_agt_host') {
                                value '${Streamserve_host}'
                              }
                            }
                            createdReleaseId '${ctm_agt_strs_start}'
                          }
                          gate('Wait for CTM agent stop (copy)') {
                            dependencies {
                              dependency {
                                variable 'ctm_agt_strs_start'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('SAP ERP ${erp_sid} upgrade') {
                    tasks {
                      manual('Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -PRE-SAP-DOWNTIME') {
                        description 'Perform Pure Storage snapshot of ${erp_sid} on ${erp_host} and suffix it with -PRE-SAP-DOWNTIME \n' +
                        '\n' +
                        '(only necessary if there was no Oracle upgrade)'
                        plannedDuration 300
                        team 'Storage Team'
                        precondition 'releaseVariables[\'ERP_DB_upgrade\'] == False'
                      }
                      sequentialGroup('Start ERP ${erp_sid}') {
                        description 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        precondition 
                        tasks {
                          createRelease('Start CI ${erp_sid} on ${erp_host}') {
                            newReleaseTitle '${release.title} - Start SAP {erp_sid} on  ${erp_host}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${erp_host}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${erp_sid}'
                              }
                            }
                            createdReleaseId '${erp_host1_start_complete}'
                          }
                          gate('Wait for CI ${erp_host}') {
                            dependencies {
                              dependency {
                                variable 'erp_host1_start_complete'
                              }
                            }
                          }
                          custom('Notify SAP ${erp_sid} is now ready for upgrade') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'SAP ${erp_sid} is now ready for upgrade'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Status", "value": "SAP ${erp_sid} CI is now started, we are ready for upgrade", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      manual('If there was an Oracle upgrade, restart SUM to reflect new oracle version') {
                        description 'on ${erp_host}, \n' +
                        'cd /usr/sap/hostctrl/exe\n' +
                        'sudo ./saphostexec -restart'
                        plannedDuration 180
                        team 'SAP/Web Admin Team'
                        precondition 'releaseVariables[\'ERP_DB_upgrade\'] == True'
                      }
                      manual('Stop web dispatcher and non-PAS instances on ${erp_host}') {
                        description 'stop web dispatcher and non-PAS instances on ${erp_host}'
                        plannedDuration 300
                        team 'SAP/Web Admin Team'
                      }
                      manual('sudo chown ${erp_siduser} brarchive brbackup ...') {
                        description 'cd /sapmnt/${erp_sid}/exe/uc/sun_64\n' +
                        'sudo chown ${erp_siduser} brarchive brbackup brconnect icmbnd patchesdb.mf SIGNATURE.SMF'
                        plannedDuration 120
                        team 'SAP/Web Admin Team'
                      }
                      manual('Perform SUM phases 5 and 6of ERP upgrade until reaching SPAU') {
                        plannedDuration 57600
                        team 'SAP/Web Admin Team'
                      }
                      manual('Create index VBAP~ZMI before importing') {
                        description 'CREATE INDEX SAPR3."VBAP~ZMI" ON SAPR3.VBAP ("ZZUMICUR", "PSTYV") PCTFREE 10 INITRANS 002 TABLESPACE PSAPVBAP_NEW2\n' +
                        '  STORAGE (INITIAL 0000000064 K NEXT 0000001024 K MINEXTENTS 0000000001 MAXEXTENTS UNLIMITED PCTINCREASE 0000 FREELISTS 001) ONLINE PARALLEL 16;'
                        plannedDuration 1020
                        team 'SAP/Web Admin Team'
                      }
                      manual('Import SPAU transports') {
                        description 'PD2K900126\n' +
                        'PD1K900069\n' +
                        'DEVK9A0ZSL\n' +
                        'DV2K913600\n' +
                        'DV2K913605\n' +
                        'DV2K913602\n' +
                        'DV2K913605\n' +
                        'DV2K913615\n' +
                        'DV2K913617\n' +
                        'DV2K913619\n' +
                        'DV2K913619\n' +
                        'DV2K913627\n' +
                        'DV2K913629\n' +
                        'DV2K913625\n' +
                        'DV2K913633\n' +
                        'DV2K913635\n' +
                        'DV2K913635\n' +
                        'DV2K913639\n' +
                        'DV2K913642\n' +
                        'DV2K913646\n' +
                        'DV2K913653\n' +
                        'DV2K913655\n' +
                        'DV2K913657\n' +
                        'DV2K913659\n' +
                        'DV2K913649\n' +
                        'DV2K913662\n' +
                        'DV2K913664\n' +
                        'DV2K913692\n' +
                        'DV2K913710\n' +
                        'DV2K913712'
                        plannedDuration 2400
                        team 'SAP/Web Admin Team'
                      }
                      manual('Unlock ABAP TLs to check SPAU') {
                        description 'Unlock ABAP TLs to check SPAU'
                        plannedDuration 600
                        team 'SAP/Web Admin Team'
                      }
                      manual('Finish SUM process') {
                        plannedDuration 2700
                        team 'SAP/Web Admin Team'
                      }
                      sequentialGroup('Stop PAS, patch kernel, profile params, start') {
                        plannedDuration 3600
                        tasks {
                          manual('Stop ${erp_sid} primary app server') {
                            plannedDuration 300
                            team 'SAP/Web Admin Team'
                          }
                          manual('Apply extra kernel patches') {
                            plannedDuration 600
                            team 'SAP/Web Admin Team'
                          }
                          manual('Update SAP ${erp_sid} profile parameters') {
                            description 'Update SAP ${erp_sid} profile parameters'
                            plannedDuration 1200
                            team 'SAP/Web Admin Team'
                          }
                          manual('Start ${erp_sid} primary app server') {
                            plannedDuration 300
                            team 'SAP/Web Admin Team'
                          }
                          manual('Update Oracle Instant Client') {
                            description 'on ${erp_host} ${erp_host2} ${erp_host3} ${erp_host4} :\n' +
                            'update ${erp_siduser}/.dbenv.csh to point to /oracle/client/122/instantclient'
                            plannedDuration 300
                            team 'SAP/Web Admin Team'
                          }
                        }
                      }
                      parallelGroup('Start app servers (after upgrade is complete)') {
                        precondition 'releaseVariables[\'erp_host\']!=\'\' and releaseVariables[\'erp_host2\']!=\'\''
                        tasks {
                          sequentialGroup('Start SAP on ${erp_host2}') {
                            precondition 'releaseVariables[\'erp_host2\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host2}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host2}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host2}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host2_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host2}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host2_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP on ${erp_host3}') {
                            precondition 'releaseVariables[\'erp_host3\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host3}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host3}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host3}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host3_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host3}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host3_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP on ${erp_host4}') {
                            precondition 'releaseVariables[\'erp_host4\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host4}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host4}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host4}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host4_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host4}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host4_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Start SAP on ${erp_host5}') {
                            precondition 'releaseVariables[\'erp_host5\'] != \'\''
                            tasks {
                              createRelease('Start SAP {erp_sid} on ${erp_host5}') {
                                precondition 
                                newReleaseTitle '${release.title} - Start SAP ${erp_sid} on ${erp_host5}'
                                template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                templateVariables {
                                  listBoxVariable('StopStartparam') {
                                    label 'Stop or Start'
                                    description 'Stop or Start'
                                    possibleValues 'Stop', 'Start'
                                    value 'Start'
                                  }
                                  stringVariable('host') {
                                    label 'Host'
                                    description 'The host name of the server'
                                    value '${erp_host5}'
                                  }
                                  stringVariable('sid') {
                                    label 'SAP SID'
                                    value '${erp_sid}'
                                  }
                                }
                                createdReleaseId '${erp_host5_start_complete}'
                              }
                              gate('Wait for completion of start SAP on ${erp_host5}') {
                                dependencies {
                                  dependency {
                                    variable 'erp_host5_start_complete'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      manual('Unlock non-SAP application DB users') {
                        description 'alter user VTXUSR_TPS account unlock;\n' +
                        'alter user  VTXUSR_RPT account unlock;\n' +
                        'alter user  VERTEX7  account unlock;\n' +
                        'alter user AU_USER account unlock;\n' +
                        'alter user QUEST account unlock;'
                        plannedDuration 120
                        team 'SAP/Web Admin Team'
                      }
                      manual('Unlock technical users in ${erp_sid}') {
                        description 'Unlock those technical users in  ${erp_sid}\n' +
                        'ALEREMOTE\n' +
                        'CONTROLM\n' +
                        'FIRE_BATCH\n' +
                        'GWCPIC\n' +
                        'INVOICEWARE\n' +
                        'MASTERSAF\n' +
                        'MQUSER\n' +
                        'RIGHTFAX\n' +
                        'STRS\n' +
                        'TMSADM\n' +
                        'VERTEXO\n' +
                        'XLRELEASE'
                        plannedDuration 120
                        team 'SAP/Web Admin Team'
                      }
                    }
                  }
                }
              }
              parallelGroup('Once ERP is upgraded and technical users unloacked , we can start other apps') {
                tasks {
                  sequentialGroup('SAP GW ${gw_sid} application') {
                    tasks {
                      sequentialGroup('Start SAP GW ${gw_sid} application') {
                        plannedDuration 360
                        precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                        tasks {
                          custom('Notify SAP ${gw_sid} is now starting') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'SAP ${gw_sid} is now starting...'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${gw_sid} is now starting... check your SAP MMC to see the progress", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          createRelease('Start ${gw_sid} on ${gw_host}') {
                            newReleaseTitle '${release.title} - Start SAP ${gw_sid}  on  ${gw_host}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${gw_host}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${gw_sid}'
                              }
                            }
                            createdReleaseId '${gw_host1_start_complete}'
                          }
                          gate('Wait for CI ${gw_host}') {
                            dependencies {
                              dependency {
                                variable 'gw_host1_start_complete'
                              }
                            }
                          }
                          parallelGroup('Multi Host') {
                            precondition 'releaseVariables[\'gw_host\']!=\'\' and releaseVariables[\'gw_host2\']!=\'\''
                            tasks {
                              sequentialGroup('Start SAP ${gw_sid} on ${gw_host2}') {
                                precondition 'releaseVariables[\'gw_host2\'] != \'\''
                                tasks {
                                  createRelease('Start SAP ${gw_sid} on ${gw_host2}') {
                                    precondition 
                                    newReleaseTitle '${release.title} - Start SAP ${gw_sid} on ${gw_host2}'
                                    template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                    templateVariables {
                                      listBoxVariable('StopStartparam') {
                                        label 'Stop or Start'
                                        description 'Stop or Start'
                                        possibleValues 'Stop', 'Start'
                                        value 'Start'
                                      }
                                      stringVariable('host') {
                                        label 'Host'
                                        description 'The host name of the server'
                                        value '${gw_host2}'
                                      }
                                      stringVariable('sid') {
                                        label 'SAP SID'
                                        value '${gw_sid}'
                                      }
                                    }
                                    createdReleaseId '${gw_host2_start_complete}'
                                  }
                                  gate('Wait for completion of start SAP on ${gw_host2}') {
                                    dependencies {
                                      dependency {
                                        variable 'gw_host2_start_complete'
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          custom('Notify SAP ${gw_sid} is now started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'SAP ${gw_sid} is now started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${gw_sid} is now started", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      sequentialGroup('Apply Rev-Tracs in GW') {
                        precondition 'releaseVariables[\'revtracs_GW\'] != \'\''
                        tasks {
                          manual('Apply Rev-tracs in ${gw_sid}.') {
                            description 'Please approve ${revtracs_GW} to ${gw_sid}.\n' +
                            '\n' +
                            'Click the Complete button once those Rev-Tracs have successfully gone into {gw_sid}'
                            team 'SAP/Web Admin Team'
                          }
                          sequentialGroup('Manual steps post Rev-Tracs') {
                            description 
                            precondition 'releaseVariables[\'revtracs_post_steps_GW\'] == True'
                            tasks {
                              manual('Unlock specific users in ${gw_sid}. to perform steps') {
                                plannedDuration 300
                                team 'SAP/Web Admin Team'
                              }
                              manual('Notify people that manual steps in ${gw_sid}. are about to begin') {
                                team 'Service Management Team'
                              }
                              manual('Manual steps') {
                                precondition 
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('SAP BW ${bw_sid} application') {
                    tasks {
                      sequentialGroup('Start BW ${bw_sid}') {
                        plannedDuration 360
                        precondition 'releaseVariables[\'restart_BW\'] == True  or releaseVariables[\'reboot_BW\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True'
                        tasks {
                          custom('Notify SAP ${bw_sid} is now starting') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'SAP ${bw_sid} is now starting...'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${bw_sid} is now starting... check your SAP MMC to see the progress", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                          createRelease('Start ${bw_sid} on ${bw_host}') {
                            newReleaseTitle '${release.title} - Start SAP on  ${erp_host}'
                            template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('host') {
                                label 'Host'
                                description 'The host name of the server'
                                value '${bw_host}'
                              }
                              stringVariable('sid') {
                                label 'SAP SID'
                                value '${bw_sid}'
                              }
                            }
                            createdReleaseId '${bw_host1_start_complete}'
                          }
                          gate('Wait for CI ${bw_host}') {
                            dependencies {
                              dependency {
                                variable 'bw_host1_start_complete'
                              }
                            }
                          }
                          parallelGroup('Multi Host') {
                            precondition 'releaseVariables[\'bw_host\']!=\'\' and releaseVariables[\'bw_host2\']!=\'\''
                            tasks {
                              sequentialGroup('Start SAP ${bw_sid} on ${bw_host2}') {
                                precondition 'releaseVariables[\'bw_host2\'] != \'\''
                                tasks {
                                  createRelease('Start SAP ${bw_sid} on ${bw_host2}') {
                                    precondition 
                                    newReleaseTitle '${release.title} - Start SAP ${bw_sid} on ${bw_host2}'
                                    template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                    templateVariables {
                                      listBoxVariable('StopStartparam') {
                                        label 'Stop or Start'
                                        description 'Stop or Start'
                                        possibleValues 'Stop', 'Start'
                                        value 'Start'
                                      }
                                      stringVariable('host') {
                                        label 'Host'
                                        description 'The host name of the server'
                                        value '${bw_host2}'
                                      }
                                      stringVariable('sid') {
                                        label 'SAP SID'
                                        value '${bw_sid}'
                                      }
                                    }
                                    createdReleaseId '${bw_host2_start_complete}'
                                  }
                                  gate('Wait for completion of start SAP on ${bw_host2}') {
                                    dependencies {
                                      dependency {
                                        variable 'bw_host2_start_complete'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Start SAP ${bw_sid} on ${bw_host3}') {
                                precondition 'releaseVariables[\'bw_host3\'] != \'\''
                                tasks {
                                  createRelease('Start SAP ${bw_sid} on ${bw_host3}') {
                                    precondition 
                                    newReleaseTitle '${release.title} - Start SAP ${bw_sid} on ${bw_host3}'
                                    template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                    templateVariables {
                                      listBoxVariable('StopStartparam') {
                                        label 'Stop or Start'
                                        description 'Stop or Start'
                                        possibleValues 'Stop', 'Start'
                                        value 'Start'
                                      }
                                      stringVariable('host') {
                                        label 'Host'
                                        description 'The host name of the server'
                                        value '${bw_host3}'
                                      }
                                      stringVariable('sid') {
                                        label 'SAP SID'
                                        value '${bw_sid}'
                                      }
                                    }
                                    createdReleaseId '${bw_host3_start_complete}'
                                  }
                                  gate('Wait for completion of start SAP on ${bw_host3}') {
                                    dependencies {
                                      dependency {
                                        variable 'bw_host3_start_complete'
                                      }
                                    }
                                  }
                                }
                              }
                              sequentialGroup('Start SAP ${bw_sid} on ${bw_host4}') {
                                precondition 'releaseVariables[\'bw_host4\'] != \'\''
                                tasks {
                                  createRelease('Start SAP ${bw_sid} on ${bw_host4}') {
                                    precondition 
                                    newReleaseTitle '${release.title} - Start SAP ${bw_sid} on ${bw_host4}'
                                    template 'SAP/ABAP/SAP ABAP Server Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                                    templateVariables {
                                      listBoxVariable('StopStartparam') {
                                        label 'Stop or Start'
                                        description 'Stop or Start'
                                        possibleValues 'Stop', 'Start'
                                        value 'Start'
                                      }
                                      stringVariable('host') {
                                        label 'Host'
                                        description 'The host name of the server'
                                        value '${bw_host4}'
                                      }
                                      stringVariable('sid') {
                                        label 'SAP SID'
                                        value '${bw_sid}'
                                      }
                                    }
                                    createdReleaseId '${bw_host4_start_complete}'
                                  }
                                  gate('Wait for completion of start SAP on ${bw_host4}') {
                                    dependencies {
                                      dependency {
                                        variable 'bw_host4_start_complete'
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          custom('Notify SAP ${bw_sid} is now started') {
                            precondition 'releaseVariables[\'slack_channel\']!=""'
                            script {
                              type 'slack.WebAPI'
                              server 'Slack WebAPI as XL-Release'
                              channelin '${slack_channel}'
                              text 'SAP ${bw_sid} is now started'
                              attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "SAP ${bw_sid} is now started", "short": true }] }]'
                              thread_ts '${slack_ts}'
                            }
                          }
                        }
                      }
                      sequentialGroup('Apply Rev-Tracs in BW') {
                        precondition 'releaseVariables[\'revtracs_BW\'] != \'\''
                        tasks {
                          manual('Apply Rev-tracs in ${bw_sid}.') {
                            description 'Please approve ${revtracs_BW} to ${bw_sid}.\n' +
                            '\n' +
                            'Click the Complete button once those Rev-Tracs have successfully gone into {bw_sid}'
                            team 'SAP/Web Admin Team'
                          }
                          sequentialGroup('Manual steps post Rev-Tracs') {
                            description 
                            precondition 'releaseVariables[\'revtracs_post_steps_BW\'] == True'
                            tasks {
                              manual('Unlock specific users in ${bw_sid}. to perform steps') {
                                plannedDuration 300
                                team 'SAP/Web Admin Team'
                              }
                              manual('Notify people that manual steps in ${bw_sid}. are about to begin') {
                                team 'Service Management Team'
                              }
                              manual('Manual steps') {
                                precondition 
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('Start SRM ${srm_sid}') {
                    plannedDuration 600
                    precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                    tasks {
                      createRelease('start SRM ${srm_sid}') {
                        newReleaseTitle 'start SRM ${srm_sid}'
                        template 'SAP/ABAP/SAP SRM Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          stringVariable('host') {
                            value '${srm_host}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('StopStartparam') {
                            label 'Action'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('sid_adm') {
                            label 'SAP user <sid>adm'
                            description 
                            value '${srm_siduser}'
                          }
                          stringVariable('SID') {
                            value '${srm_sid}'
                          }
                          stringVariable('ipc_adm') {
                            value '${srm_ipcuser}'
                          }
                          stringVariable('trex_adm') {
                            value '${srm_trexadm}'
                          }
                          stringVariable('ipc_host') {
                            value '${srm_ipchost}'
                          }
                          stringVariable('trex_host') {
                            label 
                            value '${srm_trexhost}'
                          }
                          stringVariable('trex_system_number') {
                            value '${srm_trexSysNum}'
                          }
                          stringVariable('host1') {
                            required false
                            description 'for SRP only : app server hostname'
                            value '${srm_host2}'
                          }
                          stringVariable('CI_SysNum') {
                            value '${srm_CI_SysNum}'
                          }
                        }
                        createdReleaseId '${srm_start_complete}'
                      }
                      gate('Wait for ${srm_sid} start') {
                        plannedDuration 0
                        dependencies {
                          dependency {
                            variable 'srm_start_complete'
                          }
                        }
                      }
                      manual('Check SRM ${srm_sid} status') {
                        description 'SAP Web Admin Team :  SRM ${srm_sid} has just been started.\n' +
                        '\n' +
                        'Please check status of the application.\n' +
                        '\n' +
                        '*IPC* :  login into  ${srm_sid} , run transaction BBP_CND_CHECK_CUST, you should see two lines which state ‘IPC Pricing is Active’ and ‘IPC up and Running’\n' +
                        '\n' +
                        '*TREX* :  login into  ${srm_sid}, run transaction SRMO, select the ‘RFC destinations’ tab, select one of the ‘SSR_TREX’ entries, click the ‘Connection Test’ button, a new window should open with a green traffic light.\n' +
                        '\n' +
                        '*URL* :  verify application is reachable via  ${srm_url}\n' +
                        '\n' +
                        '\n' +
                        'Please note that XL-Release does not restart the webdispatcher during outages (only SRP has a webdispatcher)\n' +
                        '\n' +
                        'Thank you.'
                        plannedDuration 600
                        team 'SAP/Web Admin Team'
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      phase('Start other apps in parallel') {
        color '#009CDB'
        tasks {
          parallelGroup('Start other SAP dependent apps') {
            tasks {
              sequentialGroup('Start BI-JAVA application') {
                precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True  or releaseVariables[\'Java_stack_UNIX_patching\'] == True  or releaseVariables[\'BW_UNIX_patching\'] == True'
                tasks {
                  custom('Notify JAVA Stack ${java_stack_SID} is now starting') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'JAVA Stack ${java_stack_SID} now starting...'
                      attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "JAVA Stack ${java_stack_SID} is now starting... check your SAP MMC to see the progress", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                  createRelease('Start ${java_stack_SID} on ${java_stack_host}') {
                    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-05T15:11:00+0100')
                    precondition 
                    newReleaseTitle 'Start ${java_stack_SID} on ${java_stack_host}'
                    template 'SAP/Java/SAP JAVA Server Control - sapcontrol version'
                    templateVariables {
                      listBoxVariable('StopStartparam') {
                        label 'Stop or Start'
                        description 'Stop or Start'
                        possibleValues 'Stop', 'Start'
                        value 'Start'
                      }
                      stringVariable('host') {
                        label 'Host'
                        description 'The host name of the server'
                        value '${java_stack_host}'
                      }
                      stringVariable('sid') {
                        label 'SAP SID in uppercase'
                        value '${java_stack_SID}'
                      }
                    }
                    createdReleaseId '${java_stack_host_start_complete}'
                  }
                  gate('Wait for start ${java_stack_SID} on ${java_stack_host}') {
                    dependencies {
                      dependency {
                        variable 'java_stack_host_start_complete'
                      }
                    }
                  }
                  sequentialGroup('Start SAP ${java_stack_SID} on app server ${java_stack_host1}') {
                    precondition 'releaseVariables[\'java_stack_host1\'] != \'\''
                    tasks {
                      createRelease('Start ${java_stack_SID} on ${java_stack_host1}') {
                        scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-05T15:11:00+0100')
                        precondition 
                        newReleaseTitle 'start ${java_stack_SID} on ${java_stack_host1}'
                        template 'SAP/Java/SAP JAVA Server Control - sapcontrol version'
                        templateVariables {
                          listBoxVariable('StopStartparam') {
                            label 'Stop or Start'
                            description 'Stop or Start'
                            possibleValues 'Stop', 'Start'
                            value 'Start'
                          }
                          stringVariable('host') {
                            label 'Host'
                            description 'The host name of the server'
                            value '${java_stack_host1}'
                          }
                          stringVariable('sid') {
                            label 'SAP SID in uppercase'
                            value '${java_stack_SID}'
                          }
                        }
                        createdReleaseId '${java_stack_host1_start_complete}'
                      }
                      gate('Wait for start ${java_stack_SID} on ${java_stack_host1}') {
                        dependencies {
                          dependency {
                            variable 'java_stack_host1_start_complete'
                          }
                        }
                      }
                    }
                  }
                  custom('Notify JAVA Stack ${java_stack_SID} is now started') {
                    precondition 'releaseVariables[\'slack_channel\']!=""'
                    script {
                      type 'slack.WebAPI'
                      server 'Slack WebAPI as XL-Release'
                      channelin '${slack_channel}'
                      text 'JAVA Stack ${java_stack_SID} is now started'
                      attachments '[{"color": "good", "title": "${release.title} "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": " JAVA Stack ${java_stack_SID} is now started", "short": true }] }]'
                      thread_ts '${slack_ts}'
                    }
                  }
                }
              }
              sequentialGroup('Start Vertex') {
                precondition 'releaseVariables[\'VertexHost\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                tasks {
                  createRelease('Start Vertex (prod)') {
                    precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                    newReleaseTitle 'Start Vertex production'
                    template 'Vertex/Vertex Service Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Start', 'Stop', 'Restart'
                        value 'Start'
                      }
                      listBoxVariable('environment') {
                        possibleValues 'Dev', 'Test', 'Production'
                        value 'Production'
                      }
                    }
                    createdReleaseId '${vertex_start_complete}'
                  }
                  createRelease('Start Vertex (test)') {
                    precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                    newReleaseTitle 'Start Vertex test'
                    template 'Vertex/Vertex Service Control - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('action') {
                        label 'Action'
                        possibleValues 'Start', 'Stop', 'Restart'
                        value 'Start'
                      }
                      listBoxVariable('environment') {
                        possibleValues 'Dev', 'Test', 'Production'
                        value 'Test'
                      }
                    }
                    createdReleaseId '${vertex_start_complete}'
                  }
                  gate('Wait for Vertex service start') {
                    dependencies {
                      dependency {
                        variable 'vertex_start_complete'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Start Windows applications and Windows dependent applications') {
                tasks {
                  parallelGroup('Confirm Wintel Team & SQL Server Team are done with their activities') {
                    plannedDuration 600
                    tasks {
                      manual('Confirm  Wintel Team is done applying Windows patches on the SAP dependent servers') {
                        description 'Confirm that Wintel Team is done applying Windows patches on the SAP dependent servers.\n' +
                        '\n' +
                        'The list of servers that should have been patched is located here on Sharepoint : https://bramblesgroup.sharepoint.com/:w:/r/teams/webadmin/_layouts/15/Doc.aspx?sourcedoc=%7Bf586d9b8-7a93-4891-8e4f-95132a7c7d1c%7D&action=default'
                        team 'Service Management Team'
                        precondition 'releaseVariables[\'Apply_Windows_Patches\'] == True'
                      }
                      manual('Confirm SQL Server Team is done applying SQL patches') {
                        description 'Confirm SQL Server Team is done applying SQL patches'
                        team 'Service Management Team'
                        precondition 'releaseVariables[\'Apply_SQL_Server_Patches\'] == True'
                      }
                    }
                  }
                  parallelGroup('Start BW pre-calculation, Invoiceware, Mastersaf, Streamserve') {
                    tasks {
                      parallelGroup('Start BW pre-calc') {
                        precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True  or releaseVariables[\'Java_stack_UNIX_patching\'] == True  or releaseVariables[\'BW_UNIX_patching\'] == True'
                        tasks {
                          sequentialGroup('Restart precalc on ${bw_precalc_host1}') {
                            precondition 'releaseVariables[\'bw_precalc_host1\'] != \'\''
                            tasks {
                              createRelease('Restart precalc on ${bw_precalc_host1}') {
                                newReleaseTitle 'Retart precalc on ${bw_precalc_host1}'
                                template 'Microsoft/Windows service control'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Restart'
                                    value 'Restart'
                                  }
                                  stringVariable('service_name') {
                                    label 'Windows service name'
                                    value 'SAP BW Precalculation Service Multi Instance'
                                  }
                                  stringVariable('windows_host') {
                                    value '${bw_precalc_host1}'
                                  }
                                  passwordVariable('xlrelease_windows_password') {
                                    
                                  }
                                  stringVariable('xlrelease_windows_user') {
                                    value '${bw_precalc_user1}'
                                  }
                                }
                                createdReleaseId '${precalc1_start_complete}'
                              }
                              gate('Wait for ${bw_precalc_host1}') {
                                dependencies {
                                  dependency {
                                    variable 'precalc1_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Restart precalc on ${bw_precalc_host2}') {
                            precondition 'releaseVariables[\'bw_precalc_host2\'] != \'\''
                            tasks {
                              createRelease('Restart precalc on ${bw_precalc_host2}') {
                                newReleaseTitle 'Retart precalc on ${bw_precalc_host2}'
                                template 'Microsoft/Windows service control'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Restart'
                                    value 'Restart'
                                  }
                                  stringVariable('service_name') {
                                    label 'Windows service name'
                                    value 'SAP BW Precalculation Service Multi Instance'
                                  }
                                  stringVariable('windows_host') {
                                    value '${bw_precalc_host2}'
                                  }
                                  passwordVariable('xlrelease_windows_password') {
                                    
                                  }
                                  stringVariable('xlrelease_windows_user') {
                                    value '${bw_precalc_user1}'
                                  }
                                }
                                createdReleaseId '${precalc2_start_complete}'
                              }
                              gate('Wait for ${bw_precalc_host2}') {
                                dependencies {
                                  dependency {
                                    variable 'precalc2_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Restart precalc on ${bw_precalc_host3}') {
                            precondition 'releaseVariables[\'bw_precalc_host3\'] != \'\''
                            tasks {
                              createRelease('Restart precalc on ${bw_precalc_host3}') {
                                newReleaseTitle 'Retart precalc on ${bw_precalc_host3}'
                                template 'Microsoft/Windows service control'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Restart'
                                    value 'Restart'
                                  }
                                  stringVariable('service_name') {
                                    label 'Windows service name'
                                    value 'SAP BW Precalculation Service Multi Instance'
                                  }
                                  stringVariable('windows_host') {
                                    value '${bw_precalc_host3}'
                                  }
                                  passwordVariable('xlrelease_windows_password') {
                                    
                                  }
                                  stringVariable('xlrelease_windows_user') {
                                    value '${bw_precalc_user1}'
                                  }
                                }
                                createdReleaseId '${precalc3_start_complete}'
                              }
                              gate('Wait for ${bw_precalc_host3}') {
                                dependencies {
                                  dependency {
                                    variable 'precalc3_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Restart precalc on ${bw_precalc_host4}') {
                            precondition 'releaseVariables[\'bw_precalc_host4\'] != \'\''
                            tasks {
                              createRelease('Restart precalc on ${bw_precalc_host4}') {
                                newReleaseTitle 'Retart precalc on ${bw_precalc_host4}'
                                template 'Microsoft/Windows service control'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Restart'
                                    value 'Restart'
                                  }
                                  stringVariable('service_name') {
                                    label 'Windows service name'
                                    value 'SAP BW Precalculation Service Multi Instance'
                                  }
                                  stringVariable('windows_host') {
                                    value '${bw_precalc_host4}'
                                  }
                                  passwordVariable('xlrelease_windows_password') {
                                    
                                  }
                                  stringVariable('xlrelease_windows_user') {
                                    value '${bw_precalc_user1}'
                                  }
                                }
                                createdReleaseId '${precalc4_start_complete}'
                              }
                              gate('Wait for ${bw_precalc_host4}') {
                                dependencies {
                                  dependency {
                                    variable 'precalc4_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Restart precalc on ${bw_precalc_host5}') {
                            precondition 'releaseVariables[\'bw_precalc_host5\'] != \'\''
                            tasks {
                              createRelease('Restart precalc on ${bw_precalc_host5}') {
                                newReleaseTitle 'Retart precalc on ${bw_precalc_host5}'
                                template 'Microsoft/Windows service control'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Restart'
                                    value 'Restart'
                                  }
                                  stringVariable('service_name') {
                                    label 'Windows service name'
                                    value 'SAP BW Precalculation Service Multi Instance'
                                  }
                                  stringVariable('windows_host') {
                                    value '${bw_precalc_host5}'
                                  }
                                  passwordVariable('xlrelease_windows_password') {
                                    
                                  }
                                  stringVariable('xlrelease_windows_user') {
                                    value '${bw_precalc_user1}'
                                  }
                                }
                                createdReleaseId '${precalc5_start_complete}'
                              }
                              gate('Wait for ${bw_precalc_host5}') {
                                dependencies {
                                  dependency {
                                    variable 'precalc5_start_complete'
                                  }
                                }
                              }
                            }
                          }
                          sequentialGroup('Restart precalc on ${bw_precalc_host6}') {
                            precondition 'releaseVariables[\'bw_precalc_host6\'] != \'\''
                            tasks {
                              createRelease('Restart precalc on ${bw_precalc_host6}') {
                                newReleaseTitle 'Retart precalc on ${bw_precalc_host6}'
                                template 'Microsoft/Windows service control'
                                templateVariables {
                                  stringVariable('slack_channel') {
                                    required false
                                    value '${slack_channel}'
                                  }
                                  stringVariable('slack_ts') {
                                    required false
                                    value '${slack_ts}'
                                  }
                                  listBoxVariable('StopStartparam') {
                                    label 'Action'
                                    possibleValues 'Stop', 'Start', 'Restart'
                                    value 'Restart'
                                  }
                                  stringVariable('service_name') {
                                    label 'Windows service name'
                                    value 'SAP BW Precalculation Service Multi Instance'
                                  }
                                  stringVariable('windows_host') {
                                    value '${bw_precalc_host6}'
                                  }
                                  passwordVariable('xlrelease_windows_password') {
                                    
                                  }
                                  stringVariable('xlrelease_windows_user') {
                                    value '${bw_precalc_user1}'
                                  }
                                }
                                createdReleaseId '${precalc6_start_complete}'
                              }
                              gate('Wait for ${bw_precalc_host6}') {
                                dependencies {
                                  dependency {
                                    variable 'precalc6_start_complete'
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Mastersaf') {
                        precondition 'releaseVariables[\'MastersafEnvironment\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                        tasks {
                          createRelease('Start Mastersaf ${MastersafEnvironment}') {
                            newReleaseTitle 'Start Mastersaf ${MastersafEnvironment}'
                            template 'Mastersaf/Mastersaf control'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Check'
                                value 'Restart'
                              }
                              stringVariable('environment') {
                                value '${MastersafEnvironment}'
                              }
                            }
                            createdReleaseId '${msaf_started}'
                          }
                          gate('wait for Mastersaf ${MastersafEnvironment}') {
                            dependencies {
                              dependency {
                                variable 'msaf_started'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Invoiceware') {
                        precondition 'releaseVariables[\'InvoicewareEnvironment\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                        tasks {
                          createRelease('Start Invoiceware ${InvoicewareEnvironment}') {
                            newReleaseTitle 'Start Invoiceware ${InvoicewareEnvironment}'
                            template 'Invoiceware/Invoiceware control'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart'
                                value 'Restart'
                              }
                              stringVariable('environment') {
                                value '${InvoicewareEnvironment}'
                              }
                            }
                            createdReleaseId '${invoiceware_started}'
                          }
                          gate('wait for Invoiceware ${InvoicewareEnvironment}') {
                            dependencies {
                              dependency {
                                variable 'invoiceware_started'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Streamserve ${StreamserveEnvironment} application') {
                        precondition 'releaseVariables[\'StreamserveEnvironment\'] != \'\' and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                        tasks {
                          createRelease('Start Streamserve ${StreamserveEnvironment} application') {
                            newReleaseTitle 'Start Streamserve ${StreamserveEnvironment} application'
                            template 'StreamServe/Streamserve 5.6.2 and Tomcat8'
                            templateVariables {
                              listBoxVariable('environment') {
                                label 'Streamserve environment'
                                possibleValues 'Dev', 'Test', 'Production'
                                value '${StreamserveEnvironment}'
                              }
                              listBoxVariable('StopStartparam') {
                                label 'Stop or Start'
                                description 'Stop or Start'
                                possibleValues 'Stop', 'Start', 'Status'
                                value 'Start'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${streamserve_start_complete}'
                          }
                          gate('Wait for Streamserve start') {
                            dependencies {
                              dependency {
                                variable 'streamserve_start_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start SAP BO BI ${BusinessObjectsEnvironment}') {
                        precondition 'releaseVariables[\'BusinessObjectsEnvironment\'] != \'\'  and ( releaseVariables[\'restart_BW\'] == True or releaseVariables[\'StopStartHANA\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True )'
                        tasks {
                          createRelease('Start SAP BO BI  (Production)') {
                            precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Production\''
                            newReleaseTitle 'Start SAP BO BI (${BusinessObjectsEnvironment})'
                            template 'SAP/Business Objects/SAP BO BI Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Production'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${sap_bo_bi_start}'
                          }
                          createRelease('Start SAP BO BI  (Test)') {
                            precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Test\''
                            newReleaseTitle 'Start SAP BO BI (${BusinessObjectsEnvironment})'
                            template 'SAP/Business Objects/SAP BO BI Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Test'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${sap_bo_bi_start}'
                          }
                          gate('Wait for SAP Data Services') {
                            dependencies {
                              dependency {
                                variable 'sap_bo_bi_start'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start SAP Data Services ${BusinessObjectsEnvironment}') {
                        precondition 'releaseVariables[\'BusinessObjectsEnvironment\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                        tasks {
                          createRelease('Start SAP Data Services  (Production)') {
                            precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Production\''
                            newReleaseTitle 'Start SAP Data Services (${BusinessObjectsEnvironment})'
                            template 'SAP/Business Objects/SAP Data Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Production'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${sap_bo_ds_start}'
                          }
                          createRelease('Start SAP Data Services  (Test)') {
                            precondition 'releaseVariables[\'BusinessObjectsEnvironment\']==\'Test\''
                            newReleaseTitle 'Start SAP Data Services (${BusinessObjectsEnvironment})'
                            template 'SAP/Business Objects/SAP Data Services Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Test'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${sap_bo_ds_start}'
                          }
                          gate('Wait for SAP Data Services') {
                            dependencies {
                              dependency {
                                variable 'sap_bo_ds_start'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start PowerBI ${PowerBIEnvironment}') {
                        precondition 'releaseVariables[\'PowerBIEnvironment\'] != \'\'  and ( releaseVariables[\'restart_BW\'] == True or releaseVariables[\'StopStartHANA\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True )'
                        tasks {
                          createRelease('Start Power BI  (Production)') {
                            precondition 'releaseVariables[\'PowerBIEnvironment\']==\'Production\''
                            newReleaseTitle 'Start Power BI  (Production)'
                            template 'Microsoft/Power BI Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            folder 'SAP/ABAP'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Production'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${power_bi_start}'
                          }
                          createRelease('Start Power BI  (non-Production)') {
                            precondition 'releaseVariables[\'PowerBIEnvironment\']==\'Development\''
                            newReleaseTitle 'Start Power BI  (non-Production)'
                            template 'Microsoft/Power BI Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            folder 'SAP/ABAP'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Development'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${power_bi_start}'
                          }
                          gate('Wait for Power BI') {
                            dependencies {
                              dependency {
                                variable 'power_bi_start'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start TRAX ${TRAXEnvironment}') {
                        precondition 'releaseVariables[\'TRAXEnvironment\'] != \'\'  and ( releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'restart_Oracle_ERP\'] == True or releaseVariables[\'ERP_UNIX_patching\'] == True )'
                        tasks {
                          createRelease('Start TRAX  (Production)') {
                            precondition 'releaseVariables[\'TRAXEnvironment\']==\'Production\''
                            newReleaseTitle 'Start TRAX (${TRAXEnvironment})'
                            template 'TRAX/TRAX Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Production'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${trax_start}'
                          }
                          createRelease('Start TRAX  (Test)') {
                            precondition 'releaseVariables[\'TRAXEnvironment\']==\'Test\''
                            newReleaseTitle 'Start TRAX (${TRAXEnvironment})'
                            template 'TRAX/TRAX Control - DO NOT CALL THIS TEMPLATE DIRECTLY! IT WILL BE CALLED FROM ENV CONTROL RELEASES'
                            templateVariables {
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start', 'Restart', 'Apply Windows patches'
                                value 'Start'
                              }
                              listBoxVariable('environment') {
                                label 'Environment'
                                possibleValues 'Development', 'Test', 'Production'
                                value 'Test'
                              }
                              stringVariable('slack_channel') {
                                required false
                                description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                description 'LEAVE THIS FIELD BLANK'
                                value '${slack_ts}'
                              }
                            }
                            createdReleaseId '${trax_start}'
                          }
                          gate('Wait for TRAX') {
                            dependencies {
                              dependency {
                                variable 'trax_start'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  manual('Verify Mastersaf & Invoiceware (check the RFCs in SAP ${erp_sid})') {
                    description 'Mastersaf & Invoiceware should have been previously started automatically by XL-Release\n' +
                    '\n' +
                    'Please check applications:\n' +
                    '\n' +
                    '* Mastersaf : \n' +
                    '\n' +
                    'https://chepdev.jira.com/wiki/spaces/SWAT/pages/159551933/Mastersaf#Mastersaf-Howtochecktheapplicationstatus? \n' +
                    '\n' +
                    '\n' +
                    '* Invoiceware : RFC to check is TFCLIENT \n' +
                    '\n' +
                    'If the RFCs fail, restart the Mastersaf/Invoiceware services and check the RFCs once again.'
                    team 'SAP/Web Admin Team'
                  }
                }
              }
              sequentialGroup('Start Control-M agents for ERP and BW and confirm they are all up and running') {
                tasks {
                  parallelGroup('Start Control-M agents for ERP and BW') {
                    tasks {
                      sequentialGroup('Start Control-M agent on ${erp_host}') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          createRelease('Start Control-M agent on ${erp_host}') {
                            newReleaseTitle 'Start Control-M agent on ${erp_host}'
                            template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('ctm_agt_host') {
                                value '${erp_host}'
                              }
                            }
                            createdReleaseId '${ctm_agt_erp_start}'
                          }
                          gate('Wait for CTM agent') {
                            dependencies {
                              dependency {
                                variable 'ctm_agt_erp_start'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Start Control-M agent on ${bw_host}') {
                        precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True'
                        tasks {
                          createRelease('Start Control-M agent on ${bw_host}') {
                            newReleaseTitle 'Start Control-M agent on ${bw_host}'
                            template 'BMC/Control-M agent contol (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Stop', 'Start'
                                value 'Start'
                              }
                              stringVariable('ctm_agt_host') {
                                value '${bw_host}'
                              }
                            }
                            createdReleaseId '${ctm_agt_bw_start}'
                          }
                          gate('Wait for CTM agent') {
                            dependencies {
                              dependency {
                                variable 'ctm_agt_bw_start'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('Confirm Control-M agents have been started') {
                    tasks {
                      manual('Confirm Control-M agents have been started (test systems)') {
                        description 'Please confirm that the Control-M agents have been started:\n' +
                        '* SAP  ${erp_sid} Control-M agent on ${erp_host}\n' +
                        '* SAP  ${bw_sid} Control-M agent on ${bw_host}\n' +
                        '\n' +
                        'Ensure the SAP extractor is running by logging on  ${erp_host} and  ${bw_host} and running the command:\n' +
                        'ps -ef | grep ctm\n' +
                        '\n' +
                        'if the process is not active, please start the process manually.'
                        plannedDuration 300
                        attachments {
                          attachment("sql:Attachment140636071") {
                            filename "attachments/Attachment140636071-image.png"
                          }
                        }
                        team 'GPM'
                        precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                      }
                      manual('Confirm Control-M agents have been started (production systems)') {
                        description 'Please confirm that the Control-M agents have been started:\n' +
                        '* SAP  ${erp_sid} Control-M agent on ${erp_host}\n' +
                        '* SAP  ${bw_sid} Control-M agent on ${bw_host}\n' +
                        '\n' +
                        'Ensure the SAP extractor is running by logging on  ${erp_host} and  ${bw_host} and running the command:\n' +
                        'ps -ef | grep p_ctmxt\n' +
                        '\n' +
                        'If the SAP extractor process is not active, please start the process manually.\n' +
                        'go to  path /opt/BMC/ctmagent/ctm/cm/SAP/exe  and run the script  start-xt'
                        plannedDuration 300
                        attachments {
                          attachment("sql:Attachment140636071") {
                            filename "attachments/Attachment140636071-image.png"
                          }
                        }
                        team 'Production Control Team'
                        precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                      }
                    }
                  }
                }
              }
              parallelGroup('After OS patches /upgrades, we can resume OS backups and monitoring') {
                tasks {
                  parallelGroup('As server ${backup_hostname_java_stack} OS has been patched/upgraded, we can resume OS backups and monitoring') {
                    precondition 'releaseVariables[\'Java_stack_UNIX_patching\'] == True'
                    tasks {
                      manual('Resume monitoring for ${backup_hostname_java_stack}') {
                        description 'As server ${backup_hostname_java_stack} OS has been patched/upgraded, please resume monitoring for ${backup_hostname_java_stack}'
                        plannedDuration 300
                        team 'DC-Ops Team'
                      }
                      manual('Resume OS backups for ${backup_hostname_java_stack}') {
                        description 'As server ${backup_hostname_java_stack} OS has been patched/upgraded, please resume OS backups for ${backup_hostname_java_stack}'
                        plannedDuration 300
                        team 'Netbackup Team'
                      }
                    }
                  }
                  parallelGroup('As server ${backup_hostname_gw} OS has been patched/upgraded, we can resume OS backups and monitoring') {
                    precondition 'releaseVariables[\'GW_UNIX_patching\'] == True'
                    tasks {
                      manual('Resume monitoring for ${backup_hostname_gw}') {
                        description 'As server ${backup_hostname_gw} OS has been patched/upgraded, please resume monitoring for ${backup_hostname_gw}'
                        plannedDuration 300
                        team 'DC-Ops Team'
                      }
                      manual('Resume OS backups for ${backup_hostname_gw}') {
                        description 'As server ${backup_hostname_gw} OS has been patched/upgraded, please resume OS backups for ${backup_hostname_gw}'
                        plannedDuration 300
                        team 'Netbackup Team'
                      }
                    }
                  }
                  parallelGroup('As server ${backup_hostname_erp} OS has been patched/upgraded, we can resume OS backups and monitoring') {
                    precondition 'releaseVariables[\'ERP_UNIX_patching\'] == True'
                    tasks {
                      manual('Resume monitoring for ${backup_hostname_erp}') {
                        description 'As server ${backup_hostname_erp} OS has been patched/upgraded, please resume monitoring for ${backup_hostname_erp}'
                        plannedDuration 300
                        team 'DC-Ops Team'
                      }
                      manual('Resume OS backups for ${backup_hostname_erp}') {
                        description 'As server ${backup_hostname_erp} OS has been patched/upgraded, please resume OS backups for ${backup_hostname_erp}'
                        plannedDuration 300
                        team 'Netbackup Team'
                      }
                    }
                  }
                  parallelGroup('As server ${backup_hostname_bw} OS has been patched/upgraded, we can resume OS backups and monitoring') {
                    precondition 'releaseVariables[\'BW_UNIX_patching\'] == True'
                    tasks {
                      manual('Resume monitoring for ${backup_hostname_bw}') {
                        description 'As server ${backup_hostname_bw} OS has been patched/upgraded, please resume monitoring for ${backup_hostname_bw}'
                        plannedDuration 300
                        team 'DC-Ops Team'
                      }
                      manual('Resume OS backups for ${backup_hostname_bw}') {
                        description 'As server ${backup_hostname_bw} OS has been patched/upgraded, please resume OS backups for ${backup_hostname_bw}'
                        plannedDuration 300
                        team 'Netbackup Team'
                      }
                    }
                  }
                }
              }
              sequentialGroup('Perform ERP post-upgrade steps') {
                precondition 'releaseVariables[\'ERP_upgrade\'] == True'
                tasks {
                  createRelease('Perform SAP ERP post-upgrade steps') {
                    newReleaseTitle 'SAP ERP ${erp_sid} post-upgrade steps'
                    template 'SAP/ABAP/SAP ERP Upgrade - post upgrade steps'
                    templateVariables {
                      stringVariable('slack_channel') {
                        required false
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      stringVariable('host') {
                        value '${erp_host}'
                      }
                      stringVariable('sidadm') {
                        value '${erp_siduser}'
                      }
                      stringVariable('orasid') {
                        required false
                        value '${erp_orauser}'
                      }
                      stringVariable('srm_sid') {
                        required false
                        value '${srm_sid}'
                      }
                      stringVariable('erp_sid') {
                        value '${erp_sid}'
                      }
                    }
                    createdReleaseId '${erp_upg_post1}'
                  }
                  gate('Wait for post-steps completion') {
                    dependencies {
                      dependency {
                        variable 'erp_upg_post1'
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      phase('Unlock users, remove outage pages, resume interfaces and jobs') {
        color '#009CDB'
        tasks {
          manual('Please confirm you are about to unlock users, release jobs, remove outage pages in ${environment}') {
            description 'Please confirm you are about to unlock users, release jobs, remove outage pages in ${environment}'
            plannedDuration 300
            team 'SAP/Web Admin Team'
          }
          parallelGroup('Unlock users and release jobs in ${environment}') {
            tasks {
              sequentialGroup('unlock users and release jobs in ${erp_sid}') {
                tasks {
                  sequentialGroup('Unlock users in SAP ${erp_sid}') {
                    description 'this task runs transaction ZLOCK'
                    tasks {
                      createRelease('Unlock users in SAP ${erp_sid}') {
                        newReleaseTitle 'Unlock users in SAP ${erp_sid}'
                        template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Lock', 'Unlock'
                            value 'Unlock'
                          }
                          stringVariable('SID') {
                            value '${erp_sid}'
                          }
                        }
                        createdReleaseId '${unlock_users_erp_done}'
                      }
                      gate('Wait for unlock') {
                        dependencies {
                          dependency {
                            variable 'unlock_users_erp_done'
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('Remove system message and release jobs') {
                    tasks {
                      sequentialGroup('Release jobs in SAP ${erp_sid} (BTCTRNS2)') {
                        tasks {
                          createRelease('Release jobs in SAP ${erp_sid} (BTCTRNS2)') {
                            newReleaseTitle 'Release jobs in SAP ${erp_sid} (BTCTRNS2)'
                            template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              stringVariable('SID') {
                                value '${erp_sid}'
                              }
                            }
                            createdReleaseId '${release_erp_jobs_complete}'
                          }
                          gate('wait for jobs release') {
                            dependencies {
                              dependency {
                                variable 'release_erp_jobs_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Delete system message in SAP ${erp_sid} (SM02)') {
                        tasks {
                          createRelease('Delete system message in SAP ${erp_sid} (SM02)') {
                            newReleaseTitle 'Delete system message in SAP ${erp_sid} (SM02)'
                            template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Post message', 'Delete message'
                                value 'Delete message'
                              }
                              stringVariable('SID') {
                                value '${erp_sid}'
                              }
                              stringVariable('Message_line1') {
                                value '${SAP_system_message_line1}'
                              }
                              stringVariable('Message_line2') {
                                label 
                                value '${SAP_system_message_line2}'
                              }
                              stringVariable('Message_line3') {
                                value '${SAP_system_message_line3}'
                              }
                              integerVariable('Expires_in_n_hours') {
                                label 'Number of hours until the message expires'
                              }
                            }
                            createdReleaseId '${message_delete_erp_done}'
                          }
                          gate('Wait for message') {
                            dependencies {
                              dependency {
                                variable 'message_delete_erp_done'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('unlock users and release jobs in ${bw_sid}') {
                tasks {
                  sequentialGroup('Unlock users in SAP ${bw_sid}') {
                    description 'this task runs transaction ZLOCK'
                    tasks {
                      createRelease('Unlock users in SAP ${bw_sid}') {
                        newReleaseTitle 'Unlock users in SAP ${bw_sid}'
                        template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Lock', 'Unlock'
                            value 'Unlock'
                          }
                          stringVariable('SID') {
                            value '${bw_sid}'
                          }
                        }
                        createdReleaseId '${unlock_users_bw_done}'
                      }
                      gate('Wait for unlock') {
                        dependencies {
                          dependency {
                            variable 'unlock_users_erp_done'
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('Remove system message and release jobs') {
                    tasks {
                      sequentialGroup('Release jobs in SAP ${bw_sid} (BTCTRNS2)') {
                        tasks {
                          createRelease('Release jobs in SAP ${bw_sid} (BTCTRNS2)') {
                            newReleaseTitle 'Release jobs in SAP ${bw_sid} (BTCTRNS2)'
                            template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              stringVariable('SID') {
                                value '${bw_sid}'
                              }
                            }
                            createdReleaseId '${release_bw_jobs_complete}'
                          }
                          gate('wait for jobs release') {
                            dependencies {
                              dependency {
                                variable 'release_bw_jobs_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Delete system message in SAP ${bw_sid} (SM02)') {
                        tasks {
                          createRelease('Delete system message in SAP ${bw_sid} (SM02)') {
                            newReleaseTitle 'Delete system message in SAP ${bw_sid} (SM02)'
                            template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Post message', 'Delete message'
                                value 'Delete message'
                              }
                              stringVariable('SID') {
                                value '${bw_sid}'
                              }
                              stringVariable('Message_line1') {
                                value '${SAP_system_message_line1}'
                              }
                              stringVariable('Message_line2') {
                                label 
                                value '${SAP_system_message_line2}'
                              }
                              stringVariable('Message_line3') {
                                value '${SAP_system_message_line3}'
                              }
                              integerVariable('Expires_in_n_hours') {
                                label 'Number of hours until the message expires'
                              }
                            }
                            createdReleaseId '${message_delete_bw_done}'
                          }
                          gate('Wait for message') {
                            dependencies {
                              dependency {
                                variable 'message_delete_bw_done'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('unlock users and release jobs in ${srm_sid}') {
                tasks {
                  sequentialGroup('Unlock users in SAP ${srm_sid}') {
                    description 'this task runs transaction ZLOCK'
                    tasks {
                      createRelease('Unlock users in SAP ${srm_sid}') {
                        newReleaseTitle 'Unlock users in SAP ${srm_sid}'
                        template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Lock', 'Unlock'
                            value 'Unlock'
                          }
                          stringVariable('SID') {
                            value '${srm_sid}'
                          }
                        }
                        createdReleaseId '${unlock_users_srm_done}'
                      }
                      gate('Wait for unlock') {
                        dependencies {
                          dependency {
                            variable 'unlock_users_srm_done'
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('Remove system message and release jobs') {
                    tasks {
                      sequentialGroup('Release jobs in SAP ${srm_sid} (BTCTRNS2)') {
                        tasks {
                          createRelease('Release jobs in SAP ${srm_sid} (BTCTRNS2)') {
                            newReleaseTitle 'Release jobs in SAP ${srm_sid} (BTCTRNS2)'
                            template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              stringVariable('SID') {
                                value '${srm_sid}'
                              }
                            }
                            createdReleaseId '${release_srm_jobs_complete}'
                          }
                          gate('wait for jobs release') {
                            dependencies {
                              dependency {
                                variable 'release_srm_jobs_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Delete system message in SAP ${srm_sid} (SM02)') {
                        tasks {
                          createRelease('Delete system message in SAP ${srm_sid} (SM02)') {
                            newReleaseTitle 'Delete system message in SAP ${srm_sid} (SM02)'
                            template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Post message', 'Delete message'
                                value 'Delete message'
                              }
                              stringVariable('SID') {
                                value '${srm_sid}'
                              }
                              stringVariable('Message_line1') {
                                value '${SAP_system_message_line1}'
                              }
                              stringVariable('Message_line2') {
                                label 
                                value '${SAP_system_message_line2}'
                              }
                              stringVariable('Message_line3') {
                                value '${SAP_system_message_line3}'
                              }
                              integerVariable('Expires_in_n_hours') {
                                label 'Number of hours until the message expires'
                              }
                            }
                            createdReleaseId '${message_delete_srm_done}'
                          }
                          gate('Wait for message') {
                            dependencies {
                              dependency {
                                variable 'message_delete_srm_done'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              sequentialGroup('unlock users and release jobs in ${gw_sid}') {
                tasks {
                  sequentialGroup('Unlock users in SAP ${gw_sid}') {
                    description 'this task runs transaction ZLOCK'
                    tasks {
                      createRelease('Unlock users in SAP ${gw_sid}') {
                        newReleaseTitle 'Unlock users in SAP ${gw_sid}'
                        template 'SAP/ABAP/SAP ABAP Control users - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                        templateVariables {
                          stringVariable('slack_channel') {
                            required false
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            value '${slack_ts}'
                          }
                          listBoxVariable('action') {
                            label 'Action'
                            possibleValues 'Lock', 'Unlock'
                            value 'Unlock'
                          }
                          stringVariable('SID') {
                            value '${gw_sid}'
                          }
                        }
                        createdReleaseId '${unlock_users_gw_done}'
                      }
                      gate('Wait for unlock') {
                        dependencies {
                          dependency {
                            variable 'unlock_users_gw_done'
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('Remove system message and release jobs') {
                    tasks {
                      sequentialGroup('Release jobs in SAP ${gw_sid} (BTCTRNS2)') {
                        tasks {
                          createRelease('Release jobs in SAP ${gw_sid} (BTCTRNS2)') {
                            newReleaseTitle 'Release jobs in SAP ${gw_sid} (BTCTRNS2)'
                            template 'SAP/ABAP/SAP ABAP Control batch Jobs - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              stringVariable('SID') {
                                value '${gw_sid}'
                              }
                            }
                            createdReleaseId '${release_gw_jobs_complete}'
                          }
                          gate('wait for jobs release') {
                            dependencies {
                              dependency {
                                variable 'release_gw_jobs_complete'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Delete system message in SAP ${gw_sid} (SM02)') {
                        tasks {
                          createRelease('Delete system message in SAP ${gw_sid} (SM02)') {
                            newReleaseTitle 'Delete system message in SAP ${gw_sid} (SM02)'
                            template 'SAP/ABAP/SAP ABAP Control System Messages - this is a template that is used by ABAP environment control - DO NOT USE directly!'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Post message', 'Delete message'
                                value 'Delete message'
                              }
                              stringVariable('Message_line1') {
                                value '${SAP_system_message_line1}'
                              }
                              stringVariable('Message_line2') {
                                label 
                                value '${SAP_system_message_line2}'
                              }
                              stringVariable('Message_line3') {
                                value '${SAP_system_message_line3}'
                              }
                              integerVariable('Expires_in_n_hours') {
                                label 'Number of hours until the message expires'
                              }
                              stringVariable('SID') {
                                value '${gw_sid}'
                              }
                            }
                            createdReleaseId '${message_delete_gw_done}'
                          }
                          gate('Wait for message') {
                            dependencies {
                              dependency {
                                variable 'message_delete_gw_done'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          parallelGroup('Unset global vars as ERP ${erp_sid} and BW ${bw_sid} are available (MyChep will check those variables)') {
            tasks {
              script('set global variable BW.UsersLocked=False') {
                script (['''\
globalVariables["global.BW.UsersLocked"] = False
'''])
              }
              script('set global variable ERP.UsersLocked=False') {
                script (['''\
globalVariables["global.ERP.UsersLocked"] = False
'''])
              }
              script('set global variable GW.UsersLocked=False') {
                script (['''\
globalVariables["global.GW.UsersLocked"] = False
'''])
              }
            }
          }
          sequentialGroup('Disable F5 Maintenance pages') {
            precondition 
            tasks {
              parallelGroup('Disable F5 maintenance rules') {
                tasks {
                  sequentialGroup('F5 maintenance for ${erp_sid}') {
                    tasks {
                      createRelease('Remove F5 Maintenance Page iRule') {
                        newReleaseTitle '${release.title} - Remove F5 Maintenance Page iRule'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${erp_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${erp_f5_disable}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${erp_f5_end}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'erp_f5_end'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('F5 maintenance for ${gw_sid}') {
                    tasks {
                      createRelease('Remove F5 Maintenance Page iRule') {
                        newReleaseTitle '${release.title} - Remove F5 Maintenance Page iRule'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${gw_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${gw_f5_disable}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${gw_f5_end}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'f5_bobi_opened'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('F5 maintenance for ${BOBIURL}') {
                    precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True or releaseVariables[\'BW_UNIX_patching\'] == True'
                    tasks {
                      createRelease('Remove F5 Maintenance Page iRule') {
                        newReleaseTitle 'Remove F5 Maintenance Page iRule for ${BOBIURL}'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${BOBI_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${BOBI_f5_disable_maintenance}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${f5_bobi_opened}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'f5_bobi_opened'
                          }
                        }
                      }
                    }
                  }
                  sequentialGroup('F5 maintenance for ${SAPIDM_URL}') {
                    precondition 'releaseVariables[\'SAPIDM_URL\'] != \'\''
                    tasks {
                      createRelease('Remove F5 Maintenance Page iRule') {
                        newReleaseTitle 'Remove F5 Maintenance Page iRule for ${SAPIDM_URL}'
                        template 'F5/F5 Change VIP iRules'
                        templateVariables {
                          stringVariable('host') {
                            label 'F5 Host'
                            description 'The F5 host to call to make the change i.e. usorslb07.chep.com or usorslb09.chep.com'
                            value '${f5_host}'
                          }
                          stringVariable('vip') {
                            label 'VIP'
                            description 'The name of the Virtual Server to change.  This is case-sensitive.  Recommended to just copy/paste name from virtual server list.'
                            value '${SAPIDM_f5_vip}'
                          }
                          stringVariable('rules') {
                            label 'iRule'
                            description 'This should be the COMPLETE quoted and comma separated list of irules to set for the VIP. i.e. "/Common/My_CHEP_Test","/Common/PortfolioUnavailable"'
                            value '${SAPIDM_f5_disable_maintenance}'
                          }
                          stringVariable('slack_channel') {
                            required false
                            description 'Only one channel or person'
                            value '${slack_channel}'
                          }
                          stringVariable('slack_ts') {
                            required false
                            description 'LEAVE THIS FIELD BLANK'
                            value '${slack_ts}'
                          }
                        }
                        createdReleaseId '${f5_SAPIDM_opened}'
                      }
                      gate('Wait for F5 Maint Page') {
                        dependencies {
                          dependency {
                            variable 'f5_SAPIDM_opened'
                          }
                        }
                      }
                    }
                  }
                }
              }
              custom('Notify the F5 rules are back to production use') {
                precondition 'releaseVariables[\'slack_channel\']!=""'
                script {
                  type 'slack.WebAPI'
                  server 'Slack WebAPI as XL-Release'
                  channelin '${slack_channel}'
                  text 'F5 maintenance irules for ${environment} have been removed'
                  attachments '[{"color": "good", "title": "${release.title}", "fields": [{"title": "Scheduled Start Date", "value": "<!date^${releaseStartDateUnix}^{date_short} at {time}|${releaseStartDate}>", "short": true }, {"title": "Status", "value": "F5 maintenance rules for ${environment} have been removed", "short": true }] }]'
                  thread_ts '${slack_ts}'
                }
              }
            }
          }
          sequentialGroup('Notify outage email recipients that the users are now unlocked and that the systems are now available externally as well') {
            tasks {
              custom('Get service interruption end') {
                script {
                  type 'remoteScript.Unix'
                  script 'date +%s'
                  remotePath 
                  output variable('time2')
                  address 'localhost'
                  username '${global.rundeckuser}'
                  privateKey 
                  privateKeyFile '${global.rundeckkeyfile}'
                }
              }
              custom('Calculate') {
                script {
                  type 'remoteScript.Unix'
                  script '#! /bin/bash\n' +
                  'typeset -i difference\n' +
                  'difference=$(expr ${time2} - ${time1})\n' +
                  'echo $difference'
                  remotePath 
                  output variable('difference')
                  address 'localhost'
                  username '${global.rundeckuser}'
                  privateKey 
                  privateKeyFile '${global.rundeckkeyfile}'
                }
              }
              script('seconds to hh:mm:ss:') {
                script (['''\
import datetime
releaseVariables['HumanReadableInterruption']=str(datetime.timedelta(seconds=${difference}))
'''])
              }
              notification('send email (prod environment)') {
                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                addresses '${outage_prod_notification_recipients}'
                subject '${environment} environments have now been unlocked'
                body 'Dear recipients,\n' +
                '\n' +
                'We would like to inform you that the users in ${environment} have now been un-locked and at this stage, the systems are now also accessible externally (i.e. maintenance pages have been removed)\n' +
                '\n' +
                'The service interruption was ${difference} seconds  (${HumanReadableInterruption})\n' +
                '\n' +
                'If you have an XL-Release account, you can review the operations that occured during the outage of ${environment} by going to the following URL : ${release_url}'
                cc '${outage_CC}'
              }
              notification('send email (test environment)') {
                precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                addresses '${outage_test_notification_recipients}'
                subject '${environment} environments have now been unlocked'
                body 'Dear recipients,\n' +
                '\n' +
                'We would like to inform you that the users in ${environment} have now been un-locked and at this stage, the systems are now also accessible externally (i.e. maintenance pages have been removed)\n' +
                '\n' +
                'The service interruption was ${difference} seconds  (${HumanReadableInterruption})\n' +
                '\n' +
                'If you have an XL-Release account, you can review the operations that occured during the outage of ${environment} by going to the following URL : ${release_url}'
                cc '${outage_CC}'
              }
            }
          }
          parallelGroup('Control-M jobs, interfaces, faxes etc.') {
            tasks {
              parallelGroup('Resume Basis monitoring') {
                tasks {
                  createRelease('Resume CCMS alerts for ${erp_sid}') {
                    precondition 'releaseVariables[\'erp_sid\']==\'TST\' or releaseVariables[\'erp_sid\']==\'PRD\''
                    newReleaseTitle 'Resume CCMS alerts for ${erp_sid}'
                    template 'SAP/ABAP/Maintenance mode for CCMS alerts- this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Set or unset the maintenance flag'
                        description 'Set or unset the maintenance flag'
                        possibleValues 'Set', 'Unset'
                        value 'Unset'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      stringVariable('SID') {
                        value '${erp_sid}'
                      }
                      stringVariable('host') {
                        value '${erp_host}'
                      }
                    }
                    createdReleaseId '${ccms_alerts_done}'
                  }
                  createRelease('Resume CCMSping alerts') {
                    precondition 'releaseVariables[\'MonitoredBySolMan\']!=\'\''
                    newReleaseTitle 'Resume CCMSping alerts'
                    template 'SAP/ABAP/Maintenance mode for CCMSping monitoring- this is a template that is used by ABAP environment control - DO NOT USE directly!'
                    templateVariables {
                      listBoxVariable('action') {
                        label 'Set or unset the maintenance flag'
                        description 'Set or unset the maintenance flag'
                        possibleValues 'Set', 'Unset'
                        value 'Unset'
                      }
                      stringVariable('slack_channel') {
                        required false
                        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
                        value '${slack_channel}'
                      }
                      stringVariable('slack_ts') {
                        required false
                        value '${slack_ts}'
                      }
                      listBoxVariable('SolMan_SID') {
                        label 'Solution Manager SID'
                        possibleValues 'CEN', 'SMD', 'SMX'
                        value '${MonitoredBySolMan}'
                      }
                    }
                    createdReleaseId '${ccms_alerts_done}'
                  }
                }
              }
              manual('Check SAP IDM') {
                description 'Make sure IDM is green in your MMC'
                plannedDuration 300
                team 'SAP/Web Admin Team'
                precondition 'releaseVariables[\'Apply_Windows_Patches\'] == True'
              }
              sequentialGroup('Release interfaces, Control-M resources (test systems)') {
                precondition 'releaseVariables[\'environment\']==\'SAP test systems (BW,ERP,Gateway,SRM)\''
                tasks {
                  sequentialGroup('Start interfaces & resume monitor (copy)') {
                    tasks {
                      manual('Resume monitoring for WTX/MQ') {
                        description 'On ${interfaces_server_name}, restart WTX/MQ Monitor by issuing the following command: \n' +
                        '      * rsmon\n' +
                        '\n' +
                        '\n' +
                        'Click the Complete button below to confirm you have now resumed the monitoring\n' +
                        '\n' +
                        'Click the Fail button below to not go further in the outage'
                        plannedDuration 300
                        attachments {
                          attachment("sql:Attachment517371769") {
                            filename "attachments/Attachment517371769-image.png"
                          }
                        }
                        team 'GPM'
                      }
                      parallelGroup('Bring up interfaces') {
                        tasks {
                          manual('Bring interfaces (BW instances) up on ${interfaces_server_name} (test systems)') {
                            description '* On  ${interfaces_server_name} bring up the BW instances: \n' +
                            '      * bwrs'
                            plannedDuration 900
                            team 'GPM'
                            precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True'
                          }
                          manual('Bring interfaces (SAP instances) up on ${interfaces_server_name} (test systems)') {
                            description '* On  ${interfaces_server_name} bring up the SAP instances: \n' +
                            '      * saprs'
                            plannedDuration 900
                            team 'GPM'
                            precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                          }
                        }
                      }
                    }
                  }
                  parallelGroup('Release resources') {
                    tasks {
                      sequentialGroup('Release WW-SAP-SYSTEM (also includes jobs for Streamserve)') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          createRelease('Release WW-SAP-SYSTEM') {
                            newReleaseTitle 'Release WW-SAP-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Test'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-SAP-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_sap_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_sap_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-DQS-SYSTEM') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          createRelease('Release WW-DQS-SYSTEM') {
                            newReleaseTitle 'Release WW-DQS-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Test'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-DQS-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_dqs_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_dqs_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-BW-SYSTEM') {
                        precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True'
                        tasks {
                          createRelease('Release WW-BW-SYSTEM') {
                            newReleaseTitle 'Release WW-BW-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Test'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-BW-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_bw_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_bw_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-SRM-SYSTEM') {
                        precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                        tasks {
                          createRelease('Release WW-SRM-SYSTEM') {
                            newReleaseTitle 'Release WW-SRM-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Test'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-SRM-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_srm_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_srm_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release STOP_CSO') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          createRelease('Release STOP_CSO') {
                            newReleaseTitle 'Release STOP_CSO'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Test'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'STOP_CSO'
                              }
                            }
                            createdReleaseId '${ctm_cso_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_cso_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-GATEWAY-SYSTEM') {
                        precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                        tasks {
                          createRelease('Release WW-GATEWAY-SYSTEM') {
                            newReleaseTitle 'Release WW-GATEWAY-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Test'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-GATEWAY-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_gw_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_gw_released'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  manual('Confirm resources have all been set to 9999') {
                    description 'Please acknowledge that the following Control-M resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} have all been set to 9999 successfully (you should have received 4 emails from XL-Release showing the new resource values as well)\n' +
                    '\n' +
                    '* STOP_CSO\n' +
                    '*  ${erp_ControlM-Resources}  (also includes jobs for Streamserve)\n' +
                    '* ${bw_ControlM-Resources}\n' +
                    '* ${srm_ControlM-Resources}\n' +
                    '\n' +
                    '\n' +
                    'Click the Complete button below to confirm resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} have been released\n' +
                    '\n' +
                    'Click the Fail button below to not go further in the outage'
                    plannedDuration 300
                    team 'GPM'
                  }
                }
              }
              sequentialGroup('Release interfaces, Control-M resources & invoicing job steps (production systems)') {
                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
                tasks {
                  sequentialGroup('Start interfaces & resume monitor') {
                    tasks {
                      parallelGroup('Bring up interfaces (copy)') {
                        tasks {
                          manual('Bring interfaces (BW instances) up on ${interfaces_server_name} (production systems)') {
                            description '* On  ${interfaces_server_name} bring up the BW instances: \n' +
                            '      * bwrs'
                            plannedDuration 900
                            team 'DC-Ops Team'
                            precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True'
                          }
                          manual('Bring interfaces (SAP instances) up on ${interfaces_server_name} (production systems)') {
                            description '* On  ${interfaces_server_name} bring up the SAP instances: \n' +
                            '      * saprs'
                            plannedDuration 900
                            team 'DC-Ops Team'
                            precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                          }
                        }
                      }
                      manual('DC-OPS : resume monitoring for WTX/MQ') {
                        description 'On ${interfaces_server_name}, restart WTX/MQ Monitor by issuing the following command: \n' +
                        '      * rsmon\n' +
                        '\n' +
                        '\n' +
                        'Click the Complete button below to confirm you have now resumed the monitoring\n' +
                        '\n' +
                        'Click the Fail button below to not go further in the outage'
                        plannedDuration 300
                        attachments {
                          attachment("sql:Attachment517371769") {
                            filename "attachments/Attachment517371769-image.png"
                          }
                        }
                        team 'DC-Ops Team'
                      }
                    }
                  }
                  parallelGroup('Release resources') {
                    tasks {
                      sequentialGroup('Release WW-SAP-SYSTEM (also includes jobs for Streamserve)') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          createRelease('Release WW-SAP-SYSTEM') {
                            newReleaseTitle 'Release WW-SAP-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Production'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-SAP-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_sap_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_sap_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-BW-SYSTEM') {
                        precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'reboot_BW\'] == True'
                        tasks {
                          createRelease('Release WW-BW-SYSTEM') {
                            newReleaseTitle 'Release WW-BW-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Production'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-BW-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_bw_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_bw_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-SRM-SYSTEM') {
                        precondition 'releaseVariables[\'restart_SRM\'] == True or releaseVariables[\'reboot_SRM\'] == True'
                        tasks {
                          createRelease('Release WW-SRM-SYSTEM') {
                            newReleaseTitle 'Release WW-SRM-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Production'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-SRM-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_srm_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_srm_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release STOP_CSO') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          createRelease('Release STOP_CSO') {
                            newReleaseTitle 'Release STOP_CSO'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Production'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'STOP_CSO'
                              }
                            }
                            createdReleaseId '${ctm_cso_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_cso_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-GATEWAY-SYSTEM') {
                        precondition 'releaseVariables[\'restart_GW\'] == True or releaseVariables[\'reboot_GW\'] == True'
                        tasks {
                          createRelease('Release WW-GATEWAY-SYSTEM') {
                            newReleaseTitle 'Release WW-GATEWAY-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Production'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-GATEWAY-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_gw_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_gw_released'
                              }
                            }
                          }
                        }
                      }
                      sequentialGroup('Release WW-DQS-SYSTEM') {
                        precondition 'releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True'
                        tasks {
                          createRelease('Release WW-DQS-SYSTEM') {
                            newReleaseTitle 'Release WW-DQS-SYSTEM'
                            template 'BMC/Control-M set resources (Do not call directly - this is designed to be call from ABAP environment control template!)'
                            templateVariables {
                              stringVariable('slack_channel') {
                                required false
                                value '${slack_channel}'
                              }
                              stringVariable('slack_ts') {
                                required false
                                value '${slack_ts}'
                              }
                              listBoxVariable('action') {
                                label 'Action'
                                possibleValues 'Suspend', 'Release'
                                value 'Release'
                              }
                              listBoxVariable('CTMEnvironment') {
                                label 'Control-M environment'
                                possibleValues 'Test', 'Production'
                                value 'Production'
                              }
                              listBoxVariable('CTMResourceName') {
                                label 'Control-M resource name'
                                possibleValues 'STOP_CSO', 'WW-SRM-SYSTEM', 'WW-SAP-SYSTEM', 'WW-BW-SYSTEM', 'WW-FKEEN-SYSTEM', 'WW-PORTFOLIO-SYSTEM', 'WW-GATEWAY-SYSTEM', 'WW-DQS-SYSTEM'
                                value 'WW-DQS-SYSTEM'
                              }
                            }
                            createdReleaseId '${ctm_dqs_released}'
                          }
                          gate('wait for Control-M resource control') {
                            dependencies {
                              dependency {
                                variable 'ctm_dqs_released'
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  manual('Confirm resources have all been set to 9999') {
                    description 'Please acknowledge that the following Control-M resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid} have all been set to 9999 successfully (you should have received 4 emails from XL-Release showing the new resource values as well)\n' +
                    '\n' +
                    '* STOP_CSO\n' +
                    '*  ${erp_ControlM-Resources}  (also includes jobs for Streamserve)\n' +
                    '* ${bw_ControlM-Resources}\n' +
                    '* ${srm_ControlM-Resources}\n' +
                    '* WW-GATEWAY-SYSTEM\n' +
                    '* WW-DQS-SYSTEM\n' +
                    '\n' +
                    '\n' +
                    'Click the Complete button below to confirm resources for SAP ${erp_sid} , ${bw_sid} , ${srm_sid}, ${gw_sid} have been released\n' +
                    '\n' +
                    'Click the Fail button below to not go further in the outage'
                    plannedDuration 300
                    team 'DC-Ops Team'
                  }
                  manual('DC-OPS : On SAP ${erp_sid}, Change the following invoice jobs, depending on time (before or after new day):') {
                    description 'DC-OPS : On SAP ${erp_sid}, Change the following invoice jobs, depending on time (before or after new day):\n' +
                    'Change the following invoice jobs, depending on time (before or after new day):\n' +
                    '* INVAF_INV_PRE_PROCESSING\n' +
                    '* INVAM_INV_PRE_PROCESSING\n' +
                    '* INVAP_INV_PRE_PROCESSING \n' +
                    '* INVEA_INV_PRE_PROCESSING\n' +
                    '* INVEU_INV_PRE_PROCESSING\n' +
                    '* INVEI_INV_PRE_PROCESSING\n' +
                    '* INVUS_INV_PRE_PROCESSING\n' +
                    '* INVSM_INV_PRE_PROCESSING'
                    plannedDuration 1200
                    team 'DC-Ops Team'
                  }
                  manual('DC-OPS : On SAP ${erp_sid}, complete the following for job:  ZASAPOL360-DEPOT_WO_CREATE') {
                    description 'DC-OPS : On SAP ${erp_sid}, complete the following for job:  ZASAPOL360-DEPOT_WO_CREATE \n' +
                    'Complete the following for job:  ZASAPOL360-DEPOT_WO_CREATE \n' +
                    '* If before new day, verify the job runs.\n' +
                    '* If after new day, create an Incident and assign it to CHEP-SAP O&L.  Email a copy of the IR to CHEP SAP Apps OL, Euronica Olivier, Lise Joubert and CHEP GPM SAP.  The transactions will need to be rerun manually as a rerun NOT done on Saturday GMT require specific dates to be entered into the variant.'
                    plannedDuration 300
                    team 'DC-Ops Team'
                  }
                  manual('DC-OPS : On SAP ${erp_sid}, check for any canceled SAP production batch jobs') {
                    description 'DC-OPS : On SAP ${erp_sid}, check for any canceled SAP production batch jobs'
                    plannedDuration 600
                    team 'DC-Ops Team'
                  }
                  manual('DC-OPS : On SAP ${erp_sid}, verify no SAP production jobs are in a "Scheduled" state.') {
                    description 'DC-OPS : On SAP ${erp_sid}, verify no SAP production jobs are in a "Scheduled" state.'
                    plannedDuration 300
                    team 'DC-Ops Team'
                  }
                }
              }
              manual('Rightfax') {
                description 'Please contact the IT Messaging Team to restart Rightfax\n' +
                'Please mark the strep complete once the IT Messaging team has restarted Rightfax'
                plannedDuration 300
                team 'Service Management Team'
                precondition 'releaseVariables[\'erp_sid\'] == \'PRD\''
              }
              manual('Please start the process chains in ${bw_sid}') {
                description 'Click the Complete button once you have started process chains in ${bw_sid} \n' +
                '\n' +
                'Click the Fail button below to not go further in the outage'
                plannedDuration 1200
                team 'BW Technical Team'
              }
              manual('Validate BO BI Launchpad ${BOBIURL}') {
                description 'Please validate BO BI Launchpad ${BOBIURL}\n' +
                '\n' +
                'Logon to ${BOBIURL} and authenticate using your SAP ${bw_sid} credentials.\n' +
                'If this doesn\'t work, please fix the problem.\n' +
                '\n' +
                'Wiki page : https://chepdev.jira.com/wiki/spaces/SWAT/pages/159611524/SAP+Business+Objects+BI+Enterprise'
                plannedDuration 180
                team 'SAP/Web Admin Team'
                precondition 'releaseVariables[\'restart_BW\'] == True or releaseVariables[\'StopStartHANA\'] == True or releaseVariables[\'reboot_BW\'] == True'
              }
              manual('Verify Trax services') {
                description 'Please login as system user in  http://trax.chep.com using Chrome browser\n' +
                'in the left  menu, go to Service > Service and check that all services status is STARTED\n' +
                '\n' +
                'If STOPPED, please notify:\n' +
                '\n' +
                '* Sean Ascott-Evans,  <Sean.Ascott-Evans@brambles.com>\n' +
                '* Myburgh van Aswegen  <Myburgh.Vanaswegen@brambles.com> \n' +
                '* Nadeesh Warnakula <Nadeesh.Warnakula@brambles.com>'
                plannedDuration 300
                team 'SAP/Web Admin Team'
                precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
              }
              notification('Notify Venkat Pusapati to check connectivity to the TF Client for Invoiceware (only  for production environment)') {
                precondition '(releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\')  and (releaseVariables[\'restart_ERP\'] == True or releaseVariables[\'reboot_ERP\'] == True)'
                addresses 'Venkata.Pusapati@brambles.com'
                subject 'Please check connectivity to the TF Client for Invoiceware production'
                body 'Please check connectivity to the TF Client for Invoiceware production.'
                cc 'DL-HCLServiceMgt@CHEP.com', 'DL-SAPWebAdmin@CHEP.com'
              }
            }
          }
        }
      }
      phase('End of outage') {
        color '#009CDB'
        tasks {
          manual('Complete the Outage, Implementation or Upgrade Notification procedure.') {
            description 'Complete the Outage, Implementation or Upgrade Notification procedure.'
            team 'Service Management Team'
            precondition 'releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
          }
          custom('Notify Complete') {
            precondition 'releaseVariables[\'slack_channel\']!=\'\''
            script {
              type 'slack.WebAPI'
              server 'Slack WebAPI as XL-Release'
              channelin '${slack_channel}'
              text 'Template: SAP ABAP Environment Control'
              attachments '[{"color": "good", "title": "${release.title} - ${action_full_name} ${environment}", "fields": [{"title": "Environment", "value": "${environment}", "short": true }, {"title": "Action", "value": "Outage", "short": true }, {"title": "Status", "value": "COMPLETE", "short": true }] }]'
              thread_ts '${slack_ts}'
            }
          }
          custom('Notify Complete (not in thread)') {
            precondition 'releaseVariables[\'slack_channel\']!=\'\''
            script {
              type 'slack.WebAPI'
              server 'Slack WebAPI as XL-Release'
              channelin '${slack_channel}'
              text 'Template: SAP ABAP Environment Control'
              attachments '[{"color": "good", "title": "${release.title} - ${action_full_name} ${environment}", "fields": [{"title": "Environment", "value": "${environment}", "short": true }, {"title": "Action", "value": "Outage", "short": true }, {"title": "Status", "value": "COMPLETE", "short": true }] }]'
              thread_ts 
            }
          }
          parallelGroup('ERP upgrade scenario') {
            precondition 'releaseVariables[\'ERP_upgrade\'] == True and releaseVariables[\'environment\']==\'SAP production systems (BW,ERP,Gateway,SRM)\''
            tasks {
              manual('Ensure DB stats for big tables have finished being gathered (SAP upgrade scenario)') {
                description 'Ensure DB stats for big tables have finished being gathered'
                plannedDuration 57600
                team 'SAP/Web Admin Team'
                precondition 
              }
              manual('Rebuild usdc2up12 ${erp_sid} standby (ERP upgrade scenario)') {
                description 'Rebuild usdc2up12 ${erp_sid} standby'
                plannedDuration 57600
                team 'Oracle DBA Team'
                precondition 
              }
            }
          }
        }
      }
    }
    extensions {
      dashboard('Dashboard') {
        tiles {
          releaseProgressTile('Release progress') {
            
          }
          releaseHealthTile('Release health') {
            
          }
          releaseSummaryTile('Release summary') {
            
          }
          resourceUsageTile('Resource usage') {
            
          }
          timelineTile('Release timeline') {
            
          }
        }
      }
    }
    
  }
}