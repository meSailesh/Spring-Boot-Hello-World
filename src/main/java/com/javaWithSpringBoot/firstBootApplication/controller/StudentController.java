package com.javaWithSpringBoot.firstBootApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by sailesh on 12/5/21.
 */
@Controller
public class StudentController {

    private HomeController homeController;
    @Autowired //search object over its di container and pass here
    StudentController(HomeController homeController) {
        this.homeController = homeController;
    }
}
