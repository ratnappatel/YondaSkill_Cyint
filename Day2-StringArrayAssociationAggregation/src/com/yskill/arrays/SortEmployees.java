package com.yskill.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortEmployees {
	
	static Employee emps[];
	static Scanner sc;
	public SortEmployees() 
	{
		emps=new Employee[5];
		
		emps[0]=new Employee(23,"Pinakin",172000);
		emps[1]=new Employee(72,"Mayur",760000);
		emps[2]=new Employee(19,"Neelkanth",682000);
		emps[3]=new Employee(25,"Gargesh",256000);
		emps[4]=new Employee(47,"Uttam",735000);
		
		sc=new Scanner(System.in);
	}
	public void display()
	{
		for(int i=0;i<5;i++)
			System.out.println(emps[i]);
	}


	public static void main(String[] args) {
		SortEmployees s1=new SortEmployees();
		
		int choice=0;
		System.out.println("How would you like to sort array");
		System.out.println("1. By Id");
		System.out.println("2. By Name");
		System.out.println("3. By Salary");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
					Arrays.sort(emps);
					break;
			case 2:
					Arrays.sort(emps, (e1,e2)->e1.getName().compareTo(e2.getName()));
					break;
			case 3:
					Arrays.sort(emps,(e1,e2)->{
						double d=e1.getSalary()-e2.getSalary();
						int i=(int)d;
						return i;
						});
					break;
			default:
					System.out.println("Not a valid input");
					break;		
		}	
		s1.display();

	}

}
