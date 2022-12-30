package com.api.rest.biblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.biblioteca.entidades.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
