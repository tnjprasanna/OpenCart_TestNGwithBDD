package com.lambda.com;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> func1 = x -> x.length();
		
		int len = func1.apply("This is java 8");
		System.out.println(len);
		
		Function<Integer, Integer> func2 = x -> x * 2;
		int multi = func1.andThen(func2).apply("Nested function");
		System.out.println(multi);
	}

}
