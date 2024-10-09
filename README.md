You are building an Online Payment Processing System where users can make payments using different payment methods like Credit Card, Debit Card, and PayPal. Each payment method has a different processing fee, and the system should calculate the total amount after including the fee.

Requirements:

Store payment details like paymentId, amount, and paymentMethod in a base class Payment.
Create subclasses CreditCardPayment, DebitCardPayment, and PayPalPayment that inherit from the Payment class.
Override a method calculateTotalAmount() in each subclass to add the respective processing fee.
Use an abstract class Payment with abstract methods.

Questions:

Create an abstract Payment class with encapsulated fields.
Implement subclasses to calculate the total amount including the processing fee for each payment type.
Write a main class that simulates different payment methods and calculates the final amount
