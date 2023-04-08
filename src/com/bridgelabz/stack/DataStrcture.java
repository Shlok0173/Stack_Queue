package com.bridgelabz.stack;

import java.util.Stack;

public class DataStrcture {
     
	public static void main(String args[]) {
		Stack stack=new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		System.out.println("Before pop"+stack);
		stack.pop();
		System.out.println("-----------------------");
		System.out.println("After Pop"+stack);
		System.out.println("-------------------------");
	    System.out.println(	"Top Elements "+stack.peek());
;	}
}
