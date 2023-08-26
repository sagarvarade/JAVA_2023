package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class codeEasyChefProblems {
	public static void main(String[] args) {
		//gradeTheSteel();
		//buggyCalculator();
		//sumOrDifference();
		lapindrome();
		System.out.println(reverseString("straga"));
	}

	private static String reverseString(String str) {
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		return temp;
	}

	private static void lapindrome() {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<=cases;i++)
		{
			String str=sc.nextLine();
			String x=str.substring(0,str.length()/2);
			String y="";
			if(str.length()%2==0)
				y=str.substring(str.length()/2);
			else
				y=str.substring((str.length()+1)/2,str.length());
			if(x.equals(y) ||reverseString(x).equals(y))
				System.out.println("YES");
			else
				System.out.println("NO");
			System.out.println(x+"   "+y);
			
		}
		
		
	}

	private static void sumOrDifference() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println(a-b);
		else
			System.out.println(a*b);
		
	}

	private static void buggyCalculator() {
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++)
		{
			 int a,b,rem1,rem2,sum=0,z=1;
			 a=sc.nextInt();
			 b=sc.nextInt();
			 while(a>0 || b>0)
	            {
	                  rem1=a%10;
	                  rem2=b%10;
	                  sum=sum+((rem1+rem2)%10)*z;
	                  z=z*10;
	                  a=a/10;
	                  b=b/10;
	                  
	            }
			 System.out.println(sum);
		}
		
		
	}

	private static void gradeTheSteel() {
		Scanner sc=new Scanner(System.in);
		int testCases=sc.nextInt();
		int [][] ar=new int[3][testCases];
		
		for(int i=0;i<testCases+1;i++)
		{
			ar[i][0]=sc.nextInt();
			ar[i][1]=sc.nextInt();
			ar[i][2]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
	}
}
