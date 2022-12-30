package com.mx.SpringCrudOneToManyTrans.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudOneToManyTrans.dominio.Marca;

public interface MarcaDao extends CrudRepository<Marca,Integer>{

}
