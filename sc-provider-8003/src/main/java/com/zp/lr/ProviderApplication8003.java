package com.zp.lr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication8003 {

	public static void main(String[] args) {
	
		SpringApplication.run(ProviderApplication8003.class, args);
	}

}
