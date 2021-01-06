package java_problem_solving;

import java.util.Scanner;

// Java Loops II : Quadratic equation
public class JavaLoopsII {
	public static void main(String[] args) {
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			int q = scan.nextInt();

			for (int i = 0; i < q; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				int n = scan.nextInt();

				int sum = a;
				for (int j = 0; j < n; j++) {
					sum += (int)(Math.pow(2, j) * b);
					System.out.print(sum + " ");
				}
				System.out.println();
			}
		}
		catch (Exception ex) {
			System.out.println("Error : \n" + ex.getMessage());
		}
	}
}
