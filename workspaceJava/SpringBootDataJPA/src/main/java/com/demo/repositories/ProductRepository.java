package com.demo.repositories;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entities.Product;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product,Integer>{
	
	@Query(value = "SELECT sum(quantity) FROM Product")
	public Long sumQuantities();
	
	@Query(value = "SELECT sum(quantity * price) FROM Product")
	public BigDecimal total();

}
