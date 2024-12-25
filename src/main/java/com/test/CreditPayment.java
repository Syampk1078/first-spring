package com.test;

public class CreditPayment implements IPayment{

	@Override
	public String pay(double payment) {
		// TODO Auto-generated method stub
		return "Payment succesful using Credit Card: "+payment;
	}

}
