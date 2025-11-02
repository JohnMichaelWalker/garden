package com.johnwalkers.garden.petunia.api;

import com.johnwalkers.garden.api.PlantStatus;

public record PetuniaModel(String colour, long amount, PlantStatus status) {}
