package RASelenium.TestPro2;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
	
	public static void main (String args[])
	{
		int arr[] = {5, 3, 10, 18, 92};
		
		for(int i : arr)
			System.out.println(i);
		Arrays.sort(arr);
		
		System.out.println("after sorting");
		
		for(int i : arr)
			System.out.println(i);
		
		String names[] = {"be","cee","deee","a"};
		
		Arrays.sort(names);
		System.out.println("After sort method");
		for(String s: names)
			System.out.println(s);
		
		Comparator comp = new ComparatorDemo();
		Arrays.sort(names,comp);
		System.out.println();
		
		System.out.println("After compare method");
		
		for(String s: names)
			System.out.println(s);
	}
}
