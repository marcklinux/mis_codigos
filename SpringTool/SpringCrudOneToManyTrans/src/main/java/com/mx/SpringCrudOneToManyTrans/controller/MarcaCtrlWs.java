package com.mx.SpringCrudOneToManyTrans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudOneToManyTrans.dominio.Marca;
import com.mx.SpringCrudOneToManyTrans.servicio.MarcaServ;



@RestController
@RequestMapping("MarcaWs")
@CrossOrigin
public class MarcaCtrlWs {

	@Autowired
	MarcaServ marcaServ;
	
	@GetMapping("listar")
	public  List<Marca> listar() {
		var lista = marcaServ.listar();
		System.out.println("lista->"+lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void agregar(@RequestBody Marca marca) {
		System.out.println("se guardo->" + marca);
		marcaServ.guardar(marca);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Marca marca) {
		System.out.println("se edito->" + marca);
		marcaServ.editar(marca);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Marca marca) {
		System.out.println("se elimino->" + marca);
		marcaServ.eliminar(marca);
	}

	@PostMapping("buscar")
	public Marca buscar(@RequestBody Marca marca) {
		marca = marcaServ.buscar(marca);
		System.out.println("se busco->" + marca);
		return marca;
	}

}
