package fr.dauphine.ja.fezzouariad.shapes.controller;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import fr.dauphine.ja.fezzouariad.shapes.model.Point;
import fr.dauphine.ja.fezzouariad.shapes.model.Shapes;
import fr.dauphine.ja.fezzouariad.shapes.model.World;

public class MouseController implements MouseMotionListener{
	private World world;
	private JFrame jFrame;
	
	
	public MouseController(World world, JFrame frame) {
		this.world = world;
		this.jFrame = frame;
	}
	
 
	public void mouseDragged(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY());
		System.out.println(e.getX()+" "+ e.getY());
		for (Shapes shape : world.getShapes()) {
			System.out.println(shape.contains(p));
			if (shape.contains(p)) {
				int index = world.getShapes().indexOf(shape);
				world.getShapes().get(index).translate(e.getX(), e.getY());
				jFrame.repaint();
				return;
			}
		}
	}
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
