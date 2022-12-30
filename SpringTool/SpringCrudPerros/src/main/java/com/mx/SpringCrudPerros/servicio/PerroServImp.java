package com.mx.SpringCrudPerros.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudPerros.dao.PerroDao;
import com.mx.SpringCrudPerros.dominio.Perro;

@Service
public class PerroServImp implements PerroServ {
	
	@Autowired
	PerroDao perrodao;

	@Override
	public void guardar(Perro perro) {
		perrodao.save(perro);
		
	}

	@Override
	public void editar(Perro perro) {
		perrodao.save(perro);
		
	}

	@Override
	public void eliminar(Perro perro) {
		perrodao.delete(perro);
		
	}

	@Override
	public Perro buscar(Perro perro) {
		// TODO Auto-generated method stub
		return perrodao.findById(perro.getId()).orElse(null);
	}

	@Override
	public List<Perro> listar() {
		// TODO Auto-generated method stub
		return (List<Perro>)perrodao.findAll();
	}

}
