package multithreading.threading;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelThread {
	public static void main(String[] args) {
		List<String> nameList=List.of("Bob","Jamie","Jill","Rick");
		System.out.println("Name List :"+nameList);
		
		List<String> collect = nameList.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	}
}
