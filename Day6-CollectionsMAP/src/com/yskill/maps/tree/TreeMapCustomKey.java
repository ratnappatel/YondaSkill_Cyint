package com.yskill.maps.tree;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapCustomKey {

	public static void main(String[] args) {
		TreeMap<Author,String> authors=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How would you like authors list to be sorted?");
		System.out.println("1. By Authod Id");
		System.out.println("2. By Author Name");
		System.out.println("3. By No.OfBooks Written");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
					authors=new TreeMap<Author,String>();
					break;
			case 2:
					authors=new TreeMap<Author,String>
								((a1,a2)->a1.getName().compareTo(a2.getName()));
					break;
			case 3: 
					authors=new TreeMap<Author,String>
								((a1,a2)->a1.getNoOfBooks()-a2.getNoOfBooks());
			default: 
				System.out.println("Invalid Choice..");
		}
		
		authors.put(new Author(25, "Dr. Rajesh Mangla", 26), "Asian Press");
		authors.put(new Author(17, "Tulika Majumdar", 19), "Wiley Publications");
		authors.put(new Author(34, "Dr. Jarnil", 71), "Notion Press");
		
		System.out.println(authors);

	}

}
