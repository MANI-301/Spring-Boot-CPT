package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{
	@GetMapping("/mani")
	public String helloWorld(){
		return "Hi this Mani here";
	}
}
