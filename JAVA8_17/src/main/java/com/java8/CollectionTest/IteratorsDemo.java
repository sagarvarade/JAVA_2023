package com.java8.CollectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

import com.java8.eg.Data;

public class IteratorsDemo {
	public static void main(String[] args) {
		// extracted_1();

		// ArrayListDemo();

		Map<String, String> str = new LinkedHashMap<String, String>();
		// Map<String,String> str=new HashMap<String, String>();
		str.put("3", "ZZZ");
		str.put("1", "AAA");
		str.put("2", "BBB");

		System.out.println(str);

		method_3();
	}

	private static void method_3() {

		List<String> stringList = Arrays.asList("JALIN_0200_REQ_IN", "JALIN_0200_REQ_OUT", "JALIN_0210_RESP_IN","JALIN_0210_RESP_OUT");
		
		//JALIN_0200_REQ_IN ,JALIN_0200_REQ_OUT,JALIN_0210_RESP_OUT,JALIN_0210_RESP_IN
		/*Collections.sort(stringList, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String[] parts1 = s1.split("_");
				String[] parts2 = s2.split("_");
				for (int i = 1; i < parts1.length; i++) {
					if (!parts1[i].equals(parts2[i])) {
						return parts1[i].compareTo(parts2[i]);
					}
				}
				return 0;
			}
		});
		
		*/
		
		Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Extract numeric parts from the strings
                int num1 = Integer.parseInt(s1.split("_")[1]);
                int num2 = Integer.parseInt(s2.split("_")[1]);

                // Compare numeric parts
                if (num1 != num2) {
                    return num1 - num2;
                } else {
                    // If numeric parts are equal, compare the remaining parts
                    return s1.compareTo(s2);
                }
            }
        });
		
		
		
		
		
		for (String s : stringList) {
			System.out.println(s);
		}
	}

	private static void ArrayListDemo() {
		List<String> l1 = new ArrayList<String>();
		l1.add("aaa");
		l1.add("bb");
		l1.add("cc");
		List<String> l2 = List.of("aaa", "bbbb", "cccc", "aaa");
		Map<String, Set<String>> Set = l2.stream()
				.collect(Collectors.groupingBy(w -> w.substring(0, 1), Collectors.toSet()));
		Map<Object, Long> Set2 = l2.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		Map<String, Long> countByString = l2.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		l2.stream().collect(Collectors.groupingBy(e -> e.toUpperCase(), Collectors.toUnmodifiableSet()));
		Map<Integer, List<String>> collect2 = l2.stream().collect(Collectors.groupingBy(e -> e.length()));
		System.out.println(collect2);
		System.out.println(countByString);
		System.out.println(Set);
		System.out.println(Set2);

		List<String> randomFullName = Data.getRandomFullName(10);

	//	Map<Boolean, List<String>> collectS = randomFullName.stream()
	//			.collect(Collectors.groupingBy(e -> e.startsWith("C")), to);
	//	System.out.println(collectS);

	}

	private static void extracted_1() {
		LinkedList<String> l = new LinkedList<String>();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator<String> itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("venki")) {
				itr.remove();
			}
			// l.add("ss"); //java.util.ConcurrentModificationException
		}

		Set<String> strSet = new HashSet<String>();
		strSet.add("aa");
		strSet.add("bb");
		strSet.add("cc");
		Iterator<String> setItr = strSet.iterator();
		while (setItr.hasNext()) {
			System.out.println(setItr.next());
			// strSet.add("ss"); //java.util.ConcurrentModificationException
		}

		CopyOnWriteArraySet<String> copyOnArraySet = new CopyOnWriteArraySet<String>();
		copyOnArraySet.add("aa");
		copyOnArraySet.add("bb");
		copyOnArraySet.add("cc");
		Iterator<String> copyItr = copyOnArraySet.iterator();
		while (copyItr.hasNext()) {
			System.out.println(copyItr.next());
			copyOnArraySet.add("sss");
		}
		System.out.println(copyOnArraySet.toString());
	}
}
