package com.shreyas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shreyas.Service.Report_Service;

/*
 * This project helps to understand @inject dependent object into target object with the help of some annotaion
 * 1.@autowired + byName in repository annotaion
 * 2.@autowired with @primary annotation
 * 3.@autowird +@qualifier => but we take in qualifier take same as in repository
 * 	above are the fild injections
 * Constructor injection+autowired+primary
 * setter injection+autowird+primary
 */

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		Report_Service service = context.getBean(Report_Service.class);
		service.show_report();
		
	}

}
