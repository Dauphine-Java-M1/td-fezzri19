package fr.dauphine.ja.fezzouariad.iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import javax.print.attribute.IntegerSyntax;

public class Panel<E> implements Iterator<Integer>{
	private int deb;
	private int fin;
	private static int  courant;
	public Panel(int deb, int fin) {
		
		this.deb = deb;
		this.fin = fin;
		this.courant=this.deb;
	}
	
	@Override
	public boolean hasNext() {
		
		return this.courant<=this.fin;
	}

	@Override
	public Integer next() {
		if(!hasNext()) throw new NoSuchElementException();
		return this.courant++;
		
	}

	public static Iterator<Integer> panel1(int debut,int fin) {
		
		return new Panel<Integer>(debut ,fin);	
	}
	


	
	public static void main(String[] args) {
		Iterator<Integer> it =  panel1(1,5);
		for(;it.hasNext();)
		System.out.println(it.next());

	}


}
