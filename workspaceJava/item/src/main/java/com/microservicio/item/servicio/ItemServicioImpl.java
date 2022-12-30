package com.microservicio.item.servicio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservicio.item.entidad.Item;
import com.microservicio.item.entidad.Producto;

@Service
public class ItemServicioImpl implements ItemServicio{
	
	@Autowired
	private RestTemplate clienteRest;

	@Override
	public List<Item> listarItem() {
		List<Producto> producto = Arrays.asList(clienteRest.getForObject("http://localhost:7002/producto/all", Producto[].class)) ;
		return producto.stream().map(p-> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item itemPorId(Integer idItem,Integer cantidad) {
	Map<String,String> pathVariables = new HashMap<String,String>();
	pathVariables.put("id", idItem.toString());
	Producto producto = clienteRest.getForObject("http://localhost:7002/producto/{id}", Producto.class,pathVariables);
	return new Item(producto,cantidad);
	}

}
