package com.microservice.order_service.service;

import com.microservice.order_service.feign.OrderInterface;
import com.microservice.order_service.model.UserDTO;
import com.microservice.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderInterface orderInterface;


    public List<UserDTO> getUsers() {
        return orderInterface.getUsers();
    }
}
