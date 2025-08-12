package lab9;

public class Duck extends Bird implements Flyable, Swimmable{

	public Duck(String name) {
		super(name);
	}
	
	public void makeNest() {
		System.out.println("Nest made");
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a duck");
	}

	@Override
	public void fly() {
		System.out.println("Flying like a duck");
	}
	
	@Override
	public void move() {
		System.out.println("Moving like a duck");
	}

}
