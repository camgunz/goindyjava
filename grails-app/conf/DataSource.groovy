dataSource {
    pooled = true
	dialect = org.hibernate.dialect.PostgreSQLDialect
    jmxExport = true
    driverClassName = "org.postgresql.Driver"
    username = "gisdev"
    password = "gisdev"
	url = "jdbc:postgresql://localhost:5432/goindygrails"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
	jdbc.use_get_generated_keys = true
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update"
        }
    }
    test {
        dataSource {
            dbCreate = "validate"
        }
    }
    production {
        dataSource {
            dbCreate = "validate"
        }
    }
}
