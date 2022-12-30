package com.mx.SpringCrudOneToManyTrans.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CELULAR9")
public class Celular {
/*CREATE TABLE CELULAR9(
ID NUMBER PRIMARY KEY,
MODELO NVARCHAR2(100),
ID_MARCA NUMBER,
PRECIO NUMBER,
SO NVARCHAR2(100),*/
	
	@Id
	int id;
	String modelo;
	double precio;
	String so;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_MARCA")
	Marca marca;
}
