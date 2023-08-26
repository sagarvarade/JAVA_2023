package DSA.PEP;

import java.util.Scanner;

import org.junit.Test;


public class PepCoding {
	
	@Test
	public void tablePrint() {
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++) {
				System.out.print("\t "+(i*j));
			}
			System.out.println();
		}
	}
	
	
	//@Test
	public void pattern() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println(">>>>>>>1>>>>>>>>");
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(">>>>>>>2>>>>>>>>");
		int space=5-1;
		int dgt=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=dgt;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			space--;
			dgt++;
		}
		
		System.out.println(">>>>>>>3>>>>>>>>");
		int space2=0;
		int dgt2=5;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=space2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=dgt2;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			space2++;
			dgt2--;
		}
		System.out.println(">>>>>>>4>>>>>>>>");
		int space3=5/2;
		int dgt3=1;
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=space3;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=dgt3;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			if(i<=5/2) {
				space3--;
				dgt3+=2;
			}
			else
			{
				space3++;
				dgt3-=2;
			}
		}
		System.out.println(">>>>>>>5>>>>>>>>");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println(">>>>>>>6>>>>>>>>");
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print("_"+j+"_");
			}
			System.out.println("");
		}
		
	}
	
	//@Test
	public void benjamingBulb() {
		int num=100;
		for(int i=2;i*i<=num;i++) {
			System.out.println(i*i);
		}
	}
	
	
	//@Test
	public void pythagoreanTriplets() {
		int a=5, b=3, c=4;
		int max=Math.max(a, Math.max(b, c));
		if((a*a)+(b*b)==max*max) {
			System.out.println("True");
		}
	}
	
	//@Test
	public void checkPrimeFactorization() {
		int num=46;
		double sqrt=Math.sqrt(num);
		System.out.println(sqrt);
		for(int div=2;div<=Math.sqrt(num);div++) {
		//for(int div=2;div<=num;div++) {
			while(num%div==0) {
				num=num/div;
				System.out.println(div);
			}
		}
		if(num!=1)
			System.out.println(num);
	}
	
	//@Test
	public void getGCD() {
		int x=36;int y=24;
		int orgX=x;
		int orgY=y;
		while(x%y !=0) {
			int rem=x%y;
			x=y;
			y=rem;
		}
		int gcd=y;
		System.out.println("GCD "+y);
		int lcm=(orgX*orgX)/gcd;
		System.out.println("LCM "+lcm);
	}
	//@Test
	public void getLCM() {
		int x=36;int y=24;
	}
	
	//@Test
	public void reverseDigitInInt() {
		int digit=3742;
		int reverseDigit=0;
		while(digit!=0) {
			int num=digit%10;
			System.out.println(num);
			digit=digit/10;
			reverseDigit=reverseDigit*10+num;
		}
		System.out.println("\n "+reverseDigit);
	}
	
	//@Test
	public void reverseDigit() {
		int digit=3742;
		while(digit!=0) {
			int num=digit%10;
			System.out.println(num);
			digit=digit/10;
		}
	}
	
	
	
	//@Test
	public void printDigits() {
		int x=100;
		int nod=0;
		int temp=x;
		while(temp!=0) {
			temp=temp/10;
			nod++;
		}
		int div=(int)Math.pow(10, nod-1);
		while(div!=0) {
			int dgt=x/div;
			System.out.println(dgt);
			x=x%div;
			div=div/10;
		}
		
	}
	
	
	//@Test 
	public void printDigitCountInNumber() {
		int x=1839;
		int count=0;
		while(x!=0) {
			x=x/10;
			count+=1;
		}
		System.out.println(count+" ..");
	}
	
	//@Test
	public void fibonacci() {
		int a=0;
		int b=1;
		int c=0;
		for(int i=0;i<10;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	//@Test
	public void isPrimeInRange() {
		int start=6379;
		int end  =7576;
		for(int i=start;i<=end;i++) {
			int num=i;
			int divByCount=0;
			for(int j=2;j*j<i;j++)
			{
				if(num%j==0) {
					divByCount++;
					break;
				}
			}
			if(divByCount>0) {
				//System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	
	//@Test
	public void isPrimeNo() {
		for(int i=1;i<1000;i++) {
			int num=i;
			int divByCount=0;
			for(int j=2;j<num;j++)
			{
				if(num%j==0) {
					divByCount++;
				}
			}
			if(divByCount>0) {
				System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	//@Test
	public void isPrimeNo2() {
		for(int i=1;i<1000;i++) {
			int num=i;
			int divByCount=0;
			//for(int j=2;j<Math.sqrt(i);j++)
			for(int j=2;j*j<i;j++)
			{
				if(num%j==0) {
					divByCount++;
					break;
				}
			}
			if(divByCount>0) {
				//System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	//@Test
	public void isPrimeNo3() {
		for(int i=1;i<1000;i++) {
			int num=i;
			int divByCount=0;
			for(int j=2;j<Math.sqrt(i) && j/2==0 ;j++)
			{
				if(num%j==0) {
					divByCount++;
				}
			}
			if(divByCount>0) {
				System.out.println("Not prime "+i);
			}
			else
				System.out.println("Prime "+i);
		}
	}
	private static void scannerDemo() {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2=sc.nextLine();
		int int1=sc.nextInt();
		long long1=sc.nextLong();
		
	}

	private static void loopDemo() {
		int i=1;
		while(i<5) {
			System.out.println(i++);
		}
		
		do {
			System.out.println(i--);
		}while(i>0);
		for(int j=0;j<5;i++) {
			
		}
	}
}
