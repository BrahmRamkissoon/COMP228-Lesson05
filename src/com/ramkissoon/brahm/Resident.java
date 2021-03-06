package com.ramkissoon.brahm;

// RESIDENT SUB CLASS OFF THE PERSON SUPERCLASS
public abstract class Resident extends Person {
	// PRIVATE INSTANCE VARIABLES
	protected String _SIN; 	// make sure to add into constructor
	protected Address _address;
	
	// GETTER AND SETTERS
	public String getSIN(){
		return this._SIN;
	}
	// CREATE A NEW OBJECT OF ADDRESS CLASS
	public void setAddress(String streetNumber, String streetName, String cityName, String provinceName){
		this._address = new Address(streetNumber, streetName, cityName, provinceName);		
	}
	
	// CHANGE ADDRESS
	public void changeAddress(String streetNumber, String streetName, String cityName, String provinceName){
		this._address.change(streetNumber, streetName, cityName, provinceName);
	}
	
	// OUTPUT ADDRESS TOSTRING with TRY CATCH BLOCK WHEN ADDRESS IS NOT SET
	public String getAddress(){
		try {
			return this._address.toString();
		} catch (Exception e) {
			return "Error: Address not initialized";			
		}
	}
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++
	public Resident(String _name, int _age, float _heightInInches, float _massInPounds, String SIN) {
		super(_age, _name, _heightInInches, _massInPounds);
		this._SIN = SIN;
		
	}

}
