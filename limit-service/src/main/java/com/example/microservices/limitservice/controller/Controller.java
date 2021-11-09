package com.example.microservices.limitservice.controller;

import com.example.microservices.limitservice.configuration.Configuration;
import com.example.microservices.limitservice.limits.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Configuration configuration;

    @GetMapping(path="/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMin(),configuration.getMax());
    }
}
