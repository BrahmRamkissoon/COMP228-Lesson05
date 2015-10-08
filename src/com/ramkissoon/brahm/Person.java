package com.ramkissoon.brahm;
// super that we'll use for this example
public class Person {
	// PRIVATE INSTANCE VARIABLES
	private int _age;
	private String _name;
	private float _heightInInches;
	private float _massInPounds;
	
	// 	GETTERS/SETTERS, ACCESSORS/MUTATORS
	
	public int getAge() {
		return this._age;
	}

	public void setAge(int _age) {
	this._age = _age;
	}

	public String getName() {
		return this._name;
	}
	
	public void setName(String _name) {
		this._name = _name;
	}
	
	public float getHeightInInches() {
		return this._heightInInches;
	}
	
	public void setHeightInInches(float _heightInInches) {
		this._heightInInches = _heightInInches;
	}

	public float getMassInPounds() {
		return this._massInPounds;
	}
	
	public void setMassInPounds(float _massInPounds) {
		this._massInPounds = _massInPounds;
	}

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
