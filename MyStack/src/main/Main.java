package main;
import java.util.Scanner;

import stack.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack myStack = new Stack();
		
		System.out.println("THIS IS A STACK OF INTEGERS, PLEASE ONLY ENTER INT VALUES. THANKS =) \n");
		System.out.println("Insert how many values? ");
		int quantity = input.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			
			System.out.print("Insert: ");
			myStack.push(input.nextInt());
			
		}
		
		myStack.display();
		
		myStack.pop();
		
		myStack.display();
		
		//changes
	}

}
