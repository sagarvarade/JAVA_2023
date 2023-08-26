package DSA.Code;

import java.util.Arrays;

public class FiveArrays {
	public static void main(String[] args) {
		permutationOfArray(new int []{0,2,1,5,3,4});
	}

	private static void permutationOfArray(int[] nums) {
		int[] ans=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			ans[i]=nums[nums[i]];
		}
		System.out.println(" "+Arrays.toString(ans));
	}
}
