package com.casestudy.a2.set5;

public class CreditCardPayment extends Payment {
 private String paymentMethod;
	public CreditCardPayment(int paymentId, double amount,String paymentMethod) {
		super(paymentId, amount);
	this.paymentMethod=paymentMethod;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	@Override
	public double calculateTotalAmount() {
		double proFee = getAmount()+50;
        return proFee;	
        }
}
