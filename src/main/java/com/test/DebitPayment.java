package com.test;

public class DebitPayment implements IPayment {

	@Override
	public String pay(double payment) {
		// TODO Auto-generated method stub
		return "Payment succesful using debit Card: "+payment;
	}

}
