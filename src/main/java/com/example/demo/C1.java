package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C1 {
	
	@GetMapping
	public String home() {
		return "hello2 Raj and Anu : )";
	}

}
