package com.yskill.inherit;

public class Test {
	private String name;
	public Test(String name) {
		this.name=name;
	}
	public void display()
	{
		System.out.println("Name : "+name);
	}
	
	public static void main(String arr[]) // JVM
	{
		Test t1=new Test("Yond Skills");
		t1.display();
	}
}
