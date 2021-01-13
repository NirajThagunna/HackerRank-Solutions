package java_problem_solving;

// You are given an integer n, you have to convert it into a string.
// Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code
// will print "Good job". Otherwise it will print "Wrong answer".
public class Java_Int_to_String {
	public static void main(String[] args) {
		int n = 100;
		String s = String.valueOf(n);
		
		if (n == Integer.parseInt(s)) {
			System.out.println("Good Job");
		}
		else {
			System.out.println("Wrong Answer");
		}
	}
}
