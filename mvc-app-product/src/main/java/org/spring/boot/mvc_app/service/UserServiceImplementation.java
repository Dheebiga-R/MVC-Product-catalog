package org.spring.boot.mvc_app.service;

import java.util.List;

import org.spring.boot.mvc_app.model.Product;
import org.spring.boot.mvc_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	public UserRepository userRepository;
	
	//implementation for add product method
	@Override
	public Product addProduct(Product product) {
		return this.userRepository.save(product);
	}

	//implementation for get products method
	@Override
	public List<Product> getProducts() {
	    return this.userRepository.findAll();
	}

}
