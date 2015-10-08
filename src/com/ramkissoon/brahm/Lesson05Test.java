package com.ramkissoon.brahm;

// 	DRIVER CLASS +++++++++++++++++++++++++++++++
public class Lesson05Test {
	
	// MAIN STATIC METHOD ++++++++++++++++++++++
	public static void main(String[] args) {
		Student student = new Student("Brahm", 20, 72.0f, 200.0f, "555 555 555", "15MM12345");
		
		student.eats();	// inheriting from person class'
		student.setAddress("55"," Fifty-Fifth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(student.getAddress());
		
		student.changeAddress("44"," Forty-Fourth Street", "Toronto", "Ontario");
		System.out.println("\n");
		System.out.println(student.getAddress());
		
		student.addCourse("COMP101", "Programming Fundamentals", "First Computer Course", 600.35);
		student.addCourse("COMP102", "Programming Design", "First UML Course", 600.35);
		student.dropCourse("Programming Design");
		//student.dropCourse("Programming Fundamentals");
		System.out.println(student.toString());

	}

}
