package lab2extension;

import java.util.Scanner;

public class MoneyExchange {
	Scanner s = new Scanner(System.in);
	
	public String getCustomerType(String prompt) {
		System.out.printf(prompt);
		return s.next();
	}

	public int getCurrencyType(String prompt) {
		System.out.printf(prompt);
		return s.nextInt();
	}

	public double getExchangeCurrency(String prompt) {
		System.out.printf(prompt);
		return s.nextDouble();
	}
	
	public void closeScanner() {
		s.close();
	}
}
