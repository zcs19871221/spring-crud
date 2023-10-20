package com.example.springcrud.order;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Proxy;

@Entity
@Data
@Table(name = "product_order")
@Proxy(lazy = false)
public class OrderDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
}
