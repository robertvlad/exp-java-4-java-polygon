package org.java.polygon;

import org.java.obj.Polygon;

public class Cerchio implements Polygon{
	
	private int raggio;
	
	public Cerchio(int raggio) {
		
		setRaggio(raggio);
	}
	
	@Override
	public int getPerimetro() {
		
		return (int)(2 * getRaggio() * Math.PI);
	}

	@Override
	public int getArea() {
		
		return (int)(getRaggio() * getRaggio() * Math.PI);
	}
	

	public int getRaggio() {
		return raggio;
	}

	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	
	
	@Override
	public String toString() {
		
		return "| Raggio cerchio: " + getRaggio() + " | Perimetro: " + getPerimetro() + " | Area: " + getArea();
	}
	
	
	

}
