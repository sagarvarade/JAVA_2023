package Problems;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Problems.Entities.Asset;
import Problems.Entities.Asset.AssetType;
import Problems.Entities.Heavy;
import Problems.Entities.HolderNaive;
import Problems.Entities.Person;

record Employee(int num, String name, double salr) {
}

record Person2(String name, int num) {
}

public class VenkaSub17 {
	private final static Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0),
			new Employee(2, "Bill Gates", 200000.0), new Employee(3, "Mark Zuckerberg", 300000.0) };

	private final static List<String> citys = new ArrayList<String>(Arrays.asList("Mumbai", "Pune", "Delhi"));

	final static List<BigDecimal> prices = Arrays.asList(new BigDecimal("10"), new BigDecimal("30"),
			new BigDecimal("17"), new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
			new BigDecimal("45"), new BigDecimal("12"));
	final static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

	final static List<Person> people = Arrays.asList(new Person("John", 20), new Person("Sara", 21),
			new Person("Jane", 21), new Person("Greg", 35));

	final List<Person2> people2 = Arrays.asList(new Person2("John", 20), new Person2("Sara", 21),
			new Person2("Jane", 21), new Person2("Greg", 35));

	final static List<Integer> intList = Arrays.asList(10, 30, 24, 143, 2032, 2);

	public static void main(String[] args) {
		// chapterZero();
		// calculateDiscount();
		// chapterTwo();
		// chapterThree();
		// chapterFour();
		// chapterFive();

		chapterSevenRecursion();

	}

	private static void chapterSevenRecursion() {
		System.out.println(factorialRec(5));

		List<StringBuilder> str = Arrays.asList(new StringBuilder("sagar"), new StringBuilder("varade"));

		List<String> str2 = Arrays.asList("sagar", "varade");
		StringBuilder str3 = new StringBuilder(str2.get(0));

		str2.stream().map(e -> new StringBuilder(e).reverse()).collect(Collectors.toList());

		Function<String, StringBuilder> toStb = e -> new StringBuilder(e);

		str2.stream().map(e -> toStb.apply(e).reverse()).collect(Collectors.toList());

		System.out.println(str.stream().map(e -> e.reverse()).collect(Collectors.toList()));

		System.out.println(intList.stream().reduce(0, Math::max));

	}

	/*
	 * public static TailCall<Integer> factorialTailRec(final int factorial, final
	 * int number) { if (number == 1) return done(factorial); else return call(() ->
	 * factorialTailRec(factorial * number, number - 1)); }
	 */
	public static int factorialRec(final int number) {
		if (number == 1)
			return number;
		else
			return number * factorialRec(number - 1);
	}

	private static void chapterZero() {
		// CitiesTo upper case

		citys.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.print(e + "\t"));
		System.out.println();
		friends.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.print(name + " "));
		System.out.println();
		friends.stream().map(name -> name.length()).forEach(name -> System.out.print(name + " "));

		// Reusing lambda expression
		final long countFriendsStartN = friends.stream().filter(name -> name.startsWith("N")).count();

		final Predicate<String> startsWithN = name -> name.startsWith("N");

		long nCount = friends.stream().filter(startsWithN).count();

		Function<String, Predicate<String>> startsWithLetter = (
				String letter) -> (String name) -> name.startsWith(letter);
		Function<String, Predicate<String>> startsWithLetterFunct = letter -> name -> name.startsWith(letter);

		long cnt = friends.stream().filter(startsWithLetterFunct.apply("N")).count();
		final long countFriendsStartB = friends.stream().filter(startsWithLetter.apply("B")).count();

		final Optional<String> foundName = friends.stream().filter(name -> name.startsWith("S")).findFirst();
		System.out.println(String.format("A name starting with %s: %s", "S", foundName.orElse("No name found")));

		System.out.println(friends.stream().mapToInt(e -> e.length()).sum() + "  Count ");

		final Optional<String> aLongName = friends.stream()
				.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));

		final String steveOrLonger = friends.stream().reduce("Steve",
				(name1, name2) -> name1.length() >= name2.length() ? name1 : name2);

		System.out.println(String.join("-", friends));

		List<String> collect = friends.stream().map(String::toUpperCase).map(e -> String.join(e, ":"))
				.collect(Collectors.toList());

		System.out.println(collect);

	}

	private static void chapterFive() {
		final HolderNaive holder = new HolderNaive();
		System.out.println("deferring heavy creation...");
		System.out.println(holder.getHeavy());
		System.out.println(holder.getHeavy());
		System.out.println("\n \n");
		Supplier<Heavy> supplier = () -> new Heavy();
		System.out.println(" Not used");
		supplier.get();

		Supplier<Heavy> supplier2 = Heavy::new;

		List<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe", "Mike", "Susan", "George", "Robert",
				"Julia", "Parker", "Benson");
		final String firstNameWith3Letters = names.stream().filter(name -> name.length() == 3)
				.map(name -> name.toUpperCase()).findFirst().get();
		System.out.println(firstNameWith3Letters + " terminal operations ");
		names.stream().filter(name -> name.length() == 3).map(VenkaSub17::toUpperCase).findFirst();
		System.out.println("===========");
		names.stream().map(VenkaSub17::toUpperCase).filter(name -> name.length() == 4).findAny();

		Stream<String> namesWith3Letters = names.stream().filter(name -> name.length() == 3)
				.map(name -> name.toUpperCase());
		System.out.println("Stream created, filtered, mapped...");
		System.out.println("ready to call findFirst...");
		final String firstNameWith3Letters2 = namesWith3Letters.findFirst().get();
		System.out.println(firstNameWith3Letters);

		System.out.println("10 primes from 1: " + Primes.primes(1, 10));
		System.out.println("5 primes from 100: " + Primes.primes(100, 5));

	}

	private static void chapterFour() {
		final List<Asset> assets = Arrays.asList(new Asset(Asset.AssetType.BOND, 1000),
				new Asset(Asset.AssetType.BOND, 2000), new Asset(Asset.AssetType.STOCK, 3000),
				new Asset(Asset.AssetType.STOCK, 4000));
		System.out.println(" .. " + totalAssetValues(assets));
		Predicate<Asset> assetBond = e -> e.getType() == AssetType.BOND;
		System.out.println("Total of all assets: " + totalAssetValues(assets, asset -> true)); // Run for all assets
		System.out.println("Total of stocks: " + totalAssetValues(assets, asset -> asset.getType() == AssetType.STOCK));
		System.out.println(totalAssetValues(assets, assetBond));
	}

	public static int totalAssetValues(final List<Asset> assets) {
		return assets.stream().mapToInt(Asset::getValue).sum();
	}

	public static int totalBondValues(final List<Asset> assets) {
		return assets.stream().mapToInt(asset -> asset.getType() == AssetType.BOND ? asset.getValue() : 0).sum();
	}

	// A better way for above two functions
	public static int totalAssetValues(final List<Asset> assets, final Predicate<Asset> assetSelector) {
		return assets.stream().filter(assetSelector).mapToInt(Asset::getValue).sum();
	}

	// Strings, Comparators, and Filters
	private static void chapterThree() {
		final String str = "Aaw00t";
		str.chars().forEach(ch -> System.out.println(ch));
		str.chars().forEach(VenkaSub17::printChar);
		System.out.println();
		str.chars().mapToObj(ch -> Character.valueOf((char) ch)).forEach(VenkaSub17::printChar);
		// print if it is a digit
		str.chars().filter(ch -> Character.isDigit(ch)).forEach(ch -> printChar(ch));
		str.chars().filter(Character::isDigit).forEach(VenkaSub17::printChar);
		List<Person> ascendingAge = people.stream().sorted((person1, person2) -> person1.ageDifference(person2))
				.collect(Collectors.toList());
		System.out.println("Sorted in ascending order by age: " + ascendingAge);
		printPeople("Sorted in ascending order by age: ", ascendingAge);
		List<Person> ascendingAge2 = people.stream().sorted(Person::ageDifference).collect(Collectors.toList());

		Comparator<Person> compareAscending = (person1, person2) -> person1.ageDifference(person2);
		Comparator<Person> compareDescending = compareAscending.reversed();

		printPeople("Sorted in ascending order by age: ",
				people.stream().sorted(compareAscending).collect(Collectors.toList()));
		printPeople("Sorted in descending order by age: ",
				people.stream().sorted(compareDescending).collect(Collectors.toList()));
		printPeople("Sorted in ascending order by name: ",
				people.stream().sorted((person1, person2) -> person1.getName().compareTo(person2.getName()))
						.collect(Collectors.toList()));

		people.stream().min(Person::ageDifference).ifPresent(youngest -> System.out.println("Youngest: " + youngest));
		people.stream().max(Person::ageDifference).ifPresent(eldest -> System.out.println("Eldest:   " + eldest));

		final Function<Person, String> byName = person -> person.getName();
		people.stream().sorted(Comparator.comparing(byName));
		final Function<Person, Integer> byAge = person -> person.getAge();
		final Function<Person, String> byTheirName = person -> person.getName();
		printPeople("Sorted in ascending order by age and name: ", people.stream()
				.sorted(Comparator.comparing(byAge).thenComparing(byTheirName)).collect(Collectors.toList()));
		List<Person> olderThan20 = new ArrayList<>();
		people.stream().filter(person -> person.getAge() > 20).forEach(person -> olderThan20.add(person));
		System.out.println("People older than 20: " + olderThan20);

		List<Person> olderThan220 = people.stream().filter(person -> person.getAge() > 20).collect(ArrayList::new,
				ArrayList::add, ArrayList::addAll);
		System.out.println("People older than 20: " + olderThan220);

		List<Person> olderThan202 = people.stream().filter(person -> person.getAge() > 20).collect(Collectors.toList());
		System.out.println("People older than 20: " + olderThan202);

		Map<Integer, List<Person>> peopleByAge = people.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println("Grouped by age: " + peopleByAge);
		Map<Integer, List<String>> nameOfPeopleByAge = people.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println("People grouped by age: " + nameOfPeopleByAge);

		Comparator<Person> byAge2 = Comparator.comparing(Person::getAge);
		Map<Character, Optional<Person>> oldestPersonOfEachLetter = people.stream().collect(Collectors
				.groupingBy(person -> person.getName().charAt(0), Collectors.reducing(BinaryOperator.maxBy(byAge2))));
		System.out.println("Oldest person of each letter:");
		System.out.println(oldestPersonOfEachLetter);
	}

	public static void betterWay() {
		List<File> files = Stream.of(new File(".").listFiles())
				.flatMap(file -> file.listFiles() == null ? Stream.of(file) : Stream.of(file.listFiles()))
				.collect(Collectors.toList());
		System.out.println("Count: " + files.size());
	}

	public static void printPeople(final String message, final List<Person> people) {
		System.out.println(message);
		people.forEach(System.out::println);
	}

	private static void chapterTwo() {
		System.out.println("1 pune - " + citys.contains("pune"));
		System.out.println("2 Pune - " + citys.contains("Pune"));
		friends.forEach(new Consumer<String>() {
			public void accept(final String name) {
				System.out.println(name);
			}
		});
		friends.forEach((final String name) -> System.out.println(name));
		friends.forEach(name -> System.out.println(name));
		friends.forEach(System.out::println); // Method reference

		final List<String> uppercaseNames = new ArrayList<String>();
		for (String name : friends) {
			uppercaseNames.add(name.toUpperCase());
		}
		final List<String> uppercaseNames2 = new ArrayList<String>();
		friends.forEach(name -> uppercaseNames2.add(name.toUpperCase()));
		// System.out.println(uppercaseNames2);

		friends.stream().map(e -> e.toUpperCase()).forEach(System.out::print);
		friends.stream().map(e -> e.length()).forEach(System.out::print);
		friends.stream().map(String::length).forEach(VenkaSub17::printMe);
		friends.stream().map(String::length).forEach(VenkaSub17::printMe);

		List<String> uppercaseNames3 = friends.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		friends.stream().filter(e -> e.startsWith("B")).forEach(VenkaSub17::printMe);

		friends.stream().filter(e -> e.startsWith("B")).collect(Collectors.toList());

		// Reusing Predicate
		final Predicate<String> startsWithN = name -> name.startsWith("N");
		final long countFriendsStartN = friends.stream().filter(startsWithN).count();

		final Predicate<String> startsWithN2 = name -> name.startsWith("N");
		final Predicate<String> startsWithB2 = name -> name.startsWith("B");
		final long countFriendsStartN2 = friends.stream().filter(startsWithN).count();

		final long countFriendsStartN3 = friends.stream().filter(checkIfStartsWith("N")).count();

		final Function<String, Predicate<String>> startsWithLetter = (
				String letter) -> (String name) -> name.startsWith(letter);
		final Function<String, Predicate<String>> startsWithLetter2 = letter -> name -> name.startsWith(letter);

		final long countFriendsStartN4 = friends.stream().filter(startsWithLetter2.apply("N")).count();

		// Pick only one elemement from list
		// pickName
		// pickName2
		System.out.println(
				"Total number of characters in all names: " + friends.stream().mapToInt(name -> name.length()).sum());

		final Optional<String> aLongName = friends.stream()
				.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));
		final String steveOrLonger = friends.stream().reduce("Steve",
				(name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		System.out.println(String.join(":", friends));

		System.out.println(friends.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));
	}

	public static void pickName(final List<String> names, final String startingLetter) {
		String foundName = null;
		for (String name : names) {
			if (name.startsWith(startingLetter)) {
				foundName = name;
				break;
			}
		}
		System.out.print(String.format("A name starting with %s: ", startingLetter));
		if (foundName != null) {
			System.out.println(foundName);
		} else {
			System.out.println("No name found");
		}
	}

	public static void pickName2(final List<String> names, final String startingLetter) {
		final Optional<String> foundName = names.stream().filter(name -> name.startsWith(startingLetter)).findFirst();
		foundName.ifPresent(name -> System.out.println("Hello " + name));

		System.out.println(
				String.format("A name starting with %s: %s", startingLetter, foundName.orElse("No name found")));
	}

	public static Predicate<String> checkIfStartsWith(final String letter) {
		return name -> name.startsWith(letter);
	}

	final Function<String, Predicate<String>> startsWithLetter = (String letter) -> {
		Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
		return checkStarts;
	};

	private static void calculateDiscount() {
		BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
		for (BigDecimal price : prices) {
			if (price.compareTo(BigDecimal.valueOf(20)) > 0)
				totalOfDiscountedPrices = totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
		}
		System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
		// Lambda for above Code
		final BigDecimal totalOfDiscountedPrices2 = prices.stream()
				.filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
				.map(price -> price.multiply(BigDecimal.valueOf(0.9))).reduce(BigDecimal.ZERO, BigDecimal::add);

		BigDecimal reduce = prices.stream().filter(e -> e.compareTo(BigDecimal.valueOf(10)) > 0)
				.map(p -> p.multiply(BigDecimal.valueOf(0.9))).reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println("Total of discounted prices: " + totalOfDiscountedPrices2);
		System.out.println("Total of discounted prices: " + reduce);
	}

	public static void printMe(String s) {
		System.out.print("\t " + s);
	}

	public static void printMe(Integer s) {
		System.out.print("\t " + s);
	}

	private static void printChar(int aChar) {
		System.out.print("\t " + (char) (aChar));
	}

	private static String toUpperCase(String string1) {
		System.out.println("called " + string1);
		return string1.toUpperCase();
	}
}
