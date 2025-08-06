package lab6;

public class Bank {
	private Account[] accounts = new Account[3];
	private int nextId = 1;
	private int count = 0;

	public Account addAccount(String owner, double balance) {
		if (count >= accounts.length) {
			return null;
		}
		Account temp = new Account(nextId++, owner, balance);
		accounts[count++] = temp;
		return temp;
	}
	
	public Account getAccount(String owner) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(owner)) {
				return accounts[i];
			}
		}
		return null;
	}
}
