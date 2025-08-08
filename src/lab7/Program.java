package lab7;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(Color.blue, new Point(6, 7), 5, 10);
		Circle c = new Circle(Color.red, new Point(5, 4), 6.5);
		Sphere s = new Sphere(Color.pink, new Point(3, 6), 8.6);
		
		System.out.println(r.getCharacteristics());
		c.printCharacteristics();
		s.printCharacteristics();
		
		ArrayList<Shape> shapes = new ArrayList<>();
		shapes.add(r);
		shapes.add(c);
		shapes.add(s);
		
		for (Shape shape : shapes) {
			System.out.println("Colour: " + shape.getColour() + " Position: " + shape.getPosition());
		}

	}

}
