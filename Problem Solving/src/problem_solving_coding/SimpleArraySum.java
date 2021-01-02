package problem_solving_coding;

import basicIO.UserIO;
import basicIO.ArrayIO;

// Given an array of integers, find the sum of its elements
public class SimpleArraySum {
	// Sum of all the elements of an array
	public static int simpleArraySum(int []arr) {
		int sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int MAX;
		try {
			System.out.print("How many elements do you want to store? ");
			MAX = UserIO.readInt();

			int []arr = ArrayIO.read_array(MAX);

			// Original Array
			System.out.println("Original Array : ");
			ArrayIO.print_array(arr);

			// Sum of elements in an array
			int sum = simpleArraySum(arr);
			System.out.println("Sum : " + sum);
		}
		catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
}
