package com.kodNest.javaOops.concepts;

public final class MountainEagle extends Eagle{
	
	private String eagleVarient;
	
	public MountainEagle(String eagleVarient) {
		super("Eagle");
		this.eagleVarient = eagleVarient;
	}
	
	void eat() {
		System.out.println(eagleVarient + " hunt mountain animal's  and eat's");
	}
}
