package Problems.PepCodingDSA1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		// Arrays
		//arrayDemo();
		// Span of array
		// SpanOfArray(5);
		// Search element in array
		// searchElementInArray( new int[] {1,23,42,46,2,3}, 23);
		// Bar chart
		  // barChart();
		  //Sum of two arrays
		  // sumOfTwoArrays(new int[] {1,2}, new int[] {3,4,5,2});
		  // Difference of two arrays
		 //    diffOfTwoArrays();  //Not working
			
		 // Batching on array
			//batchingOnArray();
		aryDemo();
	}

	
	
	private static void aryDemo() {
		int [] x=new int[] {2,3,4};
		//int [] y=x;
		int [] y=x.clone();
		System.out.println(Arrays.toString(x)+"    "+Arrays.toString(y));
		x[1]=5;
		System.out.println(Arrays.toString(x)+"    "+Arrays.toString(y));
	}



	private static void batchingOnArray() {
		int [] ary=new int[] {1,2,12,3,1,4,5,7,1,3,4,667,235,55,36,73,45,256,2,466,2345,6,224,6445,22,235,22,75,23};
		int batchSize=6;
		divideArrayIntoBatches(ary, batchSize);
	}
	
	private static Object subArray(int[] ary, int batchSize, int start, int end) {
		int[] ary2 =new int[batchSize];
		for(int i=0;i<batchSize;i++) {
			ary2[i]=ary[i+start];
		}
		System.out.println(Arrays.toString(ary2));
		return null;
	}
	
	public static List<int[]> divideArrayIntoBatches(int[] array, int batchSize) {
        List<int[]> batches = new ArrayList<>();
        int length = array.length;

        for (int i = 0; i < length; i += batchSize) {
            int[] batch = Arrays.copyOfRange(array, i, Math.min(length, i + batchSize));
            batches.add(batch);
            System.out.println(Arrays.toString(batch));
        }
        
        return batches;
    }
	private static void diffOfTwoArrays() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int [] a1=new int[n1];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		
		int n2=sc.nextInt();		
		int [] a2=new int[n2];
		for(int i=0;i<a2.length;i++) {
			a2[i]=sc.nextInt();
		}
		
		int[] diff=new int [n2];
		int c=0;
		
		int i=a1.length-1;
		int j=a2.length-1;
		int k=diff.length-1;
		
		while(k>=0) {
			int d=0;
			int alv=i>=0?a1[i]:0;
			
			if(a2[j]+c>=alv) {
				d=a2[j]+c-alv;
				c=0;
			}
			else {
				d=a2[j]+c+10-alv;
				c=-1;
			}
			diff[k]=d;
			i--;
			j--;
			k--;
		}
		int idx=0;
		while(idx<diff.length) {
			if(diff[idx]==0) {
				idx++;
			}
			else
				break;
		}
		while(idx<diff.length) {
			System.out.println(diff[idx]);
		}
		
	}

	private static void sumOfTwoArrays(int[] ary, int[] ary2) {
		int [] sum=new int [ary.length>ary2.length?ary.length:ary2.length];
		int c=0;
		int i=ary.length-1;
		int j=ary2.length-1;
		int k=sum.length-1;
		
		while(k>=0) {
			int d=c;
			if(i>=0) {
				d+=ary[i];
			}
			if(j>=0) {
				d+=ary2[j];
			}
			c=d/10;
			d=d%10;
			sum[k]=d;
			i--;
			j--;
			k--;
		}
		if(c!=0)
			System.out.println(c);
		for(int val:sum) {
			System.out.print(val+" \t");
		}
	}

	private static void barChart() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int x[]=new int[n];
		int max=-1;
		int min=-1;
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			x[i]=num;
			if(num>max) max=num;
			if(num<min) min=num;
		}
		for(int floor=max;floor>=1;floor--) {
			for(int i=0;i<x.length;i++) {
				if(x[i]>=floor) {
					System.out.print("*\t");
				}
				else
					System.out.print("\t");
			}
			System.out.println();
		}
		sc.close();
		
	}

	private static void searchElementInArray(int[] is, int i) {
		int pos=0;
		int count=0;
		for(int j:is) {
			count++;
			if(j==i)
				pos=count;
		}
		
		
		
		System.out.println(pos==0?"Not found":"Found at "+pos);
	}

	private static void SpanOfArray(int i) {
		int ary[] =new int [i];
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<i;j++)
		{
			ary[j]=sc.nextInt();
		}
		int min=ary[0];
		int max=ary[0];
		for(int j:ary) {
			if(j<min)
				min=j;
			if(j>max)
				max=j;
		}
		System.out.println(min+"  "+max+"  "+(max-min));
 	}

	private static void arrayDemo() {
		String [] x=new String[5]; // Null value 
		int [] x2=new int[5];      // Primitive value
		double [] x3=new double[5];      // Primitive value
		char [] x4=new char[5];      // Primitive value
		System.out.println(Arrays.deepToString(x));
		for(int y:x2) {
			System.out.println(y);
		}
		for(double y:x3) {
			System.out.println(y);
		}
		for(char y:x4) {
			System.out.println(">> "+y);
		}
	}
}
