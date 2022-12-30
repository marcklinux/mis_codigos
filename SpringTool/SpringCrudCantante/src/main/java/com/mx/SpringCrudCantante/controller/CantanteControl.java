package com.mx.SpringCrudCantante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mx.SpringCrudCantante.dominio.Cantante;
import com.mx.SpringCrudCantante.servicio.CantanteServ;



@Controller
public class CantanteControl {
	
	@Autowired
	CantanteServ cantanteServ;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var lista = cantanteServ.listar();
		model.addAttribute("lista", lista);
		return "index";
	}
	@GetMapping("alta")
	public String alta(Cantante cantante) {
		return "agregar";
		
	}
	
	@PostMapping("guardar")
	public String guardar(Cantante cantante) {
		cantanteServ.guardar(cantante);
		return "redirect:/";
	}
	
	//eliminar
			@GetMapping("/eliminar/{id}")
			public String eliminar(Cantante cantante, Model model) {
				
				cantante = cantanteServ.buscar(cantante);
				model.addAttribute("cantante",cantante);
				return "eliminar";
			}
	
			@PostMapping("/delete")
			public String delete(Cantante cantante) {
			cantanteServ.eliminar(cantante);
			return "redirect:/";
			}
			
			//editar
			@GetMapping("/editar/{id}")
			public String editar(Cantante cantante, Model model) {
				
				cantante = cantanteServ.buscar(cantante);
				model.addAttribute("cantante",cantante);
				return "editar";
			}
			
			@PostMapping("/update")
			public String update(Cantante cantante) {
			cantanteServ.editar(cantante);
			return "redirect:/";
			}

}

