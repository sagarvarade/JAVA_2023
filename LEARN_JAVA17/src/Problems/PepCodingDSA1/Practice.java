package Problems.PepCodingDSA1;

public class Practice {
	public static void main(String[] args) {
		// Check given number is prime or not
		// System.out.println(isPrime(11)+" "+isPrime(12));

		// Print all primes to this number
		// PrintAllPrimeNumbersUpto(100);

		// Print Fibonacci numbers upto
		// PrintFibonacciNumbersUpto(25);
		// Print count of digits in a number
		// CountDigitsInNumber(1735672);

		// Sum of digits in number
		// SumOfDigitsInNumber(1234);

		// Print digits of number as it is
		// PrintDigitsInNumnber(7600);

		// Print reverse Number
		// PrintReverseNumber(1234578900);
		// Inverse of a number 613254 = 621435
		// inverseANumber(21453);

		// Print GCD and LCM of a number
		// GCG_N_LCM(36,24);

		// Prime factorization ,Print num which divide this number
		// PrintPrimeFactor(23);

		// Pythagores triplet
		//PythogoresTriplet(4, 3, 5);
		
		//Benjaming Bulb
		BenjamingBulb(23);

	}

	private static void BenjamingBulb(int num) {
		for(int i=1;i*i<=num;i++) {
			System.out.println(i*i);
		}
	}

	@SuppressWarnings("unused")
	private static void PythogoresTriplet(int i, int j, int k) {
		int max = i;
		max = j > max ? j : max;
		max = k > max ? k : max;
		System.out.println(max);
		if (max == i) {
			boolean bool = (max * max) == (j * j) + (k * k);
			System.out.println(bool);
		} else if (max == j) {
			boolean bool = (max * max) == (i * i) + (k * k);
			System.out.println(bool);
		} else {
			boolean bool = (max * max) == (i * i) + (j * j);
			System.out.println(bool);
		}
	}
	@SuppressWarnings("unused")
	private static void PrintPrimeFactor(int num) {
		for (int div = 2; div * div <= num; div++) {
			while (num % div == 0) {
				num = num / div;
				System.out.println(div);
			}
		}
		if (num != 1)
			System.out.println(num);
	}
	@SuppressWarnings("unused")
	private static void GCG_N_LCM(int n1, int n2) {
		int oN1 = n1;
		int oN2 = n2;
		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		int gcd = n2;
		int lcm = (oN1 * oN2) / gcd;
		System.out.println("GCD : " + gcd + ", LCM :  " + lcm);
	}
	@SuppressWarnings("unused")
	private static void inverseANumber(int num) {
		int inv = 0;
		int op = 1;
		while (num != 0) {
			int od = num % 10;
			int id = op;
			int ip = od;

			inv = inv + id * (int) Math.pow(10, ip - 1);

			num = num / 10;
			op++;
		}
		System.out.println(inv);
	}
	@SuppressWarnings("unused")
	private static void PrintReverseNumber(int num) {
		int sum = 0;
		while (num > 0) {
			int x = num % 10;
			System.out.print(x + "  ");
			sum = sum + x;
			num = num / 10;
		}
	}
	
	@SuppressWarnings("unused")
	private static void PrintDigitsInNumnber(int num) {
		int temp = num;
		int nod = 0;
		while (temp > 0) {
			temp = temp / 10;
			nod++;
		}
		System.out.println("Nod : " + nod);
		int div = (int) Math.pow(10, nod - 1);
		while (div != 0) {
			int q = num / div;
			System.out.print(q + " ");
			num = num % div;
			div = div / 10;
		}
	}

	@SuppressWarnings("unused")
	private static void SumOfDigitsInNumber(int num) {
		int sum = 0;
		while (num > 0) {
			int x = num % 10;
			System.out.print(x + "  ");
			sum = sum + x;
			num = num / 10;
		}
		System.out.println("= " + sum);
	}

	@SuppressWarnings("unused")
	private static void CountDigitsInNumber(int num) {
		System.out.println(String.valueOf(num).length());
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("==" + count);

	}

	@SuppressWarnings("unused")
	private static void PrintFibonacciNumbersUpto(int i) {
		int a = 0;
		int b = 1;
		for (int j = 0; j < i; j++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}

	@SuppressWarnings("unused")
	private static void PrintAllPrimeNumbersUpto(int i) {
		for (int j = 1; j <= i; j++) {
			if (isPrime(j))
				System.out.println(j);
		}
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
