package com.spring.restuarant.service;

import com.spring.restuarant.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    public List<Order> getAllOrders();

}
