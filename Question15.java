package com.cozentus.LambdaQuestions;

import java.util.ArrayList;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 =() -> {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(2);
			al.add(3);
			al.add(4);
			System.out.println("List : "+al);
			int sum=0;
			for(Integer s:al) {
				sum = sum+(s*s);
			}
			System.out.println("Sum of squares are : "+sum);
		};
		r1.run();
	}
}
