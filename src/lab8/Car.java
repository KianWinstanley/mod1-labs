package lab8;

public class Car {
	private String model;
	private int speed;
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
	
	public void accelerate(int seconds) {
		speed += 5 * seconds;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void getToSixty() {
		speed = 60;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
