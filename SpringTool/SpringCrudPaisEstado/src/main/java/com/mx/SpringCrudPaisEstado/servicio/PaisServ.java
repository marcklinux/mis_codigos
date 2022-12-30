package com.mx.SpringCrudPaisEstado.servicio;

import java.util.List;

import com.mx.SpringCrudPaisEstado.dominio.Pais;


public interface PaisServ {
	public void guardar(Pais pais);
	public void editar(Pais pais);
	public void eliminar(Pais pais);
	public Pais buscar(Pais pais);
	public List<Pais> listar();
}
