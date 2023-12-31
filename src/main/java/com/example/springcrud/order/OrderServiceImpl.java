package com.example.springcrud.order;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    public String name;

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderResponseDto get() {
        Long id = 1234L;
        OrderDao order =  orderRepository.getReferenceById(id);
        return new OrderResponseDto("hello");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
