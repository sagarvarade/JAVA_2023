package DSA.MasterClass.Recursion;

public class RecursionInterview {
	public static void main(String[] args) {
		//Sum of digits
		System.out.println("Sum of digit : "+SUMOFDIGIT(1112));
		System.out.println("Power        : "+power(2,3));
		System.out.println("GDC        : "+gcd(2,4));
		System.out.println("DEcimal to binary        : "+decimalToBinary(10));
	}

	private static int SUMOFDIGIT(int n) {
		if (n==0 || n < 0) {
		      return 0;
		    }
		return n%10 + SUMOFDIGIT(n/10);
	}
	public static int power(int base, int exp) {
	    if (exp<0) {
	      return -1;
	    }
	    if (exp==0 || exp==1) {
	      return base;
	    }
	    return base * power(base, exp-1);
	}
	public static int gcd(int a, int b) {
	    if (a<0 || b<0) {
	      return -1;
	    }
	    if (b == 0) {
	      return a;
	    }
	    return gcd(b, a%b);
	}
	public static int decimalToBinary(int n) {
	    if (n==0) {
	      return 0;
	    }
	    return n%2 + 10*decimalToBinary(n/2);
	}

}
