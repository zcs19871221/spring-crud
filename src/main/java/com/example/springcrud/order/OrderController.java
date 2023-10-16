package com.example.springcrud.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {


    private OrderService orderService;

    public OrderController(OrderService os) {
        this.orderService = os;
    }

    @GetMapping("/order")
    public OrderResponse list() {
        return orderService.get();
    }
}
