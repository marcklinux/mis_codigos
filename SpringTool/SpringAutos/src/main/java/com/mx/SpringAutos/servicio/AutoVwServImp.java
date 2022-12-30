package com.mx.SpringAutos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringAutos.dao.AutoVwDao;
import com.mx.SpringAutos.dominio.AutoVw;

@Service
public class AutoVwServImp implements AutoVwServ{

	@Autowired
	AutoVwDao autovwdao;
	
	@Override
	public void guardar(AutoVw autoVw) {
		autovwdao.save(autoVw);
		
	}

	@Override
	public void editar(AutoVw autoVw) {
		autovwdao.save(autoVw);
		
	}

	@Override
	public void eliminar(AutoVw autoVw) {
		autovwdao.delete(autoVw);
		
	}

	@Override
	public AutoVw buscar(AutoVw autoVw) {
		// TODO Auto-generated method stub
		return autovwdao.findById(autoVw.getId()).orElse(null);
	}

	@Override
	public List<AutoVw> listar() {
		// TODO Auto-generated method stub
		return (List<AutoVw>)autovwdao.findAll();
	}

}
