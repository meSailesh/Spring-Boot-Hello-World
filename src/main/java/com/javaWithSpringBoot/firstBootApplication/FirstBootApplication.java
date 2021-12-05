package com.javaWithSpringBoot.firstBootApplication;

import com.javaWithSpringBoot.firstBootApplication.controller.HomeController;
import com.javaWithSpringBoot.firstBootApplication.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootApplication.class, args);
	}


}



//mvc -> render html pages from the server side itself

//restful apis -> we will have different framework for ui that will consume data from our spring boot

//client -> access any one of the endpoint of controller
//controller will trigger the required business logic service
//return the view page


//mvc ->
