package com.cozentus.LambdaQuestions;

import java.util.Scanner;

interface StringChecker {
	void check();
}

public class Question2 {
	public static void main(String[] args) {	
		
		StringChecker sc = () -> {
			try(Scanner scan = new Scanner(System.in);) {
				System.out.print("Enter any String if you want : ");
				String s = scan.nextLine();
				if(s.isEmpty()) {
					System.out.println("Entered String is empty");
				}
				else {
					System.out.println("Entered String is not empty");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		};
		sc.check();
	}
}