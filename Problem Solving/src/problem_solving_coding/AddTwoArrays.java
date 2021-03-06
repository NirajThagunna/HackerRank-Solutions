package problem_solving_coding;

import basicIO.UserIO;
import basicIO.ArrayIO;

import java.io.PrintWriter;
import java.io.StringWriter;

public class AddTwoArrays {
	public static int[] sumOfTwoArrays(int []numArrayA, int []numArrayB, int N) {
		int []tempArray = new int[N];
		for (int i = 0; i < N; i++) {
			tempArray[i] = numArrayA[i] + numArrayB[i];
		}
		return tempArray;
	}

	public static void main(String[] args) {
		int MAX;
		try {
			System.out.print("How many elements do you want to store? ");
			MAX = UserIO.readInt();

			System.out.println("Enter the elements of first array : ");
			int []numArrayA = ArrayIO.read_array(MAX);
			System.out.println("Enter the elements of second array : ");
			int []numArrayB = ArrayIO.read_array(MAX);

			// Printing two arrays
			System.out.println("First Array : ");
			ArrayIO.print_array(numArrayA);

			System.out.println("Second Array : ");
			ArrayIO.print_array(numArrayB);

			// Adding two arrays
			int []sumArray = sumOfTwoArrays(numArrayA, numArrayB, MAX);

			// Array after addition
			System.out.println("sumArray is : ");
			ArrayIO.print_array(sumArray);
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}
