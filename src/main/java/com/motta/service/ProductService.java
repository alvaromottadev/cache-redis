package com.motta.service;

import com.motta.model.Product;
import com.motta.repository.ProductRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Cacheable(value = "products")
    public List<Product> getAllProducts() {
        System.out.println("Fetching products from the database...");
        return this.productRepository.findAll();
    }

    @CacheEvict(value = "products")
    public void resetCache(){
        System.out.println("Resetting cache and database...");

    }

}
