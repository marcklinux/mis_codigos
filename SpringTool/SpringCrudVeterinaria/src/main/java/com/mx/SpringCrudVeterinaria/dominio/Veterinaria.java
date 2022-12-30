package com.mx.SpringCrudVeterinaria.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="VETERINARIA")
public class Veterinaria {

	/*CREATE TABLE VETERINARIA (
    ID NUMBER PRIMARY KEY,
    NOMBRE NVARCHAR2(20),
    TELEFONO NVARCHAR2(10),
    CORREO NVARCHAR2(20),
    PRECIOCON NUMBER(10)
);
	 * */
	@Id
	int id;
	String nombre;
	String telefono;
	String correo;
	double preciocon;
	
	
	public Veterinaria() {
		
	}
	
}
