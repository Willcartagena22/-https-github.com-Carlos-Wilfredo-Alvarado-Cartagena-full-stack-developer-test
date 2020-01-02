package com.hugo.test.entity.service;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hugo.test.entity.Estancia;
import com.hugo.test.entity.Vehiculo;
import com.hugo.test.repository.IEstanciaRepo;

@Service
public class EstanciaServiceImp implements IEstanciaService {
	Date fecha = new Date();
	Double valor=0.0 ;
	@Autowired
	private RestTemplate clienteRest;
	
	@Autowired
	private IEstanciaRepo estancia;
	

	
	@Override
	public List<Estancia> findAll() {
		return estancia.findAll();
	}

	@Override
	public Estancia addEstancia(String placa) {		
//		Vehiculo vh =findVehiculo(placa);
//		Estancia est= new Estancia(fecha, null, vh, valor, valor, 1, 1);
//		estancia.save(est);
//		return est;
		return null;
	}

	@Override
	public List<Estancia> findAllV() {

//		List<Vehiculo> vehiculos= Arrays.asList(clienteRest.getForObject("http://localhost:8001/listarVehiculos", Vehiculo[].class));
//		return vehiculos.stream().map(p -> new Estancia(fecha, fecha, p, valor, valor, 1, 1)).collect(Collectors.toList());
	return null;
	}

	@Override
	public Estancia findByV(String placa) {
//		Map<String, String> pathvariables = new HashMap<String,String>();
//		pathvariables.put("placa", placa);
//		Vehiculo v=clienteRest.getForObject("http://localhost:8001/listarVehiculos/{placa}", Vehiculo.class);
//		return new Estancia(fecha, fecha, v, valor, valor, 1, 1);
		return null;
	}

	@Override
	public Vehiculo findVehiculo(String ids) {
//		Map<String, String> pathvariables = new HashMap<String,String>();
//		pathvariables.put("placa", ids.toString());	
//		String url = "http://localhost:8001/listarVehiculos/{ids}";
//		Vehiculo v=clienteRest.getForObject(url, Vehiculo.class,ids);
//		return v;
		return null;
	}

}
