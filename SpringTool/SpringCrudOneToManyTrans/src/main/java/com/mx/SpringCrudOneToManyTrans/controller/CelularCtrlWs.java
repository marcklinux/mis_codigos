package com.mx.SpringCrudOneToManyTrans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.SpringCrudOneToManyTrans.dominio.Celular;
import com.mx.SpringCrudOneToManyTrans.servicio.CelularServ;





@RestController
@RequestMapping("CelularWs")
@CrossOrigin
public class CelularCtrlWs {
	
	@Autowired
	CelularServ celularServ;
	
	@GetMapping("listar")
	public  List<Celular> listar() {
		var lista = celularServ.listar();
		System.out.println("lista->"+lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void agregar(@RequestBody Celular celular) {
		System.out.println("se guardo->" + celular);
		celularServ.guardar(celular);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Celular celular) {
		System.out.println("se edito->" + celular);
		celularServ.editar(celular);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Celular celular) {
		System.out.println("se elimino->" + celular);
		celularServ.eliminar(celular);
	}

	@PostMapping("buscar")
	public Celular buscar(@RequestBody Celular celular) {
		celular = celularServ.buscar(celular);
		System.out.println("se busco->" + celular);
		return celular;
	}

}
