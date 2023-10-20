package com.example.springcrud.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {

    private final String catalog;

    public MovieRecommender(@Value("${spring.datasource.url:jdbc:mysql://}")
                                String catalog) {
        this.catalog = catalog;
    }
}