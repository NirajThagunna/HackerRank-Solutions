package java_problem_solving;

import java.util.Scanner;

// Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work
// with the primitives used to hold integer values (byte, short, int, and long):
public class JavaDatatypes {
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i=0;i<t;i++)
		{
			try
			{
				long x = sc.nextLong();
				System.out.println(x+" can be fitted in:");
				if(x>=-128 && x<=127)System.out.println("* byte");
				//Complete the code
				if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
					System.out.println("* short");
				}
				if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
					System.out.println("* long");
				}
			}
			catch(Exception e)
			{
				System.out.println(sc.next()+" can't be fitted anywhere.");
			}
		}
		sc.close();
	}
}
