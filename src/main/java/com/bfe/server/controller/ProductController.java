package com.bfe.server.controller;

import com.bfe.server.dto.ProductDto;
import com.bfe.server.entity.Product;
import com.bfe.server.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public Product show(@PathVariable Long id) {
        return productService.show(id);
    }

    @PostMapping("/product")
    public ResponseEntity<Product> create(@RequestBody ProductDto productDto) {
        Product created = productService.create(productDto);
        return (created != null) ?
                ResponseEntity.status(HttpStatus.CREATED).body(created) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PostMapping("/product/{id}")
    public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody ProductDto productDto) {
        Product updated = productService.update(id, productDto);
        return (updated != null) ?
                ResponseEntity.status(HttpStatus.OK).body(updated) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
