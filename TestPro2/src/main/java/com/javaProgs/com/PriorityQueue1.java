package com.javaProgs.com;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee{
	
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee Name: "+name+" Employee Salary: "+salary;
	}
}

class EmpCoparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
				
		return e1.salary - e2.salary;
	}
	
}

public class PriorityQueue1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpCoparator comparator = new EmpCoparator();
		
		PriorityQueue<Employee> pq = new PriorityQueue<>(10, comparator);
		pq.add(new Employee("A",12000));
		pq.add(new Employee("B",15000));
		pq.add(new Employee("C",25000));
		pq.add(new Employee("D",5000));
		pq.add(new Employee("E",6000));
		pq.add(new Employee("F",2000));
		
		//System.out.println(pq.poll());
		System.out.println(pq);
	}

}
