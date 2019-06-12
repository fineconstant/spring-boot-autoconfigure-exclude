package com.kduda.springboot.autoconfigure.exclude

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveDataAutoConfiguration
import org.springframework.boot.autoconfigure.data.mongo.MongoReactiveRepositoriesAutoConfiguration
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration
import org.springframework.context.annotation.Configuration


@Configuration
@ConditionalOnProperty(
    prefix = "spring.autoconfigure.enable",
    name = ["mongodb"],
    havingValue = "false",
    matchIfMissing = true
)
@EnableAutoConfiguration(
    exclude = [MongoAutoConfiguration::class,
        MongoReactiveAutoConfiguration::class,
        MongoDataAutoConfiguration::class,
        MongoReactiveDataAutoConfiguration::class,
        MongoRepositoriesAutoConfiguration::class,
        MongoReactiveRepositoriesAutoConfiguration::class
    ]
)
private class MongoExcludeAutoConfiguration
