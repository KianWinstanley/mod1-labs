package lab8;

import java.util.ArrayList;

public class PaymentProcessor {
	ArrayList<PaymentMethod> payments = new ArrayList<>();
	
	public PaymentProcessor(ArrayList<PaymentMethod> payments) {
		this.payments = payments;
	}
	
	public void process(double amount) {
		for (PaymentMethod payment : payments) {
			payment.processPayment(amount);
			System.out.println(payment.getPaymentDetails());
		}
	}
}
