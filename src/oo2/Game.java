package oo2;

import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 
import java.util.Timer; 
import javax.swing.*; 

 
public class Game extends Canvas {
	ArrayList<Shape> shapes = new ArrayList<>();
	
	Game() {
		shapes.add(new Shape(12, 11, 50, 50, 5, 5, ShapeType.THREEDRECTANGLE, Color.blue));
		shapes.add(new Shape(15, 20, 80, 80, 20, 10, ShapeType.ARC, Color.red));
		shapes.add(new Shape(40, 100, 30, 30, 15, 5, ShapeType.ROUNDRECTANGLE, Color.pink));
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		
		Shape.setWorld(500, 500);
		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};
		
		t.schedule(tt,  0, 50);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}
	
	public void draw() {
		for (Shape shape : shapes) {
			shape.move();
		}
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0,  0,  Shape.worldW, Shape.worldH);
		for (Shape shape : shapes) {
			g.setColor(shape.getColour());
			if (shape.getShapeType() == ShapeType.OVAL) {
				g.drawOval(shape.x, shape.y, shape.w, shape.h);
			}
			else if (shape.getShapeType() == ShapeType.ROUNDRECTANGLE) {
				g.drawRoundRect(shape.x, shape.y, shape.w, shape.h, shape.w, shape.h);
			}
			else if (shape.getShapeType() == ShapeType.ARC) {
				g.drawArc(shape.x, shape.y, shape.w, shape.h, 50, 70);
			}
			else if (shape.getShapeType() == ShapeType.RECTANGLE) {
				g.drawRect(shape.x, shape.y, shape.w, shape.h);
			}
			else {
				g.draw3DRect(shape.x, shape.y, shape.w, shape.h, true);
			}
		}
	}
}
