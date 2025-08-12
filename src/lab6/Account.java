package lab6;

public class Account implements Comparable<Account>{
	private int id;
	private String owner;
	private double balance;
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void Deposit(double amount) {
		if (amount < 1) {
			System.out.println("Not a valid amount");
		}
		else {
			this.balance += amount;
		}
	}
	
	public void Withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("You don't have that much money");
		}
		else {
			this.balance -= amount;	
		}
	}
	
	public String getDetails() {
		String result = String.format("Hello %s, your account with id %d has %f", this.owner, this.id, this.balance);
		return result;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void AddInterest() {
		this.balance *= 1.025;
	}

	@Override
	public int compareTo(Account other) {
		return this.owner.compareTo(other.owner);
	}
}
