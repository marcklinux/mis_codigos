package com.mx.CrudRest.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudRest.dao.IClienteDao;
import com.mx.CrudRest.dto.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	IClienteDao iClienteDao;

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return iClienteDao.findAll();
	}

	@Override
	public Cliente guardarcliente(Cliente cliente) {
		
		return iClienteDao.save(cliente);
	}

	@Override
	public Cliente clienteId(Long id) {
		
		return iClienteDao.findById(id).get();
	}

	@Override
	public Cliente actualizar(Cliente cliente) {
		
		return iClienteDao.save(cliente);
	}

	@Override
	public void eliminar(Long id) {
		iClienteDao.deleteById(id);
		
	}

}
