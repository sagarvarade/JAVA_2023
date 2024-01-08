package com.java8.eg.Interf;

@FunctionalInterface
public interface FuncInterf {

	public void func();
	
	default double sqrt(int num) {
		printPrivateMethod();
		return Math.sqrt((double)num);
	}
	
	private void printPrivateMethod() {
		System.out.println("Print me : printPrivateMethod");
	}
}
