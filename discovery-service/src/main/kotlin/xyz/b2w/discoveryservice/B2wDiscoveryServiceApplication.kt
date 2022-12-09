package xyz.b2w.discoveryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class B2wDiscoveryServiceApplication

fun main(args: Array<String>) {
	runApplication<B2wDiscoveryServiceApplication>(*args)
}
