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

    public Product update(Long id, ProductDto productDto) {
        Product target = productRepository.findById(id).orElse(null);

        // TODO 코드 개선 필요, 프로덕트 카테고리 변경 대응할 수 있도록 구성
        Long categoryId = null;
        if (target != null) {
            categoryId = target.getCategory().getId();
        }
        Category category = null;
        if (categoryId != null) {
            category = categoryRepository.findById(categoryId).orElse(null);
        }

        Product product = productDto.toEntity(category);

        if (target == null || !id.equals(product.getId())) {
            return null;
        }

        target.patch(product);
        return productRepository.save(target);
    }
}
