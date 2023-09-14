package com.cozentus.Lambda;

interface Lambda {
//	void display();
	void display1(int x); // We are passing parameter so, in below lambda expression, parameter need to pass to run and 
						  // call the abstract method.
}


public class Lambda1 {

	public static void main(String[] args) {
//		Lambda lamb = () -> { // Curly Brackets are necessary for multiple line execution.
//			for(int i=0; i<10; i++) {
//				System.out.println("The value of i : "+i);
//			}
//		};
//		lamb.display();
		
		Lambda lamb = x -> { // For parameter to pass to run, we don't need normal brackets.
			for(int i=0; i<10; i++) {
				System.out.println("The value of i : "+i);
			}
		};
		lamb.display1(23);
	}
}
