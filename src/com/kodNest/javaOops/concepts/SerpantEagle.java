package com.kodNest.javaOops.concepts;

public final class SerpantEagle extends Eagle {
	
	private String eagleVarient;
	
	public SerpantEagle(String eagleVarient) {
		super("Eagle");
		this.eagleVarient = eagleVarient;
	}
	
	void eat() {
		System.out.println(eagleVarient + " hunt snake's and eat's");
	}
}
