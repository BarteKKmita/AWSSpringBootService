package com.learning.awsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.learning.awsspringboot")
public class AwsspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsspringbootApplication.class, args);
	}

}
