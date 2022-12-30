package com.mx.CrudRest.service;

import java.util.List;

import com.mx.CrudRest.dto.Cliente;

public interface IClienteService {

	public List<Cliente> listarClientes();
	public Cliente guardarcliente(Cliente cliente);
	public Cliente clienteId(Long id);
	public Cliente actualizar(Cliente cliente);
	public void eliminar(Long id);
	
}
