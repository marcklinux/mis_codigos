package com.mx.SpringCrudUnoMuchos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudUnoMuchos.dao.HijoDao;
import com.mx.SpringCrudUnoMuchos.dominio.Hijo;

@Service
public class HijoServImp implements HijoServ{
	
	@Autowired
	HijoDao hijoDao;

	@Override
	public void guardar(Hijo hijo) {
		hijoDao.save(hijo);
		
	}

	@Override
	public void editar(Hijo hijo) {
		hijoDao.save(hijo);
		
	}

	@Override
	public void eliminar(Hijo hijo) {
		hijoDao.delete(hijo);
		
	}

	@Override
	public Hijo buscar(Hijo hijo) {
		// TODO Auto-generated method stub
		return hijoDao.findById(hijo.getId_hijo()).orElse(null);
	}

	@Override
	public List<Hijo> listar() {
		// TODO Auto-generated method stub
		return (List<Hijo>)hijoDao.findAll();
	}

}
