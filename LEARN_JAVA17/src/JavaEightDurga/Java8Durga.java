package JavaEightDurga;

import java.util.Arrays;
import java.util.List;

public class Java8Durga {

	int x = 777;

	public static void main(String[] args) {
		func fc = new func() {
			@Override
			public String syt() {
				return "SYS";
			}
		};
		System.out.println("1>  " + fc.syt());
		func fc2 = () -> {
			return "SYS2";
		};
		fc2.prinme();
		System.out.println("2>  " + fc2.syt() + "  ");
		// Functional Interface with Threads
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("\t " + i);
				}
			}
		};
		Runnable r2 = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("\t " + i);
			}
		};
		Runnable r3 = () -> System.out.println("No Body");
		List<Thread> rList = Arrays.asList(new Thread(r), new Thread(r2), new Thread(r3));
		for (Thread t : rList) {
			t.start();
		}
		Comparable<String> tCompare = new Comparable<String>() {

			@Override
			public int compareTo(String o) {
				return 1;
			}
		};
		// If an interface extends Functional Interface and child interface doesn�t
		// contain any abstract method
		// then child interface is also Functional Interface
		B b1 = new B() {

			@Override
			public void methodOne() {
				// TODO Auto-generated method stub

			}
		};
		MathOpertaion sum = (a, b) -> a + b;
		MathOpertaion multi = (a, b) -> a * b;
		MathOpertaion div = sum::oper;
		System.out.println(" Lambda " + sum.oper(10, 20) + " " + multi.oper(10, 20) + "  " + div.oper(4, 2));
		passLambdaAsArgument(sum);

	}

	private static void passLambdaAsArgument(MathOpertaion sum) {
		System.out.println(sum.oper(90, 78));
	}

}

@FunctionalInterface
interface func {
	public String syt();

	default void prinme() {
		System.out.println("Default pring tem");
	}
}

@FunctionalInterface
interface A {
	public void methodOne();
}

@FunctionalInterface
interface B extends A {
}

@FunctionalInterface
interface MathOpertaion {
	public int oper(int a, int b);
}