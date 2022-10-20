package com.spring.restuarant.repository;

import com.spring.restuarant.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Long> {
}
