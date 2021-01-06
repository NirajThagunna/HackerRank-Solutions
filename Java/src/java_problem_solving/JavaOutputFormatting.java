package java_problem_solving;

import java.util.Scanner;

// Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your 
// understanding of formatting output using printf().
public class JavaOutputFormatting {
	public static void main(String[] args) {
		Scanner scan;

		try {
			scan = new Scanner(System.in);
			System.out.println("================================");
			for (int i = 0; i < 3; i++) {
				String str = scan.nextLine();
				int num = scan.nextInt();

				//Complete this line
				// %-15s = left-justified a String 
				// %3d = How many digits are present in a number i.e. if the number of
				// digits are 3 the print the same value otherwise
				// %03d = add 0 before the number if the digits in a number is less than
				// 3
				// \n = New line
				// Default all the string are aligned right i.e. right-jusitified
				System.out.printf("%-15s%03d\n", str, num);
			}
			System.out.println("================================");
		}
		catch (Exception ex) {
			System.out.println("Error : \n" + ex.getMessage());
		}
	}
}
