package fr.dauphine.ja.fezzouariad.shapes.view;

import java.awt.Color;
import java.awt.Graphics;

import fr.dauphine.ja.fezzouariad.shapes.model.Circle;
import fr.dauphine.ja.fezzouariad.shapes.model.LigneList;

public class LigneListDrawer implements Drawer{
	private LigneList ligneList;
	public LigneListDrawer(LigneList ligneList) {
		this.ligneList= ligneList;
	}
	public void draw(Graphics graphics) {
		for(int i=0; i<ligneList.nbPoints()-1; i++) {
			  graphics.drawLine((int) ligneList.get(i).getX(),(int) ligneList.get(i).getY(),
	                    (int) ligneList.get(i+1).getX(),(int) ligneList.get(i+1).getY());
		}
	}
}
