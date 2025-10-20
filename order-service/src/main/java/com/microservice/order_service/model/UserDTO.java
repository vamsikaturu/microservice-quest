package com.microservice.order_service.model;


import lombok.Data;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String email;

}
