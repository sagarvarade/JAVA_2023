package DSA.Code;

import java.util.Scanner;
import java.util.function.Predicate;

public class FirstJavaProgram {
	public static void main(String[] args) {
		//CheckEvenOrOdd();
		//greetUser();
		//SimpleInterest();
		$("Home");
	}

	private static void $(String string) {
		System.out.println(string);
		
	}

	private static void SimpleInterest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount ,Time ,Rate ");
		int amount=sc.nextInt();
		int time=sc.nextInt();
		int rate=sc.nextInt();
		int interest=(amount*time*rate)/100;
		System.out.println("Interest = "+interest);
		
	}

	private static void greetUser() {
		Scanner sc=new Scanner(System.in);
		String user=sc.next();
		System.out.println("hello "+user);
		
	}

	private static void CheckEvenOrOdd() {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Predicate<Integer> odd=e->e%2!=0;
		Predicate<Integer> even=e->e%2==0;
		if(odd.test(num))
			System.out.println("Odd");
		if(even.test(num))
			System.out.println("Even");
	}
}
