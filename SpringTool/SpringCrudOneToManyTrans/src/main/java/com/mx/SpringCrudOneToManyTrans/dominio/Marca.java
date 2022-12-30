package com.mx.SpringCrudOneToManyTrans.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MARCACEL")
public class Marca {

	/*CREATE TABLE MARCACEL(
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(50),
PAIS NVARCHAR2(50),
SLOGAN NVARCHAR2(100)
);*/
	
	@Id
	int id;
	String nombre;
	String pais;
	String slogan;
	
	@OneToMany(mappedBy="marca", cascade=CascadeType.ALL)
	List<Celular> lista = new ArrayList<Celular>();

	
	public Marca() {
		
	}

	public Marca(int id, String nombre, String pais, String slogan) {
		
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.slogan = slogan;
	}
	
	

	@Override
	public String toString() {
		return "Marca [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", slogan=" + slogan + "]\n";
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	
	
	
	
}
