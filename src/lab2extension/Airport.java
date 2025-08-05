package lab2extension;

import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the amount of GBP that you want to exchange: ");
		var gbp = s.nextDouble();
		
		System.out.println("What currency would you like to exchange to (1= USD, 2= EUR, 3= JPY): ");
		var currency = s.nextInt();
		
		System.out.println("What type of customer are you(R = Regular, V = VIPm S = Staff): ");
		var customerType = s.next();
		
		System.out.println("Calculating exchange now");
		s.close();
		
		switch (currency) {
		case 1:
			gbp *= 1.25;
			break;
		case 2:
			gbp *= 1.15;
			break;
		case 3:
			gbp *= 180.50;
			break;
		default:
			System.out.println("Valid currency not picked");
		}	
			
		if (gbp < 100.00) {
			gbp *= 0.95;
		}
		else {
			gbp *= 0.975;
		}
		
		System.out.println("The amount after the service fee is: " + gbp);
		
		if (customerType.equals("R")) {
			gbp *= 0.9;
		}
		else if (customerType.equals("V")) {
			gbp *= 0.95;
		}
		else {
			System.out.println("No tax needed");
		}
		
		System.out.println("The amount after tax is: " + gbp);
		
		System.out.println("Your final amount is: " + (int)gbp);

	}

}
