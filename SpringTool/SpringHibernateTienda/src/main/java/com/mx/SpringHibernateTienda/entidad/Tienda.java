package com.mx.SpringHibernateTienda.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tienda")
public class Tienda {
/*CREATE TABLE TIENDA(
	ID PRIMARY KEY,
	NOMBRE NVARCHAR2(100),
	SLOGAN NVARCHAR(100),
	CORREO NVARCHAR(100),
	);
	*/
	
	@Id
	int id;
	String nombre;
	String slogan;
	String correo;
	
	public Tienda() {
		
	}
	
	public Tienda(int id) {
		this.id = id;
	}

	public Tienda(int id, String nombre, String slogan, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.slogan = slogan;
		this.correo = correo;
	}
	
	

	@Override
	public String toString() {
		return "Tienda [id=" + id + ", nombre=" + nombre + ", slogan=" + slogan + ", correo=" + correo + "]\n";
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

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
}
