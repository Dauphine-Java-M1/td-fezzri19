package fr.dauphine.ja.fezzouariad.shapes.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import fr.dauphine.ja.fezzouariad.shapes.model.Circle;

public class CircleDrawer implements Drawer {
	private Circle circle;
	private Color randomColour;
	public CircleDrawer(Circle circle) {
		this.circle = circle;
		Random randomGenerator = new Random();
		int red = randomGenerator.nextInt(256);
		int green = randomGenerator.nextInt(256);
		int blue = randomGenerator.nextInt(256);
		this.randomColour = new Color(red,green,blue);
	}
	public void draw(Graphics graphics) {
		int x = this.circle.getCenter().getX();
		int y = this.circle.getCenter().getY();
		int rayon = this.circle.getRayon();
	    graphics.setColor(randomColour);
	    graphics.fillOval(x, y, rayon, rayon);
		
	}

}
