package com.mx.SpringAutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.SpringAutos.dominio.AutoVw;
import com.mx.SpringAutos.servicio.AutoVwServ;

@Controller
@RequestMapping("AutoVwControl")
public class AutoVwControl {

	@Autowired
	AutoVwServ autovwser;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var lista = autovwser.listar();
		model.addAttribute("lista", lista);
		return "vw";
		
	}
	
	@GetMapping("alta")
	public String alta(AutoVw autoVw) {
		return "agregar";
	}
	
	@PostMapping("guardar")
	public String guardar(AutoVw autoVw) {
		autovwser.guardar(autoVw);
		return "redirect:/AutoVwControl/";
	}
	
	//eliminar
	@GetMapping("/eliminar/{id}")
	public String eliminar(AutoVw autoVw,Model model) {
		autoVw = autovwser.buscar(autoVw);
		model.addAttribute("autoVw", autoVw);
		return "eliminar";
		
	}
	@PostMapping("/delete")
	public String delete(AutoVw autoVw) {
		autovwser.eliminar(autoVw);
		return "redirect:/AutoVwControl/";
	}
	
	//editar
		@GetMapping("/editar/{id}")
		public String editar(AutoVw autoVw,Model model) {
			autoVw = autovwser.buscar(autoVw);
			model.addAttribute("autoVw", autoVw);
			return "editar";
			
		}
		@PostMapping("/update")
		public String update(AutoVw autoVw) {
			autovwser.editar(autoVw);
			return "redirect:/AutoVwControl/";
		}
}
