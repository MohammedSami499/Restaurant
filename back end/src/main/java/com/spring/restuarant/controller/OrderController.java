package com.spring.restuarant.controller;

import com.spring.restuarant.model.Category;
import com.spring.restuarant.model.Order;
import com.spring.restuarant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
public class OrderController {

    OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //http://localhost:8088/api/allOrders
    @GetMapping("/api/allOrders")
    public List<Order> getAllCategories(){
        return orderService.getAllOrders();
    }

}
