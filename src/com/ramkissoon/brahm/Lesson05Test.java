package com.ramkissoon.brahm;

// 	DRIVER CLASS +++++++++++++++++++++++++++++++
public class Lesson05Test {
	
	// MAIN STATIC METHOD ++++++++++++++++++++++
	public static void main(String[] args) {
		Resident resident = new Resident("Brahm", 20, 72.0f, 200.0f, "555 555 555");
		
		resident.eats();	// inheriting from person class'
		resident.setAddress("55"," Fifty-Fifth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(resident.getAddress());
		
		resident.changeAddress("44"," Forty-Fourth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(resident.getAddress());

	}

}