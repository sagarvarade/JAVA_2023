package com.dailyCodeBuffer.DesignPatterns.Singleton;


import java.io.Serializable;

public class LazySingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static LazySingleton instance = null;

	private LazySingleton() {

	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	// This will be used in De - serializaton and retun this instace for this class
	protected Object readResolve() {
		return instance;
	}
}
