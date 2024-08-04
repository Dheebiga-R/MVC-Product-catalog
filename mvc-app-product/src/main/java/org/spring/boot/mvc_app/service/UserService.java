package org.spring.boot.mvc_app.service;

import java.util.List;

import org.spring.boot.mvc_app.model.Product;

public interface UserService {

	//method for add product
	public Product addProduct(Product product);
	//method for get all products
	public List<Product> getProducts();
}
