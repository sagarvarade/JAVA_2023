package com_old_package.corejava.Basics;

import java.math.BigDecimal;

/* Classes can have , Methods , Variables and constructors
 * variables : Public, private, instance , final , protected
 * 
 *  
 */

final class Dadaji {

}

class Parent { // extends Dadaji , Can not extend final class dadaji

	private String pName;
	private String pAddress;

	public Parent() {
		super();
	}

	public Parent(String pName, String pAddress) {
		super();
		this.pName = pName;
		this.pAddress = pAddress;
	}

	public void methodOne() {
		System.out.println("Parent Method one ");
	}

	public Object covariant() {
		System.out.println("Covariant Parent Object");
		return "";
	}

	public static void staticMethodOne() {
		System.out.println("Parent Static method");
	}
}

class Child extends Parent {
	public Child() {
		
	}

	public Child(String pName, String pAddress) {
		super(pName, pAddress);
	}

	// You can not decrease the scope of parent method, Parent public can not be
	// change to Private in child
	public void methodOne() {
		System.out.println("Child Method one ");
	}

	public void methodTwo() {
		System.out.println("Child Method two ");
	}

	public String covariant() { // Covariant return type can change to its child
		System.out.println("Covariant Parent String ");
		return "";
	}

	public static void staticMethodOne() {
		System.out.println("child Static method");
	}
}

public class BasicOne {
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent p2 = new Child();
		Child c1 = new Child();
		// Method overriding
		p.methodOne(); // Parent method
		p2.methodOne(); // Child method
		c1.methodOne(); // Child Method

		// Methods
		// p.methodTwo(); // Dont have access
		// p2.methodTwo(); // Dont have access
		c1.methodTwo(); // Child Method two

		// Static methods
		System.out.println(">>>>> Static methods");
		p.staticMethodOne();
		c1.staticMethodOne();
		Parent.staticMethodOne();
		Child.staticMethodOne();
		System.out.println(">>>>>>>>>>");
		BigDecimal bg=new BigDecimal(10);
		
		SubjectsEnum.ENGLISH.methd();
		
		
	}
}
