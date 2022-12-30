package com.mx.SpringCrudVeterinaria.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringCrudVeterinaria.dominio.Veterinaria;

public interface VeterinariaDao extends CrudRepository<Veterinaria,Integer>{

}
