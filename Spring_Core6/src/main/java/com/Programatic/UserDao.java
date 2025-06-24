package com.Programatic;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class UserDao implements InitializingBean,DisposableBean{
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Getting data from DB");
	}
	
	public void show_Data()
	{
		System.out.println("Data Getting...");
	}
	

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DB connection close");
		
	}

	
	
	

}
