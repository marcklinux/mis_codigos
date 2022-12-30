package com.api.rest.fiestas.repositorio;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.rest.fiestas.entidades.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Integer> {
	
	Collection<Persona> findAll();

}
