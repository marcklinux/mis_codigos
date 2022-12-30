package com.mx.SpringAutos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringAutos.dao.AutoKiaDao;
import com.mx.SpringAutos.dominio.AutoKia;

@Service
public class AutoKiaServImp implements AutoKiaServ {
	
	@Autowired
	AutoKiaDao autokiadao;

	@Override
	public void guardar(AutoKia autoKia) {
		autokiadao.save(autoKia);
		
	}

	@Override
	public void editar(AutoKia autoKia) {
		autokiadao.save(autoKia);
		
	}

	@Override
	public void eliminar(AutoKia autoKia) {
		autokiadao.delete(autoKia);
		
	}

	@Override
	public AutoKia buscar(AutoKia autoKia) {
		// TODO Auto-generated method stub
		return autokiadao.findById(autoKia.getId()).orElse(null);
	}

	@Override
	public List<AutoKia> listar() {
		// TODO Auto-generated method stub
		return (List<AutoKia>)autokiadao.findAll();
	}

}
