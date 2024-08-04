package org.spring.boot.mvc_app.repository;

import org.spring.boot.mvc_app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Product, Long>{

}
