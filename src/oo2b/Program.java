package oo2b;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[3];
		
		vehicles[0] = new Vehicle(0, 1, "Steve");
		vehicles[1] = new Vehicle(0, 2, "Bob");
		vehicles[2] = new Vehicle(0, 3, "Brian");
		
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
