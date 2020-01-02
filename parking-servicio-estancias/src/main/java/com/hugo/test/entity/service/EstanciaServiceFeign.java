package com.hugo.test.entity.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hugo.test.clientes.VehiculoClienteFeign;
import com.hugo.test.entity.Estancia;
import com.hugo.test.entity.Vehiculo;
import com.hugo.test.repository.IEstanciaRepo;

@Service("serviceFeign")
@Primary
public class EstanciaServiceFeign implements IEstanciaService{
	Date fecha = new Date();
	Double valor=0.0 ;
	
	@Autowired
	private VehiculoClienteFeign cliente ;
	
	@Autowired
	private IEstanciaRepo estancia;

	@Override
	public List<Estancia> findAll() {
		return estancia.findAll() ;
	}

	@Override
	public List<Estancia> findAllV() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estancia findByV(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estancia addEstancia(String e) {
		Vehiculo vh =findVehiculo(e);
		String placa= vh.getPlaca();
		String tipov=vh.getTipovehiculo();
		Estancia est= new Estancia(fecha, fecha, placa,tipov, valor, valor, 1, 1);
		estancia.save(est);
		return null;
	}

	@Override
	public Vehiculo findVehiculo(String placa) {
	return cliente.obtenerVehiculo(placa);
	}

}
