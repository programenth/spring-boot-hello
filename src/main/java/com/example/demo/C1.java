package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C1 {
	
	@GetMapping("/hello")
	public String home() {
		return "hello Sachin : )";
	}

}
