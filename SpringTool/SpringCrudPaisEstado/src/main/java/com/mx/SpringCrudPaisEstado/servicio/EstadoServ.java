package com.mx.SpringCrudPaisEstado.servicio;

import java.util.List;

import com.mx.SpringCrudPaisEstado.dominio.Estado;



public interface EstadoServ {

	public void guardar(Estado estado);
	public void editar(Estado estado);
	public void eliminar(Estado estado);
	public Estado buscar(Estado estado);
	public List<Estado> listar();
}
