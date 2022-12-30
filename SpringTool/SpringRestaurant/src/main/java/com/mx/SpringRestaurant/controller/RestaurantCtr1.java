package com.mx.SpringRestaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mx.SpringRestaurant.dominio.Restaurant;
import com.mx.SpringRestaurant.servicio.RestaurantServ;


@Controller
public class RestaurantCtr1 {
	
	@Autowired
	RestaurantServ restaurantserv;
	
	@GetMapping("/")
	public String inicio(Model model) {
		var lista = restaurantserv.listar();
		model.addAttribute("lista",lista);
		return "index";
	}
	
	@GetMapping("alta")
	public String alta(Restaurant restaurant) {
		return "agregar";
		
	}
	
	@PostMapping("guardar")
	public String guardar(Restaurant restaurant) {
		restaurantserv.guardar(restaurant);
		return "redirect:/";
		
	}
	
	//eliminar
	@GetMapping("/eliminar/{id}")
	public String eliminar(Restaurant restaurant, Model model) {
		
		restaurant = restaurantserv.buscar(restaurant);
		model.addAttribute("restaurant",restaurant);
		return "eliminar";
	}
	
	@PostMapping("/delete")
	public String delete(Restaurant restaurant) {
	restaurantserv.eliminar(restaurant);
	return "redirect:/";
	}
	
	//editar
	@GetMapping("/editar/{id}")
	public String editar(Restaurant restaurant, Model model) {
		
		restaurant = restaurantserv.buscar(restaurant);
		model.addAttribute("restaurant",restaurant);
		return "editar";
	}
	
	@PostMapping("/update")
	public String update(Restaurant restaurant) {
	restaurantserv.editar(restaurant);
	return "redirect:/";
	}
}
