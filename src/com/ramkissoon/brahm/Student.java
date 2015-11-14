package com.ramkissoon.brahm;

import java.util.ArrayList;

// STUDENT CLASS
public class Student extends Resident implements SchoolID {
	// PRIVATE INSTANCE VARIABLES
	private String _studentID;
	private ArrayList<Course> _courses = new ArrayList<Course>();
	private String _schoolID;
	
	// CONSTRUCTOR
	
	public Student(String _name, int _age, float _heightInInches, float _massInPounds, String SIN, String studentID) {
		super(_name, _age, _heightInInches, _massInPounds, SIN);
		this._studentID = studentID;
	}
	
	public void addCourse(String courseCode, String courseName, String courseDescription, double courseCost){
		this._courses.add(new Course(courseCode, courseName, courseDescription, courseCost));
	}
	
	// enhanced for loop -- equivalent to foreach in C#
	// this is for small lists, since it has to iterate through each object
	public void dropCourse(String courseName){
		int index = 0;
		for (Course course : this._courses) {
			if(course.getName() == courseName){
				index = this._courses.indexOf(course);				
			}
		}
		if(index >= 0){
		this._courses.remove(index);
		}
	}

	// OVERRIDE TOSTRING
	@Override
	public String toString() {
		String output = "";
		output +=	"Student Name: " + this._name + " StudentID: " + this._studentID + "\n";
		
		if(this._courses.size() > 0){
			output +=	"Courses\n";
			output += 	"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
			
			for (Course course : this._courses) {
				output += course.getName() + "\n";
			}
			output += 	"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
		}
		
		return output;					
	}

	@Override
	public void addSchool(String schoolName) {
		this._schoolID = schoolName;
		
	}
	
}
