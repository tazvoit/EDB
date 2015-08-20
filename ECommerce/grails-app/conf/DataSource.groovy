dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
	jdbc.use_get_generated_keys = true
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			driverClassName = "oracle.jdbc.driver.OracleDriver"
			username = "system"
			password = "12345678"
			dialect= "org.hibernate.dialect.Oracle9Dialect" // or "org.hibernate.dialect.OracleDialect"
			url = "jdbc:oracle:thin:@localhost:1521:XE"
        }
    }
    test {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			driverClassName = "oracle.jdbc.driver.OracleDriver"
			username = "system"
			password = "12345678"
			dialect= "org.hibernate.dialect.Oracle9Dialect" // or "org.hibernate.dialect.OracleDialect"
			url = "jdbc:oracle:thin:@localhost:1521:XE"
        }
    }
    production {
        dataSource {
            dbCreate = "create-drop"
			driverClassName = "oracle.jdbc.driver.OracleDriver"
			username = "system"
			password = "12345678"
			dialect= "org.hibernate.dialect.Oracle9Dialect" // or "org.hibernate.dialect.OracleDialect"
			url = "jdbc:oracle:thin:@localhost:1521:XE"
            //url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
            properties {
               // See http://grails.org/doc/latest/guide/conf.html#dataSource for documentation
               jmxEnabled = true
               initialSize = 5
               maxActive = 50
               minIdle = 5
               maxIdle = 25
               maxWait = 10000
               maxAge = 10 * 60000
               timeBetweenEvictionRunsMillis = 5000
               minEvictableIdleTimeMillis = 60000
               validationQuery = "SELECT 1"
               validationQueryTimeout = 3
               validationInterval = 15000
               testOnBorrow = true
               testWhileIdle = true
               testOnReturn = false
               jdbcInterceptors = "ConnectionState"
               defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
            }
        }
    }
}