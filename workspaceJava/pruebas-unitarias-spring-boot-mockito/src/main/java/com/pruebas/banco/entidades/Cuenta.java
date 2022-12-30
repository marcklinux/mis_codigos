package com.pruebas.banco.entidades;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pruebas.banco.excepciones.DineroInsuficienteException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cuentas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String persona;
	private BigDecimal saldo;
	
	public void realizarDebito(BigDecimal monto) {
		BigDecimal nuevoSaldo = this.saldo.subtract(monto);
		if(nuevoSaldo.compareTo(BigDecimal.ZERO) < 0) {
			throw new  DineroInsuficienteException("Dinero insuficiente en la cuenta");
		}
		
		this.saldo = nuevoSaldo;
	}
	
	public void realizarCredito(BigDecimal monto) {
		this.saldo = saldo.add(monto);
	}

}
