package com.javaProgs.com;



public class LinkedListStack {
	
	Node head;
	
	class Node{
		
		int value;
		Node next;
	}
	
	LinkedListStack(){
		
		head = null; 
	}
	
	public void push(int value) {
		
		Node extraHead = head;
		head = new Node();
		head.value = value;
		head.next = extraHead;

	}
	
	public int pop() {
		
		int value=0;
		try {
			if(head==null) {
				System.out.println("stack is empty");
			}
			value = head.value;
			head = head.next;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static void printList(Node head) {
		
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack lls = new LinkedListStack();
		//lls.pop();
		lls.push(10);
		lls.push(30);
		lls.push(50);
		lls.push(70);
		lls.push(90);
		
		lls.pop();
		lls.push(95);
		printList(lls.head);
		
		
	}

}
