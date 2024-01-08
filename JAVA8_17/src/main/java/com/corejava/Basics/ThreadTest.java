package com.corejava.Basics;

import java.util.HashMap;
import java.util.Map;

class ThreadOne implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thead one  "+i);
		}
	}
	
}
class ThreadTwo implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thead two  "+i);
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		ThreadOne one=new ThreadOne();
		ThreadTwo two=new ThreadTwo();
		
		Thread t2=new Thread(two);
		t2.setPriority(2);
		t2.start();
		
		Thread t=new Thread(one);
		t.setPriority(2);
		t.start();
		Map<String, String> names = new HashMap<>();
		names.put("Albert", "Ein?");
		names.put("Marie", "Curie");
		names.put("Max", "Plank");
		
		names.merge("Albert", "stein", (old, val) -> old.substring(0, 3) + val);
		System.out.println(names);
	}
}
