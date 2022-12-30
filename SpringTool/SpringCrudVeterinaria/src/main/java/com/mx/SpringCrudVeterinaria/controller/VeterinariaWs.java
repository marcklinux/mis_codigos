package com.mx.SpringCrudVeterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudVeterinaria.dominio.Veterinaria;
import com.mx.SpringCrudVeterinaria.servicio.VeterinariaServ;

@RestController
@RequestMapping("VeterinariaWs")
@CrossOrigin
public class VeterinariaWs {
	
	@Autowired
	VeterinariaServ veterinariaServ;
	
	@GetMapping("listar")
	public List<Veterinaria> listar(){
		var lista = veterinariaServ.listar();
		System.out.println("lista->"+lista);
		return lista;
		
	}
	
	@PostMapping("agregar")
	public void agregar(@RequestBody Veterinaria veterinaria ) {
		System.out.println("se guardo->" + veterinaria);
		veterinariaServ.guardar(veterinaria);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Veterinaria veterinaria) {
		System.out.println("se edito->"+ veterinaria);
		veterinariaServ.editar(veterinaria);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Veterinaria veterinaria) {
		System.out.println("se elimino->"+ veterinaria);
		veterinariaServ.eliminar(veterinaria);
	}
	
	@PostMapping("buscar")
	public Veterinaria buscar(@RequestBody Veterinaria veterinaria) {
		veterinaria = veterinariaServ.buscar(veterinaria);
		System.out.println("se busco->"+ veterinaria);
		veterinariaServ.editar(veterinaria);
		return veterinaria;
	}
	
	
	

}
