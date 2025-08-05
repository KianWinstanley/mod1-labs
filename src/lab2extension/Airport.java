package lab2extension;

public class Airport {
	
	public static void main(String[] args) {
		MoneyExchange me = new MoneyExchange();
		
		var exchangeCurrency = me.getExchangeCurrency("Enter the amount of GBP that you want to exchange: ");
		var currency = me.getCurrencyType("What currency would you like to exchange to (1= USD, 2= EUR, 3= JPY): ");		
		var customerType = me.getCustomerType("What type of customer are you(R = Regular, V = VIP, S = Staff): ");
		
		System.out.println("Calculating exchange now");
		me.closeScanner();	
		
		exchangeCurrency = calculateExchangeRate(exchangeCurrency, currency);
		
		exchangeCurrency = calculateServiceFee(exchangeCurrency);		
		System.out.println("The amount after the service fee is: " + exchangeCurrency);
		
		exchangeCurrency = calculateTax(exchangeCurrency, customerType);		
		System.out.println("The amount after tax is: " + exchangeCurrency);
		
		var result = String.format("Your final amount is %,d" , (int)exchangeCurrency);
		System.out.println(result);
	}

	private static double calculateTax(double exchangeCurrency, String customerType) {
		if (customerType.equals("R")) {
			exchangeCurrency *= 0.9;
		}
		else if (customerType.equals("V")) {
			exchangeCurrency *= 0.95;
		}
		else {
			System.out.println("No tax needed");
		}
		return exchangeCurrency;
	}

	private static double calculateServiceFee(double exchangeCurrency) {
		if (exchangeCurrency < 100.00) {
			exchangeCurrency *= 0.95;
		}
		else {
			exchangeCurrency *= 0.975;
		}
		return exchangeCurrency;
	}

	private static double calculateExchangeRate(double exchangeCurrency, int currency) {
		switch (currency) {
		case 1:
			exchangeCurrency *= 1.25;
			break;
		case 2:
			exchangeCurrency *= 1.15;
			break;
		case 3:
			exchangeCurrency *= 180.50;
			break;
		default:
			System.out.println("Valid currency not picked");
		}
		return exchangeCurrency;
	}
}
