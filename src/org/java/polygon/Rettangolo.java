package org.java.polygon;

import org.java.obj.Polygon;

public class Rettangolo implements Polygon{
	
	private int base;
	private int altezza;
	
	public Rettangolo(int base, int altezza) {
		
		setBase(base);
		setAltezza(altezza);
	}

	@Override
	public int getPerimetro() {
		
		return (getBase() + getAltezza()) * 2;
	}

	@Override
	public int getArea() {
		
		return getBase() * getAltezza();
	}
	

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	
	@Override
	public String toString() {
		
		return "| Rettangolo Altezza: " + getAltezza() + " e Base: " + getBase() + " | Perimetro: " + getPerimetro() + " | Area: " + getArea();
	}
}
