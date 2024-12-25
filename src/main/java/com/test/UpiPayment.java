package com.test;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double payment) {
		// TODO Auto-generated method stub
		return "Payment succesful using Upi: "+payment;
	}

}
