package fr.dauphine.ja.fezzouariad.shapes.model;

import java.util.ArrayList;

import fr.dauphine.ja.fezzouariad.shapes.view.RingDrawer;
public class Ring extends Shapes {
	
	private Circle circle_interne;
	private Circle circle_externe;

	
	public Ring(Point centre, int rayon, int rayonInterne) {
		super.setDrawer(new RingDrawer(this));

		if(rayon>rayonInterne) {
			this.circle_interne = new Circle(centre, rayonInterne);
			this.circle_externe = new Circle(centre, rayon);
			super.world.addShape(this);
		}else {
			System.out.println("Rayon < Rayon Interne");
		}
	}
	
	public Circle getCircleInterne() {
		return this.circle_interne;
	}
	
	public Circle getCircleExterne() {
		return this.circle_externe;
	}
	public boolean equals(Object o) {
		if(o==this)
			return true;
		if(! ( o instanceof Ring))
				return false;
		Ring r = (Ring) o;
		
		return  this.circle_interne.getCenter().equals(r.circle_interne.getCenter()) 
				&& this.circle_interne.getRayon() == r.circle_interne.getRayon()
				&& this.circle_externe.getCenter().equals(r.circle_externe.getCenter())
				&& this.circle_externe.getRayon() == r.circle_externe.getRayon();
	}
	
	public String toString() {
		return "("+this.circle_interne+","+this.circle_externe+")";
	}
	
	public boolean contains(Point p) {
		if(circle_externe.contains(p) && !circle_interne.contains(p))
			return true;
		return false;
	}
	
	public boolean contains(Point p, ArrayList<Ring> rings) {
		for (Ring r : rings) {
			if( r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void translate(int x, int y) {
		this.circle_externe.translate(x, y);
		this.circle_interne.translate(x, y);
		
	}
	public static void main(String [] args) {
		Ring r1 = new Ring (new Point(0,0), 2, 1);
		
		System.out.println(r1);
		System.out.println(r1.contains(new Point(1,0)));
		System.out.println(r1.contains(new Point(0,2)));
		
		ArrayList<Ring> rings = new ArrayList<Ring>();
		rings.add(r1);
		System.out.println(r1.contains(new Point(1,0)));
	}



}
