package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.demo.JPAConfiguration;
import com.demo.services.ProductService;

public class Demo {
	
	public  static void main(String[] args) {
		
		try {
			
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
			ProductService productService = context.getBean(ProductService.class);
			System.out.println("Sum Quantities: " + productService.sumQuantities());
			System.out.println("Total: " + productService.total());
			context.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
			
		}
	}

}
