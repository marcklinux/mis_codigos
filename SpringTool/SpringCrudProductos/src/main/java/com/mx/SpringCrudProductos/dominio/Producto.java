package com.mx.SpringCrudProductos.dominio;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PRODUCTOW")
public class Producto {
	
	/*CREATE TABLE PRODUCTOW(
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
PRECIO NUMBER,
TIPO NVARCHAR2(100)
);
	 * 
	 */
	@Id
	int id;
	String nombre;
	double precio;
	String tipo;

	public Producto() {
		
	}

	public Producto(int id, String nombre, double precio, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
	}
	
	

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo + "]\n";
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
