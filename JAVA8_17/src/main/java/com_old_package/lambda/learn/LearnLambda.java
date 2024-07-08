package com_old_package.lambda.learn;

import java.util.List;

public class LearnLambda {
	public static void main(String[] args) {
		t1();
	}

	public static void t1() {
		List<String> cities=List.of("Mumbai","Pune","Jalgaon");
		boolean found=false;
		for(String str:cities) {
			if(str.equals("Pune")) {
				found=true;
			}
		}
		System.out.println(found);  // same outpute code
		System.out.println(cities.contains("Pune")); // Small code for above
		
		
	}
}
