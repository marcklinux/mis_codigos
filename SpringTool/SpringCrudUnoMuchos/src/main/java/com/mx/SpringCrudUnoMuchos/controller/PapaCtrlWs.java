package com.mx.SpringCrudUnoMuchos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mx.SpringCrudUnoMuchos.dominio.Papa;
import com.mx.SpringCrudUnoMuchos.servicio.PapaServ;

@RestController
@RequestMapping("PapaWs")
@CrossOrigin
public class PapaCtrlWs {

	@Autowired
	PapaServ papaServ;
	
	@GetMapping("listar")
	public List<Papa> listar(){
		var lista = papaServ.listar();
		System.out.println("listar->" + lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void agregar(@RequestBody Papa papa) {
		System.out.println("se guardo->" + papa);
		papaServ.guardar(papa);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Papa papa) {
		System.out.println("se edito->" + papa);
		papaServ.editar(papa);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Papa papa) {
		System.out.println("se elimino->" + papa);
		papaServ.eliminar(papa);
	}
	
	@PostMapping("buscar")
	public Papa buscar(@RequestBody Papa papa) {
		papa = papaServ.buscar(papa);
		System.out.println("se busco->" + papa);
		return papa;
	}
	
	
}
