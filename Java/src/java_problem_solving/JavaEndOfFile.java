package java_problem_solving;

import java.util.Scanner;

// The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
// Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String
// For each line, print the line number, followed by a single space, and then the line content received as input.
public class JavaEndOfFile {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			int count = 0;
			while (scan.hasNext()) {
				String str = scan.nextLine();
				count++;
				System.out.println(count + " " + str);
			}
			scan.close();
		}
		catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
	}
}
