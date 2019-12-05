package fr.dauphine.ja.fezzouariad.shapes.model;

import java.util.LinkedList;
import java.util.List;

import fr.dauphine.ja.fezzouariad.shapes.view.LigneListDrawer;

public class LigneList extends Shapes{
	private List<Point> points;
	public LigneList() {
		super.setDrawer(new LigneListDrawer(this));
		this.points = new LinkedList<Point>();
	}
	public void add(Point p) {
		points.add(p);
	}
	public Point get(int i ) {
		return points.get(i);
	}
	public int pointCapacity() {
		// Capacity ne sert plus à rien, car avec une linkedList on ajoute à "l'infini"
		return points.size();
	}
	public int nbPoints() {
		return points.size();
	}
	public boolean contains(Point p) {
		return points.contains(p);
	}

	@Override
	public void translate(int x, int y) {
		for(Point point : points ) {
			point.translate(x, y);
		}
		
	}
}
