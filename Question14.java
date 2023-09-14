package com.cozentus.LambdaQuestions;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Runnable r1 = () ->{
			try(Scanner sc = new Scanner(System.in);) {
				System.out.println("Enter a word : ");
				String s = sc.nextLine();
				String s1 = s.toLowerCase();
				String s2 = new StringBuilder(s1).reverse().toString();
				if(s1.equals(s2)) {
					System.out.println("It is palindrone");
				}
				else {
					System.out.println("It is not a palindrone");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		};
		r1.run();
	}
}
