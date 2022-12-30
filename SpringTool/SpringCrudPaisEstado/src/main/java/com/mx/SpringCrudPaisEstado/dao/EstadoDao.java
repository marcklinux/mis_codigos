package com.mx.SpringCrudPaisEstado.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudPaisEstado.dominio.Estado;

public interface EstadoDao extends CrudRepository<Estado,Integer> {

}
