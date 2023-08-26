package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DSAOne {

	
	
	public static void main(String[] args) {
		BitManipulation();
		XORDemo();
		findNonDuplicateNumber();
		System.out.println(factorialNumer(30));
		trailingZerosInFactorial(30);
		palindromeNumber(121);
		palindromeString("aabbaac");
		/*  for(int i=2;i<100;i++) {
			  isPrimeNumber(i);
		  }*/
		
		System.out.println(gcd(60,24));
		System.out.println(fastPower(1121312,3));
		System.out.println(fastPower2(1121312,3,100000));
		
		//RecursionProblems
		System.out.println(sumOfN(5));
		System.out.println(power(2,4)+"  "+power(5,3));
		
		System.out.println(possibleNumberOfWays(4,3));
		System.out.println(josephusProblem(5,3));
		
		System.out.println(isStringPalindrom("aabbaa",0,0)+"   "+isStringPalindrom("abc",0,0));
		
		majorityElementFromArray(new int[] {1,2,3,1,1,1});
		System.out.println(largestSumContinousArray(new int[] {5,-4,-2,6,-1}));
		System.out.println(maximumProfitSoFar(new int [] {5,2,6,4,1}));
		System.out.println(maximumProfitAnyTRXFar(new int [] {5,2,6,1,4,7,3,6}));
		
		System.out.println(rainWaterTrapping(new int [] {5,2,6,1,4,7,3,6}));
		
		
		
		//Sorting
		System.out.println(bubbleSort(new int [] {5,2,6,1,4,7,3,6}));
		System.out.println(insertionSort(new int [] {5,2,6,1,4,7,3,6}));
		
		System.out.println(selectionSort(new int [] {5,2,6,1,4,7,3,6}));
		System.out.println(quickSort(new int [] {5,2,6,1,4,7,3,6},0,0));
	}

	private static String quickSort(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	    return "";
	}

	private static String selectionSort(int[] ary) {
		for(int i=0;i<ary.length-1;i++) {
			int min=i;
			for(int j=i+1;j<ary.length;j++) {
				if(ary[j]<ary[min]) {
					min=j;
				}
			}
			if(min!=i) {
				swap(ary,min,i);
			}
		}
		System.out.println(Arrays.toString(ary)+" ....");
		return "";
	}

	private static void swap(int[] ary, int min, int i) {
		int temp=min;
		ary[i]=temp;
		min=temp;
	}

	private static int insertionSort(int[] is) {
		for(int i=1;i<is.length;i++) {
			int temp=is[i];
			int j=i-1;
			while(j>=0 && is[j]>temp) {
				is[j+1]=is[j];
				j--;
			}
			is[j+1]=temp;
		}
		System.out.println("Insertion Sort : "+Arrays.toString(is));
		return 0;
	}

	private static int bubbleSort(int[] ary) {
		boolean swaped=false;
		for(int i=0;i<ary.length-1;i++) {
			for(int j=0;j<ary.length-i-1;j++) {
				if(ary[j+1]<ary[j]) {
					swaped=true;
					int temp=ary[j+1];
					ary[j+1]=ary[j];
					ary[j]=temp;
				}
			}
			if(!swaped)
				break;
		}
		System.out.println("ary   : "+Arrays.toString(ary));
		return 0;
	}

	private static int rainWaterTrapping(int[] ary) {
		int n=ary.length;
		int [] left=new int [n];
		int [ ]right=new int [n];
		left[0]=ary[0];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1], ary[i]);
		}
		right[n-1]=ary[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], ary[i]);
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+=(Math.min(left[i],right[i])-ary[i]);
		}
		return ans;
		
	}

	private static int maximumProfitAnyTRXFar(int[] is) {
		int profit=0;
		for(int i=1;i<is.length;i++) {
			if(is[i]>is[i-1]) {
				profit+=(is[i]-is[i-1]);
			}
		}
		return profit;
	}

	private static int maximumProfitSoFar(int[] is) {
		int maxProfit=0;
		int minsofar=is[0];
		for(int i=0;i<is.length;i++) {
			minsofar=Math.min(minsofar, is[i]);
			int profit=is[i]-minsofar;
			maxProfit=Math.max(maxProfit,profit);
		}
		return maxProfit;
	}

	private static int largestSumContinousArray(int[] is) {
		int maxsum=0;
		int cursum=0;
		for(int i=0;i<is.length;i++) {
			cursum=cursum+is[i];
			if(cursum>maxsum) {
				maxsum=cursum;
			}
			if(cursum<0) {
				cursum=0;
			}
		}
		return maxsum;
	}

	private static void majorityElementFromArray(int[] ary) {
		HashMap<Integer,Integer> iMap=new HashMap<Integer,Integer>();
		for(int x:ary) {
			if(iMap.containsKey(x)) {
				int countInMap=iMap.get(x);
				iMap.put(x,countInMap+1);
			}
			else
				iMap.put(x,1);
		}
		int shouldContains=ary.length/2;
		System.out.println(iMap+"  "+shouldContains);
		List<Entry<Integer, Integer>> isGreater = iMap.entrySet().stream().filter(e->e.getValue()>shouldContains).collect(Collectors.toList());
		System.out.println(isGreater);
	}

	private static boolean isStringPalindrom(String string, int i, int j) {
		if(i>=j)
			return true;
		if(string.charAt(i)!=string.charAt(j))
		{
			return false;
		}
			return isStringPalindrom(string, i+1, j-1);
					
	}


	private static int josephusProblem(int n, int k) {
		if(n==1)
			return 0;
			
		return (josephusProblem(n-1,k)+k)%n;
	}

	private static int possibleNumberOfWays(int i, int j) {
		if(i==1 || j==1) {
			return 1;
		}
		
		return possibleNumberOfWays(i-1, j)+possibleNumberOfWays(i, j-1);
	}

	private static int power(int i, int j) {
		if(j<1)
			return 1;
		return i*power(i,j-1);
	}

	private static int sumOfN(int i) {
		if(i<=1)
			return 1;
		
		return i+sumOfN(i-1);
		
	}

	private static int fastPower2(int a, int b,int n) {
		int res=1;
		while(b>0) {
			if((b&1)!=0) {
				res=(res*a%n)%n;
			}
			a=(a%n *a%n)%n;
			b=b>>1;
		}
		return res;
	}
	
	private static int fastPower(int a, int b) {
		int res=1;
		while(b>0) {
			if((b&1)!=0) {
				res=res*a;
			}
			a=a*a;
			b=b>>1;
		}
		return res;
	}

	private static int gcd(int a, int b) {
		//if(b==0) return a;
		//return gcd(b,a%b);
		return (b==0)?a: gcd(b,a%b);
	}

	private static void isPrimeNumber(int num) {
		 int isPrime=0;
		 for(int i=2;i<(num/2);i++) {
			 if((num%i)==0) {
				 isPrime++;
			 }
		 }
		 if(isPrime>0)
		 {
			 //System.out.println("Not Prime "+num);
		 }
		 else
			 System.out.println("Is Prime "+num );
		
	}

	private static void palindromeString(String str) {
		String x="";
		for(int i=str.length()-1;i>=0;i--) {
			x=x+str.charAt(i);
		}
		System.out.println(x+"   "+str);
		System.out.println(x.equals(str)?"Palindrom":"Not Palindrome");
	}

	private static void palindromeNumber( int num) {
		int revers=0,rem,val;
		val=num;
		while(num!=0) {
			rem=num%10;
			revers=revers*10+rem;
			num=num/10;
		}
		System.out.println(revers==val?"Palindrome":"Not Palindrome");
		
	}

	private static void trailingZerosInFactorial(int num) {
		int res=0;
		for(int i=5;i<=num;i=i*5) {
			res=res+num/i;
		}
		System.out.println(res);
	}

	private static int factorialNumer(int i) {
		if(i<=1)
			return 1;
		else
			return i*factorialNumer(i-1);
		
	}

	private static void findNonDuplicateNumber() {
		int [] ary=new int[] {2,3,4,5,2,3};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<ary.length;i++) {
			int num=ary[i];
			if(set.contains(num)) {
				set.remove(num);
			}
			else 
				set.add(num);
		}
		System.out.println(set);
	}

	private static void XORDemo() {
		// Find non duplicate Number from array
		int [] ary=new int[] {2,3,4,2,3};
		int num=0;
		for(int i=0;i<ary.length;i++) {
			num=num^ary[i];
		}
		System.out.println(num);
	}

	private static void BitManipulation() {
		int a=5;
		int b=7;
		System.out.println((a|b)+" Or ");
		System.out.println((a&b)+" And ");
		System.out.println((a^b)+" ^ ");
		System.out.println((~a)+" ~ "+(~b));
		
		//Shift operator
		int q=2;
		int p=200;
		System.out.println("Multiply by  "+(q<<1)+" Shift  "+(q<<2)+"  "+(q<<3));
		System.out.println("Div by       "+(p>>1)+" Shift  "+(p>>2)+"  "+(p>>3));
	}

}

