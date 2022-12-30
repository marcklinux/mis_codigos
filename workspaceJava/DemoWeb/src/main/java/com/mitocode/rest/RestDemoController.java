package com.mitocode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public Persona insertar(@RequestBody Persona persona) {
		Persona nueva = repo.save(persona);
		return nueva;
		
	}
	
	@PutMapping
	public Persona actualizar(@RequestBody Persona persona) {
		Persona actualizada = repo.save(persona);
		return actualizada;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		 repo.deleteById(id);
		
	}

}
