package com.java8.eg;

import java.util.List;

public class IteratingList {

	public static void main(String[] args) {
		List<String> names = Data.getRandomName(10);
		
		// Iterating through list 
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
	}
}
