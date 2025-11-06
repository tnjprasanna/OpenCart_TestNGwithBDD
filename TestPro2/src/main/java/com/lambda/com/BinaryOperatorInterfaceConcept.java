package com.lambda.com;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryOperator<Integer> func1 = (x1, x2) -> x1+x2;
		
		int t = func1.apply(10, 20);
		System.out.println(t);
		
		BiFunction<Integer , Integer , Integer> func2 = (x1,x2) -> x1+x2;
		int result = func2.apply(30, 40);
		System.out.println(result);
	}

}
