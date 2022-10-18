package com.yskill.arrays;

public class StaticClassDemo {

	static class Inner{
	
		int x=23;
		void display()
		{
			System.out.println("x = "+x);
		}
	}
	public static void main(String[] args) {
		StaticClassDemo.Inner i1=new StaticClassDemo.Inner();
		i1.display();

	}

}
