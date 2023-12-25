package dsa.PepCodingDSA1;

public class FunctionsDemo {
	public static void main(String[] args) {
		//Digit frequency
		//digitFrequency(12345234, 4);
		// Decimal to any base 
		//decimalToAnyBase(62,4);
		// Any base to decimal
		//anyToDecimal(11,2);
		// Any base to any base , Used previous methods for this 
		// anyBaseToAnyBase(172,2);
			
	}

	private static void anyBaseToAnyBase(int digit, int base) {
		int decimal=anyToDecimal(digit, base);
		int decimalToAnyBase = decimalToAnyBase(decimal, base);
		System.out.println(decimalToAnyBase);
	}

	private static int anyToDecimal(int digit,int base) {
		int rv=0;
		int p=1;
		while(digit>0) {
			int dig=digit%10;
			digit=digit/10;
			rv+=dig*p;
			p=p*base;
		}
		System.out.println(rv);
		return rv;
	}

	private static int decimalToAnyBase(int digit ,int base) {
		int rv=0;
		int p=1;
		while(digit>0) {
			int dig=digit%base;
			digit=digit/base;
			rv+=dig*p;
			p=p*10;
		}
		System.out.println(rv);
		return rv;
	}

	
	private static void digitFrequency(int num, int digit) {
		int d=0;
		int count=0;
		while(num>0) {
			d=num%10;
			num=num/10;
			if(d==digit) count++;
		}
		System.out.println(count);
	}
}
