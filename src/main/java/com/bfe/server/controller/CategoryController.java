//package com.bfe.server.controller;
//
//
//import com.bfe.server.dto.CategoryDto;
//import com.bfe.server.entity.Category;
//import com.bfe.server.entity.Product;
//import com.bfe.server.service.CategoryService;
//import com.bfe.server.service.ProductService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Slf4j
//@RestController
//public class CategoryController {
//    @Autowired
//    CategoryService categoryService;
//
//    @Autowired
//    ProductService productService;
//
//    @GetMapping("/category/{id}")
//    public List<Product> showCategoryProducts (@PathVariable Long id){
//        return productService.showProductsByCategoryId(id);
//    }
//
//    @GetMapping("/category/all")
//    public List<Category> showAllCategories () {
//        return categoryService.showAllCategories();
//    }
//
//    @PostMapping("/category")
//    public ResponseEntity<Category> addCategory (@RequestBody CategoryDto categoryDto) {
//        Category created = categoryService.addCategory(categoryDto);
//        return (created != null) ?
//                ResponseEntity.status(HttpStatus.CREATED).body(created) :
//                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//    }
//}
