package com.shri.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {
	
	@GetMapping({"/","home","welcome"})  //In this from the url we get same page
	public String home()
	{
		return "home";
	}

}
