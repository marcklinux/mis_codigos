package com.mx.SpringAutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.SpringAutos.dominio.AutoKia;
import com.mx.SpringAutos.servicio.AutoKiaServ;

@Controller
@RequestMapping("AutoKiaControl")

public class AutoKiaControl {

	@Autowired
	AutoKiaServ autokiaserv;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var lista = autokiaserv.listar();
		model.addAttribute("lista", lista);
		return "kia";
		
	}
	
	@GetMapping("alta")
	public String alta(AutoKia autoKia) {
		return "agregark";
	}
	
	@PostMapping("guardar")
	public String guardar(AutoKia autoKia) {
		autokiaserv.guardar(autoKia);
		return "redirect:/AutoKiaControl/";
	}
	
	//eliminar
	@GetMapping("/eliminar/{id}")
	public String eliminar(AutoKia autoKia,Model model) {
		autoKia = autokiaserv.buscar(autoKia);
		model.addAttribute("autoKia", autoKia);
		return "eliminark";
		
	}
	@PostMapping("/delete")
	public String delete(AutoKia autoKia) {
		autokiaserv.eliminar(autoKia);
		return "redirect:/AutoKiaControl/";
	}
	
	//editar
		@GetMapping("/editar/{id}")
		public String editar(AutoKia autoKia,Model model) {
			autoKia = autokiaserv.buscar(autoKia);
			model.addAttribute("autoKia", autoKia);
			return "editark";
			
		}
		@PostMapping("/update")
		public String update(AutoKia autoKia) {
			autokiaserv.editar(autoKia);
			return "redirect:/AutoKiaControl/";
		}
}
