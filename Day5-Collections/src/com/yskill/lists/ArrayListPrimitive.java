package com.yskill.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListPrimitive {

	public static void main(String[] args) {
		// ArrayList of primitive values
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("The Size of ArrayList : "+al.size());
		
		Scanner sc=new Scanner(System.in);
		String choice="yes";
		do {
			System.out.println("Enter Element");
			al.add(sc.nextInt());
			System.out.println("Would you like to add more element?(yes/no)?");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		
		System.out.println("The Size of ArrayList : "+al.size());
		System.out.println(al); // toString() ==> for collection is overriden to print all elements
		System.out.println("Sorted list of elements");
		Collections.sort(al); // Sorting is performed as in-place sorting
		System.out.println(al);
		System.out.println("DescendingOrder of elements");
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		// How to traverse array-list
		System.out.println("=========================================");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			int element=itr.next(); //Object 
			if(element%2==0)
				System.out.println(element);
		}
	}

}
