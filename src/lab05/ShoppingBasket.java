package lab05;

import java.util.ArrayList;

public class ShoppingBasket {
	ArrayList<ShoppingBasketItem> basket = new ArrayList<>();
	
	void add(ShoppingBasketItem item) {
		basket.add(item);
	}
}
