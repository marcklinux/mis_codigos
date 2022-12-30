package com.api.rest.biblioteca.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.biblioteca.entidades.Biblioteca;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer> {

}
