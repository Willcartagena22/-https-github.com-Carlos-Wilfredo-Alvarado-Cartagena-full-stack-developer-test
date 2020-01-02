package com.hugo.test.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ParkingServicioEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingServicioEurekaServerApplication.class, args);
	}

}
