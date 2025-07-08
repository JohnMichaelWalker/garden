package com.johnwalkers.garden.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("garden")
public class GardenController {

    @GetMapping("hello")
    public String getGardenString() {
        return "the garden string!";
    }
}
