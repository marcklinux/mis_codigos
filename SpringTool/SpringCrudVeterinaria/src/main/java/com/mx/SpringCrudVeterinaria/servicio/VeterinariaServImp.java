package com.mx.SpringCrudVeterinaria.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudVeterinaria.dao.VeterinariaDao;
import com.mx.SpringCrudVeterinaria.dominio.Veterinaria;

@Service
public class VeterinariaServImp implements VeterinariaServ{

	@Autowired
	VeterinariaDao veterinariaDao;
	
	@Override
	public void guardar(Veterinaria veterinaria) {
		veterinariaDao.save(veterinaria);
		
	}

	@Override
	public void editar(Veterinaria veterinaria) {
		veterinariaDao.save(veterinaria);
		
	}

	@Override
	public void eliminar(Veterinaria veterinaria) {
		veterinariaDao.delete(veterinaria);
		
	}

	@Override
	public Veterinaria buscar(Veterinaria veterinaria) {
		// TODO Auto-generated method stub
		return veterinariaDao.findById(veterinaria.getId()).orElse(null);
	}

	@Override
	public List<Veterinaria> listar() {
		// TODO Auto-generated method stub
		return (List<Veterinaria>)veterinariaDao.findAll();
	}

}
