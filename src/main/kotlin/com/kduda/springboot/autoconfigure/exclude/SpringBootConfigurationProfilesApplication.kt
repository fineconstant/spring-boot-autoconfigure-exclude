package com.kduda.springboot.autoconfigure.exclude

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class SpringBootConfigurationProfilesApplication {

    @Bean
    fun commandLineRunner(springAutoconfigureEnableProperties: SpringAutoconfigureEnableProperties) =
        CommandLineRunner {
            println("springAutoconfigureEnableProperties.cassandra = ${springAutoconfigureEnableProperties.cassandra}")
            println("springAutoconfigureEnableProperties.mongodb = ${springAutoconfigureEnableProperties.mongodb}")
        }
}

fun main(args: Array<String>) {
    runApplication<SpringBootConfigurationProfilesApplication>(*args)
}
