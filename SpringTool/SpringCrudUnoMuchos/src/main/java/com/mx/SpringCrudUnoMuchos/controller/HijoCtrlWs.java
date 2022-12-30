package com.mx.SpringCrudUnoMuchos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudUnoMuchos.dominio.Hijo;
import com.mx.SpringCrudUnoMuchos.servicio.HijoServ;



@RestController
@RequestMapping("HijoWs")
@CrossOrigin
public class HijoCtrlWs {

	@Autowired
	HijoServ hijoServ;
	
	@GetMapping("listar")
	public List<Hijo> listar(){
		var lista = hijoServ.listar();
		System.out.println("listar->" + lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void agregar(@RequestBody Hijo hijo) {
		System.out.println("se guardo->" + hijo);
		hijoServ.guardar(hijo);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Hijo hijo) {
		System.out.println("se edito->" + hijo);
		hijoServ.editar(hijo);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Hijo hijo) {
		System.out.println("se elimino->" + hijo);
		hijoServ.eliminar(hijo);
	}
	
	@PostMapping("buscar")
	public Hijo buscar(@RequestBody Hijo hijo) {
		hijo = hijoServ.buscar(hijo);
		System.out.println("se busco->" + hijo);
		return hijo;
	}
	
}
