package com.kduda.springboot.autoconfigure.exclude

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration
import org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveDataAutoConfiguration
import org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration
import org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration
import org.springframework.context.annotation.Configuration


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
