package com.cozentus.LambdaQuestions;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) {
		
		Runnable r1 = () -> {
		ArrayList<Double> al = new ArrayList<>();
		al.add(20.5);
		al.add(15.2);
		al.add(16.7);
		al.add(29.9);
		al.add(26.5);
		System.out.println("Original List : "+al);
		double sum=0;
		for(double d:al) {
			 sum+=d;
		}
		double avg = sum/al.size();
		System.out.println("Average : "+avg);
	};
		r1.run();
	}
}
