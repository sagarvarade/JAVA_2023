package DSA.Code;

import java.util.Arrays;

public class GeekForGeeks {
	public static void main(String[] args) {
		waiveLike(new int[]{1,2,3,4,5});
	}

	private static void waiveLike(int[] is) {
		for(int i=0;i<=is.length-1;i+=2) {
			if(i==is.length && i%2!=0)
				break;
			else
				is[i]=is[i+1];
		
			System.out.println(Arrays.toString(is));
		}
	}
}
