package java_problem_solving;

import java.util.Scanner;

// Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
// You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram 
// with breadth B and height H. You should read the variables from the standard input.
// if B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
public class JavaStaticInitializerBlock {
	static Scanner scan = new Scanner(System.in);
	public static int B = scan.nextInt();
	public static int H = scan.nextInt();
	public static boolean flag = true;
	
	static {
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}
}
