package com.mx.SpringCrudPaisEstado.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudPaisEstado.dominio.Pais;

public interface PaisDao extends CrudRepository<Pais,Integer> {

}
