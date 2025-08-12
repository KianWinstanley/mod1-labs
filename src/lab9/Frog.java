package lab9;

public class Frog extends Amphibian{

	public Frog(String name) {
		super(name);
	}
	
	public void Speak() {
		System.out.println("Ribbit");
	}
	
	@Override
	public void move() {
		System.out.println("Moving like a frog");
	}
	
	@Override
	public void swim() {
		System.out.println("Swimming like a frog");
	}
}
