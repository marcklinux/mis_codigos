package com.mx.SpringCrudOneToManyTrans.servicio;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.SpringCrudOneToManyTrans.dao.MarcaDao;

import com.mx.SpringCrudOneToManyTrans.dominio.Marca;

@Service
public class MarcaServImp implements MarcaServ{

	@Autowired
	MarcaDao marcaDao;
	
	@Transactional
	@Override
	public void guardar(Marca marca) {
		marcaDao.save(marca);
		
	}
	@Transactional
	@Override
	public void editar(Marca marca) {
		marcaDao.save(marca);
		
	}
	@Transactional
	@Override
	public void eliminar(Marca marca) {
		marcaDao.delete(marca);
		
	}
	@Transactional(readOnly=true)
	@Override
	public Marca buscar(Marca marca) {
		marca = marcaDao.findById(marca.getId()).orElse(null);
		return null;
	}
	@Transactional(readOnly=true)
	@Override
	public List<Marca> listar() {
		// TODO Auto-generated method stub
		return (List<Marca>)marcaDao.findAll();
	}

}
