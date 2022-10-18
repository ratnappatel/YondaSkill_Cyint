package com.yskill.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		Employee emps[]=new Employee[3];
		// empty constructors need 
		
		for(int i=0;i<3;i++)
		{
			Employee e1=new Employee(); 
			System.out.println("Enter Employee Id:  ");
			e1.setId(sc.nextInt());
			System.out.println("Enter Employee Name:  ");
			e1.setName(sc.next());
			System.out.println("Enter Employee Salary:  ");
			e1.setSalary(sc.nextDouble());			
			emps[i]=e1;			
		}
		// how to sort 
		
		Arrays.sort(emps);
		System.out.println("Sorted Array");
		for(int i=0;i<3;i++)
			System.out.println(emps[i]);
	}
}
