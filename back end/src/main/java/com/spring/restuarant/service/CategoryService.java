package com.spring.restuarant.service;

import com.spring.restuarant.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    public List<Category> getAllCategories();

}
