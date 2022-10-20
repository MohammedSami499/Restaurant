package com.spring.restuarant.repository;

import com.spring.restuarant.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order , Long> {
}
