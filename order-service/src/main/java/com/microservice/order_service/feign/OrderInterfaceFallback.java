package com.microservice.order_service.feign;

import com.microservice.order_service.model.UserDTO;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
@Component
public class OrderInterfaceFallback implements FallbackFactory<OrderInterface> {

    @Override
    public OrderInterface create(Throwable cause) {
        // Optional: log the cause to see ConnectException / 503 etc.
        System.out.println("⚠️ Feign fallback cause: " + (cause == null ? "unknown" : cause.getClass().getSimpleName() + ": " + cause.getMessage()));

        return new OrderInterface() {
            @Override
            public List<UserDTO> getUsers() {
                // Graceful response when user-service is down
                return Collections.emptyList();
            }
        };
    }
}