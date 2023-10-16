package com.example.springcrud.order;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderResponse get() {
        Long id = 1234L;
        Order order =  orderRepository.getReferenceById(id);
        return new OrderResponse("hello");
    }
}
