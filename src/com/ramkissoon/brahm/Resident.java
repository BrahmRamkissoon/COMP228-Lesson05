package com.ramkissoon.brahm;

// RESIDENT SUB CLASS OFF THE PERSON SUPERCLASS
public class Resident extends Person {
	// PRIVATE INSTANCE VARIABLES
	private String _SIN; 	// make sure to add into constructor
	private Address _address;
	
	// GETTER AND SETTERS
	public String getSIN(){
		return this._SIN;
	}
	// CREATE A NEW OBJECT OF ADDRESS CLASS
	public void setAddress(String streetNumber, String streetName, String cityName, String provinceName){
		this._address = new Address(streetNumber, streetName, cityName, provinceName);		
	}
	
	// OUTPUT ADDRESS TOSTRING
	public String getAddress(){
		return this._address.toString();
	}
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++
	public Resident(int _age, String _name, float _heightInInches, float _massInPounds, String SIN) {
		super(_age, _name, _heightInInches, _massInPounds);
		this._SIN = SIN;
		
	}

}
