package com.Annotation;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class UserDao {
	
	@PostConstruct
	public void init()
	{
		System.out.println("Getting DB Connection from db..");
	}
	
	public void connect()
	{
		System.out.println("Connect DB");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("close Db Connection");
	}
	
	

}
