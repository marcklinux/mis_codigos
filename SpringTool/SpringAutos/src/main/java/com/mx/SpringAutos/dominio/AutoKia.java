package com.mx.SpringAutos.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AUTOKIA")
public class AutoKia {
	
	/*CREATE TABLE AUTOKIA (
    ID NUMBER PRIMARY KEY,
    MODELO NVARCHAR2(10),
    MARCA NVARCHAR2(10),
    PRECIO NUMBER(15),
    PUERTAS NUMBER(2)
);
	 */
	@Id
	@Column(name="ID", columnDefinition="NUMBER")
	int id;
	
	@Column(name="MODELO", columnDefinition="INVARCHAR(10)")
	String modelo;
	
	@Column(name="MARCA", columnDefinition="INVARCHAR(10)")
	String marca;
	
	@Column(name="PRECIO", columnDefinition="NUMBER(15)")
	double precio;
	
	@Column(name="PUERTAS", columnDefinition="NUMBER(2)")
	int puertas;
	
	public AutoKia() {
		
	}

	public AutoKia(int id, String modelo, String marca, double precio, int puertas) {
		
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.puertas = puertas;
	}
	
	

	@Override
	public String toString() {
		return "AutoKia [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", puertas="
				+ puertas + "]";
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

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	
}
