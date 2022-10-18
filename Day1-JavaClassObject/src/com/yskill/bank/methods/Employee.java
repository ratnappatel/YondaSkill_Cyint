package com.yskill.bank.methods;

public class Employee {

	private int id;
	private String name;
	private double salary;
	public Employee(String name) {
		this.name=name; // this == current instance of the class 
		this.id=(int)(Math.random()*100);
		this.salary=0.0;
	}
	
	public Employee(String name,double salary) {
		this(name); // calls a constructor of same class 
		this.salary=salary;
		this.id=(int)(Math.random()*100);
	}
	
	
	public void displayDetails()
	{
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Salary : "+this.salary);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("Uttam");
		e1.displayDetails();
		
		Employee e2=new Employee("Ratna",34000.890);
		e2.displayDetails();
	}

}
