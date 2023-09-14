package com.cozentus.LambdaQuestions;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			try(Scanner sc = new Scanner(System.in);){
				System.out.println("Enter a number : ");
				int n = sc.nextInt();
				int fact=1;
				for(int i=1; i<=n; i++) {
					fact = fact*i;
				}
				System.out.println("Factorial of "+n+" : "+fact);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		};
		r1.run();

	}

}
