package com.tek.general;

public class Forwardprog {
	
	public void promote() {
		
	byte x =20;
	char i= 'r';
	short z=456;
	int a = 1200;
	float j= 5.3f;
	double p= .856589;
	
	double result= (j*x)+ (a/i) + (p*z);
	
	System.out.println((j*x) + " + " + (a/i) + " - " + (p*z ));
	System.out.println("result = " + result);
		
	}

	public static void main(String[] args) {
	
		Forwardprog fp= new Forwardprog();
		fp.promote();
		
		
	}

}
