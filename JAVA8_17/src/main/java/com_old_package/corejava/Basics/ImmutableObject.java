package com_old_package.corejava.Basics;

final public class ImmutableObject {
	private int i;

	ImmutableObject(int i) {
		super();
		this.i = i;
	}

	public ImmutableObject modify(int i) {
		if (this.i == i) {
			return this;
		} else
			return new ImmutableObject(i);
	}

	public static void main(String[] args) {
		ImmutableObject ij = new ImmutableObject(10);
		ImmutableObject ij2 = ij.modify(12);
		ImmutableObject ij3 = ij.modify(123);
		ImmutableObject ij4 = ij3.modify(123);
		System.out.println(ij.hashCode() + "   " + ij2.hashCode() + "   " + ij3.hashCode() + "    " + ij4.hashCode());
	}
}
