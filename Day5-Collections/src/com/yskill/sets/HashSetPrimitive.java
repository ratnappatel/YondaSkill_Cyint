package com.yskill.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrimitive {

	public static void main(String[] args) {
		HashSet<String> books=new HashSet<String>();
		
		books.add("Bahgvad Geeta");
		books.add("Vishnu Puran");
		books.add("Vachnamrut");
		books.add("Bhakt Chintamani");
		books.add("Bahgvad Geeta");// duplicate
		books.add("Vishnu Puran"); //duplicate
		books.add("Hari Charitramrut");
		
		System.out.println(books);
		books.stream().sorted().forEach(System.out::println);
		System.out.println("============================================");
		Iterator<String> itr=books.iterator();
		while(itr.hasNext())
			System.out.println(itr.next().toUpperCase());

	}

}
