package creatingClass_assigning_cassobjects;

import java.util.Stack;

public class DemoStackOfTenElements {

	public static void main(String[] args) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		System.out.println("mystack1 is ");
		for(int i=0; i<10; i++) {
			mystack1.push(i);
			System.out.println(mystack1.push(i));
		}
		System.out.println("mystack2 is ");
		

	}

}
