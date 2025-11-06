/*
 * package com.javaProgs.com;
 * 
 * public class StackImp {
 * 
 * int size; int arr[]; int top;
 * 
 * 
 * 
 * StackImp(int size){ this.size = size; this.arr = new int[size]; this.top =
 * -1; }
 * 
 * public void push(int element) { if(!isFull()) { top++; arr[top] = element;
 * System.out.println(element); } else { System.out.println("Stack is full"); }
 * }
 * 
 * public int pop() {
 * 
 * if(!isEmpty()) { int returnTop = top; top--;
 * System.out.println(arr[returnTop]); } else {
 * System.out.println("Stack is empty"); return -1; } return size; }
 * 
 * public boolean isEmpty() { return (top == 1); }
 * 
 * public boolean isFull() { return (size - 1 == top); }
 * 
 * public int peek() { if(!this.isEmpty()) { return arr[top]; } else {
 * 
 * return -1; } }
 * 
 * public static void main(String args[]) {
 * 
 * StackImp stackImp = new StackImp(10); //stackImp.pop();
 * System.out.println("-------------"); stackImp.push(101); stackImp.push(102);
 * stackImp.push(103); stackImp.push(104); stackImp.push(105);
 * System.out.println("-------------"); System.out.println(stackImp.peek());
 * stackImp.pop();
 * 
 * }
 * 
 * }
 */