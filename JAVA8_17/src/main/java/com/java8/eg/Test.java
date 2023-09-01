package com.java8.eg;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java8.eg.Interf.FuncInterf;
import com.java8.eg.Records.fullName;

public class Test {

	public static void main(String[] args) {
		// checkMethods();

		// predicateTest();
		functionsTest();

	}

	private static void functionsTest() {
		List<String> randomName = Data.getRandomName(20);
		Function<String, String> toCapital = a -> a.toUpperCase();
		randomName.stream().forEach(e -> toCapital.apply(e));
		List<String> collect = randomName.stream().filter(e -> e.length() % 2 != 0).map(e -> toCapital.apply(e))
				.collect(Collectors.toList());
		System.out.println(collect);
		List<Integer> collectLen = randomName.stream().filter(e -> e.length() % 2 == 0).map(e -> e.length())
				.collect(Collectors.toList());
		System.out.println(collectLen);

		randomName.stream().forEach(Test::printme);

		Data.getRandomeNumbers(30).stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(Test::printme);
		System.out.println();
		Data.getRandomeNumbers(30).stream().filter(e -> e % 2 == 0).sorted().collect(Collectors.toList())
				.forEach(Test::printme);
		long count = Data.getRandomeNumbers(30).stream().filter(e -> e % 2 == 0).count();
		System.out.println("\n " + count);

		LocalDate dt = LocalDate.now();
		LocalTime dTime = LocalTime.now();
		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone + " " + zone.getRules());
		System.out.println(
				dTime.getHour() + "  " + dTime.getMinute() + "  " + dTime.getSecond() + "  " + dTime.getNano());
		System.out.println(
				dt.getDayOfMonth() + "  " + dt.getYear() + "  " + dt.getDayOfYear() + " " + dt.getMonthValue() + "  "
						+ dt.getChronology() + "  " + dt.getDayOfWeek() + "  " + dt.getEra() + "  " + dt.getMonth());

		List<fullName> fullNameRecords = Data.getFullNameRecords(10);

		Map<String, String> map = fullNameRecords.stream().collect(Collectors.toMap(e -> e.name(), j -> j.surName()));
		for(Entry<String, String> x:map.entrySet()) {
			System.out.println(x.getKey()+",,"+x.getValue());
		}
		System.out.println(">>>>>>>>>");
		Map<String, String> mapx = randomName.stream().collect(Collectors.toMap(e->e, e->e+"ddd"));
		for(Entry<String, String> x:mapx.entrySet()) {
			System.out.println(x.getKey()+",,"+x.getValue());
		}
		
		System.out.println(">>>>>>>");
		
	}

	public static void printme(String x) {
		System.out.println(x);
	}

	public static void printme(int x) {
		System.out.print("," + x);
	}

	private static void predicateTest() {
		FuncInterf fn = () -> {
			System.out.println("Heelo");
		};
		FuncInterf fn2 = () -> System.out.println("Heelo");
		fn.func();
		fn2.func();

		Predicate<Integer> checkEven = (a) -> a % 2 == 0; // Predicate will return boolean value , Can pass only one
															// value
		System.out.println(checkEven.test(10) + "  " + checkEven.test(7));
		// Two values can not be passed to Predicate , Only one can be passed
		// Predicate<Integer,Integer> scheckEven=(a)->a%2==0;

		// Predicates can be joined by And Or or negate
		Predicate<Integer> checkOdd = (a) -> a % 2 != 0;
		Predicate<Integer> lessThanZero = (a) -> a < 0;
		// Predicates Chaining
		System.out.println(checkEven.negate().and(lessThanZero).or(checkEven).test(3));
	}

	private static void checkMethods() {
		final List<String> names = Data.getRandomName(10);
		for (final String x1 : names) {
			System.out.println(x1);
		}

		final List<String> surNames = Data.getRandomSurName(10);
		for (final String x1 : surNames) {
			System.out.println(x1);
		}

		final List<String> fullNames = Data.getRandomFullName(10);
		for (final String x1 : fullNames) {
			System.out.println(x1);
		}

		final List<fullName> fullNames2 = Data.getFullNameRecords(10);
		for (final fullName x1 : fullNames2) {
			System.out.println("REcord : " + x1.toString());
		}
	}

}
