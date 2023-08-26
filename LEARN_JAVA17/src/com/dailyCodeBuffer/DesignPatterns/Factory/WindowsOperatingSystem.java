package com.dailyCodeBuffer.DesignPatterns.Factory;

public class WindowsOperatingSystem extends OperatingSystem {

	public WindowsOperatingSystem(String version, String architecture) {
		super(version, architecture);
	}

	@Override
	public void changeDir(String dir) {
		System.out.println("Windows Change DIR");
	}

	@Override
	public void removeDir(String dir) {
		System.out.println("Windows remove DIR");
	}

	@Override
	public String toString() {
		return "WindowsOperatingSystem [getVersion()=" + getVersion() + ", getArchitecture()=" + getArchitecture()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
