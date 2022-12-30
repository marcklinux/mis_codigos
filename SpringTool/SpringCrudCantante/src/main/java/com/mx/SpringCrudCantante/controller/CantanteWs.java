package com.mx.SpringCrudCantante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudCantante.dominio.Cantante;
import com.mx.SpringCrudCantante.servicio.CantanteServ;


@RestController
@RequestMapping("CantanteWs")
@CrossOrigin
public class CantanteWs {
	
	@Autowired
	CantanteServ cantanteServ;
	
	@GetMapping("listar")
	public List<Cantante> listar(){
		var lista = cantanteServ.listar();
		System.out.println("lista->"+lista);
		return lista;
	}
	
	@PostMapping("agregar")
	public void agregar(@RequestBody Cantante cantante) {
		System.out.println("se guardo->" + cantante);
		cantanteServ.guardar(cantante);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Cantante cantante) {
		System.out.println("se edito->"+ cantante);
		cantanteServ.editar(cantante);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Cantante cantante) {
		System.out.println("se elimino->"+ cantante);
		cantanteServ.eliminar(cantante);
	}
	
	@PostMapping("buscar")
	public Cantante buscar(@RequestBody Cantante cantante) {
		cantante = cantanteServ.buscar(cantante);
		System.out.println("se busco->"+ cantante);
		cantanteServ.editar(cantante);
		return cantante;
	}
		

}
