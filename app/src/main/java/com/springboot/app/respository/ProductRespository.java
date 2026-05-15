package com.springboot.app.respository;

import java.util.ArrayList;


import java.util.List;

import org.springframework.stereotype.Repository;
import com.springboot.app.model.Product;
@Repository
public class ProductRespository {
	private List<Product> list = new ArrayList<Product>();
	public void createProduct() {
//	   list = List.of(new Product(1,"laptop",3,50000),
//			   new Product(2,"laptop",3,50000));
	}

}
