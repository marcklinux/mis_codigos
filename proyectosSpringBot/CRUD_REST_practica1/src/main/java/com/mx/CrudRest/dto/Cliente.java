package com.mx.CrudRest.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre")
	private String name;
	@Column(name="apellido")
	private String apellido;
	@Column(name="direccion")
	private String direccion;
	@Column(name="dni")
	private int dni;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public Cliente() {
		
	}

	public Cliente(Long id, String name, String apellido, String direccion, int dni, Date fecha) {
	
		this.id = id;
		this.name = name;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}
	
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", name=" + name + ", apellido=" + apellido + ", direccion=" + direccion + ", dni="
				+ dni + ", fecha=" + fecha + "]\n";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
