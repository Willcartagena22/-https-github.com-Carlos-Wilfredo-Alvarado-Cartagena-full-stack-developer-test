package com.hugo.test.service;

import java.util.List;

import com.hugo.test.entity.Vehiculo;

public interface IVehiculoService {

	public List<Vehiculo> findAll();
	public Vehiculo findById(String placa);	
	public Vehiculo addVehiculo(Vehiculo v);
	
}
