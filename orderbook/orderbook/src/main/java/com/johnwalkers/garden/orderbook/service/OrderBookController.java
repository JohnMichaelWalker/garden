package com.johnwalkers.garden.orderbook.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping()
public class OrderBookController {

    @GetMapping()
    public List<String> getOrderBook() {
        return List.of("hi", "hey");
    }
}
