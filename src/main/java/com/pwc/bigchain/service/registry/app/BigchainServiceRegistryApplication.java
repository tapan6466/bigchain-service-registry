package com.pwc.bigchain.service.registry.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BigchainServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigchainServiceRegistryApplication.class, args);
	}
}
