package com.tek.general;

public class Simpleprogram3 {
	
	public void Add(){
		int a=20;
		int b=30;
		if(a<b) {
			System.out.println("a is less than b");
		}
			
				if(b>a) {
					System.out.println("b is greater than a");
				}
				a= a + 10;
				if(b== a) {
					System.out.println("b equals to a");
				}
			}
		
			
		

	public static void main(String[] args) {
		Simpleprogram3 sp3= new Simpleprogram3();
		sp3.Add();
	}

}
