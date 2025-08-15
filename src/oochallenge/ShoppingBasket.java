package oochallenge;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ShoppingBasket {
	private ArrayList<ShoppingBasketItem> items = new ArrayList<>();
	LocalDateTime savedTime;
	
	public void addItem(Product product, int quantity) {
		for (ShoppingBasketItem item : items) {
			if (item.getProduct().equals(product)) {
				item.changeQuantity(quantity);
				return;
			}
		}
		
		items.add(new ShoppingBasketItem(product, quantity));
	}
	
	public ArrayList<ShoppingBasketItem> getItems() {
		return this.items;
	}
	
	public void removeItem(Product product) {
		for (ShoppingBasketItem item : items) {
			if (item.getProduct().equals(product)) {
				items.remove(item);
				return;
			}
		}
		
		System.out.println("Item not found in basket");
	}
	
	public void clearBasket() {
		items.removeAll(items);
	}
	
	public void saveBasket() {
		this.savedTime = LocalDateTime.now();
	}
	
	public boolean isPriceValid() {
		if (savedTime.isBefore(LocalDateTime.now().minusHours(24))) {
			return false;
		}
		
		return true;
	}
	
	public void saveToFile(String filePath) {
		StringBuilder builder = new StringBuilder();
		for (ShoppingBasketItem item : items) {
			builder.append(item.getProduct().getName())
			.append(" | ")
			.append(item.getProduct().getId())
			.append(" | ")
			.append(item.getProduct().getPrice())
			.append(" | ")
			.append(item.getQuantity())
			.append(" | ")
			.append(this.savedTime)
			.append("\n");
		}
		String result = builder.toString();
	}
}
