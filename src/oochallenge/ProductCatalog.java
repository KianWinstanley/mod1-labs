package oochallenge;

import java.util.ArrayList;

public class ProductCatalog {
	private ArrayList<Product> products = new ArrayList<>();
	
	public ProductCatalog() {
		products.add(new Product(1, "Apple", 5.00));
		products.add(new Product(2, "Banana", 5.00));
		products.add(new Product(3, "Sweets", 7.00));
		products.add(new Product(4, "Meds", 10.00));
		products.add(new Product(5, "TV", 249.99));
	}
	
	public void displayProductList() {
		for (Product product : products) {
			System.out.println(product.toString());
		}
	}
	
	public Product getProductById(int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		
		System.out.println("No product with that id");
		return null;
	}
}
