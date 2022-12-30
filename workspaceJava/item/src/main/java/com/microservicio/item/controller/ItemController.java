 package com.microservicio.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.item.entidad.Item;
import com.microservicio.item.servicio.ItemServicio;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemServicio servicio;
	
	@GetMapping("/listar")
	public List<Item> listarItem(){
		return servicio.listarItem();
	}

	@GetMapping("/{id}/{cantidad}")
	public Item itemPorId(@PathVariable Integer id,@PathVariable Integer cantidad) {
		 return servicio.itemPorId(id, cantidad);
		
	}
}
