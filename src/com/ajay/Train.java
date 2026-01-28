package com.ajay;

import java.util.ArrayList;

public class Train {
	private String sourceStation;
	private String DestinationStation;
	private int totaltickets;
	private int availabletickets;
	ArrayList<String> AllTrains=new ArrayList<String>();
	{
		AllTrains.add("Bangalore -> Chennai");
		AllTrains.add("Chennai -> Bangalore");
		AllTrains.add("Trichy -> Chennai");
	}
	public void showAllTrains() {
		for(String str: AllTrains) {
			System.out.println(str);
		}
		
	}
}
