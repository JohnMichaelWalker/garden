package com.johnwalkers.garden.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.johnwalkers.garden"})
public class GardenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenServiceApplication.class, args);
	}

}
