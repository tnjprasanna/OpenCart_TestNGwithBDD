package RASelenium.TestPro2;

import java.util.Arrays;

public class BinarySearchExample {
	
	 // Iterative binary search implementation
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate middle index

            if (arr[mid] == target) {
                return mid; // Target found, return its index
            } else if (arr[mid] < target) {
                low = mid + 1; // Target is in the right half
            } else {
                high = mid - 1; // Target is in the left half
            }
        }
        return -1; // Target not found
    }

    // Recursive binary search implementation
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Base case: target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search right half
        } else {
            return binarySearchRecursive(arr, target, mid - 1, low); // Search left half
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] numbers = {4, 2, 8, 1, 7, 5, 3, 6};
	     int target = 5;
	     
	     // 1. Sort the array (Binary Search requires a sorted array)
	     Arrays.sort(numbers);
	     System.out.println("Sorted array: " + Arrays.toString(numbers));
	     
	     // 2. Perform iterative binary search
	    int iterativeResult = binarySearchIterative(numbers, target);
	    if (iterativeResult != -1) {
	    	System.out.println("Iterative search: " + target + " found at index " + iterativeResult);
	    } else {
	    	System.out.println("Iterative search: " + target + " not found.");
	    }

	    // 3. Perform recursive binary search
	    int recursiveResult = binarySearchRecursive(numbers, target, 0, numbers.length - 1);
	    if (recursiveResult != -1) {
	    	System.out.println("Recursive search: " + target + " found at index " + recursiveResult);
	    } else {
	    	System.out.println("Recursive search: " + target + " not found.");
	    }
	    
	    // Using Java's built-in binary search
        int builtInResult = Arrays.binarySearch(numbers, target);
        if (builtInResult >= 0) { // Arrays.binarySearch returns a non-negative index if found
            System.out.println("Built-in binary search: " + target + " found at index " + builtInResult);
        } else {
            System.out.println("Built-in binary search: " + target + " not found.");
        }
        
	}
}
