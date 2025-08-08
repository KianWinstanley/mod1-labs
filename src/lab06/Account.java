package lab06;

public class Account {
	private int id;
	private double balance;
	private String owner;
	
	public Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		if (balance < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void close() {
		String format = String.format("account %d is closed", this.id);
		System.out.println(format);
	}
	
	public String getDetails() {
		String format = String.format("account %d is owned by %s and has %f", this.id, this.owner, this.balance);
		return format;
	}
}
