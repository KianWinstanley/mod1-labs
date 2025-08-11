package lab9;

public class Fish extends Animal{

	public Fish(String name) {
		super(name);
		this.animalType = AnimalType.Fish;
	}
	
	public void Swim() {
		System.out.println("Swimming");
	}
}
