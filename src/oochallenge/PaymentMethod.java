package oochallenge;

public interface PaymentMethod {
	public void processPayment(double amount);
	
	String getPaymentDetails();
}
