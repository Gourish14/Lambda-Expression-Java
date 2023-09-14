package com.cozentus.LambdaQuestions;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(10);
			al.add(24);
			al.add(37);
			al.add(43);
			al.add(52);
			al.add(79);
			System.out.println("Original List : "+al); 
			for(int i:al) {
			if(i%2==0) {System.out.println(i+" is a even number");}
			else {System.out.println(i+" is a odd number");}
			}
		};
		r1.run();
	}
}
