package com.yskill.sets;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetEmployees {

	public static void main(String[] args) {
		TreeSet<Employee> emps=new TreeSet<Employee>();
		
		emps.add(new Employee(34, "Ketan",6473652));
		emps.add(new Employee(74, "Mayur", 637462));
		emps.add(new Employee(17, "Gargesh", 864728));
		emps.add(new Employee(62, "Neel", 863528));
		emps.add(new Employee(72,"Uttam",73662));
		emps.add(new Employee(81, "Pinakin", 986373));
		
		System.out.println(emps);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How would you like to sort Employees list");
		System.out.println("1. By Name");
		System.out.println("2. By Salary");
		System.out.println("3. By Id");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				emps.stream()
				    .sorted((e1,e2)->e1.getName().compareTo(e2.getName()))
				    .forEach(System.out::println);
				
				break;
			case 2: 
				emps.stream()
				.sorted((e1,e2)->e1.getSalary()-e2.getSalary())
				.forEach(System.out::println);
				break;
			case 3:
				System.out.println(emps);
				break;
			default:
				System.out.println("Invalid Choice");
			
		}
		
		
	}
}
