package DSA.MasterClass.Recursion;

public class Recursion {
	public static void main(String[] args) {
		//openDollRecursion(5);
		//System.out.println("Fact of 5 :"+factorial(5));

		//System.out.println(PrintSumOfPostiveInteger(1245));
		//System.out.println(mathPow(2,3));
		System.out.println(gcd(8,4));

	}

	private static int gcd(int i, int j) {
		if(j==0)
		{
			return i;
		}
		return gcd(j,i%j);
	}

	private static int mathPow(int num, int pow) {
		if(pow==0 || pow==1)
		{
			return num;
		}
		else
			return num*mathPow(num, pow-1);
	}

	private static int PrintSumOfPostiveInteger(int i) {
		if(i==0 || i<0)
			return 0;
		else
			return i%10+PrintSumOfPostiveInteger(i/10);

	}

	private static int factorial(int i) {
		if(i==1)
			return 1;
		else 
			return i*factorial(i-1);
	}

	private static void openDollRecursion(int i) {
		if(i==0)
		{
			System.out.println("All Dolls open");
		}
		else {
			System.out.println("Opening "+i);
			openDollRecursion(i-1);
		}
		
	}
}
