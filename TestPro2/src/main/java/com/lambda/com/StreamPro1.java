package com.lambda.com;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.assertj.core.util.Arrays;

public class StreamPro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream.of(1,2,3,4,5,6,7,8,9,10).filter(e -> e%2==0).forEach(e -> System.out.println(e));
		
		Stream.of("Hello","Java").map( e -> e + " world").forEach(System.out::println);
		
		String s[] = new String[5];
		s[2]="Naveen";
		Optional<String> isNull = Optional.ofNullable(s[2]);
		
		if(isNull.isPresent()) {
			System.out.println(s[2]+""+s[2].length());
		} else {
			System.out.println("Value is not availabe");
		}
		isNull.ifPresent( e -> System.out.println(e.length()));
		
		Optional<String> nothing = Optional.empty();
		nothing.ifPresent(e -> System.out.println("Bye...."));
		
		/*
		JDK 14
		
		Employee e1 = new Employee("Peter",34,"FOS");
		System.out.println(e1.name()+" "+ e1.age()+" "+ e1.dep); 
		 */
		
	}

}
