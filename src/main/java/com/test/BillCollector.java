package com.test;

public class BillCollector {
	
	private IPayment payment;

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public BillCollector() {}
	
	public BillCollector(IPayment payment) {
		System.out.println("Constructor Executed");
		this.payment = payment;
	}



	public void collectPayment(double amount) {
		System.out.println(payment.getClass().getSimpleName());
		String status = payment.pay(amount);
		System.out.println(status);
	}

}
