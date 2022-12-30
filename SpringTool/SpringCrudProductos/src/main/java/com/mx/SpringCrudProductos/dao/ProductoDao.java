package com.mx.SpringCrudProductos.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudProductos.dominio.Producto;

public interface ProductoDao extends CrudRepository<Producto,Integer>{

}
