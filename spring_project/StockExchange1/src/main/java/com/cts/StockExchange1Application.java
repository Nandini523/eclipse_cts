package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockExchange1Application {

	public static void main(String[] args) {
		SpringApplication.run(StockExchange1Application.class, args);
	}

}
