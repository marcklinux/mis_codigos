package com.mx.SpringCrudCantante.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudCantante.dao.CantanteDao;
import com.mx.SpringCrudCantante.dominio.Cantante;

@Service
public class CantanteServImp implements CantanteServ {

	@Autowired
	CantanteDao cantanteDao;
	
	@Override
	public void guardar(Cantante cantante) {
	cantanteDao.save(cantante);
		
	}

	@Override
	public void editar(Cantante cantante) {
		cantanteDao.save(cantante);
		
	}

	@Override
	public void eliminar(Cantante cantante) {
		cantanteDao.delete(cantante);
		
	}

	@Override
	public Cantante buscar(Cantante cantante) {
		// TODO Auto-generated method stub
		return cantanteDao.findById(cantante.getId()).orElse(null);
	}

	@Override
	public List<Cantante> listar() {
		// TODO Auto-generated method stub
		return (List<Cantante>)cantanteDao.findAll();
	}

}
