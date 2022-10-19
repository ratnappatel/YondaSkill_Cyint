package com.yskill.function;

@FunctionalInterface
public interface DivideInterface {
	public void divide(int no1,int no2);
	//public void multiply(int no1,int no2);
	public default void display()
	{
		System.out.println("From default display of Functional Interface..");
	}
	
	public static void call()
	{
		System.out.println("I am to be called without an instance");
	}
}
