package com.yskill.polymorphism;

public class Calculator {

	public void add(int a , int b)
	{
		int total=a+b;
		System.out.println("Total : "+total);
	}
	
	public void add(int a,int b, int c) 
	{
		int total=a+b+c;
		System.out.println("Total : "+total);
	}
	public void add(int a,float b, double c)
	{
		double total=a+b+c;
		System.out.println("Total : "+total);
	}
	
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(34,56); // compiler take care of binding correct form of add method 
		c.add(23,56.78f,56789.13235346);		

	}

}
