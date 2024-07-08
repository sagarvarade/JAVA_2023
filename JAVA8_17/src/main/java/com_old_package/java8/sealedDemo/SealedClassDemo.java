package com_old_package.java8.sealedDemo;

sealed interface TraficLight {
}

final class RedLight implements TraficLight {
}

final class YellowLight implements TraficLight {
}

final class GreenLight implements TraficLight {
}

final class SmallHouse implements House {
}

non-sealed class MediumHouse implements House {

}

public class SealedClassDemo {
	public static void main(String[] args) {
		RedLight rl = new RedLight();
		SmallHouse sm = new SmallHouse();

	}
}
