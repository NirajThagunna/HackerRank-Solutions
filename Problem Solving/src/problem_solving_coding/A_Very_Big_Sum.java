package problem_solving_coding;

import basicIO.UserIO;
import basicIO.ArrayIO;

import java.io.PrintWriter;
import java.io.StringWriter;

// A Very Big Sum
// In this challenge, you are required to calculate and print the sum of the elements
// in an array, keeping in mind that some of those integers may be quite large.
public class A_Very_Big_Sum {

	// Finding the sum of all the elements of an array
	public static long sumOfArray(long []arr, int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// Driver/main method
	public static void main(String[] args) {
		int MAX;
		try {
			System.out.print("How many elements do you want to store? ");
			MAX = UserIO.readInt();

			long []arr = ArrayIO.read_long_array(MAX);

			// Original Array
			System.out.println("Original Array : ");
			ArrayIO.print_long_array(arr);

			// Sum of an array
			long result = sumOfArray(arr, MAX);
			System.out.println("Sum of elements of an array is : " + result);
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n " + error);
		}
	}
}
