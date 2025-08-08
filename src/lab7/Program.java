package lab7;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		Point point = new Point();
		Rectangle r = new Rectangle(Color.blue, point, 5, 10);
		Circle c = new Circle(Color.red, point, 6.5);
		Sphere s = new Sphere(Color.pink, point, 8.6);
		
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
