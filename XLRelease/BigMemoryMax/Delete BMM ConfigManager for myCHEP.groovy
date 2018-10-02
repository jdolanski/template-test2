// Exported from:        http://xlrelease.chep.com/#/templates/Folder986783431-Release479335926/releasefile
// XL Release version:   8.5.0-SNAPSHOT
// Date created:         Tue Oct 02 14:13:11 CEST 2018

xlr {
  template('Delete BMM ConfigManager for myCHEP') {
    folder('BigMemoryMax')
    variables {
      listBoxVariable('cachemanager') {
        label 'BMM CacheManager'
        possibleValues 'ehcache-bigmemorymax-config-myd-1b-striped', 'ehcache-bigmemorymax-config-myc-1b-striped', 'ehcache-bigmemorymax-config-myt-1b-striped', 'ehcache-bigmemorymax-config-myp-striped'
        value 'ehcache-bigmemorymax-config-myd-1b-striped'
      }
      stringVariable('bmm_host_override') {
        required false
        description 'Only if you want to connect to a specific BMM host to perform the action.'
      }
      stringVariable('slack_channel') {
        required false
        description 'Examples: #sap_web-admin OR @russell.milliner OR leave blank for no Slack messages'
        value '#sap_web-admin'
      }
      stringVariable('slack_ts') {
        required false
        description 'LEAVE THIS FIELD BLANK'
      }
      stringVariable('host') {
        required false
        showOnReleaseStart false
        label 'SAP Host'
        description 
      }
      stringVariable('bmm_host') {
        required false
        showOnReleaseStart false
        label 'BMM Host'
        description 'This is just the host to connect to.  It deletes the cachemanager for the whole cluster.'
        value 'usdcvlt005.chep.com'
      }
      stringVariable('output') {
        required false
        showOnReleaseStart false
      }
      stringVariable('err') {
        required false
        showOnReleaseStart false
      }
      stringVariable('unix') {
        required false
        showOnReleaseStart false
        label 'SAP Unix User'
      }
      stringVariable('stop_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('start_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('color') {
        showOnReleaseStart false
        value 'good'
      }
      stringVariable('sapcontrol_stop_complete') {
        required false
        showOnReleaseStart false
      }
      integerVariable('sap_server_check') {
        required false
        showOnReleaseStart false
      }
      stringVariable('get_sap_check') {
        required false
        showOnReleaseStart false
      }
      stringVariable('application_state_err') {
        required false
        showOnReleaseStart false
      }
      stringVariable('application_state_out') {
        required false
        showOnReleaseStart false
      }
      stringVariable('shutdown_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('sid') {
        required false
        showOnReleaseStart false
      }
      stringVariable('startup_complete') {
        required false
        showOnReleaseStart false
      }
      stringVariable('clustername') {
        showOnReleaseStart false
        value 'MyCHEP'
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2017-01-12T15:00:00+0100')
    tags 'mychep', 'bigmemorymax', 'bmm'
    scriptUsername 'admin'
    scriptUserPassword '{b64}C0SqJ8Ewz++2uNODwygGKQ=='
    phases {
      phase('Initialize') {
        color '#009CDB'
        tasks {
          script('Set Variables') {
            script (['''\
if releaseVariables['cachemanager'] == 'ehcache-bigmemorymax-config-myt-1b-striped':
    releaseVariables['bmm_host']='usdcvlt005'
    releaseVariables['host']='usdcvlt008.chep.com'
    releaseVariables['unix']='mytadm'
    releaseVariables['sid']='MYT'

elif releaseVariables['cachemanager'] == 'ehcache-bigmemorymax-config-myc-1b-striped':
    releaseVariables['bmm_host']='usdcvlt005'
    releaseVariables['host']='usdcvlt017.chep.com'
    releaseVariables['unix']='mycadm'
    releaseVariables['sid']='MYC'

elif releaseVariables['cachemanager'] == 'ehcache-bigmemorymax-config-myd-1b-striped':
    releaseVariables['bmm_host']='usdcvlt005'
    releaseVariables['host']='usdcvlt007.chep.com'
    releaseVariables['unix']='mydadm'
    releaseVariables['sid']='MYD'

elif releaseVariables['cachemanager'] == 'ehcache-bigmemorymax-config-myp-striped':
    releaseVariables['clustername']='MyCHEPProd'
    releaseVariables['bmm_host']='usdcvlp012'
    releaseVariables['host']='usdcvlp020.chep.com'
    releaseVariables['unix']='mypadm'
    releaseVariables['sid']='MYP'

else:
    raise Exception("No BMM Cache Manager configuration matched")

if releaseVariables['bmm_host_override']!='':
    releaseVariables['bmm_host']=releaseVariables['bmm_host_override']
'''])
          }
          createRelease('Get SAP Server Check Value') {
            newReleaseTitle '${release.title} - Get SAP Server Check Value'
            template 'SAP/Java/SAP startsap check code'
            templateVariables {
              stringVariable('host') {
                value '${host}'
              }
              stringVariable('sudo') {
                value '${unix}'
              }
            }
            createdReleaseId '${get_sap_check}'
          }
          gate('Wait for SAP Server Check Value') {
            dependencies {
              dependency {
                variable 'get_sap_check'
              }
            }
          }
          script('Set sap_server_check variable') {
            script (['''\
for varstr in releaseApi.getVariables(releaseVariables['get_sap_check']):
    var = releaseApi.getVariable(str(varstr))
    print("key: " + var.key)
    print("value: " + str(var.value))
    if var.key == 'sap_check_value':
        releaseVariables['sap_server_check'] = int(var.value)
'''])
          }
          custom('Start Thread') {
            precondition 'releaseVariables[\'slack_ts\']==\'\' and releaseVariables[\'slack_channel\']!=\'\''
            script {
              type 'slack.WebAPI'
              server 'Slack WebAPI as XL-Release'
              channelin '${slack_channel}'
              text 'Template: Delete BMM ConfigManager for myCHEP'
              attachments '[{"color": "${color}", "title": "${release.title} - BMM CacheManager Delete", "fields": [{"title": "CacheManager", "value": "${cachemanager}"}, {"title": "Status", "value": "See Replies", "short": true }, {"title": "Owner", "value": "${release.owner}", "short": true }] }]'
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
              text 'Template: Delete BMM ConfigManager for myCHEP'
              attachments '[{"color": "${color}", "title": "${release.title} - BMM CacheManager Delete", "fields": [{"title": "CacheManager", "value": "${cachemanager}"}, {"title": "Status", "value": "DELETING", "short": true }, {"title": "SAP Server Check", "value": "${sap_server_check}", "short": true }, {"title": "Owner", "value": "${release.owner}", "short": true }] }]'
              thread_ts '${slack_ts}'
            }
          }
        }
      }
      phase('Stop mychep-core') {
        color '#009CDB'
        tasks {
          sequentialGroup('If SAP Server Up') {
            precondition 'releaseVariables[\'sap_server_check\'] == 32 or releaseVariables[\'sap_server_check\'] == 34 or releaseVariables[\'sap_server_check\'] == 38'
            tasks {
              createRelease('Stop mychep-core') {
                newReleaseTitle '${release.title} - Stop mychep-core on ${host}'
                template 'SAP/Java/SAP SAPControl'
                templateVariables {
                  stringVariable('host') {
                    label 'Unix host with sapcontrol'
                    value '${host}'
                  }
                  stringVariable('unix') {
                    label 'Unix user to run command as'
                    value '${unix}'
                  }
                  stringVariable('instance') {
                    label 'Instance'
                    value '00'
                  }
                  stringVariable('function') {
                    label 'SAPControl Function'
                    value 'J2EEControlComponents'
                  }
                  stringVariable('parameters') {
                    required false
                    label 'Parameters to pass the function'
                    value 'all stop Application chep.com/mychep-core'
                  }
                }
                createdReleaseId '${sapcontrol_stop_complete}'
              }
              gate('Wait for sapcontrol_stop_complete') {
                dependencies {
                  dependency {
                    variable 'sapcontrol_stop_complete'
                  }
                }
              }
              custom('Wait for Application State Stopped') {
                script {
                  type 'remoteScript.Unix'
                  script '/bin/hug -f /apps/xebialabs/scripts/sapcontrol_gateway.hug -c WaitForComponentStatus --host ${host} --componentName chep.com/mychep-core --status stopped --tries 60'
                  output variable('application_state_out')
                  err variable('application_state_err')
                  address 'localhost'
                  username '${global.rundeckuser}'
                  privateKeyFile '${global.rundeckkeyfile}'
                }
              }
            }
          }
        }
      }
      phase('Shutdown Environment if App stop failed') {
        color '#009CDB'
        tasks {
          sequentialGroup('Shutdown Environment') {
            precondition 'releaseVariables[\'application_state_err\'] == \'Number of tries exceeded\''
            tasks {
              createRelease('Shutdown Environment') {
                newReleaseTitle '${release.title} - Shutdown Environment'
                template 'SAP/Java/SAP Environment Control'
                templateVariables {
                  listBoxVariable('environment') {
                    label 'Environment'
                    possibleValues 'PLP', 'usdcvlp100', 'usdcvlp101', 'PLT', 'usdcvlt087', 'usdcvlt088', 'PLQ', 'PLC', 'PLD', 'PLX', 'BLP', 'usdcvlp102', 'usdcvlp103', 'BLT', 'BLQ', 'BLC', 'BLD', 'BLX', 'MYP', 'my-prd01', 'my-prd02', 'my-prd03', 'MYT', 'my-tst01', 'my-tst02', 'my-tst03', 'MYQ', 'MYC', 'MYD', 'MYX', 'PlantsPRD', 'ESP_Prod', 'ESP_Test'
                    value '${sid}'
                  }
                  listBoxVariable('action') {
                    label 'Action'
                    possibleValues 'check', 'Restart J2EE', 'Restart J2EE with Start Apps', 'Restart J2EE with Maint and Start Apps', 'Restart J2EE/SCS with Maint and Start Apps', 'Shutdown', 'Startup', 'Start Applications', 'Startup and Start Apps', 'Enable Maintenance Page', 'Disable Maintenance Page', 'Clear Akamai Cache', 'Clear BMM Cache', 'Environment Validation'
                    value 'Shutdown'
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
                createdReleaseId '${shutdown_complete}'
              }
              gate('Wait for Shutdown Environment') {
                dependencies {
                  dependency {
                    variable 'shutdown_complete'
                  }
                }
              }
            }
          }
        }
      }
      phase('Delete BMM ConfigManager') {
        color '#009CDB'
        tasks {
          custom('Delete CacheManager') {
            script {
              type 'remoteScript.Unix'
              script '#!/usr/bin/python\n' +
              'import requests,json\n' +
              '\n' +
              'url = "http://${bmm_host}:9889/tmc/api/v2/agents;ids=${clustername}/clusters/cacheManagers;names=${cachemanager}"\n' +
              'r = requests.get(url)\n' +
              'print r\n' +
              'print r.text\n' +
              '\n' +
              '\n' +
              'token = r.headers[\'owasp_csrftoken\']\n' +
              'headers = { \'X-Requested-With\': \'OWASP CSRFGuard Project\', \'OWASP_CSRFTOKEN\': token }\n' +
              'r2 = requests.delete(url,cookies=r.cookies,headers=headers)\n' +
              'print r2\n' +
              'print r2.text'
              output variable('output')
              err variable('err')
              address 'localhost'
              username '${global.rundeckuser}'
              privateKeyFile '${global.rundeckkeyfile}'
            }
          }
        }
      }
      phase('Startup Environment if App stop failed') {
        color '#009CDB'
        tasks {
          sequentialGroup('Startup Environment') {
            precondition 'releaseVariables[\'application_state_err\'] == \'Number of tries exceeded\''
            tasks {
              createRelease('Startup Environment') {
                newReleaseTitle '${release.title} - Startup Environment'
                template 'SAP/Java/SAP Environment Control'
                templateVariables {
                  listBoxVariable('environment') {
                    label 'Environment'
                    possibleValues 'PLP', 'usdcvlp100', 'usdcvlp101', 'PLT', 'usdcvlt087', 'usdcvlt088', 'PLQ', 'PLC', 'PLD', 'PLX', 'BLP', 'usdcvlp102', 'usdcvlp103', 'BLT', 'BLQ', 'BLC', 'BLD', 'BLX', 'MYP', 'my-prd01', 'my-prd02', 'my-prd03', 'MYT', 'my-tst01', 'my-tst02', 'my-tst03', 'MYQ', 'MYC', 'MYD', 'MYX', 'PlantsPRD', 'ESP_Prod', 'ESP_Test'
                    value '${sid}'
                  }
                  listBoxVariable('action') {
                    label 'Action'
                    possibleValues 'check', 'Restart J2EE', 'Restart J2EE with Start Apps', 'Restart J2EE with Maint and Start Apps', 'Restart J2EE/SCS with Maint and Start Apps', 'Shutdown', 'Startup', 'Start Applications', 'Startup and Start Apps', 'Enable Maintenance Page', 'Disable Maintenance Page', 'Clear Akamai Cache', 'Clear BMM Cache', 'Environment Validation'
                    value 'Restart J2EE with Start Apps'
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
                createdReleaseId '${startup_complete}'
              }
              gate('Wait for Startup Environment') {
                dependencies {
                  dependency {
                    variable 'startup_complete'
                  }
                }
              }
            }
          }
        }
      }
      phase('Start mychep-core') {
        color '#009CDB'
        tasks {
          sequentialGroup('If SAP Server Up') {
            precondition 'releaseVariables[\'sap_server_check\'] == 32 or releaseVariables[\'sap_server_check\'] == 34 or releaseVariables[\'sap_server_check\'] == 38 and releaseVariables[\'application_state_err\'] != \'Number of tries exceeded\''
            tasks {
              createRelease('Start mychep-core') {
                newReleaseTitle '${release.title} - Start mychep-core on ${host}'
                template 'SAP/Java/SAP SAPControl'
                templateVariables {
                  stringVariable('host') {
                    label 'Unix host with sapcontrol'
                    value '${host}'
                  }
                  stringVariable('unix') {
                    label 'Unix user to run command as'
                    value '${unix}'
                  }
                  stringVariable('instance') {
                    label 'Instance'
                    value '00'
                  }
                  stringVariable('function') {
                    label 'SAPControl Function'
                    value 'J2EEControlComponents'
                  }
                  stringVariable('parameters') {
                    required false
                    label 'Parameters to pass the function'
                    value 'all start Application chep.com/mychep-core'
                  }
                }
                createdReleaseId '${start_complete}'
              }
              gate('Wait for Start to complete') {
                dependencies {
                  dependency {
                    variable 'start_complete'
                  }
                }
              }
              custom('Wait for Application State running') {
                attachments {
                  attachment("sql:Attachment115363418") {
                    filename "attachments/Attachment115363418-blob"
                  }
                }
                script {
                  type 'remoteScript.Unix'
                  script '/bin/hug -f /apps/xebialabs/scripts/sapcontrol_gateway.hug -c WaitForComponentStatus --host ${host} --componentName chep.com/mychep-core --status running'
                  address 'localhost'
                  username '${global.rundeckuser}'
                  privateKeyFile '${global.rundeckkeyfile}'
                }
              }
            }
          }
        }
      }
      phase('Complete') {
        color '#009CDB'
        tasks {
          custom('Notify Complete') {
            precondition 'releaseVariables[\'slack_channel\']!=\'\''
            script {
              type 'slack.WebAPI'
              server 'Slack WebAPI as XL-Release'
              channelin '${slack_channel}'
              text 'Template: Delete BMM ConfigManager for myCHEP'
              attachments '[{"color": "${color}", "title": "${release.title} - BMM CacheManager Delete", "fields": [{"title": "CacheManager", "value": "${cachemanager}"}, {"title": "Status", "value": "COMPLETE", "short": true }] }]'
              thread_ts '${slack_ts}'
            }
          }
        }
      }
    }
    
  }
}