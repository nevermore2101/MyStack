package main;

import stack.Stack;

public class MyGenericStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(7);
		stack.push(4);
		stack.push(5);
		stack.push(9);
		stack.push(1);
		stack.push(0);
//		stack.push(21);
//		stack.push(17);
//		stack.push(15);
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.contains(22));
		System.out.println(stack.max_size());
		
	}

}
