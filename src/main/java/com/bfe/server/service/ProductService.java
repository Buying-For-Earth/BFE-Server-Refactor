package com.bfe.server.service;

import com.bfe.server.entity.Product;
import com.bfe.server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product show (Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
