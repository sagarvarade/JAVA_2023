package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LeetCodeProblems {
	public static void main(String[] args) {
		//https://leetcode.com/problems/running-sum-of-1d-array/
		//runningSome(new int[] {1,2,3,4}); runningSome(new int[] {1,1,1,1,1});
		
		//https://leetcode.com/problems/find-pivot-index
		//findPivotIndex(new int[] {1,7,3,6,5,6}); findPivotIndex(new int[] {1,2,3});findPivotIndex(new int[] {2,1,-1});
		
		//Day 2
		String st="egg";
		String ts="add";
		System.out.println(isIsomorphic(st,ts));
		
		System.out.println(isIsomorphic(st,ts));
	}
	
	public boolean isSubsequence(String s, String t) {
		//https://leetcode.com/problems/is-subsequence/submissions/
        int j=0,k=0;
        while(j<s.length() && k<t.length()){
            if(s.charAt(j)==t.charAt(k)) j++;
            k++;
        }
        return j==s.length();
    }

	private static boolean isIsomorphic(String st, String ts) {
		
		//https://leetcode.com/problems/isomorphic-strings/submissions/
		HashMap<Character, Character> stHash=new HashMap<>();
		HashMap<Character, Boolean> tsHash=new HashMap<>();
		
		for(int i=0;i<st.length();i++) {
			char c1=st.charAt(i);
			char c2=st.charAt(i);
			if(stHash.containsKey(c1)==true) {
				if(stHash.get(c1)!=c2)
					return false;
			}
			else {
				if(tsHash.containsKey(c2)==true) {
					return false;
				}
				else {
					stHash.put(c1, c2);
					tsHash.put(c2, true);
				}
			}			
		}
		return true;
	}

	private static int leftIndexSum(int[] ary,int index) {
		int sum=0;
		for(int i=0;i<index;i++) {
			sum=sum+ary[i];
		}
		return sum;
	}
	private static int rightIndexSum(int[] ary,int index) {
		int sum=0;
		for(int i=index+1;i<ary.length;i++) {
			sum=sum+ary[i];
		}
		return sum;
	}
	private static void findPivotIndex(int[] nums) {
		boolean found=false;
		for(int i=0;i<nums.length;i++) {
			int sumLeft =leftIndexSum(nums,i);
			int sumRight=rightIndexSum(nums,i);
			if(sumLeft==sumRight)
			{
				System.out.println(i+" "+sumLeft+"  "+sumRight);
				found=true;
			}
		}
		if(!found)
			System.out.println(-1);
	}

	private static void runningSome(int[] nums) {
		int [] sumAry=new int[nums.length];
		for(int i=0;i<sumAry.length;i++) {
			int x=0;
			for(int j=0;j<i+1;j++) {
				x=x+nums[j];
			}
			sumAry[i]=x;
		}
		System.out.println(Arrays.toString(sumAry));
	}
}
