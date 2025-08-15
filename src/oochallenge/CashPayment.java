package oochallenge;

public class CashPayment implements PaymentMethod {
	String name;
	String email;
	double balance;
	
	public CashPayment(String name, String email, double balance) {
		this.name = name;
		this.email = email;
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void processPayment(double amount) {
		if (amount > balance) {
			System.out.println(getName() + " Not enough money");
			return;
		}
		
		System.out.println("taking " + amount + " out of balance");
		balance -= amount;
	}
	
	public String getPaymentDetails() {
		String info = "\n**** ****\n";
		info += "Name: " + getName() + "\n";
		info += "Email: " + getEmail() + "\n";
		info += "Balance: " + getBalance() + "\n";
		
		return info;
	}
}
