package com.example.citest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiThereController {

    @RequestMapping("/SayHi")
    public String hi() {
        return "Hello travis?   ";
    }

}
