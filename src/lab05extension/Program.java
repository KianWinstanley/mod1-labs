package lab05extension;

public class Program {

	public static void main(String[] args) {
		Product product1 = new Product("Apple", 1.00, "Farm");
		Product product2 = new Product("Febreze", 7.00, "Febreze");
		Product product3 = new Product("Crisps", 4.50, "Walkers");
		
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(product1, 5);
		sc.addItem(product2, 2);
		sc.addItem(product3, 7);
		sc.addItem(product2, 1);
		
		sc.showCart();
		sc.getTotal();
		
		System.out.println("----------------------");
		sc.removeItem(product1, 2);
		sc.showCart();
		
		System.out.println("----------------------");
		sc.clearCart();
		sc.showCart();
	}
}
