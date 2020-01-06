dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.postgresql.Driver"
//local
//password = "postgres"
   
//RB_LEMERY
  username = "postgres"
 password = "postgres"
	  
	 // NRBSL_LIVE
    // username = "postgres"
     // password = "microbanker"
	
    
    //  NRBSL_Backup
      //  username = "postgres"
       //  password = "microbanker"
       
     //ATM_BMB
        // username = "postgres"
        // password = "postgres"
        
        //MB_PHIL
        // username = "postgres"
        // password = "postgres"
        
	
}
hibernate {
    cache.use_second_level_cache = true
    cache.us//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
       //url = "jdbc:postgresql://localhost:5433/MACTAN"
       
       // this is PROD
           // url = "jdbc:postgresql://192.168.0.3:5432/ICBS_NRBSL_PROD"
            
           // url = "jdbc:postgresql://localhost:5433/lemerytestof5years"
	    // url = "jdbc:postgresql://localhost:5432/08042017"//
            // url = "jdbc:postgresql://localhost:5433/Regression_ATM"
	    // url = "jdbc:postgresql://192.168.0.200:5432/NRBSL_EOM_TESTING" //aje
            // url = "jdbc:postgresql://localhost:5432/reclassRetestings"
            //url = "jdbc:postgresql://10.252.241.190:5432/ICBS_ATM"
//             url = "jdbc:postgresql://192.168.254.146:5432/icbs"  //LEMERY PROD
//                  url = "jdbc:postgresql://192.168.254.146:5432/icbs"
//                url = "jdbc:postgresql://localhost:5433/lemery" 
//  url = "jdbc:postgresql://192.168.0.4:7477/max_icbs"  
                 url = "jdbc:postgresql://192.168.0.27:5432/maxbank"  
               
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            //url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            //url = "jdbc:postgresql://localhost:5433/MACTAN"
            //   url = "jdbc:postgresql://192.168.0.3:5432/startofyeartesting2"
            // url = "jdbc:postgresql://localhost:5432/08042017"
       
       // this is PROD
           // url = "jdbc:postgresql://192.168.0.3:5432/ICBS_NRBSL_PROD"
            
           // url = "jdbc:postgresql://localhost:5433/lemerytestof5years"
	    // url = "jdbc:postgresql://localhost:5432/08042017"//
            // url = "jdbc:postgresql://localhost:5433/Regression_ATM"
	    // url = "jdbc:postgresql://192.168.0.200:5432/NRBSL_EOM_TESTING" //aje
            // url = "jdbc:postgresql://localhost:5432/reclassRetestings"
            //url = "jdbc:postgresql://10.252.241.190:5432/ICBS_ATM"
          //  url = "jdbc:postgresql://192.168.254.146:5432/test"  //LEMERY PROD
//                  url = "jdbc:postgresql://192.168.254.146:5432/icbs"
//                 url = "jdbc:postgresql://localhost:5433/lemery"  
//                        url = "jdbc:postgresql://192.168.0.4:7477/max_icbs"  
url = "jdbc:postgresql://192.168.0.27:5432/maxbank"
//                 url = "jdbc:postgresql://192.168.254.146:5432/icbs"    
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            //url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
//            /*properties {
//               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
//               jmxEnabled = true
//               initialSize = 5
//               maxActive = 50
//               minIdle = 5
//               maxIdle = 25
//               maxWait = 10000
//               maxAge = 10 * 60000
//               timeBetweenEvictionRunsMillis = 5000
//               minEvictableIdleTimeMillis = 60000
//               validationQuery = "SELECT 1"
//               validationQueryTimeout = 3
//               validationInterval = 15000
//               testOnBorrow = true
//               testWhileIdle = true
//               testOnReturn = false
//               jdbcInterceptors = "ConnectionState"
//               defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
//            }*/
        // url = "jdbc:postgresql://localhost:5433/NRBSL_new_branch"
			//url = "jdbc:postgresql://localhost:5433/MACTAN"
                        //  url = "jdbc:postgresql://192.168.0.3:5432/startofyeartesting2"
       // this is PROD
           // url = "jdbc:postgresql://192.168.0.3:5432/ICBS_NRBSL_PROD"
            
           // url = "jdbc:postgresql://localhost:5433/lemerytestof5years"
	    // url = "jdbc:postgresql://localhost:5432/08042017"//
            // url = "jdbc:postgresql://localhost:5433/Regression_ATM"
	    // url = "jdbc:postgresql://192.168.0.200:5432/NRBSL_EOM_TESTING" //aje
            // url = "jdbc:postgresql://localhost:5432/reclassRetestings"
            //url = "jdbc:postgresql://10.252.241.190:5432/ICBS_ATM"
          //  url = "jdbc:postgresql://192.168.254.146:5432/test"  //LEMERY PROD
//                  url = "jdbc:postgresql://192.168.254.146:5432/icbs"
//                 url = "jdbc:postgresql://localhost:5433/lemery"  
//                 url = "jdbc:postgresql://192.168.0.4:7477/max_icbs" 
                 url = "jdbc:postgresql://192.168.0.27:5432/maxbank"
//                url = "jdbc:postgresql://192.168.254.146:5432/icbs" 
        }
    }
}
