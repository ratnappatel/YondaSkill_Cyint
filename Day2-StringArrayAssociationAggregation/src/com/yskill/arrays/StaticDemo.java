package com.yskill.arrays;

public class StaticDemo {

	// very first statement of any class execution to take place
	static int x;
	int y;
	
	// is the block of code executed by JVM prior to an execution of main method
	static {
		System.out.println("Entered in static Block");
		x=100;
		//y=10;
	}
	
	public static void display()
	{
		System.out.println("X  = "+x);
		//System.out.println("Y = "+y);
	}	
	public static void main(String[] args) {
		System.out.println("Entered in Main Function");
		StaticDemo.display();
		StaticDemo sd=new StaticDemo();
		System.out.println("Exited From Main Function");

	}

}
