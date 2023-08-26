package DSA.Code;

import java.util.Scanner;

public class FlowOfProgram {
	public static void main(String[] args) {
		//checkYearLeapOrNot();
		//checkSumOfTwoYear();
		//printTableOfNumber();
		//LCMHCF();
		keepTakingNumberUntilX();
	}

	private static void LCMHCF() {
	     int t1, t2, no1, no2, temp, hcf, lcm;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("Enter First Number ");
	      no1 = scanner.nextInt();
	      System.out.print("Enter Second Number ");
	      no2 = scanner.nextInt();
	      scanner.close();
	      t1 = no1;
	      t2 = no2;
	      while(t2 != 0){
	         temp = t2;
	         t2 = t1%t2;
	         t1 = temp;
	      }
	      hcf = t1;
	      lcm = (no1*no2)/hcf;
	      System.out.println("HCF of input numbers: "+hcf);
	      System.out.println("LCM of input numbers: "+lcm);
		
	}

	private static void keepTakingNumberUntilX() {
		boolean get=true;
		int sum=0;
		while(get) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number ");
			String ch=sc.next();
			try {
			sum=sum+Integer.valueOf(ch);
			}
			catch(Exception e)
			{
				//e.printStackTrace();
			}
			if(ch.equalsIgnoreCase("x"))
			{	get=false;
				System.out.println("Sum "+sum);
			}
		}
				
		
	}

	private static void printTableOfNumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.print("\t "+a*i);
		}
		
	}

	private static void checkSumOfTwoYear() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Sum of two is "+(a+b));
		
	}

	private static void checkYearLeapOrNot() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int yr=sc.nextInt();
		if(yr%4==0)
			System.out.println("This is Leap Year");
		else
			System.out.println("This is Not Leap Year");
		
	}
}
