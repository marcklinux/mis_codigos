package com.mx.SpringCrudCantante.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CANTANTE")
public class Cantante {

	/*CREATE TABLE CANTANTE (
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(20),
GENERO NVARCHAR2(20),
BOLETO NUMBER(10),
PAIS NVARCHAR2(20)
);
 */
	@Id
	int id;
	String nombre;
	String genero;
	double boleto;
	String pais;
	
	public Cantante() {
		
	}
	
}
