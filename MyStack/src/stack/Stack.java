package stack;

public class Stack {
	
	private int index = 0;
	private int[] stack = new int[10];
	
	//The push() method adds the value in the stack.
	public void push(int value) {
		
		if(!isFull()) {		
			stack[index] = value;
			index++;
			return;
		}
		System.out.println("Stack has no more space!");
	}
	
	//The peek() method retrieve or fetch the element at the top of the stack without removing it.
	public int peek() {
		
		return index;
		
	}
	
	//The pop() method removes the element at the top of the stack.
	public void pop() {
		
		if(isEmpty()) {
			
			System.out.println("The stack is empty!");
			return;
		
		}
		System.out.println("Removed: "+index);
		stack[index] = -1;
		index--;
	}
	
	//The isEmpty() method returns FALSE if the stack contains at least one element and TRUE if the stack is empty
	private boolean isEmpty() {
		
		if(index == 0)
			return true;
		return false;
		
	}
	
	private boolean isFull() {
		
		return index == 9;
		
	}
	
	public void display() {
		
		for(int i = index-1; i >= 0; i--) {
			
			System.out.println(stack[i]);
			
		}
		
	}
	
	

}
