package lab7;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape{
	public double radius;
	
	public Circle(Color colour, Point position, double radius) {
		super(colour, position);
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getCircumference() {
		return Math.PI * getDiameter();
	}
	
	public double getDiameter() {
		return radius * 2;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void printCharacteristics() {
		String format = String.format("Your circle has a radius of %f, a diameter of %f, a circumference of %f and an area of %f", this.radius, this.getDiameter(), this.getCircumference(), this.getArea());
		System.out.println(format);
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
