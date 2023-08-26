package com.dailyCodeBuffer.DesignPatterns.Factory;

public class LinuxOperatingSystem extends OperatingSystem {

	
	public LinuxOperatingSystem(String version, String architecture) {
		super(version, architecture);
	}

	@Override
	public void changeDir(String dir) {
		System.out.println("Linux Change DIR");
	}

	@Override
	public void removeDir(String dir) {
		System.out.println("Linux remove DIR");
	}

	@Override
	public String toString() {
		return "LinuxOperatingSystem [getVersion()=" + getVersion() + ", getArchitecture()=" + getArchitecture()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
