package com.microservicio.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio.dao.ProductoRepositorio;
import com.microservicio.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoServicio{
	
	@Autowired
	private ProductoRepositorio repo;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> listarProducto() {
		return (List<Producto>)repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto productoPorId(Integer id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public void eliminarProductoId(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public void guardarProducto(Producto producto) {
		repo.save(producto);
		
	}

}
