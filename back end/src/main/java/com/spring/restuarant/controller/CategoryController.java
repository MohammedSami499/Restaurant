package com.spring.restuarant.controller;

import com.spring.restuarant.model.Category;
import com.spring.restuarant.repository.CategoryRepository;
import com.spring.restuarant.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    //http://localhost:8088/api/allCategories
    @GetMapping("/api/allCategories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
