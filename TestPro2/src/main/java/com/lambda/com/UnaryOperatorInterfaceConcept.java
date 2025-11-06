package com.lambda.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import org.assertj.core.util.Arrays;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UnaryOperator<Integer> func1 = x -> x * 7;
		
		int n1 = func1.apply(10);
		System.out.println(n1);
		
		Function<Integer, Integer> func2 = x -> x*10;
		System.out.println(func2.apply(50));
		
		List<String> langList = new ArrayList<String>();
		langList.add("java");
		langList.add("Ruby");
		langList.add("Python");
		
		System.out.println(langList);
		System.out.println("forEachRemaining");
		Iterator itLang = langList.iterator();
		itLang.forEachRemaining( show -> { System.out.println(show);});
		
		langList.replaceAll(ele -> ele + "Prasanna");
		System.out.println(langList);
		
		//List<Integer> value =	Arrays.asList("a","b");
		
		Consumer<String> conFun1 = x -> System.out.println(x);
		conFun1.accept("This is Prasanna Venkatesan");
		
		getText(() -> "Java");
		getText(() -> "PV");
		getText(() -> "Test Automation");
	}
	
	public static void getText(Supplier<String> text) {
		
		System.out.println(text.get().length());
		
	}

}
