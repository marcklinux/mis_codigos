package com.negocio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.negocio.model.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Integer> {

}
