package com.gabrielpit.inventory_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielpit.inventory_management.model.Product;
import com.gabrielpit.inventory_management.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        return productRepository.findById(id)
                .map(existingProduct -> {
                    existingProduct.setName(product.getName());
                    existingProduct.setQuantity(product.getQuantity());
                    existingProduct.setPrice(product.getPrice());
                    return productRepository.save(existingProduct);
                }).orElseThrow(() -> {
                    throw new RuntimeException("Product not found");
                });
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

}
