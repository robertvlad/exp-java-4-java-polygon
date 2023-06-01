package org.java;

import org.java.polygon.Cerchio;
import org.java.polygon.Rettangolo;

public class Main {
	
	public static void main(String[] args) {
		
		Rettangolo r = new Rettangolo(10, 20);
		System.out.println(r);
		
		System.out.println("\n--------------------------------------------------\n");
		
		Cerchio c = new Cerchio(10);
		System.out.println(c);
	}
}
