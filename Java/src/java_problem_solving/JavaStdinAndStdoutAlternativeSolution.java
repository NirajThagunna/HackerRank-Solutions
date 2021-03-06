package java_problem_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

//In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the 
//instructions in the Output Format section below.

//Input Format
//There are three lines of input:
	// The first line contains an integer.
	// The second line contains a double.
	// The third line contains a String.

//Output Format
//There are three lines of output:
	// On the first line, print String: followed by the unaltered String read from stdin.
	// On the second line, print Double: followed by the unaltered double read from stdin.
	// On the third line, print Int: followed by the unaltered integer read from stdin.
public class JavaStdinAndStdoutAlternativeSolution {
	public static String readInput() {
		String str = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			str = reader.readLine();
		}
		catch (IOException ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
		return str;
	}

	public static void main(String[] args) {
		try {
			System.out.print("Enter Integer Number : ");
			int num1 = Integer.parseInt(readInput());
			System.out.print("Enter Double Number : ");
			double num2 = Double.parseDouble(readInput());
			System.out.print("Enter any String : ");
			String str = readInput();

			System.out.println("String: " + str);
			System.out.println("Double: " + num2);
			System.out.println("Int: " + num1);
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
