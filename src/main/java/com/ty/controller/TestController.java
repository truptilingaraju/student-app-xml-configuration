package com.ty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/hi")
	public String sayHi() {
		return "student.jsp";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register.jsp";
	}
}
