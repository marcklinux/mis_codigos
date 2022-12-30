package com.gestion.productos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.productos.entidades.Producto;
import com.gestion.productos.repositorio.ProductoRepositorio;

@Service
public class ProductoServicio {
	
	@Autowired
	private ProductoRepositorio repositorio;
	
	public List<Producto> listAll(String palabraClave){
		if(palabraClave != null) {
			 return repositorio.findAll(palabraClave);
		}
		return repositorio.findAll();
	}

	public void save(Producto producto) {
		repositorio.save(producto);
	}
	
	public Producto get(Long id) {
		return repositorio.findById(id).get();
	}
	
	public void delete(Long id) {
		repositorio.deleteById(id);
	}
	
	public List<Producto> getAll() {
		List<Producto> productos = repositorio.findAll();
		return productos;
	}
}

