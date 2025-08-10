package com.kodNest.javaOops.concepts;

abstract class Eagle extends Bird {
	
	private String type;	
	public Eagle(String type) {
		super("Bird");
		this.type = type;
	}
	String spesies = getSpecies();
	
	void fly() {
		System.out.println("The Spieces " +  spesies + " type of " +  type + " fly's very high");
	}
	
	void sleep() {
		System.out.println(type + " sleep's in tall Tree's");
	}
}
