package ru.javabegin.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
