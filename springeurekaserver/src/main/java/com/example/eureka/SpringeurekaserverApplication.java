package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringeurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringeurekaserverApplication.class, args);
	}
}
