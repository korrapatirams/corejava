package com.tek.general;

public class Nestedif {
	
	public void conditionTest() {
		
		int i=5;
		int j=20;
		 int t=8;
		 int x=5;
		
		if (i<j) {
			System.out.println("i is smaller than j");
		}
			
			if(j>t) {
				
				System.out.println("j is greater than t");
			}
			if(i==x) {
				System.out.println("i is equals to x");
			}
		}
			
	public static void main(String[] args) {
		
		Nestedif n= new Nestedif();
		n.conditionTest();
		
		

	}

}
