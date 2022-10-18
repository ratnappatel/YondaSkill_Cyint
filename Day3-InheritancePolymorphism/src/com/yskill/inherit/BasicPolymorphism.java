package com.yskill.inherit;

public class BasicPolymorphism {

	public static void main(String[] args) {
		Base b1; // Reference of base class
		b1=new Base(100);
		b1.print();
		
		System.out.println("=================================================");
		// reference of base class pointing to derived class object
		b1=new Derived(10,20); 
		b1.print();
		

	}

}
class Base
{
	private int x;
	public Base(int x) {
		this.x=x;
	}
	public void print()
	{
		System.out.println("x ="+x);
	}
	public int getX()
	{
		return x;
	}
}
class Derived extends Base
{
	private int y;
	public Derived(int x,int y) {
		super(x);
		this.y=y;
	}
	public void print()
	{
		System.out.println("x = "+getX());
		System.out.println("y = "+y);
	}
}