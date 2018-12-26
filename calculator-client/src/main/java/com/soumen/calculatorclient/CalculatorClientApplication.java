package com.soumen.calculatorclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CalculatorClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(CalculatorClientApplication.class, args);
	}

}

