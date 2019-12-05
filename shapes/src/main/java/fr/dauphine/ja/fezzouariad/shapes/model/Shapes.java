package fr.dauphine.ja.fezzouariad.shapes.model;

import fr.dauphine.ja.fezzouariad.shapes.view.Drawer;

public abstract class Shapes {
	private Drawer drawer;
	protected World world = new World();
	
	
	public void setDrawer(Drawer drawer) {
		this.drawer = drawer;
	}
	public Drawer getDrawer() {
		return this.drawer;
	}
	public abstract boolean contains(Point point);
	public abstract void translate(int x, int y);
}
