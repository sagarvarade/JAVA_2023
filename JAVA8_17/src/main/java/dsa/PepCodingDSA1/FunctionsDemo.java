package dsa.PepCodingDSA1;

public class FunctionsDemo {
	public static void main(String[] args) {
		//Digit frequency
		digitFrequency(12345234, 4);
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
