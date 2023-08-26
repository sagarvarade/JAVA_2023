package com.Java17.FunctionalsTest;

import java.util.List;

public class CollectionObjects {
	private static final List<String> StringList;

	static {
		StringList = List.of("aaa", "bbb", "cccccc", "sds3e", "mangw", "sdfe", "sdf");
	}

	public static List<String> getGetStringList() {
		return StringList;
	}
}
