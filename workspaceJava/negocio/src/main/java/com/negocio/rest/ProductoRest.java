package com.negocio.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.negocio.dao.ProductoDAO;
import com.negocio.model.Producto;

@RestController
@RequestMapping("negocio")
public class ProductoRest {
	
	@Autowired
	private ProductoDAO productoDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Producto producto) {
		productoDAO.save(producto);
	}
	
	@GetMapping("/listado")
	public List<Producto> listado(){
		return productoDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		productoDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Producto producto) {
		productoDAO.save(producto);
	}
	

}
