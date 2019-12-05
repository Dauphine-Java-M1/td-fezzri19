
package fr.dauphine.ja.fezzouariad.shapes;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.fezzouariad.shapes.controller.MouseController;
import fr.dauphine.ja.fezzouariad.shapes.model.Circle;
import fr.dauphine.ja.fezzouariad.shapes.model.LigneTab;
import fr.dauphine.ja.fezzouariad.shapes.model.Point;
import fr.dauphine.ja.fezzouariad.shapes.model.Ring;
import fr.dauphine.ja.fezzouariad.shapes.model.Shapes;
import fr.dauphine.ja.fezzouariad.shapes.model.World;

public class Main extends JPanel {
	private World world;
	
	public Main(World world) {
		this.world = world;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for(Shapes shape : this.world.getShapes()) {
			shape.getDrawer().draw(g);
		}
	}

	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Model :
		World world = new World();
		// Circles :
		Circle circle = new Circle(new Point(200,200), 20);
		Circle circle2 = new Circle(new Point(300,300), 20);
		
		// Ligne :
		LigneTab lignetab = new LigneTab(2);
		lignetab.add(new Point(200,200));
		lignetab.add(new Point(900,900));
		
		// Ring
		//Ring ring = new Ring(new Point(300,300), 300, 150);
		
		// Ajout
		world.addShape(circle);
		world.addShape(circle2);
		world.addShape(lignetab);
		//world.addShape(ring);
		
		// Création
		Main view = new Main(world);
		
		
		// Controler : 
		MouseController mouseController = new MouseController(world, frame);
		
		frame.add(view);
		frame.addMouseMotionListener(mouseController);
		frame.setVisible(true);
	}
	
}
