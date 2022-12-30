package com.mx.SpringCrudCantante.servicio;

import java.util.List;

import com.mx.SpringCrudCantante.dominio.Cantante;

public interface CantanteServ {
	
	public void guardar(Cantante cantante);
	public void editar(Cantante cantante);
	public void eliminar(Cantante cantante);
	public Cantante buscar(Cantante cantante);
	public List<Cantante> listar();

}
