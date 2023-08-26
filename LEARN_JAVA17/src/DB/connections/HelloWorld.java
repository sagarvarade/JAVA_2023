package DB.connections;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;

public class HelloWorld {
	
	@SuppressWarnings("unused")
	private static final LinkedList<String> String1 = null;
	public static void chunkSplitter()
	{
		int[] x = new int[535];
		for (int i = 0; i < 235; i++)
			x[i] = i + 1;
		ArrayList<Integer> iar = new ArrayList<Integer>();
		ArrayList<Integer> tempAr = new ArrayList<Integer>();
		System.out.println(x.length);
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 0)
				continue;
			if (x.length < 50) {
				iar.add(i);
			} else {
				tempAr.add(x[i]);
			}
			if (i % 50 == 0) {
				iar.addAll(tempAr);
				tempAr.clear();
				System.out.println(iar.size() + " chuck " + iar);
			}
			if (i == x.length - 1) {
				iar.addAll(tempAr);
				tempAr.clear();
				System.out.println(iar.size() + " last chuck " + iar);
			}
		}
	}
	private static void cardSwap() {
		String [] cardsArray= {"1","2","3","4","5","6","7","8","9","10","A","B","C"};
		System.out.println(cardsArray.length);
		for(int i=0;i<2000;i++)
		{
			LinkedHashSet<String> randomCards=new LinkedHashSet<String>();
			while(randomCards.size()<13)
			{
				int random=(int) ((Math.random()*100)%13);
				randomCards.add(cardsArray[random]);
			}
			System.out.println(randomCards.toString());
			randomCards=null;
		}		
	}
	
	private static void cardSwap2() {
		for(int i=0;i<2000;i++){
			LinkedList<String> sequence=new LinkedList<String>();
			sequence.add("1");sequence.add(null);sequence.add("2");sequence.add(null);sequence.add("3");sequence.add(null);sequence.add("4");
			sequence.add(null);sequence.add("5");sequence.add(null);sequence.add("6");
			sequence.add(null);sequence.add("7");	
			LinkedList<String> topick=new LinkedList<String>();
			topick.add("8");topick.add("9");topick.add("10");
			topick.add("Bhatya");topick.add("Rani");topick.add("King");
			for(int j=1;j<12;)			{
				int random=(int) ((Math.random()*100)%topick.size());
				sequence.set(j, topick.get(random));
				topick.remove(random);
				j=j+2;
			}			
			printSequence(sequence);
		}
	}
	private static void printSequence(LinkedList<java.lang.String> sequence) {
		@SuppressWarnings("unchecked")
		LinkedList<java.lang.String> dup=(LinkedList<java.lang.String>) sequence.clone();
		int index=0;
		StringBuilder str=new StringBuilder();
		while(!sequence.isEmpty())		{
			String pk=sequence.poll();
			String next=sequence.poll();
			str.append(pk+" ");
			sequence.add(next);
			index++;
			if(index==13)
				break;
		}
		if(str.toString().trim().equals("1 2 3 4 5 6 7 8 9 10 Bhatya Rani King"))		{
			System.out.println(dup);
			System.out.println("found"+str);
		}
	}
	public static void main(String[] args) {
		
		
		
		/*
		 * for(int i=1000;i<2000;i++) { FileDownloader(i+"-JLP2020-1.jpg"); }
		 */
		//FileDownloader();
		//shiftOperator();
		//FunctionalDemo();
		cardSwap2();
		//sumofThree();
		//stringMatcher();
		//cardSwap();
		/*
		 * StringBuilder str=new StringBuilder();
		 * str.append("1 2 3 4 5 6 7 Bhatya King 9 Rani 8 10 ");
		 * if(str.toString().equals("1 2 3 4 5 6 7 Bhatya King 9 Rani 8 10 ")) { //
		 * System.out.println("found"); }
		 */	
		
		
		
	}
	
	private static void FileDownloader(String fileName) {
		
		File fl=new File("D:\\Personal Data Sagar_varade\\photo\\"+fileName);
		if(fl.exists())
		{
			
		}
		else {
			try {
				fl.createNewFile();
				System.out.println(" File not exist created "+fileName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		try (BufferedInputStream inputStream = 
				new BufferedInputStream(new URL("https://www.levanavyuvaksangh.com/members/"+fileName).openStream());
		    
			
				
			FileOutputStream fileOS = new FileOutputStream("D:\\Personal Data Sagar_varade\\photo\\"+fileName)) {
		    byte data[] = new byte[1024];
		    int byteContent;
		    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
		        fileOS.write(data, 0, byteContent);
		    }
		} catch (IOException e) {
		    // handles IO exceptions
			e.printStackTrace();
			
		}
		
	}
	
	
	
	private static void FileDownloader() {
		try (BufferedInputStream inputStream = new BufferedInputStream(new URL("https://www.levanavyuvaksangh.com/members/2842-JLP2020-1.jpg").openStream());
		  FileOutputStream fileOS = new FileOutputStream("D:\\Personal Data Sagar_varade\\photo\\1.jpg")) {
		    byte data[] = new byte[1024];
		    int byteContent;
		    while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
		        fileOS.write(data, 0, byteContent);
		    }
		} catch (IOException e) {
		    // handles IO exceptions
			e.printStackTrace();
			
		}
		
	}
	private static void shiftOperator() {
	int x=2;
	x=x<<4;	
	System.out.println(x);
	
	int minCapacity=1<<15;
	System.out.println(minCapacity);
		
	}
	private static void FunctionalDemo() {
		
		Consumer<String> con=(e)->System.out.println(e);
		con.accept("sagar");
		con.accept("varade");
		
		Function<String,Integer> func=(e)->e.length();
		System.out.println(func.apply("sagar"));
		
		
		
		
	}
	private static void stringMatcher() {
		
		/*
		 * String [] chrs= {"a","b","c","d","e","f","g","h","i","j",
		 * "k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
		 * "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S",
		 * "T","U","V","W","X","Y","Z", "0","1","2","3","4","5","6","7","8","9"};
		 */
		String pas="zg";
		String [] chrs= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z" };
				//  "k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

		String toCmp="";
		int cnt=0;
		while(!toCmp.equals(pas))
		{
			int random=(int) ((Math.random()*100)%(chrs.length-1));
			toCmp=toCmp+""+chrs[random];
			System.out.println("cmp "+toCmp);
			if(toCmp.length()>2)
				toCmp="";
			cnt++;
			/*
			 * if(cnt==1000000) System.out.println("cmp break "+toCmp); break;
			 */
		}
		System.out.println("Break "+cnt);
		
	}
	private static void sumofThree() {
		int [] ar= {2,6,10,14,18,22,26,30,34,38,42,46,50,54,58};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;i<ar.length;j++)
			{
				for(int k=0;i<ar.length;k++)
				{
					int sum=ar[i]+ar[j]+ar[k];
					if(sum>50)
						System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
				}
				
			}
		}
		
	}
}

