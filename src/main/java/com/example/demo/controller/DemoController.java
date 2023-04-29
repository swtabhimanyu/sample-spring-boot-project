package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
//	Logger logger=Logger.getLogger(DemoController.class);

	@RequestMapping("/")
	public String getHelloWorld() {
		System.out.println("Hello Printed");
		return "Hello World";
	}
	
	@RequestMapping("/newPage")
	public String getHelloWorld2() {
		System.out.println("Hello Printed")
		return "Hello World";
	}
}
