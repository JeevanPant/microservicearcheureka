package com.eureka.serviceregistry.serverInitialization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerInitializationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerInitializationApplication.class, args);
	}

}
