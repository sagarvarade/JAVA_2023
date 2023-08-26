package com.DesignPatterns.Singleton;

public class SingletonDoubleCheck {
	private static SingletonDoubleCheck sc;

	private SingletonDoubleCheck() {
	}

	public static SingletonDoubleCheck getSingletonDoubleCheckObject() {
		if (sc == null) {
			if (sc == null) {
				sc = new SingletonDoubleCheck();
			}
		}
		return sc;
	}

	public static synchronized SingletonDoubleCheck getSingletonDoubleCheckSyncronisedObject() {
		if (sc == null) {
			sc = new SingletonDoubleCheck();
		}
		return sc;
	}

	public static synchronized SingletonDoubleCheck getSingletonDoubleCheckSyncronisedObject2() {
		if (sc == null) {
			synchronized (SingletonDoubleCheck.class) {
				sc = new SingletonDoubleCheck();
			}
		}
		return sc;
	}

}
