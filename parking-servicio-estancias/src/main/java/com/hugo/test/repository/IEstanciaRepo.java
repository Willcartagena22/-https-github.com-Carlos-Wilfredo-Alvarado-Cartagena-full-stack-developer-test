package com.hugo.test.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hugo.test.entity.Estancia;

public interface IEstanciaRepo extends MongoRepository<Estancia, Serializable> {

}
