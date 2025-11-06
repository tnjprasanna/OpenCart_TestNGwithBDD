package com.javaProgs.com;

import java.util.LinkedList;

public class MyLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next= null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList ll = new MyLinkedList();
		Node first = ll.new Node(10);
		ll.head = first;
		
		Node second = ll.new Node(20);
		first.next = second;
		
		Node third = ll.new Node(30);
		second.next = third;
		
		ll.printMyLinkedList();
		
		
		//Default Linked List in java
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Praveen");
		names.add("Kumar");
		names.add("Malhothra");
		System.out.println(names);
		names.forEach(nameList -> System.out.println(nameList));
		
		//names.add(4,"Steve");
		//System.out.println(names);
		
		names.add(1,"Ragu");
		System.out.println(names);
		
	}
	
	public void printMyLinkedList() {
		
		Node n = head;
		while(n!=null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

}
