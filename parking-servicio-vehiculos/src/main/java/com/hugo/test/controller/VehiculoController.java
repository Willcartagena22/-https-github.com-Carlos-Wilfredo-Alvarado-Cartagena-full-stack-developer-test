package com.hugo.test.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hugo.test.entity.Vehiculo;
import com.hugo.test.service.IVehiculoService;


@RestController
public class VehiculoController {

	@Autowired
	private Environment env;

	@Autowired
	private IVehiculoService vehiculo;

	@PostMapping("/altaVehiculo")
	public String altaVehiculo(@RequestBody Vehiculo v) {
		vehiculo.addVehiculo(v);
		return "Se agrego vehiculo con id : " +v.getPlaca();
	}

	@GetMapping("/listarVehiculos")
	public List<Vehiculo> obtenerVehiculos() {
		return vehiculo.findAll().stream().map(v ->{
			v.setPort(Integer.parseInt(env.getProperty("local.server.port")));
			return v;
		}).collect(Collectors.toList());
	}

	@GetMapping("/listarVehiculos/{placa}")
	public Vehiculo obtenerVehiculo(@PathVariable String placa) {
		Vehiculo v = vehiculo.findById(placa);
		v.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return v;
	}

}

