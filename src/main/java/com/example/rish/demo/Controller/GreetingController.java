package com.example.rish.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@RequestMapping("/")
	public String getGreeting(){
		return "Hi it's me rishi and I like tekken";
	}

}
