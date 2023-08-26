package DSA.Code;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

record Student (int marks) {}

public class FourthFunctions {
	public static void main(String[] args) {
		// showMaxNumberFromUserInput();
		// evenOrOdd();
		//checkEligibleForVoteOrNot();
		//returnSumOfTwo();
		//productOfTwoNumbers();
		//getCircumFerenceOfRadius(BigDecimal.valueOf(4.0));
		//checkPrimeOrNot(13);
		  //getMarksForEachStudent();
		//System.out.println(factorial(5));
		//checkIsPalindromeOrNot(342);
		//checkIsPalindromeOrNot(343);
		//returnSumOfFirstNNumber(5);
		// returnPrimeNumbersFromRange(1000,25000);
	}

	private static void returnPrimeNumbersFromRange(int start,int end) {
		for(int i=start+1;i<end;i++) {
			boolean bl=checkIsPrime(i);
			if(bl)
				System.out.println(" Is prime "+i);
		}
		
	}

	private static boolean checkIsPrime(int num) {
		if(num%2==0)
			return false;
		int count=0;
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0)
				count++;
		}
		if(count>0)
			return false;
		else
			return true;
	}

	private static void returnSumOfFirstNNumber(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

	private static void checkIsPalindromeOrNot(final int i) {
		int temp=i;
		int rev=0;
		while(temp!=0) {
			int reminder=temp%10;
			rev=reminder+rev*10;
			temp=temp/10;
		}
		System.out.println(rev+"   "+i);
		if(rev==i)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		
	}

	private static int factorial(int n) {
		if(n<=1)
			return 1;
		else
			return factorial(n-1)*n;
		
	}

	private static void getMarksForEachStudent() {
		List<Student> studentList=Arrays.asList(new Student(10),new Student(45),new Student(67));
		Function<Integer,String> getGrade=e->{
			if(e<35)
				return "F";
			else if(e>=35 && e<50)
				return "C";
			else if(e>=51 && e<70)
				return "C";
			return "Not Apply";
		};
		
		
	}

	private static void checkPrimeOrNot(int num) {
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				count++;
		}
		if(count>0)
			System.out.println("Not Prime ");
		else
			System.out.println("Prime");
	}

	private static void getCircumFerenceOfRadius(BigDecimal i) {

		Function<BigDecimal,BigDecimal> circc=e->BigDecimal.valueOf(Math.PI).multiply(e);
		System.out.println("product : "+circc.apply(i));
	}

	private static void productOfTwoNumbers() {
		int a=10,b=20;
		BiFunction<Integer,Integer,Integer> product=(x,y)->x*y;
		System.out.println("product : "+product.apply(a, b));		
	}

	private static void returnSumOfTwo() {
		int a=10,b=20;
		BiFunction<Integer,Integer,Integer> sum=(x,y)->x+y;
		System.out.println("Sum : "+sum.apply(a, b));
	}

	private static void checkEligibleForVoteOrNot() {
		List<Integer> ages = Arrays.asList(10, 12, 30, 46);
		Predicate<Integer> voterEligibleCheck = e -> e >= 18;
		List<Integer> collect = ages.stream().filter(voterEligibleCheck).collect(Collectors.toList());
		System.out.println("Eligible voters " + collect);
	}

	private static void evenOrOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num to check :");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

	private static void showMaxNumberFromUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to check :");
		int count = sc.nextInt();
		int[] nums = new int[count];
		System.out.println("Enter " + count + " nums,");
		for (int i = 0; i < count; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Ary " + Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println("Max is " + nums[nums.length - 1]);
	}
}
