package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String showLanding() {
		return "landing";
	}

//	@GetMapping("/")
//	public String showHome() {
//		return "home";
//	}
	
	@GetMapping("/employees")
	public String showHome() {
		return "home";
	}
	
	// add request mapping for /leaders
	@GetMapping("/leaders")
	public String showLeaders() {
		return "leaders";
	}
}