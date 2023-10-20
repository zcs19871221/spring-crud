package com.example.springcrud.order;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class OrderController {


    @Resource
    private OrderService os1;

    private List<OrderService> orderServices;

    private Map<String, OrderService> map;

    private MovieRecommender ff;

    @GetMapping("/order")
    public OrderResponseDto list() {

        return os1.get();
    }
}
