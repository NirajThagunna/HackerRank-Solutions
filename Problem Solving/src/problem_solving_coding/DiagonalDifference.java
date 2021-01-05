package problem_solving_coding;

import java.io.PrintWriter;
import java.io.StringWriter;

import basicIO.UserIO;

// Given a square matrix, calculate the absolute difference between the sums of its diagonals.
public class DiagonalDifference {
	// Reading a 2-D array
	public static int[][] readArray(int m, int n) {
		int[][] temp = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr[" + i + "]" + "[" + j + "]" + " : ");
				temp[i][j] = UserIO.readInt();
			}
		}
		return temp;
	}
	
	// Printing 2-D Array
	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	// digonalDifference method
	public static int digonalDifference(int[][] arr) {
		int principalDigonal = 0, secondaryDiagonal = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// Condition for principal diagonal
				// row-column condition : row == column
				if (i == j) {
					principalDigonal += arr[i][j];
				}
				
				// Condition for secondary diagonal : row == (no. of rows - column - 1)
				// row-column condition : (row + column) == (no. of rows - 1)
				// Here, no. of rows = arr.length
				if ((i + j) == (arr.length - 1)) {
					secondaryDiagonal += arr[i][j];
				}
			}
		}
		return (Math.abs(principalDigonal - secondaryDiagonal));
	}
	
	public static void main(String[] args) {
		int m, n;
		try {
			System.out.print("Enter the number of rows : ");
			m = UserIO.readInt();
			
			System.out.print("Enter the number of columns : ");
			n = UserIO.readInt();
			
			int[][] arr = readArray(m, n);
			
			System.out.println("\nThe 2-D array is : ");
			printArray(arr);
			
			int result = digonalDifference(arr);
			System.out.println("\nThe Digonal Difference of a matrix is : " + result);
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
