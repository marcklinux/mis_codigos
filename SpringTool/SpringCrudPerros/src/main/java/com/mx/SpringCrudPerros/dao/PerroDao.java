package com.mx.SpringCrudPerros.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudPerros.dominio.Perro;

public interface PerroDao extends CrudRepository<Perro,Integer>{

}
