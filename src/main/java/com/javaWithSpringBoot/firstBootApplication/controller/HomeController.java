package com.javaWithSpringBoot.firstBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sailesh on 12/5/21.
 */
@RestController //registers object of  class HomeController to dI container
public class HomeController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
