package com.Bridgelabz.linkedlistproblem;

public class LinkedList {
	
	Node top;
	int nodeCount = 0;
	
	public void push(int data)        
    {
		Node newNode = new Node(data);
       if (newNode == null)
        {
            System.out.println("Heap Overflow");
            return;
        }else {
 
        	System.out.println("Inserting " + data);
        	newNode.next = top;
        	top = newNode;
        	nodeCount ++;
        }
    }

	public void display() {
			Node temp = top;
			while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			}
	}
}
	


