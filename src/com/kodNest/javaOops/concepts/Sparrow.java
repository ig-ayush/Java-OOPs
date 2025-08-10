package com.kodNest.javaOops.concepts;

abstract class Sparrow extends Bird{

	private String type;	
	
	public Sparrow(String type) {
		super("Bird");
		this.type = type;
	}
	
	String spesies = getSpecies();
	
	void fly() {
		System.out.println("The Spieces " +  spesies + " type of " + type + " fly's very low");
	}
	
	void sleep() {
		System.out.println(type + " sleep's in  plant's");
	}
}
