package com.lambda.com;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForkJoinPool corePool = ForkJoinPool.commonPool();
		System.out.println(corePool.getParallelism());
		System.out.println("-----Sequential-----------");
		Stream.of("A","B","C","D").forEach(System.out::println);
		System.out.println("-----Parallel-----------");
		Stream.of("A","B","C","D").parallel().forEach(System.out::println);
		
		System.out.println("-----Sequential-----------");
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("-----Parallel-----------");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		System.out.println("------Normal Stream--------");
		getAlphaList().stream().forEach(System.out::println);
		
		System.out.println("------Parallel Stream--------");
		getAlphaList().parallelStream().forEach(System.out::println);
		
	}
	
	public static List<String> getAlphaList(){
		
		List<String> alpha = new ArrayList<String>();
		
		int n =97;
		while(n<=122) {
			char c = (char)n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
		
	}

}
