package com.microservicio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicio.entity.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {

}
