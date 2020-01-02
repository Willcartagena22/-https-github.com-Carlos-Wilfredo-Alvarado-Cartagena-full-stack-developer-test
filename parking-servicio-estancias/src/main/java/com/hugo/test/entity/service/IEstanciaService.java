package com.hugo.test.entity.service;

import java.util.List;

import com.hugo.test.entity.Estancia;
import com.hugo.test.entity.Vehiculo;

public interface IEstanciaService {

	public List<Estancia> findAll();
	public List<Estancia> findAllV();
	public Estancia findByV(String placa);
	public Estancia addEstancia(String e);
	public Vehiculo findVehiculo(String placa);
	
}
