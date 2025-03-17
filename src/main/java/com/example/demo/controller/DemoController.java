package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {
	
	@RequestMapping("/home-page")
	public ResponseEntity<String> landingPage(HttpServletRequest httpServletRequest) throws IllegalAccessException {
		log.info("Welcome to home page with session-id {}",		httpServletRequest.getSession().getId());
		return ResponseEntity.ok("Welcome to Home Page");
	}

}
