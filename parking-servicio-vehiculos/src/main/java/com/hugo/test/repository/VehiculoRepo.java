package com.hugo.test.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hugo.test.entity.Vehiculo;

public interface VehiculoRepo extends MongoRepository<Vehiculo, Serializable> {

}
