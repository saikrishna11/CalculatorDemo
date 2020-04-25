package com.code.calc.CalculatorDemo.controller.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	
	Logger logger = LoggerFactory.getLogger(LogController.class);
	
	@GetMapping("/logMessage")
	public String logAppMessage() {
		logger.trace("Calc App Error");
		return "This is Calc App log message";
	}

}
