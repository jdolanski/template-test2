// Exported from:        http://Jans-MacBook-Pro.local:5516/#/templates/Release70475d98571843b683feeb04c0a017db/releasefile
// XL Release version:   8.5.0-rc.3
// Date created:         Tue Dec 04 13:20:34 CET 2018

xlr {
  template('template0') {
    variables {
      stringVariable('var1') {
        value 'v1'
      }
    }
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-12-04T09:00:00+0100')
    phases {
      phase('New Phase') {
        tasks {
          manual('t1') {
            
          }
          createRelease('t2') {
            facets {
              facet {
                type 'udm.DeploymentTaskFacet'
                applicationId 'Configuration/environmentManagement/Applicationba6b760ee0f546e1bf765d8749d41a61'
                environmentId 'Configuration/environmentManagement/Environmentac5cf5ad9fd04556b062803631d04136'
                version 'v1'
              }
            }
            checkAttributes true
            newReleaseTitle 'test'
            template 'f1/f12/t1_f12'
            folder 'f1/f11'
            templateVariables {
              listBoxVariable('appvar1') {
                // no DSL renderer found for xlrelease.ApplicationValueProvider
                value 'Configuration/environmentManagement/Applicationfb9aac983ec54bcb86e7d6f2a11581b8'
              }
              listBoxVariable('envvar1') {
                // no DSL renderer found for xlrelease.EnvironmentValueProvider
                value 'Configuration/environmentManagement/Environmentade25137c5544aa7b03e4f7af8f21bee'
              }
              listBoxVariable('lbsimple1') {
                possibleValues 'a', 'b', 'c', 'd'
                value 'b'
              }
              listVariable('list1') {
                value 'a', 'b', 'c', 'h'
              }
              listBoxVariable('lbreference1') {
                possibleValues variable('list1')
                value 'h'
              }
            }
            releaseTags 'tag1', 'tag2'
          }
          manual('t3') {
            facets {
              facet {
                type 'udm.DeploymentTaskFacet'
                applicationId 'Configuration/environmentManagement/Applicationfb9aac983ec54bcb86e7d6f2a11581b8'
                environmentId 'Configuration/environmentManagement/Environmentade25137c5544aa7b03e4f7af8f21bee'
                version 'v8'
              }
              facet {
                type 'udm.DeploymentTaskFacet'
                applicationId 'Configuration/environmentManagement/Applicationfb9aac983ec54bcb86e7d6f2a11581b8'
                environmentId 'Configuration/environmentManagement/Environmentade25137c5544aa7b03e4f7af8f21bee'
                version 'v1'
              }
            }
            checkAttributes true
          }
        }
      }
    }
    releaseTriggers {
      timeSchedule('trigger1') {
        releaseTitle 'rfromtrig1'
        variables {
          stringVariable('var1') {
            value 'v38'
          }
        }
        pollType com.xebialabs.xlrelease.domain.PollType.REPEAT
        periodicity '10'
        enabled false
      }
    }
    teams {
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_precondition', 'template#edit_security', 'template#create_release', 'template#edit_failure_handler'
      }
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#reassign_task', 'release#edit_security', 'release#view', 'release#lock_task', 'release#start', 'release#edit_blackout', 'template#view', 'release#edit_failure_handler', 'release#abort', 'release#edit_task'
      }
    }
  }
}