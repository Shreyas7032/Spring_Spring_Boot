package com.Declrative;


/*
 * This project is used to define Sprig Bean Life Cycle
 * we can achive spring bean lifecycle by 3 ways 
 * 1.Declarative approach :It is used by  Using XML Configuration init-method.Destroy-method
 * 2.programmatic approach: for we need to implement two interface 1.initilizingBean,DisposalBean
 * 3.Annotation approach: 1.@PostConstruct 2.@preDestroy :This Annotation is giving in Jakarta Dependency
 */
public class UserDao {

//	public UserDao() {
//		super();
//		System.out.println("UserDao");
//	}
	
	public void init()
	{
		System.out.println("Getting DB Connection..");
	}
	
	public void get_Data()
	{
		System.out.println("Data Get From DB..");
	}
	
	public void Destroy()
	{
		System.out.println("DB connection closed..");
	}
	
	
	
	
	
	

}
