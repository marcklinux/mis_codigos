package com.mx.SpringCrudProductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudProductos.dominio.Producto;
import com.mx.SpringCrudProductos.servicio.ProductoServ;

@RestController
@RequestMapping("ProductoWs")
@CrossOrigin
public class ProductoWs {
	
	@Autowired
	ProductoServ productoServ;
	
	@GetMapping("listar")
	public  List<Producto> listar() {
		var lista = productoServ.listar();
		System.out.println("lista->"+lista);
		return lista;
	}
	
	@PostMapping("agregar")
	public void agregar(@RequestBody Producto producto) {
		System.out.println("se guardo->" + producto);
		productoServ.guardar(producto);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Producto producto) {
		System.out.println("se edito->" + producto);
		productoServ.editar(producto);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Producto producto) {
		System.out.println("se elimino->" + producto);
		productoServ.eliminar(producto);
	}

	@PostMapping("buscar")
	public Producto buscar(@RequestBody Producto producto) {
		producto = productoServ.buscar(producto);
		System.out.println("se busco->" + producto);
		return producto;
	}
}
