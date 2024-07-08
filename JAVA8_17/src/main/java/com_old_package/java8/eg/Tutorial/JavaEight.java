package com_old_package.java8.eg.Tutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Formula {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}

@FunctionalInterface
interface Converter<F, T> {
	T convert(F from);
}

public class JavaEight {

	private static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

	public static void main(String[] args) {
		// extracted();
		lambda();

	}

	private static void lambda() {
		System.out.println(names);
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		// Lambda code

		Collections.sort(names, (String a, String b) -> b.compareTo(a));

		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		System.out.println(names);
		Converter<String,String> cm=(a)->"xxx "+a+" xxx";
		System.out.println(cm.convert(" Test"));
		System.out.println(cm.convert("++"));
		
		Converter<String, Integer> cc = Integer::valueOf;
		System.out.println(cc.convert("1"));
	}

	private static void extracted() {
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};
		System.out.println(formula.calculate(4) + "   " + formula.sqrt(4));
	}
}
