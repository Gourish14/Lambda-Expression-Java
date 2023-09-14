package com.cozentus.LambdaQuestions;

import java.util.Scanner;
interface Sum {
	void sum();
}

public class Question1 {

	public static void main(String[] args) {
		
		Sum s = () -> {
			try (Scanner sc = new Scanner(System.in);) {
				System.out.println("Enter First Integer : ");
				int a = sc.nextInt();
				System.out.println("Enter Second Integer : ");
				int b = sc.nextInt();
				int sum = a+b;
				System.out.println("Sum = "+sum);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		};
		s.sum();
	}
}