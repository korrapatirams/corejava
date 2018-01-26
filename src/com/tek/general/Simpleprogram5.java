package com.tek.general;

public class Simpleprogram5 {
	
	public void blockTest() {
		int a=25;
		int b;
		
		for(b=0;b<15;b++) {
			System.out.println("print b:" + b);
			
			System.out.println("print a: "+ a);
					
			a= a-1;
		}
	}

	public static void main(String[] args) {
		Simpleprogram5 sp5= new Simpleprogram5();
		sp5.blockTest();
		
		
	}

}
