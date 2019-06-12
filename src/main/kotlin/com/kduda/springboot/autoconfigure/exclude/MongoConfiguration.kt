package com.kduda.springboot.autoconfigure.exclude

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Configuration


@Configuration
@ConditionalOnProperty(
    prefix = "spring.autoconfigure.enable",
    name = ["mongodb"],
    havingValue = "true",
    matchIfMissing = false
)
private class MongoConfiguration {
//    configuration
}
