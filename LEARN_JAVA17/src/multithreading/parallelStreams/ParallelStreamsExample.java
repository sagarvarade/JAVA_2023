package multithreading.parallelStreams;

import static multithreading.util.CommonUtil.delay;
import static multithreading.util.CommonUtil.stopWatch;
import static multithreading.util.LoggerUtil.log;
import java.util.List;
import java.util.stream.Collectors;

import multithreading.util.DataSet;

public class ParallelStreamsExample {

	public List<String> stringTransform(List<String> namesList) {
		List<String> list = namesList.stream().map(this::addNameLengthTransform).collect(Collectors.toList());
		return list;
	}

	public List<String> stringParallelTransform(List<String> namesList) {
		List<String> list = namesList.parallelStream()
				.sequential()
				.parallel()
				.map(this::addNameLengthTransform).collect(Collectors.toList());
		return list;
	}
	public List<String> stringParallelTransform(List<String> namesList,boolean isParallel) {
		List<String> list = namesList.parallelStream()
				.sequential()
				.parallel()
				.map(this::addNameLengthTransform).collect(Collectors.toList());
		return list;
	}

	public static void main(String[] args) {
		stopWatch.start();
		List<String> nameList = DataSet.namesList();
		ParallelStreamsExample prse = new ParallelStreamsExample();
		List<String> resultList = prse.stringTransform(nameList);
		log("Result list :" + resultList);

		stopWatch.stop();
		log("Time taken :" + stopWatch.getTime());

		stopWatch.reset();
		stopWatch.start();
		List<String> nameList2 = DataSet.namesList();
		ParallelStreamsExample prse2 = new ParallelStreamsExample();
		List<String> resultList2 = prse2.stringParallelTransform(nameList2);
		log("Result list :" + resultList2);

		stopWatch.stop();
		log("Time taken :" + stopWatch.getTime());
	}

	private String addNameLengthTransform(String name) {
		delay(500);
		return name.length() + " - " + name;
	}
}
