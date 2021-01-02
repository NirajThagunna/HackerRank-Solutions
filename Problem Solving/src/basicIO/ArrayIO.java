package basicIO;

public class ArrayIO {

	// Read an array
	public static int[] read_array(int MAX) {
		int []arr = new int[0];
		try {
			arr = new int[MAX];
			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter any number : ");
				arr[i] = UserIO.readInt();
			}
		}
		catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return arr;
	}

	// Read long array
	public static long[] read_long_array(int MAX) {
		long []arr = new long[0];
		try {
			arr = new long[MAX];
			for (int i = 0; i < MAX; i++) {
				System.out.print("Enter any number : ");
				arr[i] = UserIO.readInt();
			}
		}
		catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}
		return arr;
	}

	// Print an array
	public static void print_array(int []arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// Printing a long array
	public static void print_long_array(long []arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
