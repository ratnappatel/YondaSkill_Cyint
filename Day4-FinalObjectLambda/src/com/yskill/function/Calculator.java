package com.yskill.function;

public class Calculator {

	public static void main(String[] args) {
		DivideInterface d=(no1,no2)->{
			System.out.println("Entered to the Lambda Expression");
			double result=no1/no2;
			System.out.println("Division Result = "+result);
		};
		
		d.divide(45, 5);
		d.display();
		DivideInterface.call();
		
	}

}
