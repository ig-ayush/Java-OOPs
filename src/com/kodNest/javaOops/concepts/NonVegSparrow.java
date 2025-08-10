package com.kodNest.javaOops.concepts;

public final class NonVegSparrow extends Sparrow{
	
	private String eagleVarient;
	
	public NonVegSparrow(String eagleVarient) {
		super("Sparrow");
		this.eagleVarient = eagleVarient;
	}
	
	void eat() {
		System.out.println(eagleVarient + " hunt small insects and eat's");
	}
}
