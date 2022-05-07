package com.cjava.expert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CjavaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjavaEurekaServerApplication.class, args);
	}

}
