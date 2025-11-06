package com.lambda.com;

public class LambdaTest1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contract2 cc = (no1, no2) -> { 
			int result = no1 + no2; 
			System.out.println(result);
			return result;
		};

	}
	
	

}
