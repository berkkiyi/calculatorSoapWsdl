package com.wcf.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.wcf.calculator")
public class SpringBootSoapWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapWsApplication.class, args);
	}


}
