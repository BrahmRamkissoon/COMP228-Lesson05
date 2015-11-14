package com.ramkissoon.brahm;
// TEACHER CLASS
public class Teacher extends Resident implements SchoolID {
	private String _schoolID;
	
	// CONSTRUCTOR
	public Teacher(String _name, int _age, float _heightInInches, float _massInPounds, String SIN) {
		super(_name, _age, _heightInInches, _massInPounds, SIN);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void addSchool(String schoolName) {
		this._schoolID = schoolName;
		
	}

}
