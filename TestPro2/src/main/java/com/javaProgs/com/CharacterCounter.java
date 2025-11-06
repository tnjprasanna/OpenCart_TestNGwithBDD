package com.javaProgs.com;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "hello world";
		 
	     Map<Character, Integer> charCountMap = countCharacters(input);
	     
	     for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	     	 System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
	     }
	}
	
	public static Map<Character, Integer> countCharacters(String str) {
        
		Map<Character, Integer> countMap = new HashMap<>();
		
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) continue; // Skip spaces if desired
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return countMap;
    }

}
