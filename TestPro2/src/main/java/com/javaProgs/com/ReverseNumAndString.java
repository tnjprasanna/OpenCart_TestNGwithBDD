package com.javaProgs.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReverseNumAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseNum(1234));
		System.out.println(reverseStr("prasanna"));
		System.out.println(palindromString("pop"));
		System.out.println(palindromNum(121));
		if(isPrime(9)) System.out.println("Given number is prime"); else System.out.println("given number is not a prime"); 
		if(isArmstrong(153)) System.out.println("Given number is Amstrong num"); else System.out.println("given number is not a Amstrong num");
		checkTwoArraysEqual(); 
		findMaxValinArray();
		findMinValinArray();
		findDuplicateValinArray();
		findDuplicatesUsingHashSet();
		findDuplicatesUsingHashMap();
		//findCharOccurances("PRASANNA");
		getSecondLargest();
		System.out.println(reverseEachWordInString("Welcome To Java")); 
	}
	
	public static int reverseNum(int num) {
		
		int rev = 0;
		
		while(num !=0) {
			int digit = num%10;
			rev = (rev*10) + digit;
			num /= 10;
		}
		return rev;
	}
	
	public static String reverseStr(String str) {
		
		//String s = "Prasanna";
		String temp = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			temp = temp+str.charAt(i);
		}
		return temp;
	}
	
	public static String palindromString(String str) {
		
		String temp = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			temp = temp+str.charAt(i);
		}
		if(str.equalsIgnoreCase(temp))
			System.out.print("Given string as Palindrom: ");
		else 
			System.out.print("Given string is not a palindrom: ");
		return temp;
	}
	
	public static int palindromNum(int num) {
		
		int rev = 0;
		int temp = num;
		//System.out.println( Math.sqrt(temp));
		while(num !=0) {
			int digit = num%10;
			rev = (rev*10) + digit;
			num /= 10;
		}
		if(temp == rev)
			System.out.print("Given Integer is Palindrom: ");
		else 
			System.out.print("Given Integer is not a palindrom: ");
		return rev;
	}
	
	public static boolean isPrime(int primeNum) {
		
		if(primeNum <=1)
			return false;
		if(primeNum%2 == 0)
			return false;
		if(primeNum == 2)
			return true;
		for(int i = 3; i<=Math.sqrt(primeNum); i+=2){
			if(primeNum % i == 0)
				return false;
		}
		return true;	
	}
	
	public static boolean isArmstrong(int num) {
		
        int originalNumber = num;
        int sum = 0;
        int numberOfDigits = 0;

        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of digits raised to the power of numberOfDigits
        temp = num; // Reset temp to original number
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }
        return sum == originalNumber;
    }
	
	public static void checkTwoArraysEqual() {
		 
		 int arr1[] = {1,3,4};
		 int arr2[] = {1,3,4};
		 
		 boolean res = true;
		 
		 if(arr1.length == arr2.length) {	 
			 for(int i = 0;i<arr1.length;i++) {
				 if(arr1[i] != arr2[i]) { 
					 res = false;
					 break;
				 }
			 } 
		 } else {
			 res = false;
		 }
		 
		 if(res){
		 	System.out.println("Equal");
	     } else {
	     	System.out.println("Not Equal");
	     }
	 }	 
	 
	public static void findMaxValinArray() {
		 
		 int a[] = {2,4,5};
		 int max = a[0];
		 for(int i =0;i<a.length;i++) {
			 
			 if(a[i] > max) {
				 max = a[i];
			 }
		 }
		 System.out.println(max);
	 }
	 
	public static void findMinValinArray() {
		 
		 int a[] = {2,4,5};
		 int min = a[0];
		 for(int i =0;i<a.length;i++) {
			 
			 if(a[i] < min) {
				 min = a[i];
			 }
		 }
		 System.out.println(min);
	 }
	
	public static void findDuplicateValinArray() {
		
		 int arr[] = {2,4,5,2};
		 System.out.println("Duplicate elements (Brute Force):");
	     for (int i = 0; i < arr.length; i++) {
	     	 for (int j = i + 1; j < arr.length; j++) {
	     	 	 if (arr[i] == arr[j]) {
	     	 	 	 System.out.println(arr[i]);
	             }
	         }
	     }	
	}
	
	public static void findDuplicatesUsingHashSet() {
		int arr[] = {2,4,5,2,2};
        Set<Integer> uniqueElements = new HashSet<>();
        System.out.println("Duplicate elements (HashSet):");
        for (int element : arr) {
            if (!uniqueElements.add(element)) { // If add returns false, element is a duplicate
                System.out.println(element);
            }
        }
    }
	
	public static void findDuplicatesUsingHashMap() {
		
		int arr[] = {2,4,5,2};
        Map<Integer, Integer> elementCounts = new HashMap<>();
        System.out.println("Duplicate elements (HashMap):");
        for (int element : arr) {
            elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : elementCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
	
	public static void findCharOccurances(String str) {
		
		char[] ch = str.toCharArray();
		boolean b[] = new boolean[str.length()]; 
		
		int count=1;
		for(int i =0;i<ch.length;i++) {
			if (b[i]) continue;     // Skip already counted characters
			for(int j = i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
					b[j] = true;
				}
			}
			System.out.println(ch[i] +"  "+ count);
		}		
	}
	
	public static int getSecondLargest() {
		
		 int[] arr = { 12, 35, 1, 10, 34, 1 };
	        
        int n = arr.length;
        System.out.println("length: "+n);
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        System.out.println("after sorting");
        for(int a : arr) {
        	System.out.print(a +" ");
        }
        System.out.println(" ");
        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            
            // return the first element which is not equal to the 
            // largest element
            if (arr[i] != arr[n - 1]) {
            	System.out.println("Second largest: "+arr[i]);
                return arr[i];
            }
        }
        
        // If no second largest element was found, return -1
        return -1;
    }
	
	public static String reverseEachWordInString(String str) {
		
		String splitString[] = str.split(" ");
		String revSplitString="";
		
		for(String eachStr : splitString) {
			String revEachStr="";
			for(int i = eachStr.length()-1;i>=0;i--) {
				revEachStr = revEachStr + eachStr.charAt(i);
			}
			revSplitString = revSplitString + revEachStr + " ";
		}
		
		return revSplitString;
		
	}
}
