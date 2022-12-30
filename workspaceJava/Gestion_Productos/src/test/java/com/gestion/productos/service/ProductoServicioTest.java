package com.gestion.productos.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gestion.productos.entidades.Producto;
import com.gestion.productos.servicio.ProductoServicio;

public class ProductoServicioTest {

	@Mock
	private ProductoServicio servicio;
	
	Producto producto;
	
	List<Producto> productos = new ArrayList<Producto>();
	
	@BeforeEach
	void setUp() {
		
		MockitoAnnotations.openMocks(this);
		
		producto = new Producto();
		
		producto.setNombre("carro");
		producto.setMarca("chevrolet");
		producto.setPrecio(12);
		producto.setId(11L);
		
		productos.add(producto);
		
		
	}
	
	@Test
	void findAllTest() {
		
		when(servicio.getAll()).thenReturn(productos);
		
		assertNotNull(servicio.getAll());
		
	}
}
