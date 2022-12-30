package com.sistema.blog.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sistema.blog.entidades.Publicacion;

public interface PublicacionRepositorio extends JpaRepository<Publicacion, Long> {
	
	@Query("select contenido from Publicacion p where p.contenido = :contenido")
	public List<Publicacion> getByContenido(@Param("contenido") String contenido);

}
