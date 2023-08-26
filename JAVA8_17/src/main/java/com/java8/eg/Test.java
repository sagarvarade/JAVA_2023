package com.java8.eg;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> names=Data.getRandomName(10);
		for(String x1:names) {
			System.out.println(x1);
		}
		
		List<String> surNames=Data.getRandomSurName(10);
		for(String x1:surNames) {
			System.out.println(x1);
		}
		
		List<String> fullNames=Data.getRandomFullName(10);
		for(String x1:fullNames) {
			System.out.println(x1);
		}
		
		
	}

}
