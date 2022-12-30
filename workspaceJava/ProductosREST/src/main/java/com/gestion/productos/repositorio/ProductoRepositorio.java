package com.gestion.productos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestion.productos.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
	
	@Query("select p from Producto p where p.nombre like %:filtro%")
	public List<Producto> getByNombre(@Param("filtro")String filtro);

}
