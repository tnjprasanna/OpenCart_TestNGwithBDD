package com.javaProgs.com;

public class QArrayImp {
	
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;
	
	
	public QArrayImp(int qSize) {
		this.capacity = qSize;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}
	
	
	
	public boolean isFull() {
		if(currentSize == capacity) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(currentSize == 0) {
			return true;
		}
		return false;
	}
	//To add the data 
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
			rear++;
			if(rear ==	capacity-1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to queue");
		}
	}
	
	//To remove the data
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			front++;
			if(front == capacity-1) {
				System.out.println(queueArr[front-1]+" remove from the queue");
				front = 0;
			} else {
					System.out.println(queueArr[front-1]+" remove from the queue");
				}
			currentSize--;
			}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QArrayImp data = new QArrayImp(10);
		
		data.enqueue(10); // added 10
		data.enqueue(20); // added 20
		data.dequeue(); // Remove 10
		
		data.enqueue(40); // added 40
		data.dequeue(); // Remove 20
		
		data.enqueue(330); // added 330
		data.enqueue(350); // added 350
		data.dequeue(); // remove 49
		
		data.enqueue(254); // added 254
		data.enqueue(255); // added 255
		data.dequeue(); // Remove 330
		data.enqueue(400); // added 400
		data.enqueue(402); // added 402
		data.dequeue(); // remove 350
	}

}
