package com.javaProgs.com;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumConcepts {

	enum Langs{
		JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnumSet<Langs> langs = EnumSet.allOf(Langs.class);
		System.out.println(langs);
		
		EnumSet<Langs> langs2 = EnumSet.noneOf(Langs.class);
		System.out.println(langs2);
		
		langs2.addAll(langs);
		
		System.out.println(langs2);
		
		Iterator it = langs2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
