package com.example.micro.currency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication

public class CurrencyNamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyNamingserverApplication.class, args);
	}

}
