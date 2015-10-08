package com.ramkissoon.brahm;
// 	ADDRESS CLASS

public class Address {
	// PRIVATE INSTANCE VARIABLES
	private String _streetNumber;
	private String _streetName;
	private String _cityName;
	private String _provinceName;
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++
	public Address(String _streetNumber, String _streetName, String _cityName, String _provinceName) {
		this._streetNumber = _streetNumber;
		this._streetName = _streetName;
		this._cityName = _cityName;
		this._provinceName = _provinceName;
	}
	
	// OVERRIDE TOSTRING()
	@Override
	public String toString() {
		String output = "";
		output += "Address: \n";
		output += "+++++++++++++++++++++++++++++++++++++++++++++++ \n";
		output += this._streetNumber + " " + this._streetName + "\n";
		output += this._cityName + " " + this._provinceName + "\n";
		return output;		
	}
	
}
