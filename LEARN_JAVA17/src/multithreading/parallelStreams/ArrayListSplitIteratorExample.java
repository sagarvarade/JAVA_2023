package multithreading.parallelStreams;

import static multithreading.util.CommonUtil.stopWatch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListSplitIteratorExample {
	public List<Integer> multiplyEachValue(ArrayList<Integer> inputList, int multiplyValue, boolean isParallel) {
		stopWatch.start();

		Stream<Integer> integerStream = inputList.stream();
		if (isParallel)
			integerStream = inputList.parallelStream();

		List<Integer> resultList = integerStream.map(inti -> inti * multiplyValue).collect(Collectors.toList());

		stopWatch.stop();
		System.out.println(stopWatch.getTime());
		stopWatch.reset();
		return resultList;
	}

}
