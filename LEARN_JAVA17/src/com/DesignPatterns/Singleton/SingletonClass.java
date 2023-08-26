package com.DesignPatterns.Singleton;

public class SingletonClass {
	
	private static SingletonClass sc=new SingletonClass();
	
	private SingletonClass() {};
	
	public static SingletonClass getSingletonClassObject() {
		return sc;
	}
	
}
