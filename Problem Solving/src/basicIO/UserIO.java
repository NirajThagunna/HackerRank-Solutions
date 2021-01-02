package basicIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.PrintWriter;

public class UserIO {

	// Reading input data from console in the form of String
	public static String inputReader() {
		String str = null;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			str = reader.readLine();
		}
		catch (IOException exception) {
			StringWriter sw = new StringWriter();

			PrintWriter pw = new PrintWriter(sw);
			exception.printStackTrace(pw);

			String error = sw.toString();
			System.out.println("Error: \n " + error);
		}
		return str;
	}

	// Reading input data in the form of integer
	public static int readInt() {
		int num = 0;
		try {
			num = Integer.parseInt(inputReader());
		}
		catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return num;
	}
}
