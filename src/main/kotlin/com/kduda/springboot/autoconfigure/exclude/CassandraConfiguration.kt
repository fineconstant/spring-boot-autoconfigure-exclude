package com.kduda.springboot.autoconfigure.exclude

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Configuration


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
