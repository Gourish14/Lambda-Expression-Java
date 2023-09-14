package com.cozentus.LambdaQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = () -> {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(23);
			al.add(12);
			al.add(24);
			al.add(36);
			System.out.println("List : "+al);
			int max = Collections.max(al);
			System.out.println("Maximum Value : "+max);
			int min = Collections.min(al);
			System.out.println("Maximum Value : "+min);
		};
		r1.run();
	}

}
