package com.lambda.com;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStrArrFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data[][] = new String[][] {
			
			{"a","b"},{"c","d"},{"e","f"}
		};
		
		Stream<String[]> dataStream =	Arrays.stream(data);
		
		Stream<String> strFlatMap  = dataStream.flatMap(x -> Arrays.stream(x));
		
		Stream<String> dataStreamFilter = strFlatMap.filter(x -> "a".equals(x.toString()));
		
		dataStreamFilter.forEach(System.out::println);
		
		Stream<String> finalStream = Arrays.stream(data)
										.flatMap(x -> Arrays.stream(x))
										.filter(x -> "d".equals(x.toString()));
		
		finalStream.forEach(System.out::println);
		
		IntStream.range(1, 11).forEach(System.out::println);
		
		Arrays.stream(new int[] {1,2,3,4}).map(n -> 2 * n+1).average().ifPresent(System.out::println);
		
		Stream.of("a1","b2","c3","d11","e50").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);
		
		Stream.of(1.0, 2.0, 3.0).mapToInt(Double :: intValue).mapToObj(i -> "a" +i).forEach(System.out::println);
		
		//Stream.iterate(0, n->n+1).limit(10).forEach(System.out::println);
		
		Stream.iterate(0, n->n+1).filter(x -> x%2 !=0).limit(10).forEach(System.out::println);
		
	}

}
