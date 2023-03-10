package com.example.demotest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/greetings")
    public String greetings(){
        return "Hi!!";
    }
}
