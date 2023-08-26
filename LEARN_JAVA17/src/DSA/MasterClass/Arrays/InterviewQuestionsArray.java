package DSA.MasterClass.Arrays;

import java.util.Arrays;

public class InterviewQuestionsArray {
	public static void main(String[] args) {
		InterviewQuestionsArray mn = new InterviewQuestionsArray();
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
		mn.linearSearch(intArray, 7);

		boolean result = mn.isUnique(intArray);
		System.out.println(result);

		int[] intArray2 = { 10, 60, 30, 40, 50 };
		String pairs = mn.maxProduct(intArray2);
		System.out.println(pairs);

		int intArray3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51,
				52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 74, 75, 76, 77, 78, 79,
				80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 };

		mn.missingNumber(intArray3);

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 4, 3, 2, 1, 0 };
		boolean result2 = mn.permutation(array1, array2);
		System.out.println(result2);

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		mn.rotateMatrix(matrix);
		System.out.println(Arrays.deepToString(matrix));

		int[] intArray4 = { 2, 7, 13, 15 };
		int[] result3 = mn.twoSum(intArray4, 20);
		System.out.println(Arrays.toString(result3));
	}

	public void linearSearch(int[] intArray, int value) {
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] == value) {
				System.out.println("Value is found at the index of " + i);
				return;
			}
		}
		System.out.println(value + " is not found");
	}

	// Is Unique
	public boolean isUnique(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j]) {
					return false;
				}
			}
		}
		return true;
	}

	// Max Product
	public String maxProduct(int[] intArray) {
		int maxProduct = 0;
		String pairs = "";
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] * intArray[j] > maxProduct) {
					maxProduct = intArray[i] * intArray[j];
					pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
				}
			}
		}
		return pairs;
	}

	public void missingNumber(int[] intArray) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i : intArray) {
			sum1 += i;
		}
		sum2 = 100 * (100 + 1) / 2;
		int difference = sum2 - sum1;
		System.out.println("Missing Number is " + difference);

	}

	// Permutation
	public boolean permutation(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		int sum1 = 0;
		int sum2 = 0;
		int mul1 = 1;
		int mul2 = 1;

		for (int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
			sum2 += array2[i];
			mul1 *= array1[i];
			mul2 *= array2[i];
		}
		if (sum1 == sum2 && mul1 == mul2) {
			return true;
		}
		return false;
	}

	public boolean rotateMatrix(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length)
			return false;
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
		return true;
	}
	
	// Two Sum
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No solution found");
	}
}
