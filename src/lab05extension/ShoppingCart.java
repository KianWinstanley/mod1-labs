package lab05extension;

import java.text.DecimalFormat;
import java.util.HashMap;

public class ShoppingCart {
	HashMap<String, CartItem> cart = new HashMap<>();;
	
	public void addItem(Product product, int quantity) {
		if (cart.containsKey(product.getName())) {
			var count = cart.get(product.getName()).getQuantity();
			cart.put(product.getName(), new CartItem(product, count + quantity));
		}
		else {
			cart.put(product.getName(), new CartItem(product, quantity));
		}
	}
	
	public void showCart() {
		DecimalFormat df = new DecimalFormat("#.00");
		if (cart.isEmpty()) {
			System.out.println("Cart is Empty");
		}
		else {
			for (String productName : cart.keySet()) {
				System.out.println(productName + "\t" + cart.get(productName).getQuantity() + "\t" + df.format(cart.get(productName).getItemTotal()) + "\t" + cart.get(productName).getProduct().getManufacturer());
			}
		}
	}
	
	public double getTotal() {
		double total = 0;
		for (String productName : cart.keySet()) {
			total += cart.get(productName).getItemTotal();
		}
		
		return total;
	}
	
	public void removeItem(Product product, int quantity) {
		if (cart.containsKey(product.getName())) {
			var count = cart.get(product.getName()).getQuantity();
			cart.put(product.getName(), new CartItem(product, count - quantity));
		}
		else {
			System.out.println("Cannot remove item that doesn't exist");
		}
	}
	
	public void clearCart() {
		cart.clear();
	}
}
