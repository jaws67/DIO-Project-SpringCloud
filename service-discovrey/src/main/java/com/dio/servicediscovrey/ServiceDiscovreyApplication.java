package com.dio.servicediscovrey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscovreyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscovreyApplication.class, args);
	}

}
