package org.java;

import org.java.obj.Polygon;
import org.java.polygon.Cerchio;
import org.java.polygon.Rettangolo;

public class Main {
	
	public static void main(String[] args) {
		
		Rettangolo r = new Rettangolo(10, 20);
		System.out.println(r);
		
		System.out.println("\n--------------------------------------------------\n");
		
		Cerchio c = new Cerchio(10);
		System.out.println(c);
		
		System.out.println("\n--------------------------------------------------\n");
		
		Polygon[] pols = {r, c};
		
		int sumPer = 0;
		int sumAre = 0;
		
		for (int i = 0; i < pols.length; i++) {
			
			Polygon p = pols[i];
			
			int per = p.getPerimetro();
			sumPer += per;
			
			int are = p.getArea();
			sumAre += are;
		}
		
		System.out.println("Somma area: " + sumAre);
		System.out.println("Somma perimetro: " + sumPer);
	}
}
