package oo2b;

public class RegistrationPlate {
	private String number;
	
	public RegistrationPlate(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		try {
			return this.number;
		}
		catch (NullPointerException e) {
			System.out.println("Number does not exist");
		}
		
		return this.number;
	}
}
