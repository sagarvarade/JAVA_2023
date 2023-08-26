package Problems;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Predicate;

public class HundredJavaProgram {

	public static void main(String[] args) {
		// one_simpleJavaProgram();
		// two_printInt();
		// three_CommandLineArg(args);
		// four_PrintUserInput();
		// five_ConvertFarenheitToCelcius();
		// six_SwapNumbersUsingThirdVariable();
		// seven_SwapNumberWithoutThirdVariable();
		// eight_AddTwoNums();
		// nine_ShowLargestNum();
		// ten_IfElseClause();
		// eleven_IfElse();
		// twelve_nestedIfElse();
		// thirteen_oddEvenNumber();
		// fourteen_findFactorial();
		// fifteen_FactorialOfBigNumber();
		// Sixteen_CheckTwoString();
		// seventeen_ForLoop();
		// seventeen_ConsoleLoop();
		// Nineteen_WhileLoop();
		// Twenty_PrintReverseNumber();
		// TwentyOne_WhileUsingBreak();
		// twentyTwo_WhileUsingBreakAndContinue();
		// twentyThree_UsingForLoop();
		// twentyFour_UsingEnhanceForLoop();
		// twentyFive_MultiplicationTable();
		// twentyFive_MultiplicationTable_2();
		// twentySix_printPrimeNums();
		// twentySeven_CheckArmStrongOrNot();
		// twentyEight_FloydsTriangle();
		// twentyNine_FindAllSubstrings();
		// thirty_PrintReversString();

		  seventy_one_two_Three_GetIP();
		
		
		// eightyOneToNinty_Conversions();
		// ninetyOneTwoThreeFourFiveSix_HashTable();
		// ninetySeven_Array();
		// ninetyEight_MultiDimensionalArray();
		// ninetyNine_Factorial();
	}

	private static void seventy_one_two_Three_GetIP() {
		
		try{
			FileInputStream fin=new FileInputStream("D:\\Technolamror.txt");
			int i=fin.read();
			System.out.print((char)i);
			fin.close();
			}catch(Exception e){System.out.println(e);}
		
		try{
			URL url=new URL("http://www.google.com/java");
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Host Name: "+url.getHost());
			System.out.println("Port Number: "+url.getPort());
			System.out.println("File Name: "+url.getFile());
			}catch(Exception e){System.out.println(e);}
			
		
		try {
			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("Host Name: " + ip.getHostName()+"  "+ip.getCanonicalHostName()+" "+ip.getLoopbackAddress());
			System.out.println("IP Address: " + ip.getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
			
		
	}

	private static void eightyOneToNinty_Conversions() {
		int i=200;
		String strI=String.valueOf(i);		
		System.out.println("ii "+i);
		
		String strL="1000";
		long l=Long.valueOf(strL);
		System.out.println("long l "+l+1);
		
		String strF="100.00";
		float f=Float.valueOf(strF);
		System.out.println("float l "+f+1);
		
		String strD="100.00";
		double d=Float.valueOf(strD);
		System.out.println("fouble l "+d+1);
		
		
		String sDate1="31/12/1998";
		String sDate2 = "31-Dec-1998";
		String sDate3 = "12 31, 1998";
		String sDate4 = "Thu, Dec 31 1998";
		String sDate5 = "Thu, Dec 31 1998 23:37:50";
		String sDate6 = "31-Dec-1998 23:37:50";
		try {
		SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatter2=new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat formatter3=new SimpleDateFormat("MM dd, yyyy");
		SimpleDateFormat formatter4=new SimpleDateFormat("E, MMM dd yyyy");
		SimpleDateFormat formatter5=new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
		SimpleDateFormat formatter6=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date date1;
		
			date1 = formatter1.parse(sDate1);
		
		Date date2=formatter2.parse(sDate2);
		Date date3=formatter3.parse(sDate3);
		Date date4=formatter4.parse(sDate4);
		Date date5=formatter5.parse(sDate5);
		Date date6=formatter6.parse(sDate6);
		System.out.println("String to Date converter by technolamror");
		System.out.println(sDate1+"\t"+date1);
		System.out.println(sDate2+"\t"+date2);
		System.out.println(sDate3+"\t"+date3);
		System.out.println(sDate4+"\t"+date4);
		System.out.println(sDate5+"\t"+date5);
		System.out.println(sDate6+"\t"+date6);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist
		list.add("Rajendra");//Adding object in arraylist
		list.add("Mahendra");
		list.add("Raja");
		list.add("Technolamror");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		
		LinkedList<String> al=new LinkedList<String>();
		al.add("Rajendra");//Adding object in LinkedList
		al.add("Mahendra");
		al.add("Raja");
		al.add("Technolamror");
		Iterator<String> itr2=al.iterator();
		while(itr2.hasNext()){
		System.out.println(itr2.next());
		}
		
		HashSet<String> set=new HashSet<String>();
		set.add("Rajendra");
		set.add("Raja");
		set.add("Ravi");
		set.add("Technolamror");
		//Traversing elements
		Iterator<String> itr3=set.iterator();
		while(itr3.hasNext()){
		System.out.println(itr3.next());
		}
		
		LinkedHashSet<String> al4=new LinkedHashSet<String>();
		al4.add("Rajendra");
		al4.add("Raja");
		al4.add("Ravi");
		al4.add("Technolamror");
		Iterator<String> itr4=al4.iterator();
		while(itr.hasNext()){
			System.out.println(">> "+itr4.next());
		}
		
	}

	private static void ninetyOneTwoThreeFourFiveSix_HashTable() {

		TreeSet<String> al = new TreeSet<String>();
		al.add("Rajendra");
		al.add("Raja");
		al.add("Ravi");
		al.add("Technolamror");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Rajendra");
		queue.add("Mahendra");
		queue.add("Raja");
		queue.add("Technolamror");
		queue.add("Rahul");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr3 = queue.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Rajendra");
		map.put(101, "Lamror");
		map.put(102, "Technolamror");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(100, "Rajendra");
		hm.put(101, "Vijay");
		hm.put(102, "Technolamror");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		TreeMap<Integer, String> hm2 = new TreeMap<Integer, String>();
		hm2.put(100, "Amit");
		hm2.put(102, "Ravi");
		hm2.put(101, "Vijay");
		hm2.put(103, "Technolamror");
		for (Map.Entry m : hm2.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Hashtable<Integer, String> hm3 = new Hashtable<Integer, String>();
		hm3.put(100, "Rajendra");
		hm3.put(102, "Praveen");
		hm3.put(101, "Bipin");
		hm3.put(103, "Pankaj");
		for (Entry m : hm3.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
		}
	}

	private static void ninetySeven_Array() {
		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		for (int i = 0; i < a.length; i++)// length is the property of array
			System.out.println(a[i]);
	}

	private static void ninetyEight_MultiDimensionalArray() {
		// declaring and initializing 2D array
		int arr[][] = { { 1, 2, 3 }, { 2, 4, 5 }, { 4, 4, 5 } };
		System.out.println("Array :" + Arrays.deepToString(arr));
	}

	private static void ninetyNine_Factorial() {
		System.out.println("Facotrial :" + fact(5));
	}

	private static int fact(int i) {
		if (i < 1)
			return 1;
		else
			return i * fact(i - 1);
	}

	private static void thirty_PrintReversString() {
		String str, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Print string to get all substrings :");
		str = sc.nextLine();
		int length = str.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);
		System.out.println(reverse);

		StringBuffer sbr = new StringBuffer(str);
		System.out.println("Revers : " + sbr.reverse());
	}

	private static void twentyNine_FindAllSubstrings() {
		String str, sub;
		int i, c, length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Print string to get all substrings :");
		str = sc.nextLine();
		for (i = 1; i < str.length(); i++) {
			for (c = 0; c <= str.length() - i; c++) {
				sub = str.substring(c, c + i);
				System.out.println(sub);
			}
		}
	}

	private static void twentyEight_FloydsTriangle() {
		int n, num = 1, c, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows of floyd's triangle you want");
		n = in.nextInt();
		System.out.println("Floyd's triangle :-");
		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

	private static void twentySeven_CheckArmStrongOrNot() {
		int number, digits = 0, remainder, sum = 0;
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		int temp = number;
		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}
		temp = number;
		while (temp != 0) {
			remainder = temp % 10;
			sum = sum + power(remainder, digits);
			temp = temp / 10;
		}
		if (number == sum)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");

	}

	private static int power(int n, int r) {
		int c, p = 1;
		for (c = 1; c <= r; c++)
			p = p * n;
		return p;
	}

	private static void twentySix_printPrimeNums() {
		int n, status = 1, num = 3;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of prime numbers you want");
		n = in.nextInt();
		if (n >= 1) {
			System.out.println("First " + n + " prime numbers are :-");
			System.out.println(2);
		}
		for (int count = 2; count <= n;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				System.out.println(num);
				count++;
			}
			status = 1;
			num++;
		}
	}

	private static void twentyFive_MultiplicationTable_2() {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j * i + "\t");
			}
			System.out.println("");
		}

	}

	private static void twentyFive_MultiplicationTable() {
		int n, c;
		System.out.println("Enter an integer to print it's multiplication table");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println("Multiplication table of " + n + " is :-");
		for (c = 1; c <= 10; c++) {
			System.out.println(n + "*" + c + " = " + (n * c));
		}
	}

	private static void twentyFour_UsingEnhanceForLoop() {
		List<String> str = Arrays.asList("a", "b", "c", "d", "e");
		for (String s : str)
			System.out.print(s + "\t");
	}

	private static void twentyThree_UsingForLoop() {
		char ch;
		for (ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	private static void twentyTwo_WhileUsingBreakAndContinue() {
		int n;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Input an integer");
			n = input.nextInt();
			if (n != 0) {
				System.out.println("You entered " + n);
				continue;
			} else {
				break;
			}
		}
	}

	private static void TwentyOne_WhileUsingBreak() {
		int n = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Input an integer");
			n = in.nextInt();
			if (n == 0)
				break;

			System.out.println("You have entered : " + n);
		}

	}

	private static void Twenty_PrintReverseNumber() {
		int n, reverse = 0;
		System.out.println("Enter the number to reverse");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		System.out.println("Reverse of entered number is " + reverse);
	}

	private static void Nineteen_WhileLoop() {
		int a = 0;
		do {
			System.out.println("Print a > " + a);
			a++;
		} while (a < 5);

		int j = 1;
		while (j < 5) {
			System.out.println("J is > " + j);
			j++;
		}
	}

	private static void seventeen_ConsoleLoop() {
		int row, numberOfStars;
		for (row = 1; row <= 10; row++) {
			for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void seventeen_ForLoop() {
		for (int c = 1; c <= 10; c++) {
			System.out.println("C  " + c);
		}
	}

	private static void Sixteen_CheckTwoString() {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		s1 = in.nextLine();
		System.out.println("Enter the second string");
		s2 = in.nextLine();
		if (s1.compareTo(s2) > 0)
			System.out.println("First string is greater than second.");
		else if (s1.compareTo(s2) < 0)
			System.out.println("First string is smaller than second.");
		else
			System.out.println("Both strings are equal.");

	}

	private static void fifteen_FactorialOfBigNumber() {
		int n, c;
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");
		n = input.nextInt();
		for (c = 1; c <= n; c++) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		System.out.println(n + "! = " + fact);

	}

	private static void fourteen_findFactorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		int i = sc.nextInt();
		System.out.println("i  " + i);
		int fact = 1;
		if (i < 0)
			fact = 1;
		else {
			for (int j = 1; j <= i; j++) {
				fact = fact * j;
			}
		}
		System.out.println("Fact is " + fact);
	}

	private static void thirteen_oddEvenNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		Integer i = sc.nextInt();
		Predicate<Integer> even = (a) -> a % 2 == 0;
		Predicate<Integer> odd = (a) -> a % 2 != 0;
		System.out.println("Check even :" + even.test(i));
		System.out.println("Check odd  :" + odd.test(i));

	}

	private static void twelve_nestedIfElse() {
		int marksObtained, passingMarks;
		char grade;
		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("Input marks scored by you");
		marksObtained = input.nextInt();
		if (marksObtained >= passingMarks) {
			if (marksObtained > 90)
				grade = 'A';
			else if (marksObtained > 75)
				grade = 'B';
			else if (marksObtained > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You passed the exam and your grade is " + grade);
		} else {
			grade = 'F';
			System.out.println("You failed and your grade is " + grade);
		}
	}

	private static void eleven_IfElse() {
		int marksObtained, passingMarks;
		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("Input marks scored by you");
		marksObtained = input.nextInt();
		if (marksObtained >= passingMarks) {
			System.out.println("You passed the exam.");
		} else {
			System.out.println("Unfortunately you failed to pass the exam.");
		}

	}

	private static void ten_IfElseClause() {
		int a = 9;
		int b = 9;
		if (a < b)
			System.out.println("A is less than B");
		else if (a > b)
			System.out.println("A is greater than B");
		else
			System.out.println("A and b are same");
	}

	private static void nine_ShowLargestNum() {
		int[] numAry = new int[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < numAry.length; i++) {
			numAry[i] = in.nextInt();
		}
		Arrays.sort(numAry);
		System.out.println("Ary " + Arrays.toString(numAry) + " ,Largest " + numAry[numAry.length - 1]);
	}

	private static void eight_AddTwoNums() {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Sum A  :" + a + " , B= " + b + " ,Sum is " + (a + b));
		BigInteger Ba = BigInteger.valueOf(a);
		BigInteger Bb = BigInteger.valueOf(b);
		BigInteger sum = Ba.add(Bb);
		System.out.println("Sum Ba  :" + Ba + " , Bb= " + Bb + " ,Sum is " + sum);
	}

	private static void seven_SwapNumberWithoutThirdVariable() {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Before Swap, A  :" + a + " , B= " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap, A  :" + a + " , B= " + b);
	}

	private static void six_SwapNumbersUsingThirdVariable() {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Before Swap, A  :" + a + " , B= " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swap, A  :" + a + " , B= " + b);
	}

	private static void five_ConvertFarenheitToCelcius() {
		float temparature;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Temperature in Farenheit :");
		temparature = in.nextFloat();
		temparature = ((temparature - 32) * 5) / 9;
		System.out.println("Temperature in Celcius :" + temparature);
	}

	private static void four_PrintUserInput() {
		int a;
		float b;
		String s;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string");
		s = in.nextLine();
		System.out.println("You entered string " + s);
		System.out.println("Enter an integer");
		a = in.nextInt();
		System.out.println("You entered integer " + a);
		System.out.println("Enter a float");
		b = in.nextFloat();
		System.out.println("You entered float " + b);

	}

	private static void three_CommandLineArg(String[] args) {
		for (String sr : args)
			System.out.println(sr);
	}

	private static void two_printInt() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Int >> " + i);
		}
	}

	private static void one_simpleJavaProgram() {
		System.out.println("Hello World Java!");
	}

}
