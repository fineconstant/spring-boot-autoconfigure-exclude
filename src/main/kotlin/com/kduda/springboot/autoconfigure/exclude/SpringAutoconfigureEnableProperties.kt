package com.kduda.springboot.autoconfigure.exclude

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated


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
