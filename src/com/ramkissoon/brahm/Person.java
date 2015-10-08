package com.ramkissoon.brahm;
// super that we'll use for this example
public class Person {
	// PRIVATE INSTANCE VARIABLES
	private int _age;
	private String _name;
	private float _heightInInches;
	private float _massInPounds;

	// CONSTRUCTOR++++++++++++++++++++++++++++++
	public Person(int _age, String _name, float _heightInInches, float _massInPounds) {
		super();
		this._age = _age;
		this._name = _name;
		this._heightInInches = _heightInInches;
		this._massInPounds = _massInPounds;	
	}
	
	// PUBLIC METHODS
	public void eats(){
		System.out.println(this._name + " is eating");		
	}
	
	public void walks(){
		System.out.println(this._name + " is walking");
	}
	
	public void speaks(){
		System.out.println(this._name + " is speaking");
		
	}
	
	
	
	
}
