package com.mx.SpringCrudPerros.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;






@Entity
@Table(name="Perro")
public class Perro {

	/*CREATE TABLE PERRO (
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(20),
RAZA NVARCHAR2(10),
EDAD NVARCHAR2(10),
DESCRIPCION NVARCHAR2(100)
);
 */
	
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	String nombre;
	
	@Column(name="RAZA", columnDefinition="NVARCHAR2(10)")
	String raza;
	
	@Column(name="EDAD", columnDefinition="NVARCHAR2(10)")
	String edad;
	
	@Column(name="DESCRIPCION", columnDefinition="NVARCHAR2(100)")
	String descripcion;
	
	public Perro() {
		
	}

	public Perro(int id, String nombre, String raza, String edad, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.descripcion = descripcion;
	}
	
	

	@Override
	public String toString() {
		return "Perro [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", descripcion="
				+ descripcion + "]\n";
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
