package com.Bridgelabz.linkedlistproblem;

public class LinkedList {
	
	Node rear = null, front = null;
	int nodeCount = 0;
	
	 public void enqueue(int data) {
		 	Node newNode = new Node(data);
	        System.out.println("Insert " +data);
	 
	        if (front == null) {
	        	front = newNode;
	            rear = newNode;
	        }
	        else {
	            rear.next = newNode;
	            rear = newNode;
	        }
	        	nodeCount ++;
	 }
	 
	 public int dequeue()     
	    {
	        if (front == null)
	        {
	            System.out.println("\nQueue Underflow");
	            System.exit(-1);
	        }
	 
	        Node temp = front;
	        System.out.printf("Removing %d\n", temp.data);
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	        nodeCount --;
	        return temp.data;
	 }
	 
	 public int peek() {
		 if (front == null) {
			 	System.out.println("Queue is overflow");
	     }
	       		return front.data;
	 }
	 
	 public boolean isEmpty() {
	        return rear == null && front == null;
	 }
	 public int size() {
	        return nodeCount;
	 }
	 public void display() {
	    	Node temp = front;
	    	while (temp != null) {
	   		System.out.print(temp.data + " ");
	   		temp = temp.next;
	   		}
	 }
}

	


