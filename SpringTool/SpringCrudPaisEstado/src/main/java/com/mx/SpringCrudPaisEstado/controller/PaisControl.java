package com.mx.SpringCrudPaisEstado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.SpringCrudPaisEstado.dominio.Pais;
import com.mx.SpringCrudPaisEstado.servicio.PaisServ;


@Controller
@RequestMapping("PaisControl")
public class PaisControl {
	
	@Autowired
	PaisServ paisServ;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var lista = paisServ.listar();
		model.addAttribute("lista", lista);
		return "pais";
		
	}
	
	@GetMapping("alta")
	public String alta(Pais pais) {
		return "agregarPais";
	}
	
	@PostMapping("guardar")
	public String guardar(Pais pais) {
		paisServ.guardar(pais);
		return "redirect:/PaisControl/";
	}
	
	//editar
	@GetMapping("/editar/{id}")
	public String editar(Pais pais, Model model) {
		pais = paisServ.buscar(pais);
		model.addAttribute("pais",pais);
		return "editarPais";
	}
	
	@PostMapping("/update")
	public String update(Pais pais) {
		paisServ.editar(pais);
		return "redirect:/PaisControl/";
	}
	
	//eliminar
	@GetMapping("/eliminar/{id}")
	public String eliminar(Pais pais, Model model) {
		pais = paisServ.buscar(pais);
		model.addAttribute("pais",pais);
		return "eliminarPais";
	}
	
	@PostMapping("/delete")
	public String delete(Pais pais) {
		paisServ.eliminar(pais);
		return "redirect:/PaisControl/";
	}

}
