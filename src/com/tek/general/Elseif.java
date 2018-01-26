package com.tek.general;

public class Elseif {
	
	public void conditionElse() {
		
		String brand; 
		String car="Accent" ;
		
		
		
		
		
	if(car== "camry" || car== "avalon"|| car=="corolla") 
		
		 brand ="Toyota";
	
    else if(car=="sonata" || car=="Elantra"|| car=="Accent")
	
	brand= "Hyundai";
	
    else if(car=="crv" || car=="civic"|| car=="Hrv")
    	
    	brand= "Honda";
    else
    	brand="other";
	
	System.out.println("Car is in the " + brand + " .");
	
		
	}

	public static void main(String[] args) {
		Elseif s=new Elseif();
		s.conditionElse();
	
	}

}
