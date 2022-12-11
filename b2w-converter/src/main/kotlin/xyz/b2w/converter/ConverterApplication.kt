package xyz.b2w.converter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class ConverterApplication

fun main(args: Array<String>) {
	runApplication<ConverterApplication>(*args)
}
