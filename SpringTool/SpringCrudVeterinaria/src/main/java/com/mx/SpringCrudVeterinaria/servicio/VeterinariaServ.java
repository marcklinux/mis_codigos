package com.mx.SpringCrudVeterinaria.servicio;

import java.util.List;

import com.mx.SpringCrudVeterinaria.dominio.Veterinaria;

public interface VeterinariaServ {
	
	public void guardar(Veterinaria veterinaria);
	public void editar(Veterinaria veterinaria);
	public void eliminar(Veterinaria veterinaria);
	public Veterinaria buscar(Veterinaria veterinaria);
	public List<Veterinaria> listar();
}
