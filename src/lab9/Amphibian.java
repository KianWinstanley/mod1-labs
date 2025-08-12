package lab9;

public abstract class Amphibian extends Animal implements Swimmable{

	public Amphibian(String name) {
		super(name);
		this.animalType = AnimalType.Amphibian;
	}
	
	public abstract void Speak();
	
	public void swim() {
		System.out.println("Swimming like an amphibian");
	}
}
