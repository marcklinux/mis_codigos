package com.api.rest.fiestas.repositorio;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.fiestas.entidades.Fiesta;

@Repository
public interface FiestaRepository extends CrudRepository<Fiesta,Integer>{
	
	Collection<Fiesta> findAll();

}
