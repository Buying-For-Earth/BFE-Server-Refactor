package com.bfe.server.service;

import com.bfe.server.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {
    @Autowired
    ProductService productService;

    @Test
    void show() {
        Long id = 1L;
        Product expected = new Product(id, "[엔데어]친환경 고체 샴푸바", 12800, "지구를 위한 착한 소비", "링크 예시");
        Product product = productService.show(id);
        assertEquals(expected.toString(), product.toString());
    }
}