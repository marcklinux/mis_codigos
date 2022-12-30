package com.mx.SpringCrudOneToManyTrans.servicio;

import java.util.List;


import com.mx.SpringCrudOneToManyTrans.dominio.Marca;

public interface MarcaServ {

	public void guardar(Marca marca);
	public void editar(Marca marca);
	public void eliminar(Marca marca);
	public Marca buscar(Marca marca);
	public List<Marca>listar();
}
