package fr.dauphine.ja.fezzouariad.shapes.model;

import java.awt.Shape;

import fr.dauphine.ja.fezzouariad.shapes.view.LigneTabDrawer;

public class LigneTab extends Shapes{
	private Point points[];
	private int index;

	
	public LigneTab(int nbPoints) {
		super.setDrawer(new LigneTabDrawer(this));
		this.points = new Point[nbPoints];
		this.index = 0;
	}
	
	public void add(Point p) {
		if(index < points.length) {
			points[index]=p;
			index++;
		}else {
			System.out.println("Impossible d'ajouter cet élément");
		}
	}
	public int pointCapacity() {
		return points.length;
	}
	public int nbPoints() {
		return index;
	}
	public Point get(int i) {
		return points[i];
	}
	public boolean contains(Point p) {
		try {
			for (Point e : points) {
				// On ne peut pas utiliser isSameAs() car cette méthode compare les valeurs des variables, 
				// Ce qui nous intéresse pas ici.
				if(e.isSameAs(p)) {
					return true;
				}
			}
		}catch(NullPointerException e) {
			System.out.println("l'objet "+p+" n'est pas contenu dans la liste.");
		}
		return false;
	}

	@Override
	public void translate(int x, int y) {
		for(int i=0; i<points.length-1; i++) {
			points[i].translate(x, y);
		}
	}

}
