package com.casestudy.a2.set5;

public class DebitCardPayment extends Payment {
	private String paymentMethod;
	 public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public DebitCardPayment(int paymentId, double amount, String paymentMethod) {
			super(paymentId, amount);
			this.paymentMethod=paymentMethod;
			}

	public double calculateTotalAmount() {
		 double proFee =  getAmount()+40;
	        return proFee;
		
	}
}
