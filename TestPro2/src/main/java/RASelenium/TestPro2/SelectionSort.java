package RASelenium.TestPro2;

public class SelectionSort {

	public static void main(String[] args) {
		
		int arr[] = {5,2,1,3,4};
		System.out.println("Array before sorting:");
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
		selectionSort(arr);
		System.out.println("Array after sorting:");
		
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();

	}
	
	public static void selectionSort(int[] arr) {
		
		int arrLen = arr.length;
		
		for(int i=0; i<arrLen; i++) {
			for(int j=i+1; j<arrLen; j++) {
				if(arr[i] > arr[j]) {
					int smallest = arr[j];
					arr[j] = arr[i];
					arr[i] = smallest;
				}
			}
		}
	}

}
