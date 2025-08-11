package lab9;

public abstract class Amphibian extends Animal{

	public Amphibian(String name) {
		super(name);
		this.animalType = AnimalType.Amphibian;
	}
	
	public abstract void Speak();
}
