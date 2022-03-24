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
	 
	  public void display() {
	    		Node temp = front;
	    		while (temp != null) {
	    		System.out.print(temp.data + " ");
	    		temp = temp.next;
	    		}
	  }
}

	


