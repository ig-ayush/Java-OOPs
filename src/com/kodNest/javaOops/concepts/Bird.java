package com.kodNest.javaOops.concepts;

abstract class Bird {
	
	private  String species;
	
	public Bird(String s) {
		this.species = s;
	}
	
	public String getSpecies() {
		return species;
	}
	abstract void eat();
	abstract void fly();
	abstract void sleep();
}
