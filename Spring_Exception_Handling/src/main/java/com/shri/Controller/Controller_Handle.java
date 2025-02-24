package com.shri.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Controller_Handle {
	
	@ExceptionHandler(value = ArithmeticException.class)  
	public String Handle_Exception()
	{
		return "errorPage";
	}
	
	@ExceptionHandler(value =NullPointerException.class)  
	public String Handle_Exception1()
	{
		
		return "errorPage1";
	}

}
