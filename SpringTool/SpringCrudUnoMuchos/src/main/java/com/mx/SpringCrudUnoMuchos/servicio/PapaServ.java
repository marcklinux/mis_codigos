package com.mx.SpringCrudUnoMuchos.servicio;

import java.util.List;

import com.mx.SpringCrudUnoMuchos.dominio.Papa;

public interface PapaServ {

public void guardar(Papa papa);
public void editar(Papa papa);
public void eliminar(Papa papa);
public Papa buscar(Papa papa);
public List<Papa> listar();
}
