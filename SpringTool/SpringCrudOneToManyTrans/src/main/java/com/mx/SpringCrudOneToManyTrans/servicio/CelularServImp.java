package com.mx.SpringCrudOneToManyTrans.servicio;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.SpringCrudOneToManyTrans.dao.CelularDao;
import com.mx.SpringCrudOneToManyTrans.dominio.Celular;

@Service
public class CelularServImp implements CelularServ{
	
	@Autowired
	CelularDao celularDao;

	@Transactional
	@Override
	public void guardar(Celular celular) {
		celularDao.save(celular);
		
	}

	@Transactional
	@Override
	public void editar(Celular celular) {
		celularDao.save(celular);
		
	}
	@Transactional
	@Override
	public void eliminar(Celular celular) {
		celularDao.delete(celular);
		
	}
	@Transactional(readOnly=true)
	@Override
	public Celular buscar(Celular celular) {
		celular = celularDao.findById(celular.getId()).orElse(null);
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(readOnly=true)
	@Override
	public List<Celular> listar() {
		// TODO Auto-generated method stub
		return (List<Celular>)celularDao.findAll();
	}

}
