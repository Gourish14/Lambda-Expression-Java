package com.cozentus.LambdaQuestions;

import java.util.ArrayList;

public class Question7 {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(10);
			al.add(10);
			al.add(15);
			al.add(25);
			al.add(30);
			System.out.println("Original List : "+al);
			
			ArrayList<Integer> uniqueList = new ArrayList<>();

	        for (Integer element : al) {
	            if (!uniqueList.contains(element)) {
	                uniqueList.add(element);
	            }
	        }
	        System.out.println("Unique List : "+uniqueList);
		};
		r1.run();
	}
}
