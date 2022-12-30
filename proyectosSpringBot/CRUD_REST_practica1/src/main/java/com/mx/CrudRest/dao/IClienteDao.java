package com.mx.CrudRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudRest.dto.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
