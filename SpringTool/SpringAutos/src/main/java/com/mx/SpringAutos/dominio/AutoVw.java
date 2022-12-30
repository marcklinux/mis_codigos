package com.mx.SpringAutos.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTOVW")
public class AutoVw {
	
	/*
	 * CREATE TABLE AUTOVW (
    ID NUMBER PRIMARY KEY,
    MODELO NVARCHAR2(10),
    MARCA NVARCHAR2(10),
    PRECIO NUMBER(15),
    COLOR NVARCHAR2(10)
);
	 */
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;
	
	@Column(name="MODELO", columnDefinition="NVARCHAR2(10)")
	String modelo;
	
	@Column(name="MARCA", columnDefinition="NVARCHAR2(10)")
	String marca;
	
	@Column(name="PRECIO", columnDefinition="NUMBER(15)")
	double precio;
	
	@Column(name="COLOR", columnDefinition="NVARCHAR2(10)")
	String color;
	
	public AutoVw() {
		
	}

	public AutoVw(int id, String modelo, String marca, double precio, String color) {
		
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return "AutoVw [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", color="
				+ color + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
