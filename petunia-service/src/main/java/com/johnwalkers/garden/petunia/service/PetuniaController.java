package com.johnwalkers.garden.petunia.service;

import com.johnwalkers.garden.api.PlantStatus;
import com.johnwalkers.garden.petunia.api.PetuniaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("petunia")
public class PetuniaController {

    @GetMapping()
    public List<PetuniaModel> getPetunias() {
        return List.of(
                new PetuniaModel("purple", 8, PlantStatus.ALIVE),
                new PetuniaModel("yellow", 21, PlantStatus.ALIVE),
                new PetuniaModel("lightpurple", 64, PlantStatus.ALIVE)
        );
    }
}
