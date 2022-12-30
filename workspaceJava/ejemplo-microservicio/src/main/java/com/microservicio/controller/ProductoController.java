package com.microservicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.entity.Producto;
import com.microservicio.servicio.ProductoServicio;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoServicio servicio;

	@GetMapping("/all")
	public @ResponseBody List<Producto> listarProductos() {
		return servicio.listarProducto();
	}

	@GetMapping("/{id}")
	public @ResponseBody Producto obtenerProductoPorId(@PathVariable("id") Integer id) {
		return servicio.productoPorId(id);
	}

	@DeleteMapping("/{id}")
	public void eliminarProducto(@PathVariable("id") Integer id) {
		servicio.eliminarProductoId(id);
	}

	@PostMapping("/")
	public void guardarProducto(@RequestBody Producto producto) {
		servicio.guardarProducto(producto);
	}
}
