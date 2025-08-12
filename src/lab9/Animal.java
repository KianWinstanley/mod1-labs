package lab9;

public abstract class Animal implements Movable{
	AnimalType animalType;
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void move() {
		System.out.println("Moving like an animal");
	}
}
