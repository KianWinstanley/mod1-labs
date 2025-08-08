package lab7;

import java.awt.Color;
import java.awt.Point;

public class Shape {
	public Color colour;
	public Point position;
	
	public Shape(Color colour, Point position) {
		this.colour = colour;
		this.position = position;
	}
	
	public Color getColour() {
		return this.colour;
	}
	
	public void setColour(Color colour) {
		this.colour = colour;
	}
	
	public Point getPosition() {
		return this.position;
	}
	
	public void setPosition(Point position) {
		this.position = position;
	}
}
