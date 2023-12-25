package dsa.PepCodingDSA1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		// Arrays
		//arrayDemo();
		// Span of array
		// SpanOfArray(5);
		// Search element in array
		// searchElementInArray( new int[] {1,23,42,46,2,3}, 23);
	}

	private static void searchElementInArray(int[] is, int i) {
		int pos=0;
		int count=0;
		for(int j:is) {
			count++;
			if(j==i)
				pos=count;
		}
		
		
		
		System.out.println(pos==0?"Not found":"Found at "+pos);
	}

	private static void SpanOfArray(int i) {
		int ary[] =new int [i];
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<i;j++)
		{
			ary[j]=sc.nextInt();
		}
		int min=ary[0];
		int max=ary[0];
		for(int j:ary) {
			if(j<min)
				min=j;
			if(j>max)
				max=j;
		}
		System.out.println(min+"  "+max+"  "+(max-min));
 	}

	private static void arrayDemo() {
		String [] x=new String[5]; // Null value 
		int [] x2=new int[5];      // Primitive value
		double [] x3=new double[5];      // Primitive value
		char [] x4=new char[5];      // Primitive value
		System.out.println(Arrays.deepToString(x));
		for(int y:x2) {
			System.out.println(y);
		}
		for(double y:x3) {
			System.out.println(y);
		}
		for(char y:x4) {
			System.out.println(">> "+y);
		}
	}
}
