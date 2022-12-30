package com.mx.SpringCrudPaisEstado.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudPaisEstado.dao.EstadoDao;
import com.mx.SpringCrudPaisEstado.dominio.Estado;

@Service
public class EstadoServImp implements EstadoServ {
	
	@Autowired
	EstadoDao estadoDao;

	@Override
	public void guardar(Estado estado) {
		estadoDao.save(estado);
		
	}

	@Override
	public void editar(Estado estado) {
		estadoDao.save(estado);
		
	}

	@Override
	public void eliminar(Estado estado) {
		estadoDao.delete(estado);
		
	}

	@Override
	public Estado buscar(Estado estado) {
		// TODO Auto-generated method stub
		return estadoDao.findById(estado.getId()).orElse(null);
	}

	@Override
	public List<Estado> listar() {
		// TODO Auto-generated method stub
		return (List<Estado>)estadoDao.findAll();
	}

}
