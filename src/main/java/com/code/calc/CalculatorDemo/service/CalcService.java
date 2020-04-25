package com.code.calc.CalculatorDemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CalcService {
	
	Logger logger = LoggerFactory.getLogger(CalcService.class);

	public int addNumbers(int num1, int num2) {
		logger.debug("Entered Service Layer of Add method");
		return num1 + num2;
	}
	
	public int subNumbers(int num1, int num2) {
		logger.debug("Entered Service Layer of Substract method");
		return num1 - num2;
	}
	
	public int multiplyNumbers(int num1, int num2) {
		logger.debug("Entered Service Layer of Multiply method");
		return num1 * num2;
	}
	
	public int divideNumbers(int num1, int num2) {
		logger.debug("Entered Service Layer of Divide method");
		return num1 / num2;
	}

	public int getRemainder(int num1, int num2) {
		logger.debug("Entered Service Layer of Get Remainder method");
		return num1%num2;
	}

}
