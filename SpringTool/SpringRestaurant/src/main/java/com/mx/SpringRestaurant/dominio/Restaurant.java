package com.mx.SpringRestaurant.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANT")
public class Restaurant {
	
	//ID NUMBER PRIMARY KEY,
	//NOMBRE INVARCHAR2(100),
	//TELEFONO INVARCHAR2(10),
	//DIRECCION INVARCHAR(100)
	//);

	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;
	
	@Column(name="NOMBRE", columnDefinition="INVARCHAR2(100)")
	String nombre;
	
	@Column(name="TELEFONO", columnDefinition="INVARCHAR2(10)")
	String telefono;
	
	@Column(name="DIRECCION", columnDefinition="INVARCHAR2(100)")
	String direccion;
	
	
	
	public Restaurant() {
		
	}
	

	public Restaurant(int id, String nombre, String telefono, String direccion) {
	
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
