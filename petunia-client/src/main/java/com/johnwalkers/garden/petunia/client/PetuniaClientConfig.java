package com.johnwalkers.garden.petunia.client;

import org.openapitools.client.api.PetuniaControllerApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetuniaClientConfig {
    @Bean
    public PetuniaControllerApi petuniaControllerApi(@Value("${petunia.api.base-path:http://petunia-service}") String basePath) {
        PetuniaControllerApi api = new PetuniaControllerApi();
        api.getApiClient().setBasePath(basePath);
        return api;
    }
}