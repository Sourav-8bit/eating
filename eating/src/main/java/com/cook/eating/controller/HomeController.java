package com.cook.eating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
	
	@GetMapping("/Hello")
	public String getMessage()
	{
		return "sourav bakliwal";
	}
	
	

}
