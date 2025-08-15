package oochallenge;

import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		ProductCatalog catalog = new ProductCatalog();
		NotificationService ns = new NotificationService();
		
		catalog.displayProductList();
		
		ShoppingBasket basket = new ShoppingBasket();
		Product p1 = catalog.getProductById(1);
		Product p2 = catalog.getProductById(5);
		basket.addItem(p1, 5);
		basket.addItem(p2, 1);
		basket.saveBasket();
		
		basket.addItem(p1, 3);
		basket.addItem(p1, -2);
		
		System.out.println("Basket: ");
		for (ShoppingBasketItem item : basket.getItems()) {
			System.out.println(item.toString());
		}
		
		CreditCardPayment card = new CreditCardPayment("Steve", 12345, 500.00);
		double total = 0.00;
		
		for (ShoppingBasketItem item : basket.getItems()) {
			total += item.getProduct().getPrice() * item.getQuantity();
		}
		
		card.processPayment(total);
		ns.confirmOrder();
		basket.clearBasket();
	}
	
}
