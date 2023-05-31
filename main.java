package dataStructures;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose the data structure you would like to visualize: linked list, stack");
		String choice = input.nextLine();
		switch (choice) {
		case "stack":
			Stack stack = new Stack();
			stack.invokeStack(stack);
			//stack.push(1);
			//stack.push(2);
			//System.out.println(stack.peek()); 
			break;
			
		case "linked list":
			LinkedList linked_list = new LinkedList();
			break;
		
		}
		input.close();
	}
}

