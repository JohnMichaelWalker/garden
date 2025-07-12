package com.johnwalkers.garden.service;

import org.openapitools.client.ApiException;
import org.openapitools.client.api.PetuniaControllerApi;
import org.openapitools.client.model.PetuniaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("garden")
public class GardenController {

    private final PetuniaControllerApi petuniaControllerApi;

    public GardenController(PetuniaControllerApi petuniaControllerApi) {
        this.petuniaControllerApi = petuniaControllerApi;
    }

    @GetMapping()
    public String getGardenString() throws ApiException {
        List<PetuniaModel> petunias = petuniaControllerApi.getPetunias();
        return "This is the garden: " + petunias;
    }
}
