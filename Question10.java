package com.cozentus.LambdaQuestions;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			try(Scanner sc = new Scanner(System.in);) {
				System.out.println("Enter first string : ");
				String s1 = sc.nextLine();
				System.out.println("Enter second string : ");
				String s2 = sc.nextLine();
				String s3 = s1.concat(s2);
				System.out.println("Concatenated Result : "+s3);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		};
		r1.run();
	}

}
