package com.kodNest.javaOops.concepts;

public final class VegSparrow extends Sparrow{
	
	private String eagleVarient;
	
	public VegSparrow(String eagleVarient) {
		super("Sparrow");
		this.eagleVarient = eagleVarient;
	}
	
	void eat() {
		System.out.println(eagleVarient + " eat's palnts");
	}
}
