package com.pruebas.banco.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bancos")
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Column(name = "total_transferencias")
	private int totalTranserencias;

	public Banco() {
		super();
	}

	public Banco(Long id, String nombre, int totalTranserencias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.totalTranserencias = totalTranserencias;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTotalTranserencias() {
		return totalTranserencias;
	}

	public void setTotalTranserencias(int totalTranserencias) {
		this.totalTranserencias = totalTranserencias;
	}

	
}
