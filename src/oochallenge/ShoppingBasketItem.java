package oochallenge;

public class ShoppingBasketItem {
	private Product product;
	private int quantity;
	
	public ShoppingBasketItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void changeQuantity(int amount) {
		quantity += amount;
	}
	
	@Override
	public String toString() {
		String format = String.format("Product Name: %s \t Product price: %f \t Product id: %d \t Quantity: %d", product.getName(), product.getPrice(), product.getId(), this.quantity);
		return format;
	}
}
