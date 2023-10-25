package com.example.springcrud.order;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;

import java.util.List;
import java.util.Locale;
import java.util.Map;


@RestController
@AllArgsConstructor
public class OrderController {


    private OrderService os1;




    @GetMapping("/order")
    public OrderResponseDto list() {
        return os1.get();
    }
}
