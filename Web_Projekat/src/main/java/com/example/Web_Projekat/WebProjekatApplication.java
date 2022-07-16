package com.example.Web_Projekat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.Web_Projekat.rest.controller" })

public class WebProjekatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebProjekatApplication.class, args);
	}
	
	

}
