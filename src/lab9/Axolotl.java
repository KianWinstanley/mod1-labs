package lab9;

public class Axolotl extends Amphibian{

	public Axolotl(String name) {
		super(name);
	}
	
	public void Speak() {
		System.out.println("*gulp*");
	}
	
	@Override
	public void move() {
		System.out.println("Moving like an axolotl");
	}
	
	@Override
	public void swim() {
		System.out.println("Swimming like an axolotl");
	}
}
