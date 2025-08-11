package lab8;

public class CreditCardPayment implements PaymentMethod{
	String name;
	int cardNumber;
	double balance;
	
	public CreditCardPayment(String name, int cardNumber, double balance) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCardNumber() {
		return this.cardNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void processPayment(double amount) {
		if (amount > balance) {
			System.out.println(getName() + " Not enough money");
			return;
		}
		
		System.out.println("taking " + amount + " out of account");
		balance -= amount;
	}
	
	public String getPaymentDetails() {
		String info = "\n**** ****\n";
		info += "Name: " + getName() + "\n";
		info += "Card Number: " + getCardNumber() + "\n";
		info += "Balance: " + getBalance() + "\n";
		
		return info;
	}
}
