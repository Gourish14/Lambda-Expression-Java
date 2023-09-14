package com.cozentus.LambdaQuestions;

import java.util.Scanner;

public class Question9 {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			try(Scanner sc = new Scanner(System.in);) {
				System.out.println("Enter a number : ");
				int n = sc.nextInt();
				if (n <= 1) {
		            System.out.println("Not a prime number");
		        } else {
		            for (int i = 2; i <= Math.sqrt(n); i++) {
		                if (n % i == 0) {
		                    System.out.println("It is not a prime number");
		                }
		                else {
		                	System.out.println("It is a prime number");
		                }
		             }
		         }
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		};
		r1.run();
	}
}
