package com.cozentus.LambdaQuestions;

import java.util.ArrayList;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = () -> {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(2);
			al.add(2);
			al.add(4);
			al.add(8);
			System.out.println("List : "+al);
			int sum=0;
			for(Integer d:al) {
				sum=sum+d;
			}
			System.out.println("Addition of list : "+sum);
			int mul=1;
			for(Integer e:al) {
				mul=mul*e;
			}
			System.out.println("Multiplication of list : "+mul);
		};
		r1.run();
	}
}
