package stack;

import java.util.Arrays;

public class Stack <T> {
	private int size;
	private T[] stack;
	private int index;
	
	public Stack() {
		this.size = 10;
		this.stack = (T[]) new Object[size];
		this.index = 0;
	}
	
	//Push() method adds an element to the stack
	public void push(T thing) {
		if(isFull()) 
			resize();		
		
		stack[index++] = thing;
	}	
	
	//Peek() method retrieves the top element of the stack
	public T peek() {
		if(isEmpty())
			return (T)"Nothing in the stack!";
		
		return stack[index-1];
	}
	
	//Pop() method removes the top element from the stack
	public void pop() {
		if(isEmpty())
			return;
		
		stack[index-1] = null;
		index--;
	}
	
	private void resize() {
		int newSize = size*2;
		stack = Arrays.copyOf(stack, newSize);
	}
	
	private boolean isEmpty() {
		return index == 0;
	}
	
	private boolean isFull() {
		return index >= stack.length;
	}
	
	public int size() {
		return index;
	}
	
	public int max_size() {
		return stack.length;
	}
	
	public boolean contains(T thing) {		
		try {
		for(T stuff : stack)
			if(stuff.equals(thing))
				return true;
		}catch(Exception e) {
			
		}
		return false;
	}
	
}
