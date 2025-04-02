package com.gabrielpit.inventory_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielpit.inventory_management.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
