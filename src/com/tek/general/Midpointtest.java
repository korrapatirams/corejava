package com.tek.general;

public class Midpointtest {
	public void findMidpoint() {
		
		int a= 500;
		int b=1000;
		
		while(++a < --b);
		
		System.out.println("midpoint is " + a);
			
			
	}

	public static void main(String[] args) {
		Midpointtest mp= new Midpointtest();
		
		mp.findMidpoint();
		

	}

}
