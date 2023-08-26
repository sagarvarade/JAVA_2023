package multithreading.parallelStreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import multithreading.util.LoggerUtil;
public class ParallelStreamResultOrder {

	public static List<Integer> listOrder(List<Integer> inputList){
		return inputList.parallelStream()
				.map(i->i*2)
				.collect(Collectors.toList());
	}
	
	public static Set<Integer> setOrder(Set<Integer> inputList){
		return inputList.parallelStream()
				.map(i->i*2)
				.collect(Collectors.toSet());
	}
	
	public static void main(String[] args) {
		List<Integer> intList = List.of(1,2,3,4,5,6,7,8);
		LoggerUtil.log("In List : "+intList);
		List<Integer> listOrder = listOrder(intList);
		LoggerUtil.log("List List : "+listOrder);
		
		Set<Integer> intSet = Set.of(1,2,3,4,5,6,7,8);
		LoggerUtil.log("In Set : "+intSet);
		Set<Integer> setOrder = setOrder(intSet);
		LoggerUtil.log("Set Set	 : "+setOrder);
		
	}
}
