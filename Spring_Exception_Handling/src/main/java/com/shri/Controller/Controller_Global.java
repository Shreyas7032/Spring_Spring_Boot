package com.shri.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/*
 * This is Another Controller,In this controller we define the Exception Handler in first controller Not working bcz this is only controller specific 
 */

@Controller
public class Controller_Global {
	
	@GetMapping("/length")
	public void length()
	{
		String s1=null;
		System.out.println(s1.length());
		
	}

}
