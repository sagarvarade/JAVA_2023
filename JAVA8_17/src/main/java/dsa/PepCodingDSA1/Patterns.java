package dsa.PepCodingDSA1;

import java.util.Map;

public class Patterns {
	public static void main(String[] args) {
		//pattern_one(5);
		//pattern_two(5);
		//pattern_three(5);
		//pattern_Four(5);
		//pattern_Five(5);
		//pattern_Six(5);
		TestSiz();
	}

	private static void TestSiz() {
		Map<String,String> x=Map.of("A","b");
		System.out.println(x);
		
	}

	private static void pattern_Six(int num) {
		int st=num/2+1;
		int sp=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;i<=st;j++) {
				System.out.print("*");
			}
			for(int j=1;i<=sp;j++) {
				System.out.print(" ");
			}
			for(int j=1;i<=st;j++) {
				System.out.print("*");
			}
			if(i<=num/2) {
				st--;
				sp+=2;
			}
			else {
				st++;
				sp-=2;
			}
			System.out.println();
		}
	}

	private static void patter_Five(int num) {
		int sp=num/2;
		int st=1;
		for(int i=1;i<=num;i++) {
			//System.out.println(sp+" "+st);
			for(int j=0;j<sp;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<st;j++)
			{
				System.out.print("*");
			}
			if(i<=num/2) {
				sp--;
				st+=2;
			}
			else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}
/*  
  *
 ***
*****
 ***
  * 
 */
	}

	private static void patter_Four(int num) {
		int starcount=num;
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<starcount;j++) {
				System.out.print("*");
			}
			starcount--;
			System.out.println();
		}
/*
 *****
  ****
   ***
    **
     *
*/
		
	}

	private static void pattern_three(int num) {
		int k=num-1;
		for(int i=1;i<=num;i++) {
			for(int l=0;l<=k;l++)
			{
				System.out.print(" ");
			}
			k=k-1;
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
/*	     	  *
		     **
		    ***
		   ****
		  *****
*/
		}
	}

	private static void pattern_two(int num) {
		for(int i=num;i>=1;i--) {
			for(int j=i;j>=1;j--)
			{
				System.out.print("*\t");
			}
			System.out.println("");
	/*		* * * * * -
			* * * * -
			* * * -
			* * -
			* -
	*/
		}
	}

	private static void pattern_one(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
/*
*
**
***
****
*****
*/
		}
	}
}
