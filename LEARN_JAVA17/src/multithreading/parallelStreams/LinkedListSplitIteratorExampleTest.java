package multithreading.parallelStreams;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.RepeatedTest;

import multithreading.util.DataSet;

class LinkedListSplitIteratorExampleTest {
	LinkedListSplitIteratorExample spl=new LinkedListSplitIteratorExample();
	
	//@Test
	@RepeatedTest(3)
	void testMultiplyEachValue() {
		int size=1000000;
		LinkedList<Integer> generateArrayList = DataSet.generateIntegerLinkedList(size);
		List<Integer> resultList = spl.multiplyEachValue(generateArrayList, 2,true);
		assertEquals(size,resultList.size());
	}

}
