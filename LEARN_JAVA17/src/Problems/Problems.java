package Problems;

import java.util.Scanner;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifmodby4else();
		januaryCookOfFirstProblem();
		
	}

	private static void januaryCookOfFirstProblem() {
			
	}

	public static void ifmodby4else() {
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int n1=((in)%4==0)?in+1:in-1;
		System.out.println(n1);
	}
}
