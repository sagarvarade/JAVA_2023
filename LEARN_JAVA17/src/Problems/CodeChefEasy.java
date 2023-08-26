package Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.accessibility.AccessibleAttributeSequence;

public class CodeChefEasy {

	public static void main(String[] args) {
		// https://www.codechef.com/CCSTART2/problems/BUYPLSE/
		// BUYPLSE();

		// https://www.codechef.com/CCSTART2/submit/ISBOTH
		// ISBOTH();

		// https://www.codechef.com/CCSTART2/problems/DIFACTRS
		// DIFACTRS();

		// https://www.codechef.com/CCSTART2/problems/SECLAR
		// findSecondLargest();

		// https://www.codechef.com/CCSTART2/problems/RNGEODD
		// rangeOdd();
		// https://www.codechef.com/CCSTART2/submit/VALTRI
		// getBusForRaju();
		// https://www.codechef.com/CCSTART2/problems/REVMEE
		// printReversArray();

		// https://www.codechef.com/CCSTART2/problems/FINDMELI
		// findInArray();

		// https://www.codechef.com/CCSTART2/problems/TRIVALCH
		// validTRIVALCH();

		// https://www.codechef.com/CCSTART2/problems/REVSTRPT
		// reverseStarPrint();

		// https://www.codechef.com/CCSTART2/problems/ADDNATRL
		// addNaturalNumbers();
		// https://www.codechef.com/CCSTART2/problems/SUMEVOD
		// sumIsEveryware();

		// https://www.codechef.com/CCSTART2/problems/ANGTRICH
		// triangleWithAngle();

		// https://www.codechef.com/CCSTART2/problems/SQALPAT
		// alternativeSquarePattern();
		// System.out.println(" >>"+returnFirstNonRepeat(" ")+"<<");

		// checkHowManyBurgersCanMake();
		// checkHowManyDaysTowait();
		//dnaStorage();
		
		//replaceElementsFromArray(new int [] {5,2,6,1,4,7,3,6});
		//https://www.codechef.com/submit/THREETOPICS
		//chefThreeTopic();
		
		//https://www.codechef.com/submit/DISCUS
		//discussThreeThrow();
		
		//https://www.codechef.com/OCT221D/problems/PODIUM
		//podiumFinish();
		//https://www.codechef.com/OCT221D/problems/MINPIZZA
		//MINPIZZA();
		//https://www.codechef.com/OCT221D/problems/BUILDINGRACE
		//BuildingRace();
		
		//https://www.codechef.com/submit/WINNERR
		//WINNER();
		//https://www.codechef.com/submit/MAXTASTE
		// MAXTastinessOfDish();
		//https://www.codechef.com/submit/MOVIE2X
		MOVIEAT2X();
	}

	private static void MOVIEAT2X() {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int TwoXSpeed=y/2;
		int TotalMovie=x-TwoXSpeed;
		System.out.println(TotalMovie);
		
	}

	private static void MAXTastinessOfDish() {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int [][] aryTest=new int[testCases][4];
		for(int i=0;i<testCases;i++) {
			aryTest[i][0]=sc.nextInt();
			aryTest[i][1]=sc.nextInt();
			aryTest[i][2]=sc.nextInt();
			aryTest[i][3]=sc.nextInt();
		}
		for(int i=0;i<testCases;i++) {
			int ATest=aryTest[i][0]>aryTest[i][1]?aryTest[i][0]:aryTest[i][1];
			int BTest=aryTest[i][2]>aryTest[i][3]?aryTest[i][2]:aryTest[i][3];
			System.out.println(ATest+BTest);
		}
	}

	private static void WINNER() {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int [][] aryTest=new int[testCases][4];
		for(int i=0;i<testCases;i++) {
			aryTest[i][0]=sc.nextInt();
			aryTest[i][1]=sc.nextInt();
			aryTest[i][2]=sc.nextInt();
			aryTest[i][3]=sc.nextInt();
		}
		for(int i=0;i<testCases;i++) {
			int APenalty=aryTest[i][0]>aryTest[i][1]?aryTest[i][0]:aryTest[i][1];
			int BPenalty=aryTest[i][2]>aryTest[i][3]?aryTest[i][2]:aryTest[i][3];
			if(APenalty==BPenalty) {
				System.out.println("TIE");
			}
			else if(APenalty<BPenalty) {
				System.out.println("P");
			}
			else if(APenalty>BPenalty) {
				System.out.println("Q");
			}
		}
	}

	private static void BuildingRace() {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int [][] aryTest=new int[testCases][4];
		for(int i=0;i<testCases;i++) {
			aryTest[i][0]=sc.nextInt();
			aryTest[i][1]=sc.nextInt();
			aryTest[i][2]=sc.nextInt();
			aryTest[i][3]=sc.nextInt();
		}
		for(int i=0;i<testCases;i++) {
			double timeToReachGroudA=aryTest[i][0]/aryTest[i][2];
			double timeToReachGroudB=aryTest[i][1]/aryTest[i][3];
			if(timeToReachGroudA==timeToReachGroudB)
				System.out.println("Both");
			else if(timeToReachGroudA<timeToReachGroudB)
				System.out.println("Chef");
			else if(timeToReachGroudA>timeToReachGroudB)
				System.out.println("Chefina");
		}
		
	}

	private static void MINPIZZA() {
		final int PIZZ_SLICE=4;
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int [][] aryTest=new int[testCases][2];
		for(int i=0;i<testCases;i++) {
			aryTest[i][0]=sc.nextInt();
			aryTest[i][1]=sc.nextInt();
		}
		for(int i=0;i<aryTest.length;i++) {
			int sliceRequired=aryTest[i][0]*aryTest[i][1];
			int pizzRequired=sliceRequired/PIZZ_SLICE;
			if(sliceRequired%PIZZ_SLICE>0)
				pizzRequired=pizzRequired+1;
			System.out.println(pizzRequired);
		}
	}

	private static void podiumFinish() {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int [][] aryTest=new int[testCases][2];
		for(int i=0;i<testCases;i++) {
			aryTest[i][0]=sc.nextInt();
			aryTest[i][1]=sc.nextInt();
		}
		for(int i=0;i<aryTest.length;i++) {
			System.out.println(aryTest[i][0]+aryTest[i][1]);
		}
	}

	private static void discussThreeThrow() {
		Scanner sc = new Scanner(System.in);
		int testCases=sc.nextInt();
		int [][] ThrowsGive=new int[testCases][3];
		for(int i=0;i<testCases;i++) {
			ThrowsGive[i][0]=sc.nextInt();
			ThrowsGive[i][1]=sc.nextInt();
			ThrowsGive[i][2]=sc.nextInt();
		}
		for(int i=0;i<ThrowsGive.length;i++) {
			int MaxThrow=0;
			if(ThrowsGive[i][0]>=ThrowsGive[i][1] && ThrowsGive[i][0]>=ThrowsGive[i][2])
			{
				MaxThrow=ThrowsGive[i][0];
			}
			else if(ThrowsGive[i][1]>=ThrowsGive[i][0] && ThrowsGive[i][1]>=ThrowsGive[i][2])
			{
				MaxThrow=ThrowsGive[i][1];
			}
			else if(ThrowsGive[i][2]>=ThrowsGive[i][0] && ThrowsGive[i][2]>=ThrowsGive[i][1])
			{
				MaxThrow=ThrowsGive[i][2];
			}
			System.out.println(MaxThrow);
		}
	}

	private static void chefThreeTopic() {
		Scanner sc = new Scanner(System.in);
		String line=sc.nextLine();
		String [] x=line.split(" ");
		String getIn=x[x.length-1];
		boolean Found=false;
		for(int i=0;i<x.length-1;i++) {
			if(x[i].equals(getIn))
			{
				Found=true;
			}
		}
		if(Found)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static void replaceElementsFromArray(int[] ary) {
		int len=ary.length;
		int curLastMax=ary[len-1];
		ary[len-1]=-1;
		for(int i=len-2;i>=0;i--) {
			int temp=ary[i];
			if(curLastMax>temp) {
				ary[i]=curLastMax;
			}
			else
			{
				ary[i]=-1;
			}
			if(curLastMax<temp) {
				curLastMax=temp;
			}
		}
		System.out.println(Arrays.toString(ary));
	}

	private static void dnaStorage() {
		// https://www.codechef.com/START43D/problems/DNASTORAGE
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int index = 0; index < num; index++) {
			int seqLength = sc.nextInt();

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				String str = reader.readLine();
				String change = str.replaceAll("00", "A").replaceAll("01", "T").replaceAll("10", "C").replaceAll("11",
						"G");
				System.out.println(change);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void checkHowManyDaysTowait() {
		// https://www.codechef.com/START43D/problems/WAITTIME

		// String sequence=sc.nextLine();
		// System.out.println("--"+sequence.replaceAll("00", "A").replaceAll("01",
		// "T").replaceAll("10", "C").replaceAll("11", "G"));

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int index = 0; index < num; index++) {
			int week = sc.nextInt();
			int daysPassed = sc.nextInt();
			System.out.println((week * 7) - daysPassed);
		}
	}

	private static void checkHowManyBurgersCanMake() {
		// https://www.codechef.com/START43D/problems/BURGERS
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int index = 0; index < num; index++) {
			int paties = sc.nextInt();
			int buns = sc.nextInt();
			if (paties == buns) {
				System.out.println(paties);
			} else if (paties < buns)
				System.out.println(paties);
			else
				System.out.println(buns);
		}

	}

	private static String returnFirstNonRepeat(String str) {
		str = str.replaceAll(" ", "");
		char[] strAry = str.toCharArray();
		String nonRepeat = "";
		for (char c : strAry) {
			if (c == ' ')
				continue;
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				nonRepeat = String.valueOf(c);
				break;
			}
		}
		return nonRepeat;

	}

	private static void alternativeSquarePattern() {
		try {
			Scanner sc = new Scanner(System.in);
			long range = sc.nextLong();

			if (range < 1)
				return;

			long[] charachtersArry = new long[(int) (range * 5)];

			for (int i = 0; i < range * 5; i++) {
				charachtersArry[i] = i;
			}
			System.out.println(Arrays.toString(charachtersArry));
			for (int i = 1; i <= range; i++) {
				if (i / 2 == 0) {

				} else {

				}

				System.out.println("#");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void triangleWithAngle() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] ary = str.split(" ");
			int a = Integer.valueOf(ary[0]);
			int b = Integer.valueOf(ary[1]);
			int c = Integer.valueOf(ary[2]);
			if ((a + b + c) == 180 && a != 0 && b != 0 && c != 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}

	private static void sumIsEveryware() {
		try {
			Scanner sc = new Scanner(System.in);
			long range = sc.nextLong();
			long oddsum = 0;
			long evensum = 0;
			long odd = 1;
			long even = 2;
			if (range < 1)
				return;
			for (long i = 0; i < range; i++) {
				oddsum += odd;
				evensum += even;
				odd += 2;
				even += 2;
			}
			System.out.println(oddsum + " " + evensum);
		} catch (Exception e) {
			return;
		}
	}

	private static void addNaturalNumbers() {
		try {
			Scanner sc = new Scanner(System.in);
			// int count=sc.nextInt();
			int count = 3;
			int sum = 0;
			for (int i = 1; i <= count; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}

	private static void reverseStarPrint() {
		try {
			Scanner sc = new Scanner(System.in);
			// int count=sc.nextInt();
			int count = 5;
			for (int j = 0; j < count; j++) {
				for (int q = j; q <= count; q++) {
					System.out.print(" ");
				}
				for (int k = 0; k <= j; k++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	private static void validTRIVALCH() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] ary = str.split(" ");
			int a = Integer.valueOf(ary[0]);
			int b = Integer.valueOf(ary[1]);
			int c = Integer.valueOf(ary[2]);
			if (a + b < c || a + c < b || b + c < a) {
				System.out.println("YES");
			} else
				System.out.println("NO");

		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	private static void findInArray() {
		try {
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			int varToFind = sc.nextInt();
			int[] inArray = new int[count];
			for (int i = 0; i < count; i++) {
				inArray[i] = sc.nextInt();
			}
			boolean isThere = false;
			for (int i = 0; i < count; i++) {
				if (inArray[i] == varToFind) {
					isThere = true;
					break;
				} else
					isThere = false;
			}
			if (isThere)
				System.out.println(1);
			else
				System.out.println(-1);
		} catch (Exception e) {
			return;
		}
	}

	private static void printReversArray() {
		try {
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			int[] inArray = new int[count];
			for (int i = 0; i < count; i++) {
				inArray[i] = sc.nextInt();
			}
			System.out.println(Arrays.toString(inArray));
			for (int j = count - 1; j > 0; j--) {
				System.out.print(inArray[j] + " ");
			}
		} catch (Exception e) {
			return;
		}

	}

	private static void getBusForRaju() {
		try {
			Scanner sc = new Scanner(System.in);
			int busno = sc.nextInt();
			if ((busno % 5) == 0 || (busno % 6) == 0) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		} catch (Exception e) {
			return;
		}
	}

	private static void rangeOdd() {
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int i = a; i <= b; i++) {
				if (i % 2 != 0)
					System.out.print(i + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void findSecondLargest() {
		try {
			Scanner sc = new Scanner(System.in);
			int[] ar = new int[3];
			ar[0] = sc.nextInt();
			ar[1] = sc.nextInt();
			ar[2] = sc.nextInt();
			Arrays.sort(ar);
			System.out.println(ar[1]);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void DIFACTRS() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] ary = str.split(" ");
			int val = Integer.valueOf(ary[0]);
			List<Integer> divVal = new ArrayList<>();
			for (int i = 1; i <= val; i++) {
				if (val % i == 0)
					divVal.add(i);
			}
			System.out.println(divVal.size());
			for (Integer i : divVal)
				System.out.print(i + " ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void BUYPLSE() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			String[] ary = str.split(" ");
			Integer sum = (Integer.valueOf(ary[0]) * Integer.valueOf(ary[2]))
					+ (Integer.valueOf(ary[1]) * Integer.valueOf(ary[3]));
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void ISBOTH() {
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if ((num % 5) == 0 && (num % 11) == 0) {
				System.out.println("BOTH");
			}
			if ((num % 5) == 0 || (num % 11) == 0) {
				System.out.println("ONE");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
