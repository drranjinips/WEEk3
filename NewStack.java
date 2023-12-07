package creatingClass_assigning_cassobjects;

import java.util.Stack;

public class NewStack {

	public static void main(String[] args) {
		Stack  mystack1= new Stack();
		
		for (int i=0; i<10; i++) {
			mystack1.push(i);
			}
		
		for (int i=0; i<10; i++) {
			
			
			System.out.println(mystack1.pop());
		}
	
	}
}
