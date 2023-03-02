package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day2 {
	
	@Value("${value:MUHILAN D S}")
	private String name;
	
	@GetMapping("/")
	public String display() {
		return "Hi... "+name;
	}
}