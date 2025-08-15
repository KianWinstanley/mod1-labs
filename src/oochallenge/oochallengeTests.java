package oochallenge;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class oochallengeTests {

	@Test
	void savebasketShouldNotHaveValidPricesAfterADay() {
		ShoppingBasket sb = new ShoppingBasket();
		Product p1 = new Product(1, "Apple", 5.00);
		sb.addItem(p1, 1);
		sb.savedTime = LocalDateTime.now().minusHours(25);
		
		var actual = sb.isPriceValid();
		assertEquals(false, actual);
	}
	
	@Test
	void saveBasketShouldHaveValidPriceWithinADay() {
		ShoppingBasket sb = new ShoppingBasket();
		Product p1 = new Product(1, "Apple", 5.00);
		sb.addItem(p1, 1);
		sb.saveBasket();
		
		var actual = sb.isPriceValid();
		
		assertEquals(true, actual);
	}
	
	@Test
	void shouldUpdateQuantityForExistingProduct() {
		ShoppingBasket sb = new ShoppingBasket();
		Product p1 = new Product(1, "Apple", 5.00);
		Product p2 = new Product(2, "Banana", 5.00);
		sb.addItem(p1, 1);
		sb.addItem(p2, 1);
		sb.addItem(p1, 1);
		
		assertEquals(2, sb.getItems().size());
	}
	
	@Test
	void shouldRemoveItemsFromList() {
		ShoppingBasket sb = new ShoppingBasket();
		Product p1 = new Product(1, "Apple", 5.00);
		Product p2 = new Product(2, "Banana", 5.00);
		sb.addItem(p1, 1);
		sb.addItem(p1, 1);
		sb.addItem(p2, 5);
		sb.removeItem(p1);
		
		assertEquals(1, sb.getItems().size());
	}
}
