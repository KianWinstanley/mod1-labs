package lab05extension;

import java.util.HashMap;

public class ShoppingCart {
	HashMap<String, CartItem> cart = new HashMap<>();;
	
	public void addItem(Product product, int quantity) {
		if (cart.containsKey(product.getName())) {
			var count = cart.get(product.getName());
			cart.put(product.getName(), 
		}
	}
}
