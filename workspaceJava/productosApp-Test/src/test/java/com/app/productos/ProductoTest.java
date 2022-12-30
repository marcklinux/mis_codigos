package com.app.productos;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace =Replace.NONE)
public class ProductoTest {
	
	@Autowired
	private ProductoRepositorio repositorio;
	
	@Test
	@Rollback(false)
	public void testGuardarProducto() {
		
		Producto producto = new Producto("Televisor sony bravia",12000);
		Producto productoGuardado = repositorio.save(producto);
		
		assertNotNull(productoGuardado);
		
		
	}
	
	@Test
	public void testBuscarProductoPorNombre() {
		String nombre = "Televisor samsung HD";
		Producto producto = repositorio.findByNombre(nombre);
		
		assertThat(producto.getNombre()).isEqualTo(nombre);
	}
	
	@Test
	public void testBuscarProductoPorNombreNoExistente() {
		String nombre = "Iphone 11";
		Producto producto = repositorio.findByNombre(nombre);
		
		assertNull(producto);
	}
	
	@Test
	@Rollback(false)
	public void testActualizarProducto() {
		
		String nombreProducto = "Televisor HD java"; //el nuevo valor
		Producto producto = new Producto(nombreProducto,2000);//valores nuevos
		producto.setId(4);//id producto a modificar
		repositorio.save(producto);
		Producto productoActualizado = repositorio.findByNombre(nombreProducto);
		
		assertThat(productoActualizado.getNombre()).isEqualTo(nombreProducto);
			
	}
	
	@Test
	public void testListarProductos() {
		List<Producto> productos = (List<Producto>) repositorio.findAll();
		for(Producto producto : productos) {
			System.out.println(producto);
		}
		assertThat(productos).size().isGreaterThan(0);
	}
	
	@Test
	@Rollback(false)
	public void testEliminarProducto() {
		Integer id = 2;
		
		boolean esExistenteAntesDeEliminar = repositorio.findById(id).isPresent();
		
		repositorio.deleteById(id);
		
		boolean noExistenteDespuesDeEliminar = repositorio.findById(id).isPresent();
		
		assertTrue(esExistenteAntesDeEliminar);
		assertFalse(noExistenteDespuesDeEliminar);
	}

}
