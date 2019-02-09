package com.example.citest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiThere {

    @RequestMapping("/")
    public String hi() {
        return "Hello";
    }

}
