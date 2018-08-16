// Exported from:        http://Jans-MBP:5516/#/templates/Folder93e73c510da046eb9ba5b8b67b2d735e-Folder680e69260cc0424c8b7a7aa99fb828bc-Release7746b56e967c4b1eb252d9b47cdd8141/releasefile
// XL Release version:   8.1.0-SNAPSHOT
// Date created:         Thu Aug 16 14:47:36 CEST 2018

xlr {
  template('templateDemo') {
    folder('Folder1/Folder12')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-08-16T09:00:00+0200')
    phases {
      phase('New Phase') {
        tasks {
          externalScript('t1') {
            
          }
          manual('t2') {
            
          }
          manual('a') {
            
          }
          manual('b') {
            
          }
          manual('v') {
            
          }
        }
      }
      phase('New Phase') {
        tasks {
          externalScript('t1') {
            
          }
          manual('t2') {
            
          }
          manual('a') {
            
          }
          manual('b') {
            
          }
          manual('v') {
            
          }
        }
      }
    }
    
  }
}