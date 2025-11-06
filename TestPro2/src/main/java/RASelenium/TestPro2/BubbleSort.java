package RASelenium.TestPro2;

public class BubbleSort {

	public static void main(String[] args) {
	
		int arr[] = {5,2,1,3,4};
		
		System.out.println("Array before sorting:");
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after sorting:");
		
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
	}
	
	public static void bubbleSort(int[] arr) {
		
		int arrLen = arr.length;
		
		for(int i=0;i < arrLen-1;i++) {	
			for(int j=0; j < arrLen - i - 1;j++) {
				
				if(arr[j] > arr[j+1]) {
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}		
	}
}
