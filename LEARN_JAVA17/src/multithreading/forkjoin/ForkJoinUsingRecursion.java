package multithreading.forkjoin;

import static multithreading.util.CommonUtil.delay;
import static multithreading.util.CommonUtil.stopWatch;
import static multithreading.util.LoggerUtil.log;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

import multithreading.util.DataSet;

public class ForkJoinUsingRecursion extends RecursiveTask<List<String>>{
	
	private List<String> inputList;
	
	public ForkJoinUsingRecursion(List<String> inputList) {
		this.inputList=inputList;
	}
	
	public static void main(String[] args) {

        stopWatch.start();
        List<String> resultList = new ArrayList<>();
        List<String> names = DataSet.namesList();
        log("names : "+ names);

        ForkJoinPool forkJoinPool=new ForkJoinPool();
        ForkJoinUsingRecursion forkJoinUsingRecursion=new ForkJoinUsingRecursion(names);
        List<String> result=forkJoinPool.invoke(forkJoinUsingRecursion);
       
        System.out.println(result);
        stopWatch.stop();
        log("Final Result : "+ resultList);
        log("Total Time Taken : "+ stopWatch.getTime());
    }


    private static String addNameLengthTransform(String name) {
        delay(500);
        return name.length()+" - "+name ;
    }


	@Override
	protected List<String> compute() {
		if(inputList.size()<=1) {
			List<String> resultList=new ArrayList<>();
			inputList.forEach(name->resultList.add(addNameLengthTransform(name)));
			return resultList;
		}
		int midPoint=inputList.size()/2;
		ForkJoinTask<List<String>> leftInputString = new ForkJoinUsingRecursion(inputList.subList(0, midPoint)).fork();
		inputList=inputList.subList(midPoint, inputList.size());
		List<String> rightResult=compute();
		List<String> leftResult=leftInputString.join();
		leftResult.addAll(rightResult);
		return leftResult;
	}
}
