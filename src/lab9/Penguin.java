package lab9;

public class Penguin extends Bird implements Swimmable{

	public Penguin(String name) {
		super(name);
	}
	
	public void makeNest() {
		System.out.println("Nest made");
	}
	
	@Override
	public void move() {
		System.out.println("Moving like a penguin");
	}
	
	@Override
	public void swim() {
		System.out.println("Swimming like a penguin");
	}
}
