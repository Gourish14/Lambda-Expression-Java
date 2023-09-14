package com.cozentus.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(new Integer (20));
		al.add(new Integer (15));
		al.add(new Integer (10));
		al.add(new Integer (5));
		al.add(new Integer (30));
		al.add(new Integer (25));
		
		System.out.println("Before Sorting : "+al);
		Comparator<Integer> c = (i1,i2) -> (i1<i2)?1:(i1>i2)?-1:0;
		Collections.sort(al,c);
		System.out.println("After Sorting : "+al);
	}
}
