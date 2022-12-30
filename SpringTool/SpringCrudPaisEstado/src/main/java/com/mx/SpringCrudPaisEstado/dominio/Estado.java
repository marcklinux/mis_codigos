package com.mx.SpringCrudPaisEstado.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="ESTADO")
public class Estado {
 /*CREATE TABLE ESTADO(
ID NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(20),
REGION NVARCHAR2(30),
HABITANTES NUMBER,
CAPITAL NVARCHAR2(20),
ID_PAIS NUMBER,*/
	
	@Id
	int id;
	String nombre;
	String region;
	int habitantes;
	String capital;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ID_PAIS")
	Pais pais;
	
}
