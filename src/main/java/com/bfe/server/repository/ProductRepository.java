package com.bfe.server.repository;

import com.bfe.server.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends CrudRepository <Product, Long> {
    @Query(value = "" +
            "select *" +
            "from product " +
            "where category_id = :id",
            nativeQuery = true)
    List<Product> findByCategoryId(Long id);
}
