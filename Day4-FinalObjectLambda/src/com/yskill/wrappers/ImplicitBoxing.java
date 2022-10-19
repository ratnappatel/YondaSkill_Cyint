package com.yskill.wrappers;

import java.util.ArrayList;

public class ImplicitBoxing {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(345); // Implicit Auto-Boxing 
		al.add(789);
		
		int total=0;
		
		for(int i=0;i<al.size();i++)
			total+=al.get(i); // Implicit Un-Boxing
		
		System.out.println(al);
		System.out.println("Total of All elements : "+total);

	}

}
