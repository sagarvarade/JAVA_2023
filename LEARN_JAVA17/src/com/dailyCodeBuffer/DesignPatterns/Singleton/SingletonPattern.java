package com.dailyCodeBuffer.DesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonPattern {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// extracted();

		// Breaking Singleton Class
		// Will be solved by readResolve method in Class
		breakSingletonClass();

		// Breaking Singleton Class by reflection
		// Will be solved by readResolve method in Class
		breakingSingletonWithReflection();
	}

	private static void breakingSingletonWithReflection()
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
		Constructor constructor = constructors[0];
		constructor.setAccessible(true);
		LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
		LazySingleton lzy2 = LazySingleton.getInstance();
		System.out.println(lazySingleton.hashCode());
		System.out.println(lzy2.hashCode());
		
		EnumSingleton.INSTANCE.doSomething();
	}

	private static void breakSingletonClass() throws FileNotFoundException, IOException, ClassNotFoundException {
		LazySingleton lzy = LazySingleton.getInstance();
		ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("fl"));
		objOut.writeObject(lzy);
		objOut.close();

		ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("fl"));
		LazySingleton desiserilizedObject = (LazySingleton) objIn.readObject();
		objIn.close();

		System.out.println(lzy.hashCode());
		System.out.println(desiserilizedObject.hashCode());
	}

	private static void extracted() {
		LazySingleton lzySingl = LazySingleton.getInstance();
		LazySingleton lzySingl2 = LazySingleton.getInstance();
		System.out.println(lzySingl.hashCode());
		System.out.println(lzySingl2.hashCode());

		EagerSingleton eagerSingl = EagerSingleton.getInstance();
		EagerSingleton eagerSingl2 = EagerSingleton.getInstance();
		System.out.println(eagerSingl.hashCode());
		System.out.println(eagerSingl2.hashCode());
	}
}
