package problem_solving_coding;

import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Creating data for alice
		System.out.println("Enter alice data : ");
		int a0 = scan.nextInt();
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();

		// Creating data for bob
		System.out.println("Enter bob's data : ");
		int b0 = scan.nextInt();
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();

		int alicePoint = ((a0 > b0) ? 1 : 0) + ((a1 > b1) ? 1 : 0) + ((a2 > b2) ? 1 : 0);
		int bobPoint = ((a0 < b0) ? 1 : 0) + ((a1 < b1) ? 1 : 0) + ((a2 < b2) ? 1 : 0);

		System.out.println("Alice and bob's points : ");
		System.out.println(alicePoint + " " + bobPoint);
	}
}
