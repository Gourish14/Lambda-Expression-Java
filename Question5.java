package com.cozentus.LambdaQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Question5 {

	public static void main(String[] args) {

		Runnable r1 = () -> {
			ArrayList<String> al = new ArrayList<>();
			al.add("Gourish");
			al.add("Aditya");
			al.add("Bablu");
			al.add("Zebra");
			al.add("Pinku");
			System.out.println("Original String List : "+al);
			Collections.sort(al);
			System.out.println("Sorted String List : "+al);
		};
		r1.run();
	}
}