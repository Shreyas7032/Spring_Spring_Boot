package com.shreyas;

public class DebitCardPayment implements Ipayment{

	@Override
	public void doPayment() {
		System.out.println("Debit Card Payment...");
		
	}

	public DebitCardPayment() {
		super();
		System.out.println("Debit card Constructor called..");
	}
	
	
	

}
