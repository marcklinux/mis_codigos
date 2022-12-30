package com.mx.SpringRestaurant.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.SpringRestaurant.dominio.Restaurant;

public interface RestaurantDao extends CrudRepository<Restaurant, Integer>{
	
	//ya tengo todos los metodos necesarios
}
