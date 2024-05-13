package com.bfe.server.service;

import com.bfe.server.dto.CategoryDto;
import com.bfe.server.entity.Category;
import com.bfe.server.entity.Product;
import com.bfe.server.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> showAllCategories() {
        return categoryRepository.findAll();
    }

    public Category addCategory(CategoryDto categoryDto) {
        Category category = categoryDto.toEntity();
        if(category.getId() != null) return null;
        return categoryRepository.save(category);
    }
}
