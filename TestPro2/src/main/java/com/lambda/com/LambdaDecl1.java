package com.lambda.com;

public class LambdaDecl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebPage w1 = (value) -> { System.out.println("Hi "+value); };
		
		WebPage w2 = (value) ->  System.out.println(value.toUpperCase()); 
		
		WebPage w3 = (n) -> System.out.println(n.length());
		
		
		WebPage ww2 = new WebPage() {
			
			public void header(String value) {
				
				System.out.println("Hello "+value);
			}
		};
		
		w1.header("Google");
		w2.header("gemini");
		w3.header("Ruby");
		ww2.header("Facebook");
		
	}

}
