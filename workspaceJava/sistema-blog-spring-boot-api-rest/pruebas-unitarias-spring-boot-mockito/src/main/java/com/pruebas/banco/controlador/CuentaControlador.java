package com.pruebas.banco.controlador;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.banco.entidades.Cuenta;
import com.pruebas.banco.entidades.TransaccionDTO;
import com.pruebas.banco.servicio.CuentaServicio;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaControlador {
	
	@Autowired
	private CuentaServicio cuentaServicio;
	
	@GetMapping("/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public Cuenta verDetalles(@PathVariable Long id) {
		return cuentaServicio.findById(id);
	}
	
	public ResponseEntity<?> transferirDinero(@RequestBody TransaccionDTO transaccionDto){
		cuentaServicio.transferirDinero(transaccionDto.getCuentaOrigenId(), transaccionDto.getCuentaDestinoId(), transaccionDto.getMonto(), transaccionDto.getBancoId());
		
		Map<String,Object> respuesta = new HashMap<>();
		respuesta.put("date", LocalDate.now().toString());
		respuesta.put("status", "OK");
		respuesta.put("mensaje", "transferecia realizada con exito");
		respuesta.put("transaccion", transaccionDto);
		
		return ResponseEntity.ok(respuesta);
	}

}
