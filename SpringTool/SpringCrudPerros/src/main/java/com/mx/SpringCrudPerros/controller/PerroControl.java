package com.mx.SpringCrudPerros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mx.SpringCrudPerros.dominio.Perro;
import com.mx.SpringCrudPerros.servicio.PerroServ;

@Controller
public class PerroControl {

	@Autowired
	PerroServ perroserv;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var lista = perroserv.listar();
		model.addAttribute("lista", lista);
		return "index";
		
	}
	
	@GetMapping("alta")
	public String alta(Perro perro) {
		return "agregar";
	}
	
	@PostMapping("guardar")
	public String guardar(Perro perro) {
		perroserv.guardar(perro);
		return "redirect:/";
	}
	
	//editar
	@GetMapping("/editar/{id}")
	public String editar(Perro perro, Model model) {
		perro = perroserv.buscar(perro);
		model.addAttribute("perro",perro);
		return "editar";
	}
	
	@PostMapping("/update")
	public String update(Perro perro) {
		perroserv.editar(perro);
		return "redirect:/";
	}
	
	//eliminar
	@GetMapping("/eliminar/{id}")
	public String eliminar(Perro perro, Model model) {
		perro = perroserv.buscar(perro);
		model.addAttribute("perro",perro);
		return "eliminar";
	}
	
	@PostMapping("/delete")
	public String delete(Perro perro) {
		perroserv.eliminar(perro);
		return "redirect:/";
	}
}
