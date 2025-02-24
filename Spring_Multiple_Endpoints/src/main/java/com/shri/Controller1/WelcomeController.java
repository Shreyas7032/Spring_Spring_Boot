package com.shri.Controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/welcome")
public class WelcomeController {
	
	@GetMapping({"/","home","welcome"})
	public String home()
	{
		return "home2";
	}

}
