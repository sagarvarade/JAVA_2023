package DSA.MasterClass.Arrays;

import java.util.Scanner;

public class SingleDimensionArray {
	int arr[] = null;

	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Successfully inserted");
			} else {
				System.out.println("This cell is already occupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array!");
		}
	}

	// Array Traversal

	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Array no longer exists!");
		}

	}

	// Search for an element in the given Array
	public void searchInArray(int valueToSearch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == valueToSearch) {
				System.out.println("Value is found at the index of " + i);
				return;
			}
		}
		System.out.println(valueToSearch + " is not found");
	}

	// Delete value from Array
	public void deleteValue(int valueToDeleteIndex) {
		try {
			arr[valueToDeleteIndex] = Integer.MIN_VALUE;
			System.out.println("The value has been deleted successfully");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The value that is provided is not in the range of array");

		}
	}

	public static void main(String[] args) {
		
		//calculateAverageTemperatur();
		//SingleDimenArrayTest();
		
	}

	private static void SingleDimenArrayTest() {
		SingleDimensionArray sdArray=new SingleDimensionArray(3);
		sdArray.insert(0, 1);
		sdArray.insert(1, 12);
		sdArray.insert(2, 32);
		sdArray.traverseArray();
		sdArray.deleteValue(1);
		sdArray.traverseArray();
		sdArray.searchInArray(32);
	}

	private static void calculateAverageTemperatur() {
		Scanner console = new Scanner(System.in);
		System.out.print("How many days' temperatures? ");
		int numDays = console.nextInt();
		int[] temps = new int[numDays];
		// record temperatures and find average
		int sum = 0;
		for (int i = 0; i < numDays; i++) {
			System.out.print("Day " + (i + 1) + "'s high temp: ");
			temps[i] = console.nextInt();
			sum += temps[i];
		}

		double average = sum / numDays;
		// count days above average
		int above = 0;
		for (int i = 0; i < temps.length; i++) {
			if (temps[i] > average) {
				above++;
			}
		}
		System.out.println();
		System.out.println("Average Temp = " + average);
		System.out.println(above + " days above average");
	}
}
