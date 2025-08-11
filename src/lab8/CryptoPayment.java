package lab8;

public class CryptoPayment implements PaymentMethod{
	String name;
	String walletAddress;
	double exchangeRate;
	double balance;
	
	public CryptoPayment(String name, String walletAddress, double exchangeRate, double balance) {
		this.name = name;
		this.walletAddress = walletAddress;
		this.exchangeRate = exchangeRate;
		this.balance = balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getWalletAddress() {
		return this.walletAddress;
	}
	
	public double getExchangeRate() {
		return this.exchangeRate;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void processPayment(double amount) {
		balance *= exchangeRate;
		if (amount > balance) {
			System.out.println(getName() + " Not enough money");
			balance /= exchangeRate;
			return;
		}
		
		System.out.println("taking " + amount + " out of account");
		balance -= amount;
		balance /= exchangeRate;
	}
	
	public String getPaymentDetails() {
		String info = "\n**** ****\n";
		info += "Name: " + getName() + "\n";
		info += "Wallet Address: " + getWalletAddress() +"\n";
		info += "Exchange Rate: " + getExchangeRate() + "\n";
		info += "Balance: " + getBalance() + "\n";
		
		return info;
	}
}
