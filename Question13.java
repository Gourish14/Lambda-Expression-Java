package com.cozentus.LambdaQuestions;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = () -> {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter a sentence : ");
                String s = sc.nextLine();
                String[] count = s.split("\\s+");
                System.out.println("Number of words : " + count.length);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
        r1.run();
	}
}
