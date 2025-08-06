package oo2b;

public class Vehicle {
	int speed, lane, distanceTravelled;
	RegistrationPlate registrationPlate;
	static int count = 0;
	String driver;
	
	public Vehicle(int speed, int lane, String driver) {
		this.speed = speed;
		this.lane = lane;
		this.driver = driver;
		this.registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
		count++;
	}
	
	public void accelerate(int amount) {
		if (speed >= 200) {
			speed = 200;
			System.out.println("Cannot increase anymore");
		}
		
		distanceTravelled += amount;
		speed += amount;
	}
	
	public void brake(int amount) {
		if (speed <= 0) {
			speed = 0;
			System.out.println("Cannot decrease anymore");
		}
		
		speed -= amount;
	}
	
	public int getDistanceTravelled() {
		return this.distanceTravelled;
	}
	
	public String getDetails() {
		String format = String.format("%s's vehicle is at speed %d, in lane %d, it has travelled %d and has the plate %s", this.driver, this.speed, this.lane, this.distanceTravelled, this.registrationPlate.getNumber());
		return format;
	}
	
	public static int getCount() {
		return count;
	}
}
