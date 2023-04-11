package com.balaji.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    @GetMapping("/workout")
    public String workout(){
        return "run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String fortune() {
        return "today is your lucky day";
    }
}
