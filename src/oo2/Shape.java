package oo2;

import java.awt.Color;

public class Shape {
	public int x, y, w, h;
	private int dirX, dirY;
	static int worldW;
	static int worldH;
	private ShapeType shapeType;
	private Color colour;
	
	
	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shapeType, Color colour) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		this.shapeType = shapeType;
		this.colour = colour;
	}
	
	public Shape(int x, int y, int w, int h) {
		new Shape(x, y, w, h, 1, 1, ShapeType.OVAL, Color.black);
	}
	
	public static void setWorld(int w, int h) {
		worldW = w;
		worldH = h;
	}
	
	public Color getColour() {
		return colour;
	}
	
	public ShapeType getShapeType() {
		return shapeType;
	}
	
	public void move() {
		x += dirX;
		y += dirY;
		
		if (x < 0) {
			x = 0;
			dirX = -dirX;
		}
		else if (x > worldW - w) {
			x = worldW - w;
			dirX = -dirX;
		}
		
		if (y < 0) {
			y = 0;
			dirY = -dirY;
		}
		else if (y > worldH - h) {
			y = worldH - h;
			dirY = -dirY;
		}
	}
}