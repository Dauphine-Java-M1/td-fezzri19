package fr.dauphine.ja.fezzouariad.shapes.model;

import java.util.ArrayList;

public class World {
	private ArrayList<Shapes> shapes;
	
	public World() {
		this.shapes = new ArrayList<Shapes>();
	}
	
	public void addShape(Shapes shape) {
		shapes.add(shape);
	}
	
	public ArrayList<Shapes> getShapes(){
		return this.shapes;
	}
}
