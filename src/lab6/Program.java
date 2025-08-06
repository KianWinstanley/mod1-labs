package lab6;

public class Program {

	public static void main(String[] args) {
		Account accountOne = new Account(1, "Bob", 200.00);
		Bank bank = new Bank();
		
		accountOne.Deposit(50.0);
		accountOne.Withdraw(20.0);
		
		String details = accountOne.getDetails();
		System.out.println(details);
		
		Account[] accounts = new Account[]{new Account(2, "Steve", 100.00), new Account(3, "Martha", 150.00), new Account(4, "Debra", 175.00)};
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
		
		Account myAccount = new Account(6, "Kian", 100.00);
		myAccount.AddInterest();
		System.out.println(myAccount.getDetails());
		
		Account partnerAccount = myAccount;
		partnerAccount.AddInterest();
		System.out.println(myAccount.getDetails());
		
		processAccount(myAccount);
		System.out.println(myAccount.getDetails());
		
		int k = 100;
		incInt(k);
		System.out.println(k);
		
		Account a1 = bank.addAccount("Bob", 100.00);
		Account a2 = bank.addAccount("Steve", 150.00);
		Account a3 = bank.addAccount("Charlotte", 200.00);
		Account a4 = bank.addAccount("Brian", 50.00);
		
		var accountFound = bank.getAccount("Steve");
		System.out.println(accountFound.getDetails());
		var accountNotFound = bank.getAccount("Brian");
		System.out.println(accountNotFound);
	}
	
	private static void incInt(int x) {
		x++;
	}
	
	public static void processAccount(Account acc) {
		acc.AddInterest();
	}
}
