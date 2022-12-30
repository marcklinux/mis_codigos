package com.microservicio.item.servicio;

import java.util.List;

import com.microservicio.item.entidad.Item;

public interface ItemServicio {
	
	List<Item>listarItem();
	
	Item itemPorId(Integer id,Integer cantidad);
		
	
	

}
