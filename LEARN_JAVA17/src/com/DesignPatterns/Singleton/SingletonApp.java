package com.DesignPatterns.Singleton;

public class SingletonApp {

	public static void main(String[] args) {
		//SingletonClass sc=new SingletonClass();
		SingletonClass sc=SingletonClass.getSingletonClassObject();
		SingletonClass sc2=SingletonClass.getSingletonClassObject();
		
		System.out.println("Sc 1 "+sc.hashCode());
		System.out.println("Sc 2 "+sc2.hashCode());
		
		SingletonDoubleCheck scc1=SingletonDoubleCheck.getSingletonDoubleCheckSyncronisedObject2();
		SingletonDoubleCheck scc2=SingletonDoubleCheck.getSingletonDoubleCheckSyncronisedObject2();
		
		System.out.println("Synchronized sc1 :"+scc1.hashCode());
		System.out.println("Synchronized sc2 :"+scc2.hashCode());		
		
	}
}

