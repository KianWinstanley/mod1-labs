package lab8;

public interface PaymentMethod {
	void processPayment(double amount);
	
	String getPaymentDetails();
}
