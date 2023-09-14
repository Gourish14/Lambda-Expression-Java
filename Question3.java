package com.cozentus.LambdaQuestions;
import java.util.ArrayList;

interface Stringcase {
	void upperLower();
}

public class Question3 {

	public static void main(String[] args) {
		
		Stringcase up = () -> {
			try{
				ArrayList<String> al = new ArrayList<>();
				al.add("Gourish");
				al.add("Raju");
				al.add("Raj");
				al.add("Rohan");
				System.out.println("Entered List : "+al);
				al.replaceAll(String::toUpperCase);
				System.out.println("Uppercased List : "+al);
				al.replaceAll(String::toLowerCase);
				System.out.println("Lowercased List : "+al);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
		up.upperLower();
	}
}