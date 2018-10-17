

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
	
	//////////// QUEUE METHODS //////////////////
	public static void enqueue(int[] arr, int n) {
		int freeIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				freeIndex = i;
				break;
			}
			i++;
		}
		System.out.println("Putting " + n + " in index " + freeIndex);
		arr[freeIndex] = n;
	}
	
	public static int dequeue(int[] arr, int index) {
		int num = arr[index];
		arr[index] = 0;
		return num;
	}
	
	public static int[] findMultipleStack(int[] arr, int n) {
		int[] myQ = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % n == 0 && arr[i] != 0) {
				System.out.println("Sending " + arr[i] + " to enqueue");
				enqueue(myQ, arr[i]);
			}
		}
		return myQ;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] a = {22,61,-10,21,0,9,50,17,35,81,-46,19,5,77};
		System.out.println("======== Using a simple for loop ========");
		System.out.println("The elements of the array A that are multiples of " + n + "are: ");
		findMultipleLoop(a, n);
		
		System.out.println("\n======== Using a stack ========");
		int[] myStack = findMultipleStack(a,n);
		
		for (int i = 0; i < myStack.length; i++) {
			System.out.println(myStack[i]);
		}
//		int[] random = new int[5];
//		System.out.println(random[i]);
	}

}
