package oo2b;

import java.util.Random;

public class Program {

	public static void main(String[] args) throws Exception {
		Vehicle[] vehicles = new Vehicle[11];
		
		try {
			vehicles[0] = new Vehicle(0, 1, "Steve");
			vehicles[1] = new Vehicle(0, 2, "Bob");
			vehicles[2] = new Vehicle(0, 3, "Brian");
			vehicles[3] = new Vehicle(0, 4, "John");
			vehicles[4] = new Vehicle(0, 5, "Peter");
			vehicles[5] = new Vehicle(0, 6, "David");
			vehicles[6] = new Vehicle(0, 7, "Roger");
			vehicles[7] = new Vehicle(0, 8, "Freddie");
			vehicles[8] = new Vehicle(0, 9, "George");
			vehicles[9] = new Vehicle(0, 10, "Lewis");
			vehicles[10] = new Vehicle(0, 11, "Gerald");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No more registration plates");
		}
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getDetails());
		}
		Random rand = new Random();
		boolean raceOver = false;
		
		while (!raceOver) {
			for (Vehicle vehicle : vehicles) {
				int n = rand.nextInt(10)+1;
				vehicle.accelerate(n);
				System.out.println(vehicle.getDetails());
				
				if (vehicle.distanceTravelled >= 1000) {
					System.out.println(vehicle.driver + " is the winner!");
					raceOver = true;
					break;
				}
			}
			
		}
		System.out.println("there are " + Vehicle.getCount() + " vehicles");
	}

}
