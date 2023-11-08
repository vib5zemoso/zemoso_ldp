package com.example.mapping.mappingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MappingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingDemoApplication.class, args);
	}

}
