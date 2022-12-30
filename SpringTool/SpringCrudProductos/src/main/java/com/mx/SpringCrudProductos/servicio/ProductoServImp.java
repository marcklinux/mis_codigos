package com.mx.SpringCrudProductos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringCrudProductos.dao.ProductoDao;
import com.mx.SpringCrudProductos.dominio.Producto;

@Service
public class ProductoServImp implements ProductoServ {
	
	@Autowired
	ProductoDao productoDao;

	@Override
	public void guardar(Producto producto) {
		productoDao.save(producto);
		
	}

	@Override
	public void editar(Producto producto) {
		productoDao.save(producto);
		
	}

	@Override
	public void eliminar(Producto producto) {
		productoDao.delete(producto);
		
	}

	@Override
	public Producto buscar(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.findById(producto.getId()).orElse(null);
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return (List<Producto>)productoDao.findAll();
	}

}
