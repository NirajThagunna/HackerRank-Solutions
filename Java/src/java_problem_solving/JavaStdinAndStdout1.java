package java_problem_solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.IOException;

// In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line.
// You may use Scanner or BufferedReader class as your comfort
public class JavaStdinAndStdout1 {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter first number : ");
			String str1 = reader.readLine();
			System.out.print("Enter second number : ");
	        String str2 = reader.readLine();
	        System.out.print("Enter third number : ");
	        String str3 = reader.readLine();
	        
	        reader.close();
	        
	        int num1 = Integer.parseInt(str1);
	        int num2 = Integer.parseInt(str2);
	        int num3 = Integer.parseInt(str3);
	        
	        // Printing the values
	        System.out.println(num1);
	        System.out.println(num2);
	        System.out.println(num3);
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
