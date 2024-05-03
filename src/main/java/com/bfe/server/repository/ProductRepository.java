package com.bfe.server.repository;

import com.bfe.server.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository extends CrudRepository <Product, Long> {
    @Query(value = "" +
            "select *" +
            "from product " +
            "where category_id = :id",
            nativeQuery = true)
    List<Product> findByCategoryId(Long id);
}
