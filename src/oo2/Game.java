package oo2;

import java.awt.*; 
import java.awt.event.*; 
import java.util.*; 
import java.util.Timer; 
import javax.swing.*; 

 
public class Game extends Canvas {
	Ball[] balls = new Ball[3];
	
	Game() {
		balls[0] = new Ball(12, 11, 50, 50, 5, 5);
		balls[1] = new Ball(15, 20, 80, 80, 20, 10);
		balls[2] = new Ball(40, 100, 30, 30, 15, 5);
		
		JFrame frame = new JFrame();
		this.setSize(400, 400);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);
		
		Ball.setWorld(500, 500);
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
		for (Ball ball : balls) {
			ball.move();
		}
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.drawRect(0,  0,  Ball.worldW, Ball.worldH);
		for (Ball ball : balls) {
			g.drawOval(ball.x, ball.y, ball.w, ball.h);
		}
	}
}
