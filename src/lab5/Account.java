package lab5;

public class Account {

	public static void main(String[] args) {
		account();
		multiplicationTable();
	}
	
	public static void account() {
		var currentMoney = 200.0;
		var interestRate = 1.05;
		var years = 0;
		
		while (currentMoney < 200) {
			currentMoney *= interestRate;
			System.out.println("You have " + currentMoney + " at the end of year " + years);
			years++;
		}
		
		System.out.println("It took " + years + " years to reach £200");
	}
	
	public static void multiplicationTable() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%5d", j * i);
			}
			System.out.println("\n");
		}
	}
}
