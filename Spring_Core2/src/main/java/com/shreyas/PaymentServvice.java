package com.shreyas;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentServvice {
	
	Ipayment payment;
	
	
	
	public PaymentServvice(Ipayment payment) {
		super();
		this.payment=payment;
	}

	public void process_Payment()
	{
		payment.doPayment();
		System.out.println("Payment successfully..");
	}
	
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}






	public static void main(String[] args) {
		
//		PaymentServvice servvice=new PaymentServvice();
//		servvice.payment=new DebitCardPayment();
//		servvice.setPayment(new CreditCardPayment());
//		servvice.process_Payment();
		
		
		//This is we done in core java but i want to tell IOC to create object for this we need to doing 
        //create a xml file or in pom.xml file we need to pass spring context dependancy..
		//In spring context dependency we can accive Application Context interface
		
		
		//Application context is an IOC means it is used to create object 
		ApplicationContext context=new ClassPathXmlApplicationContext("Shreyas.xml");
		
		
		//Pn yane nusta object nahi banat tysathi ioc la sangava lagta shreyas.xml madhe ya class cha object banav
		PaymentServvice bean = context.getBean(PaymentServvice.class);//getBean ne context madhil object kadhla 
		bean.process_Payment();
		
	}

}
