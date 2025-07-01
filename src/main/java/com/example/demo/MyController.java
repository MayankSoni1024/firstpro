package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("/first")
	public String first() {
		System.out.println("first is called");
		return "first";
	}
	@RequestMapping("/second")
	public String second() {
		System.out.println("second is called");
		return "first";
	}
}
