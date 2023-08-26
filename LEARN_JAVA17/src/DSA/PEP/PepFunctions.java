package DSA.PEP;

import java.util.Scanner;

public class PepFunctions {
	
	//@Test
	public void decimalToAnyBase() {
		int num=987;
		int base=2;
		int rv=0;
		int p=1;
		while(num>0) {
			int dig=num%base;
			num=num/base;
			rv+=dig*p;
			p=p*10;
		}
		System.out.print("\t"+rv+"\n");
		//1733
	}
	
	
	//@Test
	public void checkFreqInDigit() {
		int checkDigit=0;
		int x=100;
		int nod=0;
		int temp=x;
		while(temp!=0) {
			temp=temp/10;
			nod++;
		}
		int div=(int)Math.pow(10, nod-1);
		int count=0;
		while(div!=0) {
			int dgt=x/div;
			System.out.println(dgt);
			if(dgt==checkDigit)
			{
				count++;
			}
			x=x%div;
			div=div/10;
		}
		System.out.println(count);
	}
	
	public static void main(String str[])
	{
		//extracted1();
		//extraced2();
		extraceted3();
	}


	private static void extraceted3() {
		// TODO Auto-generated method stub
		
	}


	private static void extraced2() {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        	int len=sc.nextInt();
 		    char[] ary=(sc.next()).toCharArray();
 		    
 		    for(int j=0;j<len;j++)
 		    {
 		        if(ary[j]=='T')
 		        ary[j]='A';
 		        else if(ary[j]=='A')
 		        	ary[j]='T';
 		        else if(ary[j]=='G')
 		        	ary[j]='C';
 		        else if(ary[j]=='C')
 		        	ary[j]='G';
 		    }
 		    
 		    System.out.println(String.valueOf(ary));
		}
	}


	private static void extracted1() {
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        	int len=sc.nextInt();
			char [] chary=new char[len];
			for(int i=0;i<len;i++)
			{
			    char c=sc.next().charAt(0);
			    if(c=='A')
			        chary[i]='T';
			    if(c=='T')
			        chary[i]='A';
			    if(c=='C')
			        chary[i]='G';
			    if(c=='G')
			        chary[i]='C';
			}
			for(int i=0;i<chary.length;i++)
			{
			    System.out.print(chary[i]);
			}
		}
	}
}
