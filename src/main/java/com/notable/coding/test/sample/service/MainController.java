package com.notable.coding.test.sample.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring";
    }

    @GetMapping("/welcome/{name}")
    public String welcomeName(@PathVariable String name){
        return "Welcome " + name + " to Spring";
    }
}
