package com.microservice.user_service.controller;


import com.microservice.user_service.model.User;
import com.microservice.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/viewAll")
    public  ResponseEntity<List<User>> getUsers(){
        User user = new User();
        return userService.getUsers();
    }

}
