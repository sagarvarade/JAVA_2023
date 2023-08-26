package Problems;

import java.util.Arrays;

public class HackerRankProblems {

	public static void main(String[] args) {
		multiDimensionalArray();
		
	}

	private static void multiDimensionalArray() {
		int [][] array= {{1,2,3,4,5},
						{66,277,43,25,77},
						{73,58,29,57,01},
						{89,48,97,10,83},
						{38,79,251,60,112}
						};
		
		
		// Print adjacent points
		
		for(int i=1;i<5-1;i++)
		{
			for(int j=1;j<5-1;j++)
			{
				System.out.println(array[i-1][j-1]+"\t"+array[i-1][j]+"\t"+array[i-1][j+1]);
				System.out.println(array[i][j-1]+"\t"+array[i][j]+"\t"+array[j][j+1]);
				System.out.println(array[i+1][j-1]+"\t"+array[i+1][j]+"\t"+array[i+1][j+1]);
				System.out.println("\n");
			}
			System.out.println("\n");
		}
		
		
		
	}

}
