package com.ybo.springcloudstreamkafkastreammetricsissue

import org.apache.kafka.streams.kstream.KStream
import org.apache.kafka.streams.kstream.KeyValueMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Function

@SpringBootApplication
class SpringCloudStreamKafkaStreamMetricsIssueApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudStreamKafkaStreamMetricsIssueApplication>(*args)
}

@Configuration
class KStreamConfig {

    @Bean
    fun processor(): Function<KStream<*,*>, KStream<*,*>> = Function {
        it.flatMapValues<String> { _ ->
            listOf<String>()
        }
    }
}