package com.microservice.order_service.feign;

import com.microservice.order_service.model.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "USER-SERVICE", fallbackFactory = OrderInterfaceFallback.class)
public interface OrderInterface {

    @GetMapping("/users/viewAll")
    public List<UserDTO> getUsers();
}
