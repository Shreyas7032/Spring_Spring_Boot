package com.shreyas;

public class CreditCardPayment implements Ipayment {

	@Override
	public void doPayment() {
		System.out.println("Credit Card Payment...");
	}

	public CreditCardPayment() {
		super();
		System.out.println("Credit Card Constructor called..");
	}
	
	

}
