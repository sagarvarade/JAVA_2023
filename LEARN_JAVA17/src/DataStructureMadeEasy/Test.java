package DataStructureMadeEasy;

public class Test {

	public static void main(String[] args) {
		
		char alpha = 65;
		
		for (int i = 0; i< 40; i++) {
			for (int j=0;j<i;j++) {
				System.out.print((char)(alpha + j) + " ");
			}
			System.out.println("");
		}
		

	}

}
