package com.example.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @RequestMapping("/producer/demo")
    public String produce(){
        return "Hello !This is from producer!";
    }
}
