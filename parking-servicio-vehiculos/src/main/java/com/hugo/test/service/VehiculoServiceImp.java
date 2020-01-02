package com.hugo.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hugo.test.entity.Vehiculo;
import com.hugo.test.repository.VehiculoRepo;

@Service
public class VehiculoServiceImp implements IVehiculoService{

	@Autowired
	private VehiculoRepo vehiculo;
	
	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findAll() {
		return vehiculo.findAll();
	}

	@Override
	public Vehiculo findById(String placa) {
		// TODO Auto-generated method stub
		return vehiculo.findById(placa).orElse(null);
	}

	@Override
	public Vehiculo addVehiculo(Vehiculo v) {
		vehiculo.save(v);
		return v;
	}

}
