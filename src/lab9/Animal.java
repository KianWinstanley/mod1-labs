package lab9;

public abstract class Animal {
	AnimalType animalType;
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
