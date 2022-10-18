package com.yskill.generics;

public class GenericMethod {

	static<T> void genericDisplay(T element)
	{
		//element=element+10;
		System.out.println(element.getClass().getName()+" = "+element);
	}
	
	public static void main(String args[])
	{
		genericDisplay(34.56f);
		genericDisplay("Hi Everyone ");
		genericDisplay(true);
		genericDisplay(456.2134);
	}
}
