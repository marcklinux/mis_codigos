package com.mx.SpringAutos.servicio;

import java.util.List;

import com.mx.SpringAutos.dominio.AutoVw;

public interface AutoVwServ {
	
	public void guardar(AutoVw autoVw);
	public void editar(AutoVw autoVw);
	public void eliminar(AutoVw autoVw);
	public AutoVw buscar(AutoVw autoVw);
	public List<AutoVw>listar();
}
