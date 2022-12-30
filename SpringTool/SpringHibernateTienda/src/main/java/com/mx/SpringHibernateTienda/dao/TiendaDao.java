package com.mx.SpringHibernateTienda.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mx.SpringHibernateTienda.entidad.Tienda;
import com.mx.SpringHibernateTienda.general.Metodos;

public class TiendaDao implements Metodos {
	
	//carga los objetos mapeados
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("Persistence");
	//implementa los metodos
	EntityManager em = emf.createEntityManager();
	Tienda tienda = null;
	
	@Override
	public String guardar(Object obj) {
	tienda = (Tienda)obj;
	em.getTransaction().begin();
	String r = null;
		try {
			em.persist(tienda);
			em.getTransaction().commit();
			r = "1";
			System.out.println("se guardo->" + tienda);
		}catch(Exception e) {
			em.getTransaction().rollback();
			r = e.getMessage();
			System.out.println("Error guardar->"+e.getMessage());
		}
		return r;
	}//cierra guardar

	@Override
	public String editar(Object obj) {
		tienda = (Tienda)obj;
		em.getTransaction().begin();
		String r = null;
			try {
				em.merge(tienda);
				em.getTransaction().commit();
				r = "1";
				System.out.println("se edito->" + tienda);
			}catch(Exception e) {
				em.getTransaction().rollback();
				r = e.getMessage();
				System.out.println("Error editar->"+e.getMessage());
			}
			return r;
	}

	@Override
	public String eliminar(Object obj) {
		tienda = (Tienda)obj;
		em.getTransaction().begin();
		String r = null;
			try {
				em.remove(tienda);
				em.getTransaction().commit();
				r = "1";
				System.out.println("se elimino->" + tienda);
			}catch(Exception e) {
				em.getTransaction().rollback();
				r = e.getMessage();
				System.out.println("Error eliminar->"+e.getMessage());
			}
			return r;
	}

	@Override
	public Object buscar(Object obj) {
	tienda = (Tienda)obj;
	tienda = em.find(Tienda.class, tienda.getId());
	return tienda;
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return em.createQuery("from Tienda order by id").getResultList();
	}

}
