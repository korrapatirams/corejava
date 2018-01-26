package com.tek.general;

public class Update_array {
	
	public void improvedArray() {
	
	int	month_days[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	System.out.println("August has " + month_days[7] + " days. ");
	}
	
	public static void main(String[] args) {
		
		Update_array u= new Update_array();
		u.improvedArray();
		
	}

}
