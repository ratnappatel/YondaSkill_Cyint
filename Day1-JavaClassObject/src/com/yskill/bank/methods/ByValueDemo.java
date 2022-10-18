package com.yskill.bank.methods;

public class ByValueDemo {
	
	public void modify(int a)
	{
		a=a+20;
		System.out.println("modify a = "+a);
	}
	public static void main(String[] args) {
		
		ByValueDemo b=new ByValueDemo();
		int a=10;
		System.out.println("Prior Modify = "+a);
		b.modify(a);
		System.out.println("Main a = "+a);
	}

}
