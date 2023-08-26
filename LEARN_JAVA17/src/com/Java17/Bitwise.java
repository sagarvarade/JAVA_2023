package com.Java17;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Bitwise {
	public static void main(String[] args) {
		//extracted();
		//extract2();
		extract3();
	}

	private static void extract3() {
		Scanner sc=new Scanner(System.in);
        int min=0;
        int max=0;
        int count=sc.nextInt();
        for(int i=0;i<count;i++)
        {	
        	int a=sc.nextInt();
        	if(i==0) {
        	max=a;min=a;	
        	}
        	
        	if(a<min)
        		min=a;
        	if(a>max)
        		max=a;
        }
        System.out.println(max-min);
	}

	private static void extract2() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int [] ary=new int[count];
		for (int i = 0; i < count; i++) {
			ary[i]=sc.nextInt();
		}
		Arrays.sort(ary);
		System.out.println(ary[1]);
	}

	private static void extracted() {
		Scanner sc=new Scanner(System.in);
        SortedSet<Integer> set=new TreeSet<Integer>();
        int count=sc.nextInt();
        for(int i=0;i<count;i++)
        {
        	int a=sc.nextInt();
        	set.add(a);
        }
        System.out.println(set.toArray()[1]);
	}

}
