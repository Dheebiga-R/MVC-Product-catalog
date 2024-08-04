package org.spring.boot.mvc_app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
    //auto generated id 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	//name field and validation
	@Column(nullable=false)
	@NotBlank(message="Name field should not empty")
	@Size(min=4,message="Name field should contain atleast 4 letters")
	private String name;
	//price field and validation
	@DecimalMin(value = "0.0", inclusive = false, message="Price should not zero")
	private double price;
	//category field and validation
	@Column(nullable = false)
	@NotBlank(message="Category field should not empty")
	private String category;
}
