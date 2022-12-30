package com.mx.SpringCrudUnoMuchos.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="HIJO9")
public class Hijo {
/*CREATE TABLE HIJO9(
ID_HIJO NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
APP NVARCHAR2(100),
HOBBIE NVARCHAR2(150),
ESTATURA NUMBER,
ID_PAPA NUMBER,
CONSTRAINT FK_HIJO_PAPA_9 FOREIGN KEY(ID_PAPA)REFERENCES PAPA9(ID_PAPA)
);
 */
	
	@Id
	int id_hijo;
	String nombre;
	String app;
	String hobbie;
	int estatura;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="ID_PAPA")
	Papa papa;
	
	
}
