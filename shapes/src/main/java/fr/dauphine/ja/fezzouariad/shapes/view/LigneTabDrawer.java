package fr.dauphine.ja.fezzouariad.shapes.view;


import java.awt.Graphics;

import fr.dauphine.ja.fezzouariad.shapes.model.LigneTab;

public class LigneTabDrawer implements Drawer{
	private LigneTab ligneTab;
	public LigneTabDrawer(LigneTab ligneTab) {
		this.ligneTab = ligneTab;
	}
	public void draw(Graphics graphics) {
		for(int i=0; i<ligneTab.nbPoints()-1; i++) {
			  graphics.drawLine((int) ligneTab.get(i).getX(),(int) ligneTab.get(i).getY(),
	                    (int) ligneTab.get(i+1).getX(),(int) ligneTab.get(i+1).getY());
		}
	}
}
