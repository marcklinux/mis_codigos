package com.mx.SpringCrudUnoMuchos.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="PAPA9")
public class Papa {

	/*CREATE TABLE PAPA9(
ID_PAPA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
APP NVARCHAR2(100),
EDAD NUMBER
);
	 * */
	@Id
	int id_papa;
	String nombre;
	String app;
	int edad;
	
	@OneToMany(mappedBy = "papa", cascade =CascadeType.ALL)
	List<Hijo> lista = new ArrayList<Hijo>();
	
	public Papa() {
		
	}

	public Papa(int id_papa, String nombre, String app, int edad) {
		
		this.id_papa = id_papa;
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
	}
	

	@Override
	public String toString() {
		return "Papa [id_papa=" + id_papa + ", nombre=" + nombre + ", app=" + app + ", edad=" + edad + "]\n";
	}

	public int getId_papa() {
		return id_papa;
	}

	public void setId_papa(int id_papa) {
		this.id_papa = id_papa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
		
	}
	
	

	