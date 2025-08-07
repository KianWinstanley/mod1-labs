package lab05extension;

public class Product {
	private String name;
	private double price;
	private String manufacturer;
	
	public Product(String name, double price, String manufacturer) {
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
}
