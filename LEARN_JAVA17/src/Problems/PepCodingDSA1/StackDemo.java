package Problems.PepCodingDSA1;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		// StackExamples();
		// Duplicate Brackets
		// duplicateBrackets();
		// Balanced Brackets
		// balancedBrackets();
		// Next greater element to the right
		// nextGreaterElementToright();
		// nextGreaterElementToRightTwo();
		// Stock Pan
		// stockPanProblem();
		// Largest Histogram
		// largestHistogram(); //Google this one

	}

	private static void largestHistogram() {

	}

	private static void stockPanProblem() {
		int[] ary = new int[] { 1, 2, 3, 4, 5, 52, 4, 2, 5, 2 };
		int[] span = new int[ary.length];
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		span[0] = 1;
		for (int i = 1; i < ary.length; i++) {
			while (st.size() > 0 && ary[i] >= ary[st.peek()]) {
				st.pop();
			}
			if (st.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = st.isEmpty() ? i + 1 : i - st.peek();
			}
			st.push(i);
		}
		System.out.println(Arrays.toString(span));
	}

	private static void nextGreaterElementToRightTwo() {
		int[] ary = new int[] { 1, 2, 3, 4, 5, 52, 4, 2, 5, 2 };
		int[] nge = new int[ary.length];
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		for (int i = 1; i < ary.length; i++) {
			while (st.size() > 0 && ary[i] > ary[st.peek()]) {
				int pos = st.peek();
				nge[pos] = ary[i];
				st.pop();
			}
			st.push(i);
		}
		while (st.size() > 0) {
			int pos = st.peek();
			nge[pos] = -1;
			st.pop();
		}
		System.out.println(Arrays.toString(nge));
	}

	private static void nextGreaterElementToright() {
		int[] ary = new int[] { 1, 2, 3, 4, 5, 52, 4, 2, 5, 2 };
		Stack<Integer> st = new Stack<Integer>();
		int[] nge = new int[ary.length];
		nge[ary.length - 1] = -1;
		for (int i = ary.length - 2; i >= 0; i--) {
			while (st.size() > 0 && ary[i] >= st.peek()) {
				st.pop();
			}
			if (st.size() == 0) {
				nge[i] = -1;
			} else {
				nge[i] = st.peek();
			}
			st.push(ary[i]);
		}
		System.out.println(Arrays.toString(nge));
	}

	private static void balancedBrackets() {
		List<Character> openBrackets = List.of('{', '(', '[');
		List<Character> closeBrackets = List.of('}', ')', ']');
		String expression = "[(a+b)+(c+d)](";
		Stack<Character> brcStack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (openBrackets.contains(ch)) {
				brcStack.push(ch);
			} else if (ch == ')') {
				boolean charachePop = charachePop('(', brcStack);
				if (charachePop == false) {
					System.out.println(charachePop);
					return;
				}
			} else if (ch == '}') {
				boolean charachePop = charachePop('{', brcStack);
				if (charachePop == false) {
					System.out.println(charachePop);
					return;
				}
			} else if (ch == ']') {
				boolean charachePop = charachePop('[', brcStack);
				if (charachePop == false) {
					System.out.println(charachePop);
					return;
				}
			}
		}
		if (brcStack.size() == 0) {
			System.out.println("True");
		} else {
			System.out.println("false");
		}
	}

	private static boolean charachePop(Character ch, Stack<Character> brcStack) {
		if (brcStack.size() == 0) {
			return false;
		} else if (brcStack.peek() != ch) {
			return false;
		} else {
			brcStack.pop();
			return true;
		}
	}

	private static void duplicateBrackets() {
		String expression = "((a+b)+(c+d))";
		Stack<Character> brcStack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (ch == ')') {
				if (brcStack.peek() == '(') {
					System.out.println(true);
					return;
				} else {
					while (brcStack.peek() != '(') {
						brcStack.pop();
					}
					brcStack.pop();
				}
			} else {
				brcStack.push(ch);
			}
		}
		System.out.println(brcStack);
		System.out.println("false");
	}

	private static void StackExamples() {
		Stack<String> stc = new Stack<String>();
		// stc.pop();
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
