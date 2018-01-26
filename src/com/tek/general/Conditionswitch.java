package com.tek.general;

public class Conditionswitch {
	
	public void switchTest() {
		
		for(int j=0;j<5;j++)
			
			switch(j) {
			case 0:
				System.out.println("one order in the menu");
				break;
			case 1:
				System.out.println("second order in the menu");
				break;
			case 2:
				System.out.println("third order in the menu");
				break;
			case 3:
				System.out.println("fourth order in the menu");
				break;
				default:
					System.out.println("order not available in the menu");
			
			}
	}

	public static void main(String[] args) {
		
		Conditionswitch cs= new Conditionswitch();
		cs.switchTest();
		

	}

}
