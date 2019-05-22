package com.goodyzain.Spring5WithBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.goodyzain"})
public class Spring5WithBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5WithBootApplication.class, args);
	}
}
