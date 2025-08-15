package oochallenge;

import java.util.ArrayList;

public class PaymentService {
	ArrayList<PaymentMethod> payments = new ArrayList<>();
	
	public PaymentService(ArrayList<PaymentMethod> payments) {
		this.payments = payments;
	}
	
	public void process(double amount) {
		for (PaymentMethod payment : payments) {
			payment.processPayment(amount);
			System.out.println(payment.getPaymentDetails());
		}
	}
}
