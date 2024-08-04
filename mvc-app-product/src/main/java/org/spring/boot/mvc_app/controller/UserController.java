package org.spring.boot.mvc_app.controller;
import org.spring.boot.mvc_app.model.Product;
import org.spring.boot.mvc_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class UserController {
	//auto wired or auto connecting between controller and user service
	@Autowired
	public UserService userService;
	//end point for home page, where user can see two buttons(add product, display product)
	@GetMapping("/home")
	public String homepage() {
		return "index";
	}
    //end point for add product	
	@GetMapping("/add")
	public String addProduct(Model model) {
		model.addAttribute("product",new Product());
		return "addproduct";
	}
	//end point for processing the user input and validation 
	@PostMapping("/process")
	public String processProduct(@Valid Product product,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "addproduct";
		}
		this.userService.addProduct(product);
		return "redirect:home";
	}
	//end point for display product details
	@GetMapping("/display")
	public String displayProduct(Model model) {
		model.addAttribute("products", this.userService.getProducts());
		return "displayproduct";
	}
	
}
