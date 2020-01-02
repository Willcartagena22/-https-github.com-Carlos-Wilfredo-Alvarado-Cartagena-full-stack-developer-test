package com.hugo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@ComponentScan
@SpringBootApplication
public class ParkingServicioVehiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingServicioVehiculosApplication.class, args);
	}

}
