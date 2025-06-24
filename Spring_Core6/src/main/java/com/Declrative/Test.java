package com.Declrative;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Shreyas.xml");
		UserDao user = context.getBean(UserDao.class);
		user.get_Data();
		
		//for this only init and getData method only call destroy methd not call for this we need to typecast the configurable application context method
		
		ConfigurableApplicationContext cc=(ConfigurableApplicationContext) context;
		cc.close();
	}

}
