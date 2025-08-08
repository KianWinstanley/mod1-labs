package lab7;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle {
	public Sphere(Color colour, Point position, double radius) {
		super(colour, position, radius);
	}

	public double getVolume() {
		return (4/3) * Math.PI * Math.pow(radius, 3);
	}
	
	public void printCharacteristics() {
		String format = String.format("Your sphere has a radius of %f, a diameter of %f, and a volume of %f", this.radius, this.getDiameter(), this.getVolume());
		System.out.println(format);
	}
}
