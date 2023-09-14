package com.cozentus.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorStringExample {

	public static void main(String[] args) {
		ArrayList<User> al = new ArrayList<>();
		al.add(new User(7,"Gourish"));
		al.add(new User(8,"Abhishek"));
		al.add(new User(9,"Jignesh"));
		
		System.out.println("Before Sorting : "+al);
		Comparator<User> c = (i1,i2) -> i1.name.compareTo(i2.name);
		Collections.sort(al,c);
		System.out.println("After Sorting : "+al);
	}

}
