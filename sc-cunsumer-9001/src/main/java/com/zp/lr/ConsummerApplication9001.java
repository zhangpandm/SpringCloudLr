package com.zp.lr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsummerApplication9001 {

	public static void main(String[] args) {
	
		SpringApplication.run(ConsummerApplication9001.class, args);
	}

}
