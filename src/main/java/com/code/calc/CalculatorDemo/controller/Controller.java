package com.code.calc.CalculatorDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.calc.CalculatorDemo.service.CalcService;

@RestController
@RequestMapping("/calc")
public class Controller {
	
	@Autowired
	CalcService service;
	
	@PostMapping("/addNumbers/{num1}/{num2}")
	public String addNumbers(@PathVariable String num1, @PathVariable String num2 ) {
		int result = service.addNumbers(Integer.valueOf(num1), Integer.valueOf(num2));
		return "Adding the numbers " + num1 + " and " + num2 + " gives us "+ result;
	}
	
	@PostMapping("/subNumbers/{num1}/{num2}")
	public String subNumbers(@PathVariable String num1, @PathVariable String num2 ) {
		int result = service.subNumbers(Integer.valueOf(num1), Integer.valueOf(num2));
		return "Substracting the number " + num2 + " from " + num1 + " gives us "+ result;
	}
	
	@PostMapping("/multiplyNumbers/{num1}/{num2}")
	public String multiplyNumbers(@PathVariable String num1, @PathVariable String num2 ) {
		int result = service.multiplyNumbers(Integer.valueOf(num1), Integer.valueOf(num2));
		return "Multiplying the numbers " + num1 + " and " + num2 + " gives us "+ result;
	}
	
	@PostMapping("/divideNumbers/{num1}/{num2}")
	public String divideNumbers(@PathVariable String num1, @PathVariable String num2 ) {
		int result = service.divideNumbers(Integer.valueOf(num1), Integer.valueOf(num2));
		return "Dividing the number " + num1 + " with " + num2 + " gives the divident as "+ result;
	}
	
	@PostMapping("/getRemainder/{num1}/{num2}")
	public String getRemainder(@PathVariable String num1, @PathVariable String num2 ) {
		int result = service.getRemainder(Integer.valueOf(num1), Integer.valueOf(num2));
		return "Dividing the numbers " + num1 + " with " + num2 + " gives the remainder as "+ result;
	}
	
	
}
