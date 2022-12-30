package com.mx.CrudRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudRest.dto.Cliente;
import com.mx.CrudRest.service.ClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	ClienteServiceImpl clienteServiceImpl;
	
	@GetMapping("/clientes")
	public List<Cliente> listarClientes(){
		return clienteServiceImpl.listarClientes();
	}
	
	@PostMapping("/clientes")
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		return clienteServiceImpl.guardarcliente(cliente) ;
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente clienteId(@PathVariable(name= "id") Long id) {
		Cliente cliente_id = new Cliente();
		cliente_id = clienteServiceImpl.clienteId(id);
		System.out.println("cliente seleccionado: " + cliente_id);
		return cliente_id;
	}
	
	@PutMapping("/clientes/{id}")
	public Cliente actualizarCliente(@PathVariable(name= "id")Long id, @RequestBody Cliente cliente) {
		Cliente cliente_seleccionado = new Cliente();
		Cliente cliente_actualizado = new Cliente();
		
		cliente_seleccionado = clienteServiceImpl.clienteId(id);
		cliente_seleccionado.setName(cliente.getName());
		cliente_seleccionado.setApellido(cliente.getApellido());
		cliente_seleccionado.setDireccion(cliente.getDireccion());
		cliente_seleccionado.setDni(cliente.getDni());
		cliente_seleccionado.setFecha(cliente.getFecha());
		
		cliente_actualizado = clienteServiceImpl.actualizar(cliente_seleccionado);
		System.out.println("el cliente actualizado es: " + cliente_actualizado);
		return cliente_actualizado;
	}
	
	@DeleteMapping("/clientes/{id}")
	public void eliminarCliente(@PathVariable(name="id") Long id) {
		clienteServiceImpl.eliminar(id);
	}
	

}
