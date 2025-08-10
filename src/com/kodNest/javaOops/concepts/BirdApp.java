package com.kodNest.javaOops.concepts;

public class BirdApp {
	public static void main(String[] args) {
		
		BirdRef.BirdRefferece(new SerpantEagle("Serpant Eagle"));
		System.out.println("----------------------------------");
		System.out.println();
		BirdRef.BirdRefferece(new MountainEagle("Mountain Eagle"));
		System.out.println("----------------------------------");
		System.out.println();
		BirdRef.BirdRefferece(new VegSparrow("Veg Sparrow "));
		System.out.println("----------------------------------");
		System.out.println();
		BirdRef.BirdRefferece(new NonVegSparrow("Non-veg Sparrow"));
		
	}
}
