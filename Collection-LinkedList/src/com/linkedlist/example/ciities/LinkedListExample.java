package com.linkedlist.example.ciities;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
	LinkedList<String> cityName = new LinkedList<>();
	
	cityName.add("BLR");
	cityName.add("HYD");
	cityName.add("LKO");
	cityName.add("DEL");
	cityName.add("CHE");
	cityName.add("KOL");
	
	
	
	cityName.addFirst("kanpur");
	cityName.addLast("kochi");
	cityName.remove("HYD");
	
	System.out.println("city Name : " + cityName);

	}

}
