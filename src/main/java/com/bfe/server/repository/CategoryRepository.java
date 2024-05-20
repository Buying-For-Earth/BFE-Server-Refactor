package com.bfe.server.repository;

import com.bfe.server.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;

@RepositoryRestResource
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
