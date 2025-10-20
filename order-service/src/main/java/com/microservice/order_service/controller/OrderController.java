package com.microservice.order_service.controller;

import com.microservice.order_service.model.UserDTO;
import com.microservice.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;


    @GetMapping("viewAllUsers")
    public List<UserDTO> getUsers(){
        return orderService.getUsers();
    }

}
