package com.example.springcrud.order;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {

    @AllArgsConstructor
    class Response {
        public String name;
    }
    @GetMapping("/order")
    public Response list() {
        return new Response("zcs");
    }
}
