package com.mx.SpringCrudPaisEstado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudPaisEstado.dominio.Estado;
import com.mx.SpringCrudPaisEstado.servicio.EstadoServ;

@RestController
@RequestMapping("EstadoWs")
@CrossOrigin
public class EstadoCtrlWs {

	@Autowired
	EstadoServ estadoServ;
	
	@GetMapping("listar")
	public List<Estado> listar(){
		var lista = estadoServ.listar();
		System.out.println("listar->" + lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void agregar(@RequestBody Estado estado) {
		System.out.println("se guardo->" + estado);
		estadoServ.guardar(estado);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Estado estado) {
		System.out.println("se edito->" + estado);
		estadoServ.editar(estado);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Estado estado) {
		System.out.println("se elimino->" + estado);
		estadoServ.eliminar(estado);
	}
	
	@PostMapping("buscar")
	public Estado buscar(@RequestBody Estado estado) {
		estado = estadoServ.buscar(estado);
		System.out.println("se busco->" + estado);
		return estado;
	}
}
