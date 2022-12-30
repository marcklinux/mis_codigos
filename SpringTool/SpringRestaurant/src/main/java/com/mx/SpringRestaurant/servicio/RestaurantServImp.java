package com.mx.SpringRestaurant.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.SpringRestaurant.dao.RestaurantDao;
import com.mx.SpringRestaurant.dominio.Restaurant;

@Service
public class RestaurantServImp implements RestaurantServ{

	@Autowired
	RestaurantDao restaurantDao;
	
	@Override
	public void guardar(Restaurant restaurant) {
		restaurantDao.save(restaurant);
		
	}

	@Override
	public void editar(Restaurant restaurant) {
		restaurantDao.save(restaurant);
		
	}

	@Override
	public void eliminar(Restaurant restaurant) {
		restaurantDao.delete(restaurant);
		
	}

	@Override
	public Restaurant buscar(Restaurant restaurant) {
		// TODO Auto-generated method stub
		return restaurantDao.findById(restaurant.getId()).orElse(null);
	}

	@Override
	public List<Restaurant> listar() {
		// TODO Auto-generated method stub
		return (List<Restaurant>)restaurantDao.findAll();
	}

}
