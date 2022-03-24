package com.Bridgelabz.linkedlistproblem;

public class MainClass {
	
	public static void main(String[] args) {
		System.out.println(" Welcome to LinkedList Program");
		
	    //LinkedList linkedlist = new LinkedList();
		
	    Stack stack = new Stack();
	    stack.push(70);
	    stack.push(30);
	    stack.push(56);
	    stack.display();
	   
	    stack.pop();
	    stack.display();
	    System.out.println("\n");
	    
	   System.out.println("stack is empty or not :" +stack.isEmpty());
	   System.out.println("top of stack is :" +stack.peek());
	   System.out.println("size of stack :" +stack.size());
	}
}
