package com.mx.SpringCrudPaisEstado.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="PAIS")
public class Pais {
/*CREATE TABLE PAIS (
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(20),
CONTINENTE NVARCHAR2(30)
);*/
	@Id
	int id;
	String nombre;
	String continente;
	
	@OneToMany(mappedBy = "pais", cascade =CascadeType.ALL)
	List<Estado> lista = new ArrayList<Estado>();
	
	public Pais() {
		
	}

	public Pais(int id, String nombre, String continente) {
		
		this.id = id;
		this.nombre = nombre;
		this.continente = continente;
	}
	
	

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", continente=" + continente + "]\n";
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

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}
	
	
	
}
