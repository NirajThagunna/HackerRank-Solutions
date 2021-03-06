package java_problem_solving;

import java.util.Scanner;

// In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the 
// instructions in the Output Format section below.

// Input Format
// There are three lines of input:
	// The first line contains an integer.
	// The second line contains a double.
	// The third line contains a String.

// Output Format
// There are three lines of output:
	// On the first line, print String: followed by the unaltered String read from stdin.
	// On the second line, print Double: followed by the unaltered double read from stdin.
	// On the third line, print Int: followed by the unaltered integer read from stdin.
public class JavaStdinAndStdout2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		// It will grab \n - new line character -1
		double num2 = scan.nextDouble();
		// It will skip first \n - new line character and add one more \n -2
		scan.nextLine();
		// Again will it take one \n and leaves only one \n
		String str = scan.nextLine();
		// Lastly it will grab that \n and take input as String
		scan.close();

		System.out.println("String: " + str);
		System.out.println("Double: " + num2);
		System.out.println("Int: " + num1); 
	}
}
