package com.bfe.server.service;

import com.bfe.server.dto.ProductDto;
import com.bfe.server.entity.Category;
import com.bfe.server.entity.Product;
import com.bfe.server.repository.CategoryRepository;
import com.bfe.server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    public Product show (Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> showProductsByCategoryId(Long id) {
        return productRepository.findByCategoryId(id);
    }

    public Product create(ProductDto productDto) {
        Category category = categoryRepository.findById(productDto.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("없는 카테고리입니다."));

        Product product = productDto.toEntity(category);
        if(product.getId() != null) return null;
        return productRepository.save(product);
    }
}
