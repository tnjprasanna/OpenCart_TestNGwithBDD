package com.lambda.com;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.assertj.core.util.Arrays;

import com.google.common.collect.ImmutableMap;

public class LambdaTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> studList = new ArrayList<String>();
		studList.add("TOM");
		studList.add("SAM");
		studList.add("RAM");
		studList.add("SHIV");
		
		studList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("Converting arraylist to object array");
		Object arr[] = studList.toArray(); // Converting arraylist to object array
		for(Object ob : arr) {
			System.out.println((String)ob);
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.removeIf(num -> num%2 == 0);
		System.out.println(numbers);
		List<Integer> subListofNum = numbers.subList(1, 3);
		subListofNum.stream().forEach(subL -> System.out.println(subL));
		
		//1. synchronizedList
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Java");
		nameList.add("Ruby");
		nameList.add("Python");
		
		synchronized (nameList) {
		
			nameList.stream().forEach(NL -> System.out.println(NL));
		}
		
		//2. CopyOnWriteArrayList (Thread safe)
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Naveen");
		empList.add("Tom");
		empList.add("Jerry");
		
		empList.stream().forEach(eL -> System.out.println(eL)); //No need explicit sync 
		
		ArrayList<Integer> duplicatetNum = new ArrayList<Integer>();
		duplicatetNum.add(1);
		duplicatetNum.add(2);
		duplicatetNum.add(3);
		duplicatetNum.add(4);
		duplicatetNum.add(2);
		duplicatetNum.add(1);
		
		//1.Linked HashSet
		LinkedHashSet<Integer> linkHashSet = new LinkedHashSet<Integer>(duplicatetNum);
		ArrayList<Integer> uniqueVal = new ArrayList<Integer>(linkHashSet);
		System.out.println(uniqueVal);
		
		List<Integer> uniqueVal2 =	duplicatetNum.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueVal2);
		
		ArrayList<String> lang1 = new ArrayList<String>();
		lang1.add("Java");
		lang1.add("C");
		lang1.add("CPP");
		
		ArrayList<String> lang2 = new ArrayList<String>();
		lang2.add("Java");
		lang2.add("C");
		lang2.add("C#");
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington");
		capitalMap.put("UK", "London");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "Berlin1");
		capitalMap.put("Berlin",null);
		capitalMap.put("Berlin",null);
		
		System.out.println(capitalMap.get(null)); // latest null value only display 
		
		System.out.println("Using Keyset");
		Iterator<String> kSet = capitalMap.keySet().iterator();
		
		while(kSet.hasNext()) {
			
			String key = kSet.next();
			String value = capitalMap.get(key);
			System.out.println("Key: "+key+ " Value: "+value);
		}
		
		System.out.println("Using Entryset");
		Iterator<Entry<String,String>> eSet = capitalMap.entrySet().iterator();
		
		while(eSet.hasNext()) {
			Entry<String, String> entry = eSet.next();
			System.out.println("Key =  " +entry.getKey() + " Value= "+ entry.getValue());
		}
		
		System.out.println("===============Using Lambda==========");
		capitalMap.forEach((k,v) -> System.out.println("Get Key: " +k+ " Get Value: "+v));
		
		//Compare Map
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
			map1.put(1, "A");
			map1.put(2, "B");
			map1.put(3, "C");
			map1.put(4, "D");
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
			map2.put(1, "C");
			map2.put(2, "A");
			map2.put(3, "B");
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
			map3.put(1, "A");
			map3.put(2, "B");
			map3.put(3, "C");
			map3.put(4, "D");

		//Compare both key and values
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		
		//Compare hashMap for the same
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
			map4.put(1, "A");
			map4.put(2, "B");
			map4.put(3, "C");	
			map4.put(4, "D");
			map4.put(5, "E");
			
		HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
			combineKeys.addAll(map4.keySet());
			combineKeys.removeAll(map1.keySet());
			System.out.println(combineKeys);
		
		System.out.println("ArrayList");	
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map3.values())));
		System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map4.values())));
		System.out.println("Hashset");
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map3.values())));
		System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map4.values())));
		
		Map<String, String> strMap = Stream.of(new String [][] {
			{"TOM","A+"},{"CRUCE","B+"}
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println(strMap.get("CRUCE")); 
		strMap.put("Linda", "A++");
		System.out.println(strMap.get("Linda"));
		
		//Using simple Entry Imutable map
		Stream.of(
				new AbstractMap.SimpleEntry<>("Prasanna","Java"),
				new AbstractMap.SimpleEntry<>("Praveen","CPP"),
				new AbstractMap.SimpleEntry<>("Raheem","python"))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		/*Map<String, Integer> mapOfEnt = Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A",100),
				new AbstractMap.SimpleEntry<>("B",200),
				new AbstractMap.SimpleEntry<>("C",300));
		*/
		
		/*
		Map<String, String> titleMaps = ImmutableMap.of("Google","Google India","Amazon","Amazon Shopping","MS","Windows","RH","Linux");
		System.out.println(titleMaps.get("RH")); 
		
		Map<String,String> emptyMap = Map.of();
		
		Map<String, String> singletonMap = Map.of("k1","v1");
		System.out.println(singletonMap.get("k1"));
		
		Map<String, String> multiMap = Map.of("k1","v1","k2","v2","k3","v3");
		System.out.println(singletonMap.get("k1"));
		*/
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1","Siva");
		map.put("2", "Ram");
		map.put("3","kalyan");
		
		Map<String,String> syncMap = Collections.synchronizedMap(map);
		System.out.println(syncMap);
		
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "CPP");
		concurrentMap.put("C", "Ruby");
		
		System.out.println(concurrentMap.get("A"));
		
		
		HashMap<String, Integer> compMap = new HashMap<String,Integer>();
		
		compMap.put("Google", 10000);
		compMap.put("Walmart", 52000);
		compMap.put("Amazon", 22000);
		compMap.put("Facebook", 12000);
		compMap.put("CISCO", 65000);
		
		Iterator<Entry<String,Integer>> eSetCompMapIt = compMap.entrySet().iterator();
		compMap.forEach((k,v) -> System.out.println("Key "+k+" Value "+v));
		
		while(eSetCompMapIt.hasNext()) {
			
			//Entry<String,Integer> pairs =  eSetCompMapIt.next();
			//System.out.println(pairs);
			
			Map.Entry pairs2 =	(Map.Entry)eSetCompMapIt.next();
			//System.out.println(pairs2);
			System.out.println(pairs2.getKey() + "="+ pairs2.getValue());
		}
		
		List<String> compMaptoListKey =	new ArrayList<String>(compMap.keySet());
		/*
		for(String t: compMaptoList ) {
			
			System.out.println(t);
		}*/
		
		compMaptoListKey.stream().forEach(compKey -> System.out.println(compKey));
		
		List<Integer> compMaptoListVal =	new ArrayList<Integer>(compMap.values());
		compMaptoListVal.stream().forEach(compVal -> System.out.println(compVal));
		
		TreeMap<Integer, String> tMap = new TreeMap<>();
		
		tMap.put(1000, "TOM");
		tMap.put(5000, "Peter");
		tMap.put(2000, "Steve");
		tMap.put(2500, "Rock");
		tMap.put(1250, "Roar");
		
		tMap.forEach((k,v) -> System.out.println("Key= "+k+ " Value="+v));
		
		Set<Integer> tail =	tMap.tailMap(2000).keySet();
		Set<Integer> head =	tMap.headMap(2000).keySet();
		
		System.out.println(tail);
		System.out.println(head);
		
		TreeMap<String, Integer> userMap = new TreeMap<>();
		userMap.put("James", 100);
		userMap.put("Bas", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Ted", 300);
		userMap.put("Paul", 120);
		userMap.put("Brad", 230);
		
		userMap.forEach((k,v)-> System.out.println("Key: "+k+ " Value:"+v));
	}
	
	
}
