package com.mx.SpringCrudPaisEstado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudPaisEstado.dominio.Pais;
import com.mx.SpringCrudPaisEstado.servicio.PaisServ;

@RestController
@RequestMapping("PaisWs")
@CrossOrigin
public class PaisCtrlWs {

	@Autowired
	PaisServ paisServ;
	
	@GetMapping("listar")
	public List<Pais> listar(){
		var lista = paisServ.listar();
		System.out.println("listar->" + lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void agregar(@RequestBody Pais pais) {
		System.out.println("se guardo->" + pais);
		paisServ.guardar(pais);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Pais pais) {
		System.out.println("se edito->" + pais);
		paisServ.editar(pais);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Pais pais) {
		System.out.println("se elimino->" + pais);
		paisServ.eliminar(pais);
	}
	
	@PostMapping("buscar")
	public Pais buscar(@RequestBody Pais pais) {
		pais = paisServ.buscar(pais);
		System.out.println("se busco->" + pais);
		return pais;
	}
	
}
