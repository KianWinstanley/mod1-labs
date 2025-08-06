package lab2extension;

public class ExchangeTransaction {
	private Customer customer;
	private Currency currency;
	private double gbpAmount;
	
	public ExchangeTransaction(Customer customer, Currency currency, double gbpAmount) {
		this.customer = customer;
		this.currency = currency;
		this.gbpAmount = gbpAmount;
	}
	
	public double calculateServiceFee() {
		return gbpAmount < 100 ? gbpAmount * 0.05 : gbpAmount * 0.025;
	}
	
	public double calculateTax(double amountAfterFee) {
		return customer.getIsVip() ? amountAfterFee * 0.05 : amountAfterFee * 0.1;
	}
	
	public void processTransaction() {
		double afterFee = gbpAmount - calculateServiceFee();
		double afterTax = afterFee - calculateTax(afterFee);
		double finalAmount = currency.convertToGBP(afterTax);
		int rounded = (int)finalAmount;
		
		String format = String.format("%s had %f to exchange, it became %f after fees and %f after tax when exchanging from %s. The full amount in gbp is now %d", customer.getName(), gbpAmount, afterFee, afterTax, currency.getName(), rounded);
		System.out.println(format);
	}
}
