package com.yskill.function;

public class CalculatorOverriden  implements DivideInterface{

	public static void main(String[] args) {
		CalculatorOverriden c=new CalculatorOverriden();
		c.divide(25,5);
		c.display();

	}

	@Override
	public void divide(int no1, int no2) {
		System.out.println("In divide");
		
	}	
	/*
	 * public void display() { System.out.println("Display overriden"); }
	 */
	

}
