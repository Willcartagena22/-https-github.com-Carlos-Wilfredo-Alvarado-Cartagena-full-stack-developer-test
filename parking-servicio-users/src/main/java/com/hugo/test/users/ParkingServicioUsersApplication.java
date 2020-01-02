package com.hugo.test.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.hugo.test.usuarioscommons.entity"})
@SpringBootApplication
public class ParkingServicioUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingServicioUsersApplication.class, args);
	}

}
