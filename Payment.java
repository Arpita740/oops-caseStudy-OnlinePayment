package com.casestudy.a2.set5;

abstract public class Payment {
	private int paymentId;
	private double amount;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Payment(int paymentId, double amount) {
		this.paymentId = paymentId;
		this.amount = amount;
	}
	 abstract public double calculateTotalAmount();

}
