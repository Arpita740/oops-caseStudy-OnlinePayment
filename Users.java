package com.casestudy.a2.set5;

public class Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment credit=new CreditCardPayment(10,2000,"Credit Card");
Payment debit=new DebitCardPayment(2,200,"Debit card");
Payment paypal=new PayPalPayment(1,130,"upi");
	
	System.out.println("Credit Card Payment Total: " + credit.calculateTotalAmount());
    System.out.println("Debit Card Payment Total: " + debit.calculateTotalAmount());
    System.out.println("PayPal Payment Total: " + paypal.calculateTotalAmount());
}
}