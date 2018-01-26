package com.tek.general;

public class Speedtest {

	public void speed()
	{
		int moonspeed;
		long days;
		long seconds;
		long distance;
		
		moonspeed= 2288;
		days=1500;
		
		seconds=days*24*60*60;
		
		distance= moonspeed*seconds;
		
		System.out.print("In " + days);
		System.out.print(" days moon travel about ");
		System.out.println(distance + " miles.");
		
		
	}
	public static void main(String[] args) {
		Speedtest st=new Speedtest();
		st.speed();
		
		
		

	}

}
