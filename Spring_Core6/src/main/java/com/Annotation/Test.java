package com.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		UserDao user = context.getBean(UserDao.class);
		user.connect();
		
		ConfigurableApplicationContext cc=(ConfigurableApplicationContext) context;
		cc.close();
	}

}
