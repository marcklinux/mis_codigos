package com.microservicio.servicio;

import java.util.List;

import com.microservicio.entity.Producto;

public interface ProductoServicio {
	
	List<Producto> listarProducto();
	Producto productoPorId(Integer id);
	void eliminarProductoId(Integer id);
	void guardarProducto(Producto producto);

}
