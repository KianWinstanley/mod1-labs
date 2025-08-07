package lab05;

import java.util.ArrayDeque;

public class Program {
	static ArrayDeque<ShoppingBasket> queue = new ArrayDeque<ShoppingBasket>();
	
	public static void main(String[] args) {
		ShoppingBasket basket1 = new ShoppingBasket();
		basket1.add(new ShoppingBasketItem("apple", 5, 5.00));
		
		ShoppingBasket basket2 = new ShoppingBasket();
		basket2.add(new ShoppingBasketItem("banana", 2, 2.00));
		
		ShoppingBasket basket3 = new ShoppingBasket();
		basket3.add(new ShoppingBasketItem("pear", 4, 4.00));
		
		queue.add(basket1);
		queue.add(basket2);
		queue.add(basket3);
		
		processBaskets();

	}
	
	static void processBaskets() {		
		while(!queue.isEmpty()) {
			var basket = queue.pop();
			for (ShoppingBasketItem item : basket.basket) {
				System.out.println(item.getDetails());
			}
		}
	}
}