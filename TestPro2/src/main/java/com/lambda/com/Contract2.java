package com.lambda.com;

@FunctionalInterface 
public interface Contract2 {
	
	public int rule2(int no1, int no2);
	
	public static void rule3() {};
	
	public default void rule4() {};
	

}
