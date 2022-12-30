package com.mx.SpringCrudPerros.servicio;

import java.util.List;

import com.mx.SpringCrudPerros.dominio.Perro;

public interface PerroServ {
	
	public void guardar(Perro perro);
	public void editar(Perro perro);
	public void eliminar(Perro perro);
	public Perro buscar(Perro perro);
	public List<Perro>listar();
}
