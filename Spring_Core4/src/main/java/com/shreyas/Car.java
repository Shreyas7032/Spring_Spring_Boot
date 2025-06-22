package com.shreyas;

import org.springframework.stereotype.Component;

/*
 * 
 * This project helps to understand annotation configuration
 * @configration :it is alternate of xml file configuration
 * @component :It is used to make java classes as spring bean
 * @componentscan: it will scan all the classes present in base package
 * 
 * This project helps to understand ComponentScan,Configuration and Component annotation
 */


@Component
public class Car {

	public Car() {
		super();
		System.out.println("Car Constructor called...");
	}
	
	
}
