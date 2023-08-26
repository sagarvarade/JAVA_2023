package multithreading.parallelStreams;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.RepeatedTest;

import multithreading.util.DataSet;

class ArrayListSplitIteratorExampleTest {

	ArrayListSplitIteratorExample spl=new ArrayListSplitIteratorExample();
	
	//@Test
	@RepeatedTest(5)
	void testMultiplyEachValue() {
		int size=1000000;
		ArrayList<Integer> generateArrayList = DataSet.generateArrayList(size);
		List<Integer> resultList = spl.multiplyEachValue(generateArrayList, 2,false);
		assertEquals( size,resultList.size());
	}

}
