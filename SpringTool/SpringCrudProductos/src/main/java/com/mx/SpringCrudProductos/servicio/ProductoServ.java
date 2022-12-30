package com.mx.SpringCrudProductos.servicio;


import java.util.List;

import com.mx.SpringCrudProductos.dominio.Producto;

public interface ProductoServ {
	
	public void guardar(Producto producto);
	public void editar(Producto producto);
	public void eliminar(Producto producto);
	
	public Producto buscar(Producto producto);
	public List<Producto> listar();

}
