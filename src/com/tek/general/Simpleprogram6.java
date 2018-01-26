package com.tek.general;

public class Simpleprogram6 {
	
	public void boolTest()
	{
		boolean x;
		x=true;
		System.out.println("x is: " + x);
		x=false;
		System.out.println("x is: " + x);
		
		System.out.println(" Don't execute ");
		
		x=true;
		System.out.println("Execute this");
		
		System.out.println(" 4 < 8 is " + (4 < 9) );
		
		
		
	}
	public static void main(String[] args) {
		Simpleprogram6 sp6=new Simpleprogram6();
		sp6.boolTest();
		
	}

}
