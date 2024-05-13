package com.bfe.server.repository;

import com.bfe.server.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    @Override
    ArrayList<Category> findAll();
}
