package com.shreyas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {
	
	IEnfine eng;
	
	public Car() {
		super();
		System.out.println("Car Constructor :: called");
	}
	
	
	
	public void setEng(IEnfine eng) {
		this.eng = eng;
	}



	public Car(IEnfine eng) {
		super();
		this.eng = eng;
	}

	void goToTravelling()
	{
		eng.start();
		System.out.println("Journe Started..");
	}
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Shreyas.xml");
		
//		Spring Scope by default singelton asto thats why only one object created not many but if we decalre the scpe prototype then multiple objects created in xml file
//		Car car = context.getBean(Car.class);
//		System.out.println(car.hashCode());
//		
//		
//		Car car2 = context.getBean(Car.class);
//		System.out.println(car2.hashCode());
//		
//		Car car3 = context.getBean(Car.class);
//		System.out.println(car3.hashCode());
		
		
//		Autowire is used to identify dependent object and inject into target object 
//		their are 3 types of of autowire
//		1.ByName :when we take the inteface instance in car class this is same as id in xml file //Also we must should create setters method for that
//		2.ByType :what w
//		3.Constructor :it directcly call primary function but autowire="constructor";
		
		Car car = context.getBean(Car.class);
		car.goToTravelling();
	}
	

}
