package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @RequestMapping("/")
    public String getName() {
        public String yourName = "Sabari";
        return "Your Name is " + yourName + "!";
    }
}