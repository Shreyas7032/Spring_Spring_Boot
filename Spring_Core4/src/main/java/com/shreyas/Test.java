package com.shreyas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
	}

}
