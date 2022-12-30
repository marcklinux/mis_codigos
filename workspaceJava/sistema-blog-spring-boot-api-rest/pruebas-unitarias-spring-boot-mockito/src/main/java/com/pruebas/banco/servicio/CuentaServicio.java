package com.pruebas.banco.servicio;

import java.math.BigDecimal;
import java.util.List;

import com.pruebas.banco.entidades.Cuenta;

public interface CuentaServicio {
	
	public List<Cuenta> findAll();
	public Cuenta findById(Long id);
	public Cuenta save(Cuenta cuenta);
	public int revisarTotalTransferencias(Long bancoId);
	public BigDecimal revisarSaldo(Long cuentaId);
	public void transferirDinero(Long numeroCuentaOrigen,Long numeroCuentaDestino,BigDecimal monto,Long bancoId);
	

}
