package com.demo.services;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.repositories.ProductRepository;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Long sumQuantities() {
		
		return productRepository.sumQuantities();
	}

	@Override
	public BigDecimal total() {
		
		return productRepository.total();
	}

}
