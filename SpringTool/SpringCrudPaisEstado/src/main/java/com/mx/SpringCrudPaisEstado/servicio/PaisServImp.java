package com.mx.SpringCrudPaisEstado.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudPaisEstado.dao.PaisDao;
import com.mx.SpringCrudPaisEstado.dominio.Pais;

@Service
public class PaisServImp implements PaisServ {
	
	@Autowired
	PaisDao paisDao;

	@Override
	public void guardar(Pais pais) {
		paisDao.save(pais);
		
	}

	@Override
	public void editar(Pais pais) {
		paisDao.save(pais);
		
	}

	@Override
	public void eliminar(Pais pais) {
		paisDao.delete(pais);
		
	}

	@Override
	public Pais buscar(Pais pais) {
		// TODO Auto-generated method stub
		return paisDao.findById(pais.getId()).orElse(null);
	}

	@Override
	public List<Pais> listar() {
		// TODO Auto-generated method stub
		return (List<Pais>)paisDao.findAll();
	}

}
