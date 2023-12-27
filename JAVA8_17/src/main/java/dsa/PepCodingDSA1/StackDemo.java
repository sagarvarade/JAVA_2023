package dsa.PepCodingDSA1;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		StackExamples();
	}

	private static void StackExamples() {
		Stack<String> stc = new Stack<String>();
		//stc.pop();
		stc.add("aa");
		stc.add("bb");
		stc.add("cc");
		stc.push("ddd");

		System.out.println(stc.pop() + " - Remove top ");
		System.out.println(stc.peek() + " - Pick top  element");
		System.out.println(stc.remove(0) + " - Pick top  element");
		for (String str : stc) {
			System.out.println(str);
		}
	}
}
