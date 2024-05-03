package com.bfe.server.service;

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
}