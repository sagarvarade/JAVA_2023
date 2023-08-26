package com.Java17.FunctionalsTest;

public class Lambda {
	public static void main(String[] args) {		
		System.out.println(CollectionObjects.getGetStringList());
		var strList=CollectionObjects.getGetStringList();
		long count = strList.stream().count();
		System.out.println("Count :"+count);
		boolean anyMatch = strList.stream().anyMatch(p->p.startsWith("aaa"));
		System.out.println("All Match : "+anyMatch);
		strList.stream().forEach(Lambda::PrintString);
		//strList.stream().forEach(String::valueOf);
		
		
		
	}
	private static void PrintString(String str) {
		System.out.println("PrintString :"+str);
	}
	
}
