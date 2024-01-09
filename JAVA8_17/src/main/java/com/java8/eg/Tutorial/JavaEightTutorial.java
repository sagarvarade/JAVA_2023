package com.java8.eg.Tutorial;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

interface MathFormula {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}

class Person {
	String firstName;
	String lastName;

	Person() {
	}

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

interface PersonFactory<P extends Person> {
	P create(String firstName, String lastName);
}

@FunctionalInterface
interface Convertor<F, T> {
	public T convert();
}

public class JavaEightTutorial {

	private static List<String> getStringCollection() {
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
		return stringCollection;
	}

	private static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia", "agarre ageer");

	/// https://github.com/winterbe/java8-tutorial
	public static void main(String[] args) {
		// extracted();
		// Built in functions in java
		// PredicatesDemo();
		// FunctionsDemo();
		// SuppliersDemo();
		// ConsumerDemo();
		// ComparatorDemo();
		// OptionalDemo();
		// StreamsDemo();
		// CountAndMatchDemo();
		// reduceOperation();
		// parallelStream();
		//   MapsOperations();
		DateAndApi();

	}

	private static void DateAndApi() {
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);   // legacy java.util.Date
		System.out.println(millis+"  "+legacyDate);
		
		System.out.println(ZoneId.getAvailableZoneIds());
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		ZoneId zone2 = ZoneId.of("Brazil/East");
		System.out.println(zone1.getRules());
		System.out.println(zone2.getRules());
		LocalTime now1 = LocalTime.now(zone1);
		LocalTime now2 = LocalTime.now(zone2);

		System.out.println(now1.isBefore(now2));  // false

		long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
		long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

		System.out.println(hoursBetween);       // -3
		System.out.println(minutesBetween);     // -239
//		LocalTime comes with various factory methods to simplify the creation of new instances, including parsing of time strings.

		LocalTime late = LocalTime.of(23, 59, 59);
		System.out.println(late);       // 23:59:59

	}

	private static void MapsOperations() {
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(int i=0;i<10;i++) {
			map.putIfAbsent(i, "val_"+i);
		}
		map.entrySet().stream().forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));
		map.computeIfPresent(3, (num, val) -> val + num);
		map.get(3);             // val33
		map.computeIfPresent(9, (num, val) -> null);
		map.containsKey(9);     // false
		map.computeIfAbsent(23, num -> "val" + num);
		map.containsKey(23);    // true
		map.computeIfAbsent(3, num -> "bam");
		map.get(3);             // val33
		
		map.remove(3, "val3");
		map.get(3);             // val33
		map.remove(3, "val33");
		map.get(3);             // null
		System.out.println(">>>>>>>>");
		map.entrySet().stream().forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));
		
		map.getOrDefault(42, "not found");  // not found
//		Merging entries of a map is quite easy:
		map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
		map.get(9);             // val9
		map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
		map.get(9);             // val9concat

		
		
		
	}

	private static void parallelStream() {
		int max = 1000000;
		List<String> values = new ArrayList<>(max);
		for (int i = 0; i < max; i++) {
			UUID uuid = UUID.randomUUID();
			values.add(uuid.toString());
		}
//		Now we measure the time it takes to sort a stream of this collection.
		// Sequential Sort
	/*	long t0 = System.nanoTime();
		long count = values.stream().sorted().count();
		System.out.println(count);
		long t1 = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("sequential sort took: %d ms", millis));
		*/
		
		//Parallel Sort
		long t0 = System.nanoTime();
		long count = values.parallelStream().sorted().count();
		System.out.println(count);
		long t1 = System.nanoTime();
		long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
		System.out.println(String.format("parallel sort took: %d ms", millis));
	}

	private static void reduceOperation() {
		List<String> stringCollection = getStringCollection();
		Optional<String> reduce = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);
		reduce.ifPresent(System.out::println);
	}

	private static void CountAndMatchDemo() {
		List<String> stringCollection = getStringCollection();
		stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a))
				.forEach(System.out::println);
		boolean allStartsWithA = stringCollection.stream().allMatch((s) -> s.startsWith("a"));

		System.out.println(allStartsWithA); // false

		boolean noneStartsWithZ = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));

		long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();

		System.out.println(noneStartsWithZ); // true
		boolean anyStartsWithA = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
		boolean x = stringCollection.stream().allMatch(e -> e.startsWith("bb"));

		long countLen = stringCollection.stream().filter(e -> e.startsWith("a")).count();
		System.out.println(countLen);
		System.out.println(anyStartsWithA + "   " + x);
	}

	private static void StreamsDemo() {
		List<String> stringCollection = getStringCollection();

		stringCollection.stream().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		stringCollection.stream().sorted().filter((s) -> s.startsWith("a")).forEach(System.out::println);
		stringCollection.stream().sorted().map(e -> e + ", ").forEach(System.out::print);
		System.out.println();
		stringCollection.stream().map(e -> e + ", ").forEach(System.out::print);
		System.out.println();
		stringCollection.stream().map(String::toUpperCase).map(e -> e + ", ").forEach(System.out::print);
		System.out.println();
		stringCollection.stream().map(String::toUpperCase).sorted((a, b) -> b.compareTo(a)).map(e -> e + ", ")
				.forEach(System.out::print);
		System.out.println();
	}

	private static void OptionalDemo() {
		Optional<String> optional = Optional.of("bam");

		System.out.println(optional.isPresent()); // true
		System.out.println(optional.get()); // "bam"
		System.out.println(optional.orElse("fallback"));
		optional.orElse("fallback"); // "bam"

		optional.ifPresent((s) -> System.out.println(s.charAt(0)));

	}

	private static void ComparatorDemo() {
		Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

		Person p1 = new Person("John", "Doe");
		Person p2 = new Person("Alice", "Wonderland");

		System.out.println(comparator.compare(p1, p2)); // > 0
		System.out.println(comparator.reversed().compare(p1, p2)); // < 0
	}

	private static void ConsumerDemo() {
		Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
		greeter.accept(new Person("Luke", "Skywalker"));

	}

	private static void SuppliersDemo() {
		Supplier<Person> personSupplier = Person::new;
		personSupplier.get();
	}

	private static void FunctionsDemo() {
		Function<String, Integer> toInteger = Integer::valueOf;
		Function<String, String> backToString = toInteger.andThen(String::valueOf);

		System.out.println(backToString.apply("123") instanceof String);

	}

	private static void PredicatesDemo() {
		Predicate<String> isLenghtGT10 = (e) -> e.length() > 10;
		BiPredicate<String, String> isBothSame = (e, j) -> e.equals(j);
		System.out.println(isLenghtGT10.test("sagar varade"));
		System.out.println(isBothSame.test("sagar", "sagarv") + "   ");
		names.stream().filter(isLenghtGT10).forEach(System.out::println);

		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;

		Predicate<String> isEmpty = String::isEmpty;

		Predicate<String> isNotEmpty = isEmpty.negate();
		// Predicate : And Or and negate

		Predicate<Integer> gtTen = e -> e > 10;
		Predicate<Integer> gtTwenty = e -> e > 20;
		Predicate<Integer> lsFifty = e -> e < 50;

		List<Integer> numberString = List.of(1, 3, 22, 45, 57, 90);
		numberString.stream().filter(gtTen).filter(lsFifty.or(gtTwenty)).forEach(System.out::println);
		List<Integer> listOne = numberString.stream().filter(gtTen).filter(lsFifty.or(gtTwenty))
				.collect(Collectors.toList());
		System.out.println(listOne);

	}

	private static void extracted() {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});

		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});

		Collections.sort(names, (a, b) -> b.compareTo(a));

		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		System.out.println(converter.convert("12") instanceof Integer);
		Integer num = converter.convert("12");

		Converter<String, Integer> converter2 = Integer::valueOf; // Using method reference
		Consumer<String> printToString = System.out::println;
		printToString.accept("Printed by consumer");

		Supplier<String> x = () -> "100";
		System.out.println(x.get() + " ,value by supplieer ");

		int x1 = 10;
		final int y1 = 20;
		Function<Integer, Integer> sum = (a) -> {
			return (a * a) + y1;
		};
		System.out.println(sum.apply(10));

		Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
		stringConverter.convert(2);

		Converter<Integer, String> stringConverter2 = (from) -> String.valueOf(from + num);

	}
}

class Lambda4 {
	static int outerStaticNum;
	int outerNum;

	void testScopes() {
		Converter<Integer, String> stringConverter1 = (from) -> {
			outerNum = 23;
			return String.valueOf(from);
		};

		Converter<Integer, String> stringConverter2 = (from) -> {
			outerStaticNum = 72;
			return String.valueOf(from);
		};
	}
}
