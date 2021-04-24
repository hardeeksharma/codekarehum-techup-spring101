package com.codekarehum.techup.spring101.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    String sayHello() {
        return "hello world!!!";
    }
    //Add
    @PostMapping("/add")
    Integer add(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        return num1+num2;
    }
    //Subtract
    @PostMapping("/subtract")
    Integer subtract(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        return num1-num2;
    }
    //Multiply
    @PostMapping("/multiply")
    Integer multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        return num1*num2;
    }
    //Divide
    @PostMapping("/divide")
    Integer divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2){
        return num1/num2;
    }

}
