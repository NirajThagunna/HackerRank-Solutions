package java_problem_solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;

// if-else conditional statements to automate decision-making processes.
// Given an integer, n , perform the following conditional actions:
	// If n is odd, print Weird
	// If n is even and in the inclusive range of 2 to 5, print not Weird
	// If n is even and in the inclusive range of 6 to 20, print Weird
	// If n is even and greater than 20, print Not Weird
public class IfElse {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter any number : ");
			String str = reader.readLine();
			reader.close();
			
			int n = Integer.parseInt(str);
			
			if (n % 2 != 0) {
	            System.out.println("Weird");
	        }
	        else if ((n % 2 == 0) && ((n >= 2) && (n <= 5))) {
	            System.out.println("Not Weird");
	        }
	        else if ((n % 2 == 0) && ((n >= 6) &&  (n <= 20))) {
	            System.out.println("Weird");
	        }
	        else if ((n % 2 == 0) && (n > 20)) {
	            System.out.println("Not Weird");
	        }
	        else {
	        	System.out.println("Not Weird");
	        }
		}
		catch (IOException ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}
