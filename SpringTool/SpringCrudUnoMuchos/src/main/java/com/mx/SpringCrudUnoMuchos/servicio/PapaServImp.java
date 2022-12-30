package com.mx.SpringCrudUnoMuchos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudUnoMuchos.dao.PapaDao;
import com.mx.SpringCrudUnoMuchos.dominio.Papa;

@Service
public class PapaServImp implements PapaServ{
	
	@Autowired
	PapaDao papaDao;

	@Override
	public void guardar(Papa papa) {
		papaDao.save(papa);
		
	}

	@Override
	public void editar(Papa papa) {
		papaDao.save(papa);
		
	}

	@Override
	public void eliminar(Papa papa) {
		papaDao.delete(papa);
		
	}

	@Override
	public Papa buscar(Papa papa) {
		// TODO Auto-generated method stub
		return papaDao.findById(papa.getId_papa()).orElse(null);
	}

	@Override
	public List<Papa> listar() {
		// TODO Auto-generated method stub
		return (List<Papa>)papaDao.findAll();
	}

}
