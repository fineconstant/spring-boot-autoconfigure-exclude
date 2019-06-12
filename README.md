## Spring Boot autoconfigure exclude example

#### Spring configuration properties

* `com.kduda.springboot.autoconfigure.exclude.SpringAutoconfigureEnableProperties`

    ```kotlin
    @Component
    @ConfigurationProperties(prefix = "spring.autoconfigure.enable")
    class SpringAutoconfigureEnableProperties {
        /**
         * Enable Spring Cassandra auto configuration
         */
        var cassandra: Boolean = false
    
        /**
         * Enable Spring MongoDB auto configuration
         */
        var mongodb: Boolean = false
    }
    ```

* `resources application-local.yml`

    ```yaml
    spring:
      autoconfigure:
        enable:
          cassandra: true
          mongodb: false
    
    ```


#### Spring Boot CassandraAutoConfiguration conditional exclusion

* `com.kduda.springboot.autoconfigure.exclude.CassandraExcludeAutoConfiguration`

    ```kotlin
    @Configuration
    @ConditionalOnProperty(
        prefix = "spring.autoconfigure.enable",
        name = ["cassandra"],
        havingValue = "false",
        matchIfMissing = true
    )
    @EnableAutoConfiguration(
        exclude = [CassandraAutoConfiguration::class,
            CassandraDataAutoConfiguration::class,
            CassandraReactiveDataAutoConfiguration::class,
            CassandraRepositoriesAutoConfiguration::class,
            CassandraReactiveRepositoriesAutoConfiguration::class
        ]
    )
    private class CassandraExcludeAutoConfiguration
    ```
    
* `com.kduda.springboot.autoconfigure.exclude.CassandraConfiguration`

    ```kotlin
    @Configuration
    @ConditionalOnProperty(
        prefix = "spring.autoconfigure.enable",
        name = ["cassandra"],
        havingValue = "true",
        matchIfMissing = false
    )
    private class CassandraConfiguration {
        // some custom configuration
    }
    ```
