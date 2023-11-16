package com.example.SPProject.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SPProject.example.ClientComponent;

@RestController
@RequestMapping("/")
public class HelloControler {
    private final ClientComponent clientComponent;

    @Autowired
    public HelloControler(ClientComponent clientComponent) {
        this.clientComponent = clientComponent;
    }

    @GetMapping
    public String sayHello() {
        return clientComponent.getClientMessage();
    }
}
