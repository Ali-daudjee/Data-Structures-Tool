package dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Stack {
	
	private int[] stack = new int[3];
	private int size = 0;
	
	public void push(int num) {
		
		if(this.size + 1 > this.stack.length) {
			this.stack = resizeArr(this.stack);
			this.stack[this.size] = num;
		} else {
			this.stack[this.size] = num;
		}
		this.size = this.size + 1;
	}
	
	public int pop() {
		if(this.size == 0) {
			System.out.println("Empty stack");
			return -1;
		}
		else {
			int popped = this.stack[this.size - 1];
			this.stack[this.size - 1] = 0;
			this.size = this.size - 1;
			return(popped);
		}
	}
	
	public String toString() { 
		String s = "[";
		for(int i = 0; i < size - 1; i++) {
			s+= this.stack[i] + ", ";
		}
		s+= this.stack[size - 1] + "]";
		return s;
	}
	
	public int peek(){
		if(!this.isItEmpty()) {
			return(this.stack[size - 1]);
		}
		else {
			return -1;
		}
		
	}
	
	public boolean isItEmpty() {
		if(this.stack[0] > 0) {
			return false;
		} else {
			return true;
		}
	}
	
	
	private int[] resizeArr(int[] arr) {
		int[] newStack = new int[this.size * 2];

		for(int i = 0; i < arr.length; i++) {
			newStack[i] = arr[i];
		}
		return newStack;
	}
	
	public void sizeCheck() {
		System.out.println("stack: " + Arrays.toString(this.stack));
		System.out.println("stack.length: " + this.stack.length);
		System.out.println("Size: " + this.size);
	}
	
	
	public void invokeStack(Stack stack) {
		System.out.println("Please indicate whether you would like to push, pop, peek");
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		while(!choice.equals("exit")) {
			switch (choice) {
			case "push":
				System.out.println("What integer would you like to push?");
				choice = input.nextLine();
				int pushedItem = Integer.parseInt(choice);
				this.push(pushedItem);
				break;
			case "pop":
				System.out.println("popped number: " + this.pop());
				System.out.println("stack after popped number: " + this.toString());
				break;
			case "peek":
				//System.out.println("3");
				break;
			}
			System.out.println("Please indicate whether you would like to push, pop, peek");
			choice = input.nextLine();
		}
		input.close();
		
		System.out.println(this.toString());
	}


	
	
	
	//add array implementatio of stack , able to visualize the resizing of stack
	
}
