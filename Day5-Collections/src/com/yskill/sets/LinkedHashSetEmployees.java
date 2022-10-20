package com.yskill.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetEmployees {

	public static void main(String[] args) {
		LinkedHashSet<Employee> emps=new LinkedHashSet<Employee>();
		
		emps.add(new Employee(34, "Ketan",6473652));
		emps.add(new Employee(74, "Mayur", 637462));
		emps.add(new Employee(17, "Gargesh", 864728));
		emps.add(new Employee(62, "Neel", 863528));
		emps.add(new Employee(72,"Uttam",73662));
		emps.add(new Employee(81, "Pinakin", 986373));
		
		System.out.println(emps);

	}

}
