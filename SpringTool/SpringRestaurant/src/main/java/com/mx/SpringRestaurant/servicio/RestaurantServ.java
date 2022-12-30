package com.mx.SpringRestaurant.servicio;

import com.mx.SpringRestaurant.dominio.Restaurant;
import java.util.List;

public interface RestaurantServ {

	public void guardar(Restaurant restaurant);
	public void editar(Restaurant restaurant);
	public void eliminar(Restaurant restaurant);
	
	public Restaurant buscar(Restaurant restaurant);
	public List<Restaurant> listar();
	
}
