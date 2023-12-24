package DurgaSoft;

public class CoreJava {

	public static void main(String[] args) {
		Arrays();
	}

	private static void Arrays() {
		String[] strArray_1=new String[10];
		String [] x={"xx","xxx","YYY1"};
		String[][] x1=new String[][]{{"xx","xxx","YYY1"},{"x"}};
		printAry(x);
		printAry(x1);
		printAry(new String[]{"18989"});
		
	}

	private static void printAry(String[] strArray_1) {
		System.out.println(" Array Class  "+strArray_1.getClass());
		for(Object x:strArray_1)
		{
			System.out.println(x);
		}
	}
	private static void printAry(String[][] strArray_1) {
		System.out.println(" Array Class  "+strArray_1.getClass());
		for(Object x:strArray_1)
		{
			System.out.println(x);
		}
	}

}
