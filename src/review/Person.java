package review;

public class Person {
	private String name;
	private String email;
	
	public Person(String name, String email) {
		this.name= name;
		this.email = email;
		}
	
	public void getDetails() {
		System.out.printf(String.format("Name: %s \tEmail: %s", this.name, this.email));
	}
}
