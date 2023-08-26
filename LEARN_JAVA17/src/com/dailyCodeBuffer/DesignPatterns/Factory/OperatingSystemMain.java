package com.dailyCodeBuffer.DesignPatterns.Factory;

public class OperatingSystemMain {
	public static void main(String[] args) {
		OperatingSystem instance = OperatingSystemFactory.getInstance("LINUX", "xx", "yyy");
		System.out.println(instance);
		try {
			OperatingSystem instance2 = OperatingSystemFactory.getInstance("WINDOWS", "xx", "yyy");
			System.out.println(instance2);
		} catch (Exception e) {

		}
	}
}
