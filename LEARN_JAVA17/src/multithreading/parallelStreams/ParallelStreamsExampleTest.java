package multithreading.parallelStreams;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import multithreading.util.DataSet;

class ParallelStreamsExampleTest {

	ParallelStreamsExample pls = new ParallelStreamsExample();

	@Test
	void stringTransform() {
		List<String> sList = DataSet.namesList();
		List<String> stringTransform = pls.stringTransform(sList);
		assertEquals(4, stringTransform.size());

	}

	@Test
	void stringParallelTransform() {
		List<String> sList = DataSet.namesList();
		List<String> stringTransform = pls.stringParallelTransform(sList);
		assertEquals(4, stringTransform.size());
	}
}
