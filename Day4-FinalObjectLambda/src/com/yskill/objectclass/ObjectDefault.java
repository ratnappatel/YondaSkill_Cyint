package com.yskill.objectclass;

public class ObjectDefault {

	public static void main(String[] args) {
		Employee e1=new Employee(101, "Ratna", 200000.00);
		Employee e2=new Employee(101, "Ratna", 200000.00);
		Employee e3=null;
		System.out.println("e1 hashCode = "+e1.hashCode());
		System.out.println("e2 hashCode = "+e2.hashCode());
		
		if(e1.equals(e3))
			System.out.println("e1 == e2");
		else
			System.out.println("e1 != e2 ");
		
		System.out.println(e1); //it should display state of an object
		System.out.println(e2);

	}

}

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int hashCode()
	{
		int temp=31;
		temp=temp+this.id;
		temp=temp+this.name.hashCode();
		temp=temp+(int)this.salary;
		return temp;
	}
	
	public boolean equals(Object o1)
	{
		if(o1!=null)
		{
			Employee e1=(Employee)o1;
			if(this.id==e1.id && this.name.equals(e1.name) && this.salary==e1.salary)
				return true;
			else
				return false;
		}
		else
			return false;
		
	}
	
	public String toString()
	{
		return "Employee [Id= "+this.id+", Name= "+this.name+
				", Salary= "+this.salary+"]\n";
	}
	
	
}