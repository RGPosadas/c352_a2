import java.util.Stack;

public class TestTheory {
	
	/**
	 * A simple for loop that finds multiples of "n" in the array "arr" (excludes 0 as a multiple).
	 * @param arr an array of integers
	 * @param n an integer
	 */
	public static void findMultipleLoop(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % n == 0 && arr[i] != 0)
				System.out.println("Index " + i + " with value " + arr[i]);
		}
	}

	/**
	 * A method that pushes and pops multiples of "n" to a QStack
	 * @param arr an aray of integers
	 * @param n an integer
	 */
	public static void findMultipleStack(int[] arr, int n) {
		Stack<Integer> myStack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % n == 0 && arr[i] != 0) {
				myStack.push(arr[i]);
				System.out.println("Index " + i + " with value " + myStack.pop());
			}
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int[] a = {22,61,-10,21,0,9,50,17,35,81,-46,19,5,77};
		System.out.println("======== Using a simple for loop ========");
		System.out.println("The elements of the array A that are multiples of " + n + " are: ");
		findMultipleLoop(a, n);
		
		System.out.println("\n======== Using a stack ========");
		System.out.println("The elements of the array A that are multiples of " + n + " are: ");
		Stack<Integer> myStack = new Stack<>();
		findMultipleStack(a, n);


	}
}
