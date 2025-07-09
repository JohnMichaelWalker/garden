package com.johnwalkers.garden.petunia.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("petunia")
public class PetuniaController {

    @GetMapping()
    public String getPetunias() {
        return "the garden string!";
    }


}
