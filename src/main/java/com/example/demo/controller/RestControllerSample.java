package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerSample {

    @GetMapping("/message")
    public String printmessage()  {
        System.out.println("This works motherfucker");
        return "This works motherfucker";
    }
}
