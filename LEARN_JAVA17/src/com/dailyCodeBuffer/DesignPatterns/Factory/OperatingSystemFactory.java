package com.dailyCodeBuffer.DesignPatterns.Factory;

public class OperatingSystemFactory {

	private OperatingSystemFactory() {

	}

	public static OperatingSystem getInstance(String type, String version, String architecure) {
		switch (type) {
		case "WINDOWS":
			return new WindowsOperatingSystem(version, architecure);
		case "LINUX":
			return new LinuxOperatingSystem(version, architecure);
		default:
			throw new IllegalArgumentException("OS Not supporeted");
		}
	}
}
