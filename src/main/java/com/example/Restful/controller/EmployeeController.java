package com.example.Restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping
    String sayHello(){
        return "hello and welcome";
    }
    @GetMapping("/add/{a}/{b}")
    String add(@PathVariable("a") int a, @PathVariable("b") int b){
        int res = a+b;
        return "the sum is "+res;
    }

    @GetMapping("/weather/{cityName}")
    String getWeather(@PathVariable("cityName") String cityName){
        return cityName +"'s weather is good";
    }

}