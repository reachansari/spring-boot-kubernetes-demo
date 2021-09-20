package com.example.demo.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping(value = "/hello")
	public String greeting() {
		return "Welcome to my first k8s controller";
	}

}
