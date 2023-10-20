package com.example.springcrud.order;


public interface OrderService {

    public OrderResponseDto get();

    public void setName(String name);

    public String getName();
}
