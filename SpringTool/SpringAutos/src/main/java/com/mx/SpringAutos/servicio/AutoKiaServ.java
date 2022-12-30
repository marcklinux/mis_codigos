package com.mx.SpringAutos.servicio;

import java.util.List;

import com.mx.SpringAutos.dominio.AutoKia;



public interface AutoKiaServ {
	
	public void guardar(AutoKia autoKia);
	public void editar(AutoKia autoKia);
	public void eliminar(AutoKia autoKia);
	public AutoKia buscar(AutoKia autoKia);
	public List<AutoKia>listar();
}
