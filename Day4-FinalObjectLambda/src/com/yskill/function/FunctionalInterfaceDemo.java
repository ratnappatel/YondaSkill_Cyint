package com.yskill.function;

public class FunctionalInterfaceDemo  {

	public static void main(String[] args) {
		/*
		 * Interface1 i1=new Interface1() { // anonymous class
		 * 
		 * @Override public int add(int a, int b) { int total=a+b;
		 * System.out.println("Totla = "+total); return total } };
		 */
		// Lambda Expression  (argument) -> logic-return something
		Interface1 i2=(a,b)->{
					System.out.println("In Lambda Definition");
					int c=a+b;
					return c;
			};
		System.out.println(i2.add(10, 20));
	}
	
}

// if its a functional-interface
interface Interface1 
{
	public int add(int a,int b);
}