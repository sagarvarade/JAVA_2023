package DataStructureMadeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Recursion {
	private static String [] ary = {"a","s","a","r","g"};
	public static void main(String[] args) {
		/*System.out.println("Sum By recursion  : " +sumByRecursion(13));
		System.out.println("Factorial by Recursion : "+factorialRecursion(5));
		System.out.println("Tower Of hanoi : ");
		towerOfHanoiRecursion(3,"A","B","x");
		int [] x=new int[] {22,35,12,52,56,75,12,65,23,56,33,21};
		System.out.println(isArrayInSortedOrder(x,x.length));
		*/
		//generateAllPossibleStrings(ary.length);
		//k_string(ary.length,2);
		//System.out.println("END");
		
		List<String> str=new ArrayList<>();
		str.add("11");
		str.add("21");
		str.add("31");
		str.add("41");str.add("51");str.add("61");
		Iterator<String> itr=str.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(" "+itr.next());
			str.add("56");
			itr.remove();
		}
		System.out.println(" >> "+str.toString());
	}
	private static void k_string(int length, int i) {
		if(length<1)
			System.out.println(Arrays.toString(ary));
		else {
			for(int j=0;j<i;j++)
			{
				ary[length-1]=Integer.valueOf(i).toString();
				k_string(length-1, i);
			}
		}
	}
	private static void generateAllPossibleStrings(int len) {
		if(len<1)
			System.out.println("Possible "+Arrays.toString(ary));
		
		else {
			ary[len-1]="0";
			generateAllPossibleStrings(len-1);
			ary[len-1]="1";
			generateAllPossibleStrings(len-1);
		}
	}
	private static int isArrayInSortedOrder(int[] x, int length) {
		if(length==1)
			return 1;
		return (x[length-1]<x[length-2])?0:isArrayInSortedOrder(x, length-1);
		
	}

	private static void towerOfHanoiRecursion(int i, String a, String b, String x) {
		if(i==1)
		{	System.out.println("Move disk 1 from peg "+a+" to peg "+b);
			return;
		}
		towerOfHanoiRecursion(i-1, a, x,b);
		System.out.println("Move disk "+i+"  from peg "+a+" to peg "+b);
		towerOfHanoiRecursion(i-1, x, b, a);
	}

	private static int factorialRecursion(int i) {
		if(i==1)
			return 1;
			else
				return i*factorialRecursion(i-1);
	}

	private static int sumByRecursion(int i) {
		if(i==0)
			return 0;
			else
				return i+sumByRecursion(i-1);
	}

}
