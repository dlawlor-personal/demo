package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest")
public class DemoController {

    @RequestMapping("/index")
    public String hello () {
        return "hellow";
    }
}
