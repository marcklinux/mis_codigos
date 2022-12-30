package com.mx.SpringCrudPaisEstado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.SpringCrudPaisEstado.dominio.Estado;
import com.mx.SpringCrudPaisEstado.servicio.EstadoServ;


@Controller
@RequestMapping("EstadoControl")
public class EstadoControl {
	
	
	@Autowired
	EstadoServ estadoServ;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var lista = estadoServ.listar();
		model.addAttribute("lista", lista);
		return "estado";
		
	}
	
	@GetMapping("alta")
	public String alta(Estado estado) {
		return "agregarEstado";
	}
	
	@PostMapping("guardar")
	public String guardar(Estado estado) {
		estadoServ.guardar(estado);
		return "redirect:/EstadoControl/";
	}
	
	//editar
	@GetMapping("/editar/{id}")
	public String editar(Estado estado, Model model) {
		estado = estadoServ.buscar(estado);
		model.addAttribute("estado",estado);
		return "editarEstado";
	}
	
	@PostMapping("/update")
	public String update(Estado estado) {
		estadoServ.editar(estado);
		return "redirect:/EstadoControl/";
	}
	
	//eliminar
	@GetMapping("/eliminar/{id}")
	public String eliminar(Estado estado, Model model) {
		estado = estadoServ.buscar(estado);
		model.addAttribute("estado",estado);
		return "eliminarEstado";
	}
	
	@PostMapping("/delete")
	public String delete(Estado estado) {
		estadoServ.eliminar(estado);
		return "redirect:/EstadoControl/";
	}

}
