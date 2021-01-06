package java_problem_solving;

import java.util.Scanner;

// In this challenge, we're going to use loops to help us do some simple math.
// Program to print the multiplication table
public class JavaLoopsI {
	public static void main(String[] args) {
		Scanner scan;
		int num;
		try {
			scan = new Scanner(System.in);
			System.out.print("Enter the number whose multiplication table to be print : ");
			num = scan.nextInt();

			System.out.println("Multiplication Table : ");
			for (int i = 1; i <= 10; i++) {
				int result = num * i;
				System.out.println(num + " x " + i + " = " + result);
			}
		}
		catch(Exception ex) {
			System.out.println("Error : \n" + ex.getMessage());
		}
	}
}
