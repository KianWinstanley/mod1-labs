package lab7;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape{
	public int sideA;
	public int sideB;
	
	public Rectangle(Color colour, Point position, int sideA, int sideB) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public int getArea() {
		return sideA * sideB;
	}
	
	public String getCharacteristics() {
		String format = String.format("This rectangle has 2 measurements, sideA: %d and sideB: %d", this.sideA, this.sideB);
		return format;
	}
	
	public int getCircumference() {
		return (this.sideA * 2) + (this.sideB * 2);
	}
}
