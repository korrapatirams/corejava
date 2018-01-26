package com.tek.general;

public class Dowhile_test {

	public void testDoWhile()
	{
		int a = 8;
		do {
			System.out.println("printed number as " + a);
			a--;
			
		}
		while(a>0);
	}
	public static void main(String[] args) {
		Dowhile_test t1=new Dowhile_test();
		t1.testDoWhile();
		
	}

}
