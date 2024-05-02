package com.bfe.server.controller;

import com.bfe.server.entity.Product;
import com.bfe.server.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return productService.show(id);
    }
}