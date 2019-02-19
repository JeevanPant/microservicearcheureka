package com.eureka.serviceregistry.clientInitialization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientInitializationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientInitializationApplication.class, args);
	}

}
