package lab14;

import java.io.IOException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		String jsonFile = "C:\\labs\\mod1-labs\\src\\customers2.json";
		
		try {
			List<Customer> customers = JSONReader.readCustomers(jsonFile);
			
			String targetCity = "London";
			List<Customer> filteredCustomers = CustomerFilter.filterByCity(customers, targetCity);
			
			System.out.println("Customers in " + targetCity + ":");
			
			filteredCustomers.forEach(customer -> 
			System.out.println(customer.getName() + " {ID: " + customer.getId() + ")"));
		}
		catch (IOException e) {
			System.err.println("Error reading the JSON file: " + e.getMessage());
		}
	}

}
