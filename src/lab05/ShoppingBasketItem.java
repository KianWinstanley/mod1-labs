package lab05;

public class ShoppingBasketItem {
	String productName;
	int quantity;
	double price;
	
	public ShoppingBasketItem(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public String getDetails() {
		String format = String.format("you have %d %s in your basket costing %f", this.quantity, this.productName, this.price);
		return format;
	}
}
