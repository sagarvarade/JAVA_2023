package com_old_package.corejava.Basics;

class RunTime extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Extends runTime exception for run time 
	public RunTime() {
		super("RunTime Exception");
	}
}

class CompileTime extends Exception{
	/** If extends exception then it is compile time exception need to handle at compile time
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CompileTime() {
		super("CompileTime Exception");
	}
}


public class ExceptionTest {

	public static void main(String[] args){
		//throw new RunTime();
		//throw new CompileTime();
		
		//ExceptionTest.TestCompileTime(); Need to handle this at compile time 
	}
	public static void TestCompileTime() throws CompileTime {
		throw new CompileTime();
	}
}
