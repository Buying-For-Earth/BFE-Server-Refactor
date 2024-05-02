package com.bfe.server.repository;

import com.bfe.server.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ProductRepository extends CrudRepository <Product, Long> {
//    @Override
//    ArrayList<Product> findAll();
}
