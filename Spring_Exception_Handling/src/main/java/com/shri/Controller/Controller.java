package com.shri.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller

/*
 * This is Controller Specific Exception 
 * i.e Local Exception
 * 
 * This Exception Handle only in this controller not another
 */
public class Controller {
	
	@GetMapping("/")
	@ResponseBody
	public String student()
	{
		int a=10;
		int c=10/0;
		System.out.println(c);
		return "Hello Shreyas";
	}
	
	@GetMapping("/data")
	public void data()
	{
		String s=null;
		System.out.println(s.length());
		System.out.println(s);
	}
	
	

}
