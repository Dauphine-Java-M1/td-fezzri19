package fr.dauphine.ja.fezzouariad.shapes.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import fr.dauphine.ja.fezzouariad.shapes.model.Ring;


public class RingDrawer implements Drawer{
	private Ring ring;
	private Color randomColour;
	public RingDrawer(Ring ring) {
		this.ring = ring;
		Random randomGenerator = new Random();
		int red = randomGenerator.nextInt(256);
		int green = randomGenerator.nextInt(256);
		int blue = randomGenerator.nextInt(256);
		this.randomColour = new Color(red,green,blue);
	}
	public void draw(Graphics graphics) {
        graphics.setColor(randomColour);
        graphics.fillOval((int)ring.getCircleExterne().getCenter().getX()-(int)ring.getCircleExterne().getRayon(),
                (int)ring.getCircleExterne().getCenter().getY()-(int)ring.getCircleExterne().getRayon(),
                2*(int)ring.getCircleExterne().getRayon(), 2*(int)ring.getCircleExterne().getRayon());
        graphics.setColor(Color.lightGray);
        graphics.fillOval((int)ring.getCircleInterne().getCenter().getX()-(int)ring.getCircleInterne().getRayon(),
                (int)ring.getCircleInterne().getCenter().getY()-(int)ring.getCircleInterne().getRayon(),
                2*(int)ring.getCircleInterne().getRayon(), 2*(int)ring.getCircleInterne().getRayon());
        graphics.setColor(Color.black);
	}

}
