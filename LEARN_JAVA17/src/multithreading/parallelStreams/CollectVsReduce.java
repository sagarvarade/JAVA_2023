package multithreading.parallelStreams;

import static multithreading.util.LoggerUtil.log;

import java.util.List;
import java.util.stream.Collectors;

import multithreading.util.DataSet;

public class CollectVsReduce {

	public static String collect() {
		List<String> list = DataSet.namesList();

		String result = list.parallelStream().collect(Collectors.joining());

		return result;
	}

	public static String reduce() {

		List<String> list = DataSet.namesList();

		String result = list.parallelStream().reduce("", (s1, s2) -> s1 + s2);

		return result;
	}

	public static void main(String[] args) {

		log("collect : " + collect());
		log("reduce : " + reduce());
	}
}
