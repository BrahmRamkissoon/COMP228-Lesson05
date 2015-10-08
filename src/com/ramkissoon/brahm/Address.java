package com.ramkissoon.brahm;
// 	ADDRESS CLASS

public class Address {
	// PRIVATE INSTANCE VARIABLES
	private String _streetNumber;
	private String _streetName;
	private String _cityName;
	private String _provinceName;
	private Boolean _hasChanged = false;
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++
	public Address(String streetNumber, String streetName, String cityName, String provinceName) {
		this._set(streetNumber, streetName, cityName, provinceName);
	}
	
	// OVERRIDE TOSTRING()++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public String toString() {
		String output = "";
		if(this._hasChanged){
			output += "New Address: \n";
		} else {
			output += "Address: \n";
		}
		output += "+++++++++++++++++++++++++++++++++++++++++++++++ \n";
		output += this._streetNumber + " " + this._streetName + "\n";
		output += this._cityName + " " + this._provinceName + "\n";
		return output;	
		
	}
	
	// CHANGE ADDRESS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void change(String streetNumber, String streetName, String cityName, String provinceName){
		this._set(streetNumber, streetName, cityName, provinceName);
		this._hasChanged = true;
		}
	
	// CODE REUSE FOR SETTING PRIVATE INSTANCE VARIABLES+++++++++++++++++++++++++++++++++++++++++++
	private void _set(String streetNumber, String streetName, String cityName, String provinceName){
		this._streetNumber = streetNumber;
		this._streetName = streetName;
		this._cityName = cityName;
		this._provinceName = provinceName;
	}
}
