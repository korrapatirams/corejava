package com.tek.general;

public class Perimeter {
	
	public void circle() {
		
		double r, pi, c;
		
		r=12.6;
		pi= 3.1416;
		
		c=2*pi*r;
		System.out.println(" perimeter of circle is " + c );
		
		
		
	}
	
	public static void main(String[] args) {
		Perimeter p= new Perimeter();
		p.circle();
		
		
	}

}
