package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "spring boot demo";
    }

    @GetMapping("/zhenyu")
    public String zhenyu(){
        return "hello zhenyu";
    }

    public static void main(String[] args) {
        System.out.println("你好");
    }
}
